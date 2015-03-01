package lookups;

import java.util.HashMap;
import java.util.Map;


/**
 * singleton class
 * @author yke
 *
 */
public class StringReturnTable {
	private static Map<String, String> map = new HashMap<String, String>();
	private static StringReturnTable table = new StringReturnTable();
	private StringReturnTable(){
		
	}
	
	public static StringReturnTable getInstance(){
		return table;
	}
	
	public static void set(String key, String value){
		map.put(key, value);
	}
	
	public static String get(String key){
		return map.get(key);
	}
	
	public static void remove(String key){
		map.remove(key);
	}

}
