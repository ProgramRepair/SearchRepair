package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;

public class GradeSearchCase extends ESearchCase {

	public GradeSearchCase(String program, Path folder, Path fileName, int repo) {
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
		
		int[] range = getBugLines();
		// FIXME: I mangled all these prefix mangling things as an intermediate step in changing from strings to paths, fix it!
		// trick is: what is prefix supposed to be pointing at?
		SearchCase instan = new SearchCase(this.getProgram(), this.getRunDir(), this.getRepo());
		instan.setBuggy(range);
		instan.setNegatives(this.getNegatives());
		instan.setPositives(this.getPositives());
		instan.setValidationTests(this.getValidationTests());
		instan.search();	
		this.setInfo(instan.getInfo());
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
