package Library;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	
	
	/**
	 * get all of the content from a file
	 * @param fileName
	 * @return 
	 */
	@SuppressWarnings("resource")
	public static String getStringFromFile(String fileName){
		BufferedReader reader;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String s = null;
			
			while((s = reader.readLine()) != null){
				sb.append(s);
				sb.append('\n');
			}
			return sb.toString();
		} catch (Exception e) {
			
		}
		return sb.toString();
	}
	
	public static String invokeZ3onFile(String file) {
		String out = "";
		String execString = "CSMT/z3"
				+ " -smt2 -nw -file:" + file;
		//System.out.println(execString);
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(execString);

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));
//			BufferedReader ls_err = new BufferedReader(new InputStreamReader(
//					ls_proc.get));

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
//				while((ls_str = ls_err.readLine()) != null){
//					System.out.println(ls_str+ "j");
//					sb.append(ls_str);
//				}
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
}
