package Database;

import java.util.HashMap;

public class DataHandler {
	public static String VARIABLE_MID = ":";
	public static String VARIABLE_END = ",";
	public static String z3TempFile = "./temp";
	public static String PROTOTYPE = "./RESOURCE";

	
	public static String concat(String left, String right){
		return left + VARIABLE_MID + right + VARIABLE_END;
	}
	

}
