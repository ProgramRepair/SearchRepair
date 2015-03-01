package InputAndOuput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseInfo {
	
	Map<List<String>, List<String>> positives;
	Map<List<String>, List<String>> negatives;
	
	//one is 
	Map<String, Map<String, String>> results;
	public CaseInfo() {
		this.positives = new HashMap<List<String>, List<String>>();
		this.negatives = new HashMap<List<String>, List<String>>();
		this.results = new HashMap<String, Map<String, String>>();
	}
	public Map<List<String>, List<String>> getPositives() {
		return positives;
	}
	public void setPositives(Map<List<String>, List<String>> positives) {
		this.positives = positives;
	}
	public Map<List<String>, List<String>> getNegatives() {
		return negatives;
	}
	public void setNegatives(Map<List<String>, List<String>> negatives) {
		this.negatives = negatives;
	}
	
	
	
	public Map<String, Map<String, String>> getResults() {
		return results;
	}
	public void setResults(Map<String, Map<String, String>> results) {
		this.results = results;
	}
	public void print(){
		System.out.println("positve");
		for(List<String> list : this.positives.keySet()){
			System.out.print("input state:");
			for(String in : list){
				System.out.print(in + ",");
			}
			System.out.print("output state:");
			for(String out : this.positives.get(list)){
				System.out.print(out + ",");
			}
			System.out.println();
		}
		System.out.println("negative");
		for(List<String> list : this.negatives.keySet()){
			System.out.print("input state:");
			for(String in : list){
				System.out.print(in + ",");
			}
			System.out.print("output state:");
			for(String out : this.negatives.get(list)){
				System.out.print(out + ",");
			}
			System.out.println();
		}
	}

}
