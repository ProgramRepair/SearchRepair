package Library;

import java.io.BufferedReader;
import java.io.FileInputStream;
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
}
