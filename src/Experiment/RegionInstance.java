package Experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
	public static String outputType = "";




//	private boolean isEmpty(ResultObject result) {
//		return info.getResult().getPartial().isEmpty()
//				&& info.getResult().getPositive().isEmpty();
//	}
//
//	private void printSearchingResult() {
//		System.out.println("True fix:\n");
//		for (String source : info.getResult().getPositive()) {
//			System.out.println(source);
//		}
//
//		System.out.println("not a fix:\n");
//		for (String source : info.getResult().getFalsePositve()) {
//			System.out.println(source);
//		}
//
//		System.out.println("partial fix:\n");
//		for (String source : info.getResult().getPartial().keySet()) {
//			System.out.println(source);
//			System.out.println("success: "
//					+ info.getResult().getPartial().get(source));
//		}
//
//	}


	
	private String generateOutputFile(String input, String compiledBinary, String programSource, int[] buggy) {
		String outputfile = compiledBinary.toString() + ".new.c";
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(outputfile)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(programSource)));
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



	/* 
	 * firstly, erase all of include statements and insert Mark, make a copy in
	 * prefix.mark get the target function using FuncitionExtractor, the entire
	 * function String Using state to obtain input and output variables and its
	 * types make a copy prefix_copy.c of original source file, and insert input
	 * and put statements
	 * 
	 * @return
	 */

	public static String writeStatesStatement(String[] states, String compiledBinary, int[] buggy) {
		String fileName = compiledBinary + ".state.c"; 
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(fileName)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(compiledBinary.toString() + ".c"))); 
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

	public static String[] getStatesStatement(String target) {
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

	private static String[] configureStatStatment(Map<String, String> variables) {
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

	private static void getStatesVariables(FunctionContext function,
			Map<String, String> variables) {
		// formals
		List<FormalParameterContext> fpc = function.parameters()
				.formalParameter();
		outputType = function.type().getText().trim();
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

	private static boolean find = false;

	private static void add(If_statContext ifstat, Map<String, String> variables) {
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

	private static Map<String, String> getBlockVariable(BlockContext block) {
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

	private static void add(AssignStatContext assign, Map<String, String> variables) {
		if (assign.type() == null)
			return;
		String type = assign.type().getText();
		String id = assign.ID().getText();
		variables.put(id, type);

	}

	private static void add(DeclarationStatContext decl, Map<String, String> variables) {
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
	public static String getFunction(String markFile) {
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
	public static String insertMark(String original, String compiledBinary, int[] buggy) {
		String output = compiledBinary + ".mark";
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(output)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(original)));
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

}
