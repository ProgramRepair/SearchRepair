package Library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import InputAndOuput.CaseInfo;




public class CTest {
	
	
	public List<List<String>> getPositiveParameters(CaseInfo info){
		List<List<String>> lists = new ArrayList<List<String>>();
		for(List<String> input : info.getPositives().keySet()){
			List<String> parameters = new ArrayList<String>();
			for(String s : input){
				String p = s.split(":")[0];
				if(p.startsWith("\"")) p = p.substring(1, p.length() - 1);
				parameters.add(p);
			}
			lists.add(parameters);
		}
		return lists;
	}
	
	public List<List<String>> getNegativeParameters(CaseInfo info){
		List<List<String>> lists = new ArrayList<List<String>>();
		for(List<String> input : info.getNegatives().keySet()){
			List<String> parameters = new ArrayList<String>();
			for(String s : input){
				String p = s.split(":")[0];
				if(p.startsWith("\"")) p = p.substring(1, p.length() - 1);
				parameters.add(p);
			}
			lists.add(parameters);
		}
		return lists;
	}
	
	
	public String processBuilder(String command, String inputFile, String outputFile){
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try{
			
		}catch(Exception e){
			ProcessBuilder process = new ProcessBuilder(command);
			//process.redirectInput();
		}
		
		return out;
	}
	
	
	public String[] getCommand(List<String> args, String filePath){
		String[] command = new String[2];
		command[0] = "gcc " + filePath + " " + args.size() + " ";
		for(String s : args){
			command[0] = command[0] + s + " ";
		}
		command[0] = command[0]  + " -o test ";
		command[1] = "./test";
		return command;
	}
	
	
	public static String runCProgram(String command){
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(command);
//			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ls_proc.getOutputStream()));
//			writer.write("3 2 1\n");
//			writer.flush();

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
					sb.append("");
				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					// System.out.println(ls_str);
				}
				while((ls_str = ls_err.readLine()) != null){
					System.out.println(ls_str);
					sb.append(ls_str);
				}
				if (isAlive(ls_proc)) {
					ls_proc.destroy();
				//sb.append("unknown - killed");
				}
			} catch (IOException e) {
				out = "";
				// System.exit(0);
			} catch (Exception e) {
				out = "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			out= "";
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
	
	public static void main(String[] args) throws IOException, InterruptedException{
		//String command = "gcc ccode/test.c -o test";
		String g = Utility.getStringFromFile("ccode/test.c");
		String command = "gcc   ccode/test.c -o test.o";
		String commands = "gcc -fprofile-arcs -ftest-coverage ./testcases/ccode/median.c";
		//Test.invokeZ3onFile("ctest/test/temp");
		CTest.runCProgram(commands);
		String s = runCProgram("./a.out");
		System.out.println(s);
		//Process p = Runtime.getRuntime().exec(command);
		//p.waitFor();
		//Thread.currentThread().sleep(3000);
		//Process ls_proc = Runtime.getRuntime().exec(command);
		//System.out.println(g);
	}

}
