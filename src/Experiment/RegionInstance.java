package Experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import search.PrototypeSearch;
import search.ResultObject;
import search.ResultObject.ResultState;
import util.Utility;
import antlr.preprocess.FunctionLexer;
import antlr.preprocess.FunctionParser;
import antlr.preprocess.FunctionParser.AssignStatContext;
import antlr.preprocess.FunctionParser.BlockContext;
import antlr.preprocess.FunctionParser.DeclarationStatContext;
import antlr.preprocess.FunctionParser.FormalParameterContext;
import antlr.preprocess.FunctionParser.FunctionContext;
import antlr.preprocess.FunctionParser.If_statContext;
import antlr.preprocess.FunctionParser.StatContext;

/**
 * This class is used to store information of one test case. The information
 * includes the file name of test case, positive and negative i/o pairs, results
 * For every test case, it includes two files. One is "prefix_TS", which
 * contains i/o pairs. The other one is "prefix.c", which is source file with
 * buggy lines.
 * 
 * @author keyalin
 *
 */
public class RegionInstance {

	public static final String MARKINPUT = "_yalin_mark(\"input\");";
	public static final String MARKOUTPUT = "_yalin_mark(\"output\");";
	public String outputType = "";

	private String program;
	private Path folder; 
	private String programSource;
	private Path compiledBinary;
	
	private int[] buggy;
	private CaseInfo info;
	// FIXME: I really don't understand why we store this twice for every damned thing
	private ProgramTests trainingTests = new ProgramTests();
	private ProgramTests verifications = new ProgramTests();
	private String inputfile;
	private String outputfile;
	private String tempOutput;
	private int repo;

	public RegionInstance(String program, Path cwd, int repo) {
		this.program = program;
		this.folder = cwd;
		this.compiledBinary = Paths.get(this.folder.toString() + File.separator + program);
		this.programSource = this.folder.toString() + File.separator + program + ".c";
		this.info = new CaseInfo();
		this.buggy = new int[2];

		this.inputfile = this.folder + "/1.in";
		this.outputfile = this.folder + "/1.out";
		this.tempOutput = this.folder + "/test.out";
		this.repo = repo;
	}

	public void search() {
		boolean pass = constructProfile();
		if (!pass)
			return;
		searchOverRepository();

		//printResult();
		ruleOutFalsePositive();

		if (isEmpty(info.getResult())) {
			this.info.getResult().setState(ResultState.FAILED);
			return;
		} else {
			if (!info.getResult().getPositive().isEmpty()) {
				this.info.getResult().setState(ResultState.SUCCESS);
			} else {
				this.info.getResult().setState(ResultState.PARTIAL);
			}
		}
	}

	private boolean isEmpty(ResultObject result) {
		return info.getResult().getPartial().isEmpty()
				&& info.getResult().getPositive().isEmpty();
	}

	private void printSearchingResult() {
		System.out.println("True fix:\n");
		for (String source : info.getResult().getPositive()) {
			System.out.println(source);
		}

		System.out.println("not a fix:\n");
		for (String source : info.getResult().getFalsePositve()) {
			System.out.println(source);
		}

		System.out.println("partial fix:\n");
		for (String source : info.getResult().getPartial().keySet()) {
			System.out.println(source);
			System.out.println("success: "
					+ info.getResult().getPartial().get(source));
		}

	}

	private void ruleOutFalsePositive() {
		for (String source : info.getResult().getSearchMapping().keySet()) {
			for (Map<String, String> map : info.getResult().getSearchMapping()
					.get(source)) {
				try {
					String input = Restore.getMappingString(source, map);
					String outputFile = generateOutputFile(input);
					if (testAllResults(source, outputFile)) {
						info.getResult().getMappingSource().put(source, input);
						int extraPass = this.passTestSuite(source, outputFile,
								this.verifications.getPositives());
						extraPass += this.passTestSuite(source, outputFile,
								this.verifications.getNegatives());
						this.info.getResult().getExtraPass()
								.put(source, extraPass);
						break;
					} else
						continue;
				} catch (Exception e) {
					System.out.println(e);
					continue;
				}
			}

		}

	}

	private boolean testAllResults(String source, String outputFile) {
		boolean pass = passAllPositive(source, outputFile);
		if (!pass)
			return false;
		int count = passNegatives(source, outputFile);
		if (count == this.getNegatives().size()) {
			info.getResult().getPositive().add(source);
			return true;
		} else if (count == 0) {
			info.getResult().getFalsePositve().add(source);
			return false;
		} else {
			info.getResult().getPartial()
					.put(source, count * 1.0 / this.getNegatives().size());
			return true;
		}
	}

