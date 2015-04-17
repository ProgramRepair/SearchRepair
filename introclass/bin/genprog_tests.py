#!/usr/bin/python3

import argparse
import os
import json
import re
import string
import subprocess
import unittest

# I don't like that this is hardcoded in so many places.
PROGRAMS = {'checksum', 'digits', 'grade',
            'median', 'smallest', 'syllables'}

def main():
    parser = argparse.ArgumentParser(add_help=True, usage="")
    parser.add_argument("test_binary", 
                        help="The test executable")
    parser.add_argument("reference_binary", 
                        help="The reference executable")
    parser.add_argument("test_input", 
                        help="The test input file")
    parser.add_argument("--program", "-p", dest='program',
                        default=None, choices=PROGRAMS,
                        help=("The program type. If this arguemnt is "+
                              "not present, it will be inferred from "+
                              "the truth binary name if possible. "+
                              "If you've renamed the truth binary, "+
                              "you'll need to use this argument."))
    parser.add_argument('--timeout', '-t',
                        dest='timeout', default=None,
                        help='Timeout for test programs.')
    args = parser.parse_args()
    test = GenprogTests()
    exit(0 if test.run_check(args.test_binary, args.reference_binary,
                             args.test_input, args.program, args.timeout)
         else 1)

class GenprogTests(object):
    def __init__(self, cachefile=None):
        if cachefile is None:
            self.cache_file = ".genprog_test_cache.json"
        self.cache = {}
        self.load()

    def __del__(self):
        self.save()

    def load(self):
        try:
            with open(self.cache_file) as cache:
                self.cache = json.load(cache)
        except:
            pass

    def save(self):
        with open(self.cache_file, 'w') as cache:
            json.dump(self.cache, cache)

    def cache_add(self, program, inputfile, output):
        if not program in self.cache:
            self.cache[program] = {}
        self.cache[program][inputfile] = output

    def check_output(self, test_output, truth_output, input_file,
                  program=None):
        with open(input_file) as inf:
            test_input = inf.read()
        return self.get_check_fn(program)(test_output, truth_output,
                                          test_input)

    def get_check_fn(self, program=None):
        if program is None:
            program = self.program
        checker_name = "check_{}".format(program)
        checker = getattr(self, checker_name)
        assert checker, \
            "Couldn't get checker for program {}".format(self.program)
        return checker

    def check_checksum(self, test_output, reference_output, test_input):
        truth_rgx = re.compile("Check[ ]?sum[ ]+is[ ]+([{}])".format(string.printable),
                               re.IGNORECASE)
        truth_answer = truth_rgx.search(reference_output).group(1)
        test_answer = truth_rgx.search(test_output)
        ret = (test_answer is not None
                and re.compile('Check[ ]?sum is {}'.format(truth_answer),
                               re.IGNORECASE)\
                        .search(test_output) is not None
                and re.compile("Check[ ]?sum is [^{}]".format(truth_answer),
                           re.IGNORECASE)\
                        .search(test_output) is None
        )
        return ret
        
    def check_digits(self, test_output, truth_output, test_input):
        answer_regex = re.compile('[-]?\d\n')
        return (answer_regex.findall(test_output)
                == answer_regex.findall(truth_output))

    def check_grade(self, test_output, truth_output, test_input):
        def get_ans(output):
            pat = re.compile('Student has an ([A-D]) grade',re.IGNORECASE)
            m = pat.search(output)
            if m is None:
                p2 = re.compile('Student has (failed) the course',re.IGNORECASE)
                m2 = p2.search(output)
                if m2 is None:
                    raise Exception("GRADE: no answer found")
                return m2.group(1)
            return m.group(1)
        truth_answer = get_ans(truth_output)
        grades = set(['A','B','C','D'])
        grade_patterns = {g: re.compile("Student has an {} grade".format(g),
                                        re.IGNORECASE)
                          for g in grades}
        if truth_answer in grades:
            no_neg_match = all([rgx.search(test_output) is None
                                for g, rgx in grade_patterns.items()
                                if g != truth_answer])
            pos_match = grade_patterns[truth_answer].search(test_output)
        elif truth_answer == 'failed':
            failure_rgx = re.compile("Student has failed the course",
                                     re.IGNORECASE)
            no_neg_match = all([rgx.search(test_output) is None
                               for g, rgx in grade_patterns.items()])
            pos_match = failure_rgx.search(test_output)
        else:
            raise ValueError("Unknown grades truth {}".format(truth_answer))
        return pos_match is not None and no_neg_match
        
    def check_median(self, test_output, truth_output, test_input):
        answer_rgx = re.compile(r'([-]?\d+) is the median')
        truth_answer = answer_rgx.search(truth_output).group(1)
        test_answer = answer_rgx.search(test_output)
        neg_inputs = [re.compile('{} is the median'.format(n))
                      for n in test_input.split(' ')
                      if n != truth_answer]
        return (test_answer is not None
                and int(test_answer.group(1)) == int(truth_answer)
                and all(nrgx.search(test_output) is None
                        for nrgx in neg_inputs)
        )
        
    def check_smallest(self, test_output, truth_output, test_input):
        answer_rgx = re.compile(r'([-]?\d+) is the smallest',
                                re.IGNORECASE)
        truth_answer = answer_rgx.search(truth_output).group(1)
        test_answer = answer_rgx.search(test_output)
        neg_rgxs = (re.compile('{} is the smallest'.format(n))
                    for n in test_input.split(' ')
                    if n != truth_answer)
        return (test_answer is not None
                and int(test_answer.group(1)) == int(truth_answer)
                and all(nr.search(test_input) is None
                        for nr in neg_rgxs)
        )
        
    def check_syllables(self, test_output, truth_output, test_input):
        answer_rgx = re.compile('syllables is (\d+)', re.IGNORECASE)
        truth_answer = answer_rgx.search(truth_output).group(1)
        right_answer = re.compile('syllables is {}'.format(truth_answer),
                                  re.IGNORECASE)
        other_answers = re.compile('syllables is [^{}]'.format(
            truth_answer))
        right_answer_p = right_answer.search(test_output) is not None
        other_answers_p = other_answers.search(test_output) is None
        return right_answer_p and other_answers_p

    def run_check(self, test_path, truth_path, input_path, program=None,
                  timeout=None):
        if timeout is None:
            timeout = 2
        if program is None:
            type_candidates = {p for p in PROGRAMS if p in truth_path}
            if len(type_candidates) > 1:
                raise ValueError("Unable to determine program type -- " +
                                 "rename one of your binaries or explicitly " +
                                 "provide the program type")
            else:
                program = list(type_candidates)[0]

        test_output = self.get_output(test_path, input_path, timeout)
        if test_output is None:     # timeout
            return False
        else:
            truth_output = self.get_output(truth_path, input_path, timeout + 1)
            assert truth_output is not None, \
                "Truth for {} returned none on {}, timeout {}".format(
                    program, input_path, timeout + 1)
        return self.check_output(test_output, truth_output,
                                           input_path, program=program)
    
    def get_output(self, s, inf, timeout):
        """if s is an executable path, return the output of
        check_output applied to it. If it's a path, but not
        executable, return the contents of the file. If it's not a
        path, return the string.

        """
        try:
            if not os.path.isfile(s):
                return s
        except TypeError:
            # from a checksum embedded NUL character...
            return s
        except ValueError:
            # also from an embedded NUL
            return s
    
        if not os.access(s, os.X_OK):
            with open(s) as sf:
                return sf.read()

        if s in self.cache and inf in self.cache[s]:
            return self.cache[s][inf]

        input_file =  open(inf)
        try:
            output = subprocess.check_output(s, timeout=timeout,
                                             stdin=input_file).decode()
            self.cache_add(s, inf, output)
            return output
        except subprocess.TimeoutExpired:
            return None
        finally:
            input_file.close()


class TestRunCheck(unittest.TestCase):
    
    def setUp(self):
        self.base = '/home/tedks//gp-test'
        self.wb_directory = self.base + '/kleetest'
        self.bb_directory = self.base + '/comptests'

    def get_testdir(self, td, program):
        return os.path.join(td, program, 'all')

    def get_binary(self, program):
        return os.path.join(self.base, 'truth',
                            '{}.out'.format(program))

    def test_tauto(self):
        for program in PROGRAMS:
            wb_tests = self.get_testdir(self.wb_directory,
                                                 program)
            testfiles = [os.path.join(wb_tests, t)
                     for t in os.listdir(wb_tests)]
            binary = self.get_binary(program)
            tests = GenprogTests()
            for test_file in testfiles:
                self.assertTrue(tests.run_check(binary, binary, test_file),
                                "Failure for {}, {}".format(program,
                                                            test_file))

if __name__ == "__main__":
    main()