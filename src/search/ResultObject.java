package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultObject {
	public enum ResultState {SUCCESS, CORRECT, NOPOSITIVE, FAILED};
	
//	private Map<String, String> pathVariablesTypes;
//	private Map<String, String> pathVariableTrack;
//	private Map<String, String> pathVariableMap;
	//source to mapping variables
	private Map<String, List<Map<String, String>>> searchMapping;
	private Map<String, Double> partial;
	
	//original source to applicable code after variable update
	private Map<String, String> mappingSource;	
	private List<String> falsePositve;
	private List<String> positive;
	private ResultState state;
	
	public ResultObject(){
//		this.pathVariablesTypes = new HashMap<String, String>();
//		this.pathVariableMap  = new HashMap<String, String>();
//		this.pathVariableTrack = new HashMap<String, String>();
		this.searchMapping = new HashMap<String, List<Map<String, String>>>();
		this.falsePositve = new ArrayList<String>();
		this.positive = new ArrayList<String>();
		this.partial = new HashMap<String, Double>();
		this.mappingSource = new HashMap<String, String>();
		this.state = ResultState.FAILED;
	}
	
	
	
	

	public Map<String, List<Map<String, String>>> getSearchMapping() {
		return searchMapping;
	}



	public void setSearchMapping(
			Map<String, List<Map<String, String>>> searchMapping) {
		this.searchMapping = searchMapping;
	}



	public ResultState getState() {
		return state;
	}



	public void setState(ResultState state) {
		this.state = state;
	}



	public Map<String, String> getMappingSource() {
		return mappingSource;
	}








	public void setMappingSource(Map<String, String> mappingSource) {
		this.mappingSource = mappingSource;
	}












	public Map<String, Double> getPartial() {
		return partial;
	}




	public void setPartial(Map<String, Double> partial) {
		this.partial = partial;
	}










	public List<String> getFalsePositve() {
		return falsePositve;
	}






	public void setFalsePositve(List<String> falsePositve) {
		this.falsePositve = falsePositve;
	}



	public List<String> getPositive() {
		return positive;
	}



	public void setPositive(List<String> positive) {
		this.positive = positive;
	}



	public void addSearchMapping(String source, Map<String, String> map) {
		if(this.searchMapping.containsKey(source)){
			List<Map<String, String>> list = this.searchMapping.get(source);
			list.add(map);
		}
		else{
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			list.add(map);
			this.searchMapping.put(source, list);
		}
		
	}








	
	

}
