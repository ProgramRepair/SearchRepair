package LoopAndResursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import search.ResultObject;

public class LRCaseInfo {
	
	private List<Map<List<String>, List<String>>> positives;
	private List<Map<List<String>, List<String>>> negatives;
	
	private ResultObject result;
	
	

	public LRCaseInfo() {
		this.positives = new ArrayList<Map<List<String>, List<String>>>();
		this.negatives = new ArrayList<Map<List<String>, List<String>>>();
		this.result = new ResultObject();
	}

	public List<Map<List<String>, List<String>>> getPositives() {
		return positives;
	}

	public void setPositives(List<Map<List<String>, List<String>>> positives) {
		this.positives = positives;
	}

	public List<Map<List<String>, List<String>>> getNegatives() {
		return negatives;
	}

	public void setNegatives(List<Map<List<String>, List<String>>> negatives) {
		this.negatives = negatives;
	}

	public ResultObject getResult() {
		return result;
	}

	public void setResult(ResultObject result) {
		this.result = result;
	}
	
	public void print(){
		System.out.println("positive:");
		for(int i = 0; i < this.getPositives().size(); i++){
			Map<List<String>, List<String>> map = this.getPositives().get(i);
			for(List<String> input : map.keySet()){
				List<String> output = map.get(input);
				for(int j = 0; j < input.size(); j++){
					System.out.print(input.get(j));
				}
				for(int j = 0; j < output.size(); j++){
					System.out.print(output.get(j));
				}
				System.out.println();
			}
		}
		
		System.out.println("negative:");
		for(int i = 0; i < this.getNegatives().size(); i++){
			Map<List<String>, List<String>> map = this.getNegatives().get(i);
			for(List<String> input : map.keySet()){
				List<String> output = map.get(input);
				for(int j = 0; j < input.size(); j++){
					System.out.print(input.get(j));
				}
				for(int j = 0; j < output.size(); j++){
					System.out.print(output.get(j));
				}
				System.out.println();
			}
		}
	}
	
	

}