	private int passNegatives(String source, String outputFile) {
		return this.passTestSuite(source, outputFile, this.trainingTests.getNegatives());
	}

	private int passTestSuite(String source, String outputFile, HashMap<String,String> suite) {
		try {
			Files.deleteIfExists(this.compiledBinary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		String command1 = "gcc " + outputFile + " -o " + this.compiledBinary.toString();
		Utility.runCProgram(command1);
		if(!Files.exists(compiledBinary)) {
			return 0;
		}

		int count = 0;
		for (String input : suite.keySet()) {
			String output = suite.get(input);
			String s2 = Utility.runCProgramWithInput(compiledBinary.toString(), input);

			if (s2.isEmpty()) {
				continue;
			}

			if (checkPassForOneCase(s2, output, input))
				count++;
		}
		return count;
	}

	private boolean checkPassForOneCase(String s2, String output, String input) {
		Utility.writeTOFile(this.tempOutput, s2);
		Utility.writeTOFile(this.outputfile, output);
		Utility.writeTOFile(this.inputfile, input);

		String s = Utility.runCProgramWithPythonCommand(this.compiledBinary.toString(),
				this.tempOutput, this.inputfile, this.outputfile, this.program);
		if (s.trim().endsWith("Test passed."))
			return true;
		else
			return false;

	}

	private boolean passAllPositive(String source, String outputFile) {
		try {
			Files.deleteIfExists(this.compiledBinary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// possible TODO: put pull out all the compile stuff into a utility function
		String command1 = "gcc " + outputFile + " -o " + this.compiledBinary.toString();
		Utility.runCProgram(command1);
		
		if(!Files.exists(this.compiledBinary)) {
			return false;
		}

		HashMap<String,String> positives = this.trainingTests.getPositives();
		for (String input : positives.keySet()) {
			String output = positives.get(input);

			String s2 = Utility.runCProgramWithInput(this.compiledBinary.toString(), input);

			if (s2.isEmpty()) {
				return false;
			}
			if (!checkPassForOneCase(s2, output, input))
				return false;

		}
		return true;
	}

	private String generateOutputFile(String input) {
		String outputfile = this.compiledBinary.toString() + ".new.c";
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(outputfile)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(this.programSource)));
			String s = null;

			for (int i = 1; i < buggy[0]; i++) {
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}

			writer.write(input);

			for (int i = buggy[0]; i <= buggy[1]; i++) {
				s = reader.readLine();

			}

			while ((s = reader.readLine()) != null) {
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			return "";
		}
		return outputfile;
	}

	// for debug only:
	private void printResult() {
		int i = 0;
		for (String source : info.getResult().getSearchMapping().keySet()) {
			i++;
			System.out.println("result" + i + "\n--------------------");
			System.out.println(source);

		}

	}

	private void searchOverRepository() {
		try {
			PrototypeSearch.search(info, repo);

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private boolean constructProfile() {
		if (insertStateStatements(this.programSource)) { 
			obtainPositiveStates();
			return true;
		} else
			return false;
	}

	private void obtainPositiveStates() {
		String sourceFile = this.compiledBinary + ".state.c";  
		for (String input : this.getPositives().keySet()) {
			try {
				Files.deleteIfExists(this.compiledBinary);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String command1 = "gcc " + sourceFile + " -o " + this.compiledBinary;
			String s1 = Utility.runCProgram(command1);
			if (s1.equals("failed"))
				continue;
			String s2 = Utility.runCProgramWithInput(this.compiledBinary.toString(), input);
			if (s2.trim().isEmpty())
				return;
			String[] entries = s2.split("_nextloop_");
			for (String entry : entries) {
				int inputStart = entry.indexOf("inputStart:");
				int inputEnd = entry.indexOf("inputEnd");
				int outputStart = entry.indexOf("outputStart:");
				// int outputEnd = s2.indexOf("outputEnd");
				if (inputStart == -1)
					continue;
				if (outputStart == -1)
					continue;

				List<String> inputList = new ArrayList<String>();
				List<String> outputList = new ArrayList<String>();

				String[] elems = entry.substring(inputStart + 11, inputEnd)
						.split("_VBC_");
				for (String e : elems) {
					if (e.equals(""))
						continue;
					inputList.add(e);
				}
				for (String o : entry.substring(outputStart + 12)
						.split("_VBC_")) {
					if (o.equals(""))
						continue;
					outputList.add(o);
				}
				info.getPositives().put(inputList, outputList);
			}
		}

	}

	/* 
	 * firstly, erase all of include statements and insert Mark, make a copy in
	 * prefix.mark get the target function using FuncitionExtractor, the entire
	 * function String Using state to obtain input and output variables and its
	 * types make a copy prefix_copy.c of original source file, and insert input
	 * and put statements
	 * 
	 * @return
	 */
	private boolean insertStateStatements(String original) {
		String markFile = insertMark(original);

		String target = getFunction(markFile);
		String[] states = getStatesStatement(target);
		if (states == null)
			return false;
		writeStatesStatement(states);
		return true;

	}

	private String writeStatesStatement(String[] states) {
		String fileName = this.compiledBinary.toString() + ".state.c"; 
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(fileName)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(this.compiledBinary.toString() + ".c"))); 
			String s = null;

			for (int i = 1; i < buggy[0]; i++) {
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}

			writer.write(states[0]);
			writer.write("\n");
			writer.flush();

			for (int i = buggy[0]; i <= buggy[1]; i++) {
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			writer.write(states[1]);
			writer.write("\n");
			writer.flush();

			while ((s = reader.readLine()) != null) {
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			return "";
		}
		return fileName;
	}

	private String[] getStatesStatement(String target) {
		String[] states = null;

		Map<String, String> variables = new HashMap<String, String>();
		try {
			InputStream stream = new ByteArrayInputStream(target.getBytes());
			ANTLRInputStream input = new ANTLRInputStream(stream);
			FunctionLexer lexer = new FunctionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FunctionParser parser = new FunctionParser(tokens);
			getStatesVariables(parser.prog().function(), variables);
			// stream.close();

		} catch (Exception e) {
			return null;
		}
		if (variables.isEmpty())
			return null;
		states = configureStatStatment(variables);
		return states;
	}

	private String[] configureStatStatment(Map<String, String> variables) {
		String[] states = new String[2];
		String inputbegin = "printf(\"inputStart:";
		String inputend = "";
		String outputbegin = "printf(\"outputStart:";
		String outputend = "";

		for (String id : variables.keySet()) {
			String type = variables.get(id);
			if (type.equals("int")) {
				String begin = id + ":%d:int_VBC_";
				String end = id + ", ";
				inputbegin += begin;
				inputend += end;
				outputbegin += begin;
				outputend += end;
			} else if (type.equals("char")) {
				String begin = id + ":%d:char_VBC_";
				String end = id + ", ";
				inputbegin += begin;
				inputend += end;
				outputbegin += begin;
				outputend += end;
			} else if (type.equals("float") || type.equals("double")) {
				String begin = id + ":%f:float_VBC_";
				String end = id + ", ";
				inputbegin += begin;
				inputend += end;
				outputbegin += begin;
				outputend += end;
			} else if (type.equals("char*")) {
				String begin = id + ":%s:char*_VBC_";
				String end = id + ", ";
				inputbegin += begin;
				inputend += end;
				outputbegin += begin;
				outputend += end;
			}
		}
		System.out.println(inputend);
		states[0] = inputbegin.subSequence(0, inputbegin.length())
				+ "inputEnd\", " + inputend.substring(0, inputend.length() - 2)
				+ ");";
		states[1] = outputbegin.subSequence(0, outputbegin.length())
				+ "_nextloop_\", "
				+ outputend.substring(0, outputend.length() - 2) + ");";
		return states;
	}

	private void getStatesVariables(FunctionContext function,
			Map<String, String> variables) {
		// formals
		List<FormalParameterContext> fpc = function.parameters()
				.formalParameter();
		this.outputType = function.type().getText().trim();
		for (FormalParameterContext fp : fpc) {
			String type = fp.type().getText();
			String id = fp.ID().getText();
			variables.put(fp.ID().getText(), fp.type().getText());
		}

		Map<String, String> local = getBlockVariable(function.block());
		for (String s : local.keySet()) {
			variables.put(s, local.get(s));
		}

	}

	private boolean find = false;

	private void add(If_statContext ifstat, Map<String, String> variables) {
		for (BlockContext block : ifstat.block()) {
			Map<String, String> local = getBlockVariable(block);
			if (find) {
				for (String s : local.keySet()) {
					variables.put(s, local.get(s));
				}
				break;
			} else
				continue;
		}

	}

	private Map<String, String> getBlockVariable(BlockContext block) {
		Map<String, String> variables = new HashMap<String, String>();
		if (find)
			return variables;
		for (StatContext statCon : block.stat()) {
			// System.out.println(statCon.getText());
			if (statCon.getText().equals(MARKINPUT)) {
				find = true;
				break;
			}
			ParseTree child = statCon.getChild(0);
			if (child instanceof DeclarationStatContext) {
				DeclarationStatContext decl = (DeclarationStatContext) child;
				add(decl, variables);
			} else if (child instanceof AssignStatContext) {
				AssignStatContext assign = (AssignStatContext) child;
				add(assign, variables);
			} else if (child instanceof If_statContext) {
				If_statContext ifstat = (If_statContext) child;
				add(ifstat, variables);
			}
		}
		return variables;
	}

	private void add(AssignStatContext assign, Map<String, String> variables) {
		if (assign.type() == null)
			return;
		String type = assign.type().getText();
		String id = assign.ID().getText();
		variables.put(id, type);

	}

	private void add(DeclarationStatContext decl, Map<String, String> variables) {
		String type = decl.type().getText();
		if (decl.getText().contains("[") || decl.getText().contains("*")) {
			type = type + '*';
		}
		for (int i = 0; i < decl.ID().size(); i++) {
			variables.put(decl.ID(i).getText(), type);
		}
	}

	/**
	 * extract the target function, whose name is the same as casePrefix
	 * 
	 * @param markFile
	 * @return
	 */
	private String getFunction(String markFile) {
		String output = "";
		try {
			String fileString = Utility.getStringFromFile(markFile);
			int start = -1;
			int end = -1;
			Stack<Character> stack = new Stack<Character>();
			Stack<Integer> index = new Stack<Integer>();
			for (int i = 0; i < fileString.length(); i++) {
				char c = fileString.charAt(i);
				if (c == '{') {
					stack.add(c);
					index.push(i);
				} else if (c == '}') {
					stack.pop();
					int temp = index.pop();
					if (stack.isEmpty()) {
						start = temp;
						end = i;
					}
				}
			}

			start = fileString.substring(0, start - 1).lastIndexOf('}');
			output = fileString.substring(start + 1, end + 1);

		} catch (Exception e) {
			System.out.println(e);
			return "";
		}
		return output;
	}

	/**
	 * insert mark, and erase include statement, write the content into
	 * this.casePrefix.mark
	 * 
	 * @param original
	 * @return
	 */
	private String insertMark(String original) {
		String output = this.compiledBinary.toString() + ".mark";
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(output)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(this.programSource)));
			String s = null;

			for (int i = 1; i < buggy[0]; i++) {
				s = reader.readLine();
				if (s.trim().startsWith("#"))
					continue;
				// if(!find && !s.contains(function)) continue;
				// find = true;
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}

			writer.write(RegionInstance.MARKINPUT);
			writer.write("\n");
			writer.flush();

			for (int i = buggy[0]; i <= buggy[1]; i++) {
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			writer.write(RegionInstance.MARKOUTPUT);
			writer.write("\n");
			writer.flush();

			while ((s = reader.readLine()) != null) {
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return output;
	}

	/**
	 * get input/output pairs, and buggy lines info
	 * 
	 * @param caseFile
	 */
	private void parse(String caseFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(caseFile)));
			String line = null;
			boolean neg = false;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.startsWith("positive:")) {
					neg = false;
				} else if (line.startsWith("negative:")) {
					neg = true;
				} else if (line.startsWith("buggy lines:")) {
					String[] lines = line.substring(12).split("-");
					buggy[0] = Integer.valueOf(lines[0]);
					buggy[1] = Integer.valueOf(lines[1]);
				} else if (line.startsWith("input:")) {
					int index = line.indexOf("output:");
					String input = line.substring(6, index);
					String output = line.substring(index + 7);
					if (neg) {
						this.trainingTests.addNegativeTest(input.trim(), output.trim());
					} else {
						this.trainingTests.addPositiveTest(input.trim(), output.trim());
					}
				} else {
					continue;
				}
			}
			br.close();
		} catch (Exception e) {
			return;
		}

	}

	public HashMap<String, String> getPositives() {
		return this.trainingTests.getPositives();
	}

	public void setPositives(HashMap<String, String> positives) {
		this.trainingTests.setPositives(positives);
	}

	public HashMap<String, String> getNegatives() {
		return this.trainingTests.getNegatives();
	}

	public void setNegatives(HashMap<String, String> negatives) {
		this.trainingTests.setNegatives(negatives);
	}

	public CaseInfo getInfo() {
		return info;
	}


	public int[] getBuggy() {
		return buggy;
	}

	public void setBuggy(int[] buggy) {
		this.buggy = buggy;
	}

	public ProgramTests getValidationTests() {
		return verifications;
	}

	public void setValidationTests(ProgramTests verifications) {
		this.verifications = verifications;
	}

	// FIXME: consider adding test cases back in when done
//	public static void main(String[] args) {
//		SearchCase case1 = new SearchCase("TestCases/examples/test1", 2);
//		// case1.print();
//	}

	public void searchJustOnMap() {
		try {
			info.setResult(new ResultObject());
			PrototypeSearch.searchOnlyMatchType(info, repo);
			//this.printResult();
			this.ruleOutFalsePositive();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
