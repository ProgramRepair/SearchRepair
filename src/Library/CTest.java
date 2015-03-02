package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import test.Test;
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
					sb.append("unknown - killed");
				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					// System.out.println(ls_str);
				}
				while((ls_str = ls_err.readLine()) != null){
					System.out.println(ls_str+ "j");
					sb.append(ls_str);
				}
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
	
	public static void main(String[] args) throws IOException, InterruptedException{
		//String command = "gcc ccode/test.c -o test";
		String g = Utility.getStringFromFile("ccode/test.c");
		String command = "gcc   ccode/test.c -o test.o";
		//Test.invokeZ3onFile("ctest/test/temp");
		CTest.runCProgram(command);
		String s = runCProgram("./test.o");
		System.out.println(s);
		//Process p = Runtime.getRuntime().exec(command);
		//p.waitFor();
		//Thread.currentThread().sleep(3000);
		//Process ls_proc = Runtime.getRuntime().exec(command);
		//System.out.println(g);
	}

}
