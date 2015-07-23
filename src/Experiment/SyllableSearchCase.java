package Experiment;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import search.ResultObject.ResultState;

public class SyllableSearchCase extends ESearchCase{

	// possible FIXME: syllables knows it's syllables, possibly don't need it here.
	public SyllableSearchCase(String program, Path folder, Path fileName, int repo) {
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
		
		List<int[]> buggys = getMultipleBuggyLines();
		
		for(int[] range : buggys){
			String s = Arrays.toString(range);
			System.out.println(s);
			String prefix = this.getRunDir() + "/" + this.getFileName().toString().substring(0, this.getFileName().toString().lastIndexOf('.'));
			SearchCase instan = new SearchCase(this.getProgram(), prefix, this.getRepo());

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

// why is this different between the search cases?  I feel like it should all be the same...	
	protected List<int[]> getMultipleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		this.initContent();
		for(int i = 12; i <= this.getSuspiciousness().keySet().size(); i++){
			for(int j = 0; j <= 5 && i + j <= this.getSuspiciousness().keySet().size(); j++){
				if(this.getContent().get(i+j-1).length() < 1) continue;
				list.add(new int[]{i, i + j});
			}
		}
				
		return list;
	}
	
//	public static void main(String[] args){
//		SyllableSearchCase instan = new SyllableSearchCase("./bughunt/syllables/37", "syllables.c", 2);
//		instan.transformAndInitRunDir(false, "");
//		instan.initInputAndOutput();
////		instan.search(true);
////		instan.recordResult(true);
//		instan.search(false);
//		instan.recordResult(false);
//	}
}
