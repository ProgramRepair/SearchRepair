package Database;

public class DataHandler {
	public static String VARIABLE_MID = ":";
	public static String VARIABLE_END = ",";

	
	public static String concat(String left, String right){
		return left + VARIABLE_MID + right + VARIABLE_END;
	}
	

}
