package Database;

import java.util.HashMap;

public class DataHandler {
	public static final String PROTOTYPE_STRING = "./RESOURCE/STRING";
	public static final String PROTOTYPE_TYPES = "./RESOURCE/pointer";
	public static final String VARIABLE_MID = ":";
	public static final String VARIABLE_END = ",";
	public static final String z3TempFile = "./temp";
	public static final String PROTOTYPE = "./RESOURCE";

	
	public static String concat(String left, String right){
		return left + VARIABLE_MID + right + VARIABLE_END;
	}
	

}
