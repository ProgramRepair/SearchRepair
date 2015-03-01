package Database;

public class DataHandler {
	public static String VARIABLE_TYPE = ":";
	public static String VARIABLE_MAP = ":";
	public static String VARIABLE_TRACK = ":";
	
	public static String concat(String left, String right){
		return left + VARIABLE_TYPE + right;
	}
	

}
