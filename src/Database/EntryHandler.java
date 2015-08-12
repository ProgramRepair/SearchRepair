package Database;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class EntryHandler {
	public static String PATH_CONSTRAINT = "_yalin_autofix_constraint\n";
	public static String PATH_SEPERATOR = "_yalin_autofix_end\n";
	public static String PATH_VARIABLE_TYPE = "_yalin_autofix_type\n";
	public static String PATH_VARIABLE_TRACK = "_yalin_autofix_track\n";
	public static String PATH_VARIABLE_MAP = "_yalin_autofix_map\n";
	public static String PATH_VARIABLE_Formal = "_yalin_autofix_formal\n";
	
	public static void save(EntryObject object, String table){
		DataBaseManager.connect();
		String source = object.getSource();
		String constraint = formatPathConstraints(object.getPathConstraint());
		
		//String introduced = formatInput(object.getIntroduced());
		String type = formatVariableType(object.getPathVariablesTypes());
		String variableTrack = formatVariableTrack(object.getPathVariableTrack());
		String variablesMap = formatVariableMap(object.getPathVariableMap());
		String formals = formatFormals(object.getPathFormalVariables());
		String sql = "insert into " + table + " (source, constraints, variableType, variableTrack, variableMap, variableFormal) " +
				"values(?, ?, ?, ?, ?, ?)";
		PreparedStatement  statement = null;
		try{
			statement = DataBaseManager.conn.prepareStatement(sql);
			statement.setString(1, source);
			statement.setString(2, constraint);
			statement.setString(3, type);
			statement.setString(4, variableTrack);
			statement.setString(5, variablesMap);
			statement.setString(6, formals);
			statement.execute();
			statement.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

	
	private static String formatFormals(Map<String, String> pathFormalVariables) {
		return format(pathFormalVariables, EntryHandler.PATH_VARIABLE_Formal, EntryHandler.PATH_SEPERATOR);
	}




	private static String formatVariableMap(Map<String, String> pathVariableMap) {
		return format(pathVariableMap, EntryHandler.PATH_VARIABLE_MAP, EntryHandler.PATH_SEPERATOR);
	}




	private static String formatVariableTrack(
			Map<String, String> pathVariableTrack) {
		return format(pathVariableTrack, EntryHandler.PATH_VARIABLE_TRACK, EntryHandler.PATH_SEPERATOR);
	}




	private static String formatVariableType(
			Map<String, String> pathVariablesTypes) {
		
		return format(pathVariablesTypes, EntryHandler.PATH_VARIABLE_TYPE, EntryHandler.PATH_SEPERATOR);
	}

	private static String format(Map<String, String> map, String midSeperator, String entrySeperator){
		String input = "";
		for(String s : map.keySet()){
			input =  input + s + midSeperator + map.get(s) + entrySeperator;
		}
		return input;
	}


	private static String formatPathConstraints(
			Map<String, String> pathConstraint) {
		String input = "";
		for(String s : pathConstraint.keySet()){
			input =  input + s + EntryHandler.PATH_CONSTRAINT + pathConstraint.get(s) + EntryHandler.PATH_SEPERATOR;
		}
		return input;
	}
	
	public static Map<String, String> retorePathConstraints(String s){
		Map<String, String> map = new HashMap<String, String>();
		String[] entries = s.split( EntryHandler.PATH_SEPERATOR);
		for(String entry : entries){
			String[] m = entry.split(PATH_CONSTRAINT);
			map.put(m[0], m[1]);
		}
		return map;
	}

	



	
	
	public static void main(String[] args){
		String content = Utility.getStringFromFile("./ctest/methods/test.c");
		//save(content);
	}
}
