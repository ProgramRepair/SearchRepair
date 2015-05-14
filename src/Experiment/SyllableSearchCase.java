package Experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import search.ResultObject.ResultState;

public class SyllableSearchCase extends ESearchCase{

	public SyllableSearchCase(String folder, String fileName, int repo) {
		super(folder, fileName, repo);
		
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
		
		List<int[]> buggys = getMultpleBuggyLines();
		//System.out.println(Arrays.toString(range));
		
		for(int[] range : buggys){
			String s = Arrays.toString(range);
			System.out.println(s);
			String prefix = this.getRunDir() + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
			SearchCase instan = new SearchCase(prefix);
			System.out.println(Arrays.toString(range));
			instan.setBuggy(range);
			instan.setNegatives(this.getNegatives());
			instan.setPositives(this.getPositives());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS || instan.getInfo().getResult().getState() == ResultState.PARTIAL){
				this.setInfo(instan.getInfo());
				break;
			}
			else{
				instan.searchJustOnMap();
				if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
					this.setInfo(instan.getInfo());				
					break;
				}
			}
		}
	}

	
	protected List<int[]> getMultpleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		this.initContent();
		for(int i = 12; i <= this.getSuspiciousness().keySet().size(); i++){
			for(int j = 0; j < 4 && i + j <= this.getSuspiciousness().keySet().size(); j++){
				if(this.getContent().get(i+j-1).length() < 1) continue;
				list.add(new int[]{i, i + j});
			}
		}
//		list.add(new int[]{30, 33});
				
		return list;
	}
	
	
	public static void main(String[] args){
		SyllableSearchCase instan = new SyllableSearchCase("./bughunt/syllables/12", "syllables.c", 2);
		instan.transformAndInitRunDir(false, "");
		instan.initInputAndOutput();
		instan.search(true);
		instan.recordResult(true);
		instan.search(false);
		instan.recordResult(false);
	}
}
