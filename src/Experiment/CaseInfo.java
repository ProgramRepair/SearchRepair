package Experiment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import search.ResultObject;
import search.ResultObject.ResultState;

public class CaseInfo {
	
	Map<List<String>, List<String>> positives;
	Map<List<String>, List<String>> negatives;
	
	ResultObject result;
	public CaseInfo() {
		this.positives = new HashMap<List<String>, List<String>>();
		this.negatives = new HashMap<List<String>, List<String>>();
		result = new ResultObject();
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
	
	public void recordLog(String path) {
		if(new File(path).exists()) new File(path).delete();
		try {
			new File(path).createNewFile();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try{
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			if(this.getResult().getState() == ResultState.FAILED){
				pw.println("failed");
			}
			else if(this.getResult().getState() == ResultState.CORRECT){
				pw.println("correct");
			}
			else if(this.getResult().getState() == ResultState.NOPOSITIVE){
				pw.println("no positive");
			}
			else{
				if(!this.getResult().getPositive().isEmpty())
					pw.print("success");
				
				if(!this.getResult().getPartial().isEmpty()){
					pw.print(" partial");
				}
				pw.println();
				pw.println("extra pass:" + this.getResult().getBigExtra());
				pw.println("True fix:" + this.getResult().getPositive().size());
				int count = 0;
				for(String source : this.getResult().getPositive()){
					pw.println();
					pw.println();
					pw.println("True fix " + ++count);
					pw.println("From: ");
					pw.println(source);
					pw.println("To: ");
					pw.print(this.getResult().getMappingSource().get(source));
				}
				
				pw.println("Partial fix:" + this.getResult().getPartial().keySet().size());
				count = 0;
				for(String source : this.getResult().getPartial().keySet()){
					
					pw.println();
					pw.println();
					pw.println("Partial fix " + ++count);
					pw.println("success: " + this.getResult().getPartial().get(source));
					pw.println("From: ");
					pw.println(source);
					pw.println("To: ");
					pw.print(this.getResult().getMappingSource().get(source));
				}
				
				pw.println("Not a fix:" + this.getResult().getFalsePositve().size());
				count = 0;
				for(String source : this.getResult().getFalsePositve()){
					pw.println();
					pw.println();
					pw.println("Not a fix " + ++count);
					pw.println(source);
				}	
			}
			pw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
				
		
	}

	
	public ResultObject getResult() {
		return result;
	}
	public void setResult(ResultObject result) {
		this.result = result;
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
	public void clear() {
		this.positives = new HashMap<List<String>, List<String>>();
		this.negatives = new HashMap<List<String>, List<String>>();
		result = new ResultObject();
		
	}

}

