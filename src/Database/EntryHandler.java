package Database;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class EntryHandler {
	public static String PATH_CONSTRAINT_MID = "_yalin_autofix_mid\n";
	public static String PATH_CONSTRAINTS_SEPERATOR = "_yalin_autofix_end\n";
	
	public static void save(EntryObject object){
		DataBaseManager.connect(DataBaseManager.USER, DataBaseManager.PASSWORD, DataBaseManager.DATABASE);
		String source = object.getSource();
		String constraint = formatPathConstraints(object.getPathConstraint());
		
		//String introduced = formatInput(object.getIntroduced());
		String type = formatVariableType(object.getVariablesTypes());
		String variableTrack = formatVariableTrack(object.getVariableTrack());
		String variablesMap = formatVariableMap(object.getVariableMap());
		String sql = "insert into prototype (source, constraints, variableType, variableTrack, variableMap) " +
				"values(?, ?, ?, ?, ?)";
		PreparedStatement  statement = null;
		try{
			statement = DataBaseManager.conn.prepareStatement(sql);
			statement.setString(1, source);
			statement.setString(2, constraint);
			statement.setString(3, type);
			statement.setString(4, variableTrack);
			statement.setString(5, variablesMap);
			statement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static String formatPathConstraints(
			Map<String, String> pathConstraint) {
		String input = "";
		for(String s : pathConstraint.keySet()){
			input =  input + s + EntryHandler.PATH_CONSTRAINT_MID + pathConstraint.get(s) + EntryHandler.PATH_CONSTRAINTS_SEPERATOR;
		}
		return input;
	}
	
	public static Map<String, String> retorePathConstraints(String s){
		Map<String, String> map = new HashMap<String, String>();
		String[] entries = s.split( EntryHandler.PATH_CONSTRAINTS_SEPERATOR);
		for(String entry : entries){
			String[] m = entry.split(PATH_CONSTRAINT_MID);
			map.put(m[0], m[1]);
		}
		return map;
	}

	//use ':' to seperate variable name and type, and use '\n' to separate every variable
	private static String formatVariableTrack(Map<String, String> variableTrack) {
		String input = "";
		for(String s : variableTrack.keySet()){
			input = input + s + ":" + variableTrack.get(s) + "\n";
		}
		return input;
	}
	
	public static Map<String, String> retoreVariableTrack(String s){
		Map<String, String> map = new HashMap<String, String>();
		String[] entries = s.split( "\n");
		for(String entry : entries){
			String[] m = entry.split(":");
			map.put(m[0], m[1]);
		}
		return map;
	}


	//use ':' to seperate variable name and type, and use '\n' to separate every variable
	private static String formatVariableType(Map<String, String> variablesTypes) {
		String input = "";
		for(String s : variablesTypes.keySet()){
			input = input + s + ":" + variablesTypes.get(s) + "\n";
		}
		return input;
	}
	
	public static Map<String, String> retoreVariableType(String s){
		Map<String, String> map = new HashMap<String, String>();
		String[] entries = s.split( "\n");
		for(String entry : entries){
			String[] m = entry.split(":");
			map.put(m[0], m[1]);
		}
		return map;
	}

	//use ':' to seperate variable name and type, and use '\n' to separate every variable
	private static String formatVariableMap(Map<String, String> variableMap) {
		String input = "";
		for(String s : variableMap.keySet()){
			input = input + s + ":" + variableMap.get(s) + "\n";
		}
		return input;
	}
	
	public static Map<String, String> retoreVariableMap(String s){
		Map<String, String> map = new HashMap<String, String>();
		String[] entries = s.split( "\n");
		for(String entry : entries){
			String[] m = entry.split(":");
			map.put(m[0], m[1]);
		}
		return map;
	}



	
	
	public static void main(String[] args){
		String content = Utility.getStringFromFile("./ctest/methods/test.c");
		//save(content);
	}
}
