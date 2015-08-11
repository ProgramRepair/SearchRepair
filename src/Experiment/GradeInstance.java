package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;

public class GradeInstance extends ProgramInstance {
// FIXME: make all the .gcov .gcda .gcno etc files end up not at the top level.
	public GradeInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo, wb);
		this.transformAndInitRunDir(true, "--type grade");
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
		
		int[] range = getBugLines();
		boolean pass = constructProfile(range);
		if (!pass)
			return;
		searchOverRepository(); 
		ruleOutFalsePositive(range);

		if (isEmpty(info.getResult())) {
			this.info.getResult().setState(ResultState.FAILED);
			return;
		} else {
			if (!info.getResult().getPositive().isEmpty()) {
				this.info.getResult().setState(ResultState.SUCCESS);
			} else {
				this.info.getResult().setState(ResultState.PARTIAL);
			}
		}
	
	}


//	public static void main(String[] args){
//		GradeSearchCase instan = new GradeSearchCase("./bughunt/grade/120", "grade.c", 4);
//		instan.transformAndInitRunDir(true, "--type grade");
//		instan.initInputAndOutput();
//		instan.search(true);
//		instan.recordResult(true);
//		instan.search(false);
//		instan.recordResult(false);
//	}


}
