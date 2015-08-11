package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;

public class MedianInstance extends ProgramInstance {
	
	public MedianInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName,  repo, wb);
		this.transformAndInitRunDir(true, "");
		this.initTests();
	}
	
	@Override
	public void search() {
		if(this.getTrainingTests().getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getTrainingTests().getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		// FIXME: why doesn't this get multiple buggy lines?
		int[] range = this.getBugLines();
		RegionInstance instan = new RegionInstance(this.getProgram(), this.getTrainingTests(), this.getValidationTests(), this.getRunDir(), this.getRepo());
		instan.setBuggy(range);
		instan.setValidationTests(this.getValidationTests());
		instan.search();	
		this.setInfo(instan.getInfo());
	}
	
//	public static void main(String[] args){
//		MedianSearchCase instan = new MedianSearchCase("./bughunt/median/0", "median.c",  2);
//		instan.transformAndInitRunDir(true, "");
//		instan.initInputAndOutput();
//		instan.search(false);
////		instan.search(false);
//		instan.recordResult(false);
//	}

}
