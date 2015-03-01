package lookups;

import java.util.HashMap;
import java.util.Map;


/**
 * singleton class
 * @author yke
 *
 */
public class TypeTable {
	private static TypeTable table = new TypeTable();
	private Map<String, String> map;
	
	private TypeTable(){
		map = new HashMap<String, String>();
		map.put("int", "Int");
		map.put("char[]", "String");
		map.put("char", "Int");
		map.put("float", "Real");
		map.put("float*", "FloatPointer");
		map.put("int*", "IntPointer");
		map.put("char*", "String");
	}
	
	public static TypeTable getInstance(){
		return table;
	}
	
	public String getType(String s){
		return map.get(s);
	}
}
