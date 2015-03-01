package search;

import java.util.Map;

public class ResultObject {
	
	private String source;
	private String path;
	private Map<String, String> pathVariablesTypes;
	private Map<String, String> pathVariableTrack;
	private Map<String, String> pathVariableMap;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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
	
	

}
