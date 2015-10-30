package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Utility {

	/**
	 * get all of the content from a file
	 * 
	 * @param fileName
	 * @return
	 */
	@SuppressWarnings("resource")
	public static String getStringFromFile(String fileName) {
		BufferedReader reader;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName)));
			String s = null;

			while ((s = reader.readLine()) != null) {
				sb.append(s);
				sb.append('\n');
			}
			reader.close();
			return sb.toString();
		} catch (Exception e) {
			return "";
		}
	}

	public static String runCProgramWithPythonCommand(String testingExe,
			String tempOuputFile, String inputFile, String outputFile, String programName) {
		String command = "/Users/clegoues/research/autobugfix/autobugfix-yalin/executors/genprog_tests.py --program "
				+ programName
				+ " "
				+ tempOuputFile
				+ " "
				+ outputFile
				+ " "
				+ inputFile;
		String s = Utility.runCProgram(command);
		return s;
	}

	
	public static String invokeZ3onFile(String file) {
		String out = "";
		String execString = "executors/z3" + " -smt2 -nw -file:" + file;
		// System.out.println(execString);
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(execString);

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));
			// BufferedReader ls_err = new BufferedReader(new InputStreamReader(
			// ls_proc.get));

			long now = System.currentTimeMillis();
			long timeoutInMillis = 100L * 10; // timeout in seconds
			long finish = now + timeoutInMillis;

			try {
				while (isAlive(ls_proc)
						&& (System.currentTimeMillis() < finish)) {
					Thread.sleep(10);
				}
				if (isAlive(ls_proc)) {
					ls_proc.destroy();
					sb.append("unknown - killed");
				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					// System.out.println(ls_str);
				}
				// while((ls_str = ls_err.readLine()) != null){
				// System.out.println(ls_str+ "j");
				// sb.append(ls_str);
				// }
			} catch (IOException e) {
				out = sb.toString();
				// System.exit(0);
			} catch (InterruptedException e) {
				out = sb.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		out = sb.toString();
		return out;
	}

	public static boolean isAlive(Process p) {
		try {
			p.exitValue();
			return false;
		} catch (IllegalThreadStateException e) {
			return true;
		}
	}

	/**
	 * eliminate all of comments
	 * 
	 * @param absolutePath
	 * @return
	 */
	public static String getStringFromFile1(String absolutePath) {
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(absolutePath)));
			String s = null;

			while ((s = reader.readLine()) != null) {
				String temp = s.trim();
				if (temp.startsWith("#") || temp.startsWith("*")
						|| temp.startsWith("//"))
					continue;
				int index = temp.indexOf("/*");
				if (index != -1)
					temp = temp.substring(0, index);
				index = temp.lastIndexOf("*/");
				if (index != -1)
					temp = temp.substring(index + 2);
				sb.append(temp);
				sb.append('\n');
			}
			reader.close();
			return sb.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	// FIXME: try to nuke this, and holy mother, why are the semantics on this backwards?
	public static void writeTOFile(String path, String input) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			pw.print(input);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// left off on initializetesting, where this function is a problem.
	public static void copyDirOK(Path copyFrom, Path copyTo) throws IOException {
		try {
		Files.copy(copyFrom, copyTo, StandardCopyOption.REPLACE_EXISTING);
		} catch(DirectoryNotEmptyException e) {
			// this is explicitly OK
		}

	}
	

	// FIXME: try to nuke this
	public static void copy(String file1, String file2) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file1)));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file2)));
			String s = null;
			while ((s = br.readLine()) != null) {
				bw.write(s);
				bw.write("\n");
			}
			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String runCProgramWithInput(String command2, String input) {
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(command2);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					ls_proc.getOutputStream()));
			writer.write(input);
			writer.flush();

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));

			long now = System.currentTimeMillis();
			long timeoutInMillis = 100L * 10; // timeout in seconds
			long finish = now + timeoutInMillis;

			try {
				while (isAlive(ls_proc)
						&& (System.currentTimeMillis() < finish)) {
					Thread.sleep(10);
				}

				if (isAlive(ls_proc)) {
					ls_proc.destroy();
				}

				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					sb.append("\n");
					// System.out.println(ls_str);
				}

			} catch (IOException e) {
				out = "";
				// System.exit(0);
			} catch (Exception e) {
				out = "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			out = "";
		}
		out = sb.toString();
		return out;
	}

	public static String runCProgram(String command) {
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(command);
			// System.out.println(ls_proc.exitValue());

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));
			BufferedReader ls_err = new BufferedReader(new InputStreamReader(
					ls_proc.getErrorStream()));

			long now = System.currentTimeMillis();
			long timeoutInMillis = 100L * 10; // timeout in seconds
			long finish = now + timeoutInMillis;

			try {
				while (isAlive(ls_proc)
						&& (System.currentTimeMillis() < finish)) {
					Thread.sleep(10);
				}
				if (isAlive(ls_proc)) {
					ls_proc.destroy();
					sb.append("failed");
				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					sb.append("\n");
				}
				while ((ls_str = ls_err.readLine()) != null) {
					sb.append("failed");
					break;
				}

			} catch (IOException e) {
				sb.append("failed");
			} catch (Exception e) {
				sb.append("failed");
			}
		} catch (Exception e) {
			sb.append("failed");
		}

		out = sb.toString();
		return out;
	}

	public static String removeExtension(String filename) {

	    // Remove the extension.
	    int extensionIndex = filename.lastIndexOf(".");
	    if (extensionIndex == -1)
	        return filename;

	    return filename.substring(0, extensionIndex);
	}
}
