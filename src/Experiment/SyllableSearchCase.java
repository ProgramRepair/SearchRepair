package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class SyllableSearchCase extends ESearchCase{

	public SyllableSearchCase(String folder, String fileName, int repo) {
		super("syllables", folder, fileName, repo);	
	}
	
	@Override
	protected List<int[]> getMultipleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		double average = getAverage();
		int index = 12;
		while(index < this.getSuspiciousness().keySet().size()){
			if(this.getSuspiciousness().get(index) >= average){
				list.add(new int[]{index,index});
				int right = index + 1;
				while(right <= this.getSuspiciousness().keySet().size() && right - index < 6) {
					if(this.getSuspiciousness().get(right) >= average) {
						list.add(new int[] {index, right});
					}
					right++;
				}
			}
			index++;
		}
		return list;
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
		
		List<int[]> buggys = getMultipleBuggyLines();
		
		for(int[] range : buggys){
			String prefix = this.getRunDir() + File.separator + "syllables"; 
			SearchCase instan = new SearchCase(prefix, this.getRepo());
			instan.setBuggy(range);
			instan.setTests(this.getTests());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS || instan.getInfo().getResult().getState() == ResultState.PARTIAL){
				this.setInfo(instan.getInfo());
				break;
			}
			else{
				if(!wb) continue;
				instan.searchJustOnMap();
				if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
					this.setInfo(instan.getInfo());				
					break;
				}
			}
		}
	}



	
}
