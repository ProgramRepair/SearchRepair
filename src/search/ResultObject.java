package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultObject {
	
	private List<String> source;
	private String path;
	private Map<String, String> pathVariablesTypes;
	private Map<String, String> pathVariableTrack;
	private Map<String, String> pathVariableMap;
	private Map<String, Map<String, String>> searchMapping;
	
	public ResultObject(){
		this.source = new ArrayList<String>();
		this.path = "";
		this.pathVariablesTypes = new HashMap<String, String>();
		this.pathVariableMap  = new HashMap<String, String>();
		this.pathVariableTrack = new HashMap<String, String>();
		this.searchMapping = new HashMap<String, Map<String, String>>();

	}
	

	
	
	

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Map<String, String> getPathVariablesTypes() {
		return pathVariablesTypes;
	}
	public void setPathVariablesTypes(Map<String, String> pathVariablesTypes) {
		this.pathVariablesTypes = pathVariablesTypes;
	}
	public Map<String, String> getPathVariableTrack() {
		return pathVariableTrack;
	}
	public void setPathVariableTrack(Map<String, String> pathVariableTrack) {
		this.pathVariableTrack = pathVariableTrack;
	}
	public Map<String, String> getPathVariableMap() {
		return pathVariableMap;
	}
	public void setPathVariableMap(Map<String, String> pathVariableMap) {
		this.pathVariableMap = pathVariableMap;
	}






	public void addSource(String source2) {
		this.source.add(source2);
		//this.searchMapping.
		
	}






	public List<String> getSource() {
		return source;
	}






	public void setSource(List<String> source) {
		this.source = source;
	}






	public Map<String, Map<String, String>> getSearchMapping() {
		return searchMapping;
	}






	public void setSearchMapping(Map<String, Map<String, String>> searchMapping) {
		this.searchMapping = searchMapping;
	}






	public void addSearchMapping(String source, Map<String, String> map) {
		this.searchMapping.put(source, map);
		
	}

	
	

}
