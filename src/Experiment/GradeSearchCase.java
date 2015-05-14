package Experiment;

import java.io.File;
import java.util.Arrays;

import search.ResultObject.ResultState;
import Library.Utility;
import ProcessIntroClass.BugLineSearcher;
import ProcessIntroClass.GcovTest;
import ProcessIntroClass.Transform;

public class GradeSearchCase extends ESearchCase {

	public GradeSearchCase(String folder, String fileName, int repo) {
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
		
		int[] range = getBugLines();
		System.out.println(Arrays.toString(range));
		String prefix = this.getRunDir() + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
		SearchCase instan = new SearchCase(prefix);
		instan.setBuggy(range);
		instan.setNegatives(this.getNegatives());
		instan.setPositives(this.getPositives());
		instan.setVerifications(this.getVerifications());
		instan.search();	
		this.setInfo(instan.getInfo());
	}

	
	
	

	public static void main(String[] args){
		GradeSearchCase instan = new GradeSearchCase("./bughunt/grade/117", "grade.c", 2);
		instan.transformAndInitRunDir(true, "--type grade");
		instan.initInputAndOutput();
		instan.search(true);
		instan.recordResult(true);
		instan.search(false);
		instan.recordResult(false);
	}

}
