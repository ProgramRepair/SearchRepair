package lookups;

import java.util.HashMap;
import java.util.Map;


/**
 * singleton class
 * @author yke
 *
 */
public class PointerTable {
	private Map<String, String> valueMap;
	private static PointerTable table = new PointerTable();
	private Map<String, String> typeMap;
	
	private PointerTable(){
		valueMap = new HashMap<String, String>();
		typeMap = new HashMap<String, String>();
	}
	
	public static  PointerTable getInstance(){
		return table;
	}
	
	public void setValue(String key, String value){
		valueMap.put(key, value);
	}
	
	public void setType(String key, String type){
		typeMap.put(key, type);
	}
	
	public void remove(String key){
		if(valueMap.containsKey(key)) valueMap.remove(key);
		if(typeMap.containsKey(key)) typeMap.remove(key);
	}
	
	public String getType(String key){
		return typeMap.get(key);
	}
	
	public String getValue(String key){
		return valueMap.get(key);
	}
	
}
