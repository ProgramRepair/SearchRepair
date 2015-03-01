package lookups;

import java.util.HashMap;
import java.util.Map;

public class ClassType {

	private static ClassType table = new ClassType();
	private Map<String, String> map;
	
	private ClassType(){
		map = new HashMap<String, String>();
		map.put("int", "Integer");
		map.put("float", "Double");
		map.put("char", "Character");
	}
	
	public static ClassType getInstance(){
		return table;
	}
	
	public String getType(String s){
		return map.get(s);
	}
}
