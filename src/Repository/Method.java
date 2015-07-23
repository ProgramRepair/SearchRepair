package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method {
	private String source;
	private String name;
	private List<String> path;
	private Map<String, String> pathToInput;
	private String returnType;
	
	
	
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public Method(){
		source = null;
		name = null;
		path = new ArrayList<String>();
		pathToInput = new HashMap<String, String>();
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPath() {
		return path;
	}
	public void setPath(List<String> path) {
		this.path = path;
	}
	public Map<String, String> getPathToInput() {
		return pathToInput;
	}
	public void setPathToInput(Map<String, String> pathToInput) {
		this.pathToInput = pathToInput;
	}

	
	

}
