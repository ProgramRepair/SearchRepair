package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;
import util.WhiteOrBlack;

public class MedianInstance extends ProgramInstance {
	
	public MedianInstance(String program, Path folder, Path fileName, int repo) {
		super(program, folder, fileName,  repo);
	}
	
	@Override
	public void search(WhiteOrBlack wb) {
		// TODO: this.initWbOrBB(wb); We already called this in GroupTest.medianTest; ensure we are consistent about this! 
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		
		int[] range = this.getBugLines();
		// possible FIXME: the second argument to SearchCase may be wrong
		OneRegion instan = new OneRegion(this.getProgram(), this.getRunDir(), this.getRepo());
		instan.setBuggy(range);
		instan.setNegatives(this.getNegatives());
		instan.setPositives(this.getPositives());
		// POSSIBLE FIXME: why don't they all set validation tests?
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
