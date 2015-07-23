package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.log4j.Logger;

import Database.EntryHandler;
import Database.EntryObject;
import Library.Utility;

// CLG: not pretty, but fine
public class EntryAddition {

	protected static Logger logger = Logger.getLogger(EntryAddition.class);

	private static int count = 0;
	private static int save = 0;
	public static void addOneFile(String filePath, String table) {
		File file = new File(filePath);
		if (!file.exists())
			return;
		List<Method> methods = getAndParseSymExe(filePath);
		for (Method method : methods) {
			count++;

			EntryObject object;
			try {
				EntryTranslator translator = new EntryTranslator(method);
				object = translator.getEntryObject();
			} catch (Exception e) {
				System.out.println(e);
				continue;
			}
			EntryHandler.save(object, table);
			save ++;
			//			for (String path : object.getPathConstraint().keySet()) {
			//				System.out.println("constraint:\n"
			//						+ object.getPathConstraint().get(path));
			//				System.out.println("variable:\n"
			//						+ object.getPathFormalVariables().get(path));
			//				System.out.println("track:\n"
			//						+ object.getPathVariableTrack().get(path));
			//				System.out.println("type:\n"
			//						+ object.getPathVariablesTypes().get(path));
			//				System.out.println("path:\n" + path);
			//			}
		}
		logger.info("Global method count attempted so far:" + count + " successes: " + save);
	}

	public static void addOneFolder(String dirPath, String table) {
		File dir = new File(dirPath);
		if (!dir.exists())
			return;
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				addOneFolder(file.getAbsolutePath(), table);
			} else {
				addOneFile(file.getAbsolutePath(), table);
			}

		}
	}

	// parses output from my symbolic execution engine

	private static List<Method> getAndParseSymExe(String fileName) {
		// assume only one method
		List<Method> methods = new ArrayList<Method>();
		try {

			String com = "./executors/pathgen " + fileName;
			Process p = Runtime.getRuntime().exec(com);

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(p.getInputStream()));

			String s = null;
			StringBuilder path = new StringBuilder();
			StringBuilder input = new StringBuilder();
			Method method = new Method();
			boolean startParsing = false;
			boolean correct = true;
			while ((s = ls_in.readLine()) != null) {

				s = s.trim();
				if (s.startsWith("Processing:")) {
					if (method.getName() != null) {
						methods.add(method);
						method = new Method();
					}
					method.setName(s.substring(12));
				} else if (s.startsWith("LOCAL")) {
					path.append(s.substring(6, s.length() - 1));
					path.append(";");
					path.append("\n");
				} else if (s.startsWith("GLOBAL")) {
					continue;
					// path.append(s.substring(7, s.length() - 1));
					// path.append("\n");
				} else if (s.startsWith("FORMAL")) {
					input.append(s.substring(7, s.length() - 1));
					input.append("\n");
					path.append(s.substring(7, s.length() - 1));
					path.append(";");
					path.append("\n");
				} else if (s.startsWith("STMT(return")) {
					path.append(s.substring(5, s.length() - 1));
					path.append("\n");

					method.getPath().add(path.toString());
					method.getPathToInput().put(path.toString(),
							input.toString());
					System.out.println(input.toString());
					path = new StringBuilder();
					input = new StringBuilder();
					// startParsing = false;
				} else if (s.equals("Paths:")) {
					startParsing = true;
					continue;
				} else if (s.startsWith("path_enumeration")
						|| s.startsWith("postprocess")) {
					continue;
				} else if (s.startsWith("STMT(")) {
					if (s.endsWith(";)")) {
						path.append(s.substring(5, s.length() - 1));
						path.append("\n");
					} else {
						path.append(s.substring(5, s.length()));
						path.append("\n");
					}
				} else if (s.endsWith(";)")) {
					path.append(s.substring(0, s.length() - 1));
					path.append("\n");
				} else if (s.startsWith("ASSUME(")) {
					path.append(s.substring(7, s.length() - 1));
					path.append(";");
					path.append("\n");
				} else if (s.startsWith("Number of")) {
					continue;
				} else {
					if (startParsing) {
						path.append(s);
						path.append("\n");
					}
					if (s.contains("error")) {
						correct = false;
						break;
					}
				}
			}
			if (!correct) {
				methods.clear();
				return methods;
			}
			if (method.getName() != null) {
				methods.add(method);
			}

			ls_in.close();
		} catch (IOException e) {

			e.printStackTrace();
			return methods;
		}
		if (methods.isEmpty())
			return methods;
		String fileString = Utility.getStringFromFile(fileName);
		List<String> sources = new ArrayList<String>();
		List<String> types = new ArrayList<String>();
		int start = -1;
		int end = -1;
		Stack<Character> stack = new Stack<Character>();
		Stack<Integer> typeStack = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();
		for (int i = 0; i < fileString.length(); i++) {
			char c = fileString.charAt(i);
			if (c == '{') {
				if (stack.isEmpty()) {
					int g = typeStack.isEmpty() ? 0 : typeStack.pop() + 1;
					String declare = fileString.substring(g, i);
					types.add(getType(declare));
				}
				index.push(i);
				stack.add(c);
				if (!typeStack.isEmpty())
					typeStack.pop();

			} else if (c == '}') {
				stack.pop();
				typeStack.push(i);
				int temp = index.pop();
				if (stack.isEmpty()) {
					start = temp;
					end = i;
					String body = fileString.substring(start + 1, end);
					sources.add(body);
				}
			}
		}

		for (int i = 0; i < methods.size(); i++) {
			methods.get(i).setSource(sources.get(i));
			methods.get(i).setReturnType(types.get(i));
		}
		return methods;

	}

	private static String getType(String declare) {
		declare = declare.trim();
		if (declare.startsWith("int"))
			return "int";
		else if (declare.startsWith("double"))
			return "double";
		else if (declare.startsWith("char"))
			return "char";
		else if (declare.startsWith("float"))
			return "float";
		else if (declare.startsWith("char*"))
			return "char*";
		else
			return "void";
	}

	// FIXME: consider adding back in unit testing when done with refactor
//	public static void main(String[] args) throws FileNotFoundException {
//		String filePath = "./repository/future";
//		EntryAddition.addOneFolder(filePath, "future");
//		;
//		// EntryAddition.addOneFile(filePath);
//	}
}
