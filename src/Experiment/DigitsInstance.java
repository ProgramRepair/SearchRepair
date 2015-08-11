package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;

public class DigitsInstance extends ProgramInstance {

	public DigitsInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo, wb);
		this.initTests();
	}

	@Override
	public void search() {
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		// FIXME: OK, I see, he doesn't bother searching for this one because we know we can't do it.
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
