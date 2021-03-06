package Database;

import java.util.HashMap;
import java.util.Map;

public class EntryObject {
	//private String name;
	private String source;
	private Map<String, String> pathConstraint;
	private Map<String, String> pathVariablesTypes;
	private Map<String, String> pathVariableTrack;
	private Map<String, String> pathVariableMap;
	private Map<String, String> pathFormalVariables;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}


	public Map<String, String> getPathFormalVariables() {
		return pathFormalVariables;
	}
	public void setPathFormalVariables(Map<String, String> pathFormalVariables) {
		this.pathFormalVariables = pathFormalVariables;
	}
	public EntryObject() {
		source = "";
		this.pathConstraint = new HashMap<String, String>();
		this.pathVariablesTypes = new HashMap<String, String>();
		this.pathVariableTrack = new HashMap<String, String>();
		this.pathVariableMap = new HashMap<String, String>();
		this.pathFormalVariables = new HashMap<String, String>();
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
	public Map<String, String> getPathConstraint() {
		return pathConstraint;
	}
	public void setPathConstraint(Map<String, String> pathConstraint) {
		this.pathConstraint = pathConstraint;
	}


}
