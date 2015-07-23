package Experiment;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class CheckSumSearchCase extends ESearchCase {

	public CheckSumSearchCase(String program, Path folder, Path fileName, int repo) {
		super(program, folder, fileName, repo);
	}

	@Override
	public void search(boolean wb) {
		this.initWbOrBB(wb);
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		
		List<int[]> buggylines = getMultipleBugLines();
		for(int[] range : buggylines){
			SearchCase instan = new SearchCase(this.getProgram(), this.getRunDir(), this.getRepo());
			instan.setBuggy(range);
			instan.setNegatives(this.getNegatives());
			instan.setPositives(this.getPositives());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
				this.setInfo(instan.getInfo());
				break;
			}
		}
	}

	protected List<int[]> getMultipleBugLines() {
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		double average = getAverage();
		for(int i = 10; i <= this.getSuspiciousness().keySet().size(); i++){
			if(this.getSuspiciousness().get(i) >= average){
				list.add(new int[]{i, i});
			}
		}
	
		int index = 10;
		while(index < this.getSuspiciousness().keySet().size()){
			if(this.getSuspiciousness().get(index) >= average){
				int right = index + 1;
				while(right <= this.getSuspiciousness().keySet().size()) {
					if(this.getSuspiciousness().get(right) >= average) break;
					right++;
				}
				if(right != this.getSuspiciousness().keySet().size()) {
					list.add(new int[] {index, right});
				}
			}
			index++;
		}
		
		return list;
		
	}
	
	private double getAverage() {
		int denominator = 0;
		double numerator = 0;
		for(int i = 1; i <= this.getSuspiciousness().keySet().size(); i++){
			if(this.getSuspiciousness().get(i) > 0){
				denominator++;
				numerator += this.getSuspiciousness().get(i);
			}
		}
		if(denominator == 0) return 1;
		else return numerator / denominator;
	}

//	public static void main(String[] args){
//		CheckSumSearchCase instan = new CheckSumSearchCase("./bughunt/checksum/8", "checksum.c", 2);
//		instan.transformAndInitRunDir(false, "");
//		instan.initInputAndOutput();
//		instan.search(true);
//		instan.recordResult(true);
//		instan.search(false);
//		instan.recordResult(false);
//	}
	

}
