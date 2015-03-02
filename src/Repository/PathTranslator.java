package Repository;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PathTranslator {
	
	private String path;
	private Map<String, String> variableTrack;
	private Map<String, String> variableType;
	private Map<String, String> variableMap;
	private List<String> constraints;
	//for generating new name only
	private String fileName;
	private int count;
	
	
	
	
	
	public PathTranslator(String path) {
		super();
		this.path = path;
		this.count = 0;
		this.fileName = "_test_";
		
		applySSA();
	}
	
	
	
	

	private void applySSA() {
		List<String> ssa = new ArrayList<String>();
		InputStream stream = new ByteArrayInputStream(path.getBytes());
		
	}





	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}



	public Map<String, String> getVariableTrack() {
		return variableTrack;
	}
	public void setVariableTrack(Map<String, String> variableTrack) {
		this.variableTrack = variableTrack;
	}
	public Map<String, String> getVariableType() {
		return variableType;
	}
	public void setVariableType(Map<String, String> variableType) {
		this.variableType = variableType;
	}
	public Map<String, String> getVariableMap() {
		return variableMap;
	}
	public void setVariableMap(Map<String, String> variableMap) {
		this.variableMap = variableMap;
	}
	public List<String> getConstraints() {
		return constraints;
	}
	public void setConstraints(List<String> constraints) {
		this.constraints = constraints;
	}
	
	

}
