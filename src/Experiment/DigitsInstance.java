package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;
import util.WhiteOrBlack;

public class DigitsInstance extends ProgramInstance {

	public DigitsInstance(String program, Path folder, Path fileName, int repo) {
		super(program, folder, fileName, repo);
		
	}

	@Override
	public void search(WhiteOrBlack wb) {
		this.initWbOrBB(wb);
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		
		this.getInfo().getResult().setState(ResultState.FAILED);
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
