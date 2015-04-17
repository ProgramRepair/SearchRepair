#!/bin/bash
DIR=`dirname $0`

case $2 in
n1) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/9.out $DIR/../../tests/blackbox/9.in && exit 0;;
n2) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/8.out $DIR/../../tests/blackbox/8.in && exit 0;;
n3) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/3.out $DIR/../../tests/blackbox/3.in && exit 0;;
n4) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/2.out $DIR/../../tests/blackbox/2.in && exit 0;;
n5) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/1.out $DIR/../../tests/blackbox/1.in && exit 0;;
n6) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/7.out $DIR/../../tests/blackbox/7.in && exit 0;;
n7) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/6.out $DIR/../../tests/blackbox/6.in && exit 0;;
n8) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/5.out $DIR/../../tests/blackbox/5.in && exit 0;;
n9) $DIR/../../../bin/genprog_tests.py --program grade $1 $DIR/../../tests/blackbox/4.out $DIR/../../tests/blackbox/4.in && exit 0;;
esac
exit 1
