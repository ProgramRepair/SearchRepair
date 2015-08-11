package Experiment;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import search.PrototypeSearch;
import search.ResultObject;
import search.ResultObject.ResultState;

public class SyllablesInstance extends ProgramInstance{

	private WhiteOrBlack whiteOrBlack;
	
	public SyllablesInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo);
		this.transformAndInitRunDir(false, "");
		this.initTests(wb);
		this.whiteOrBlack = wb;
	}

	private void searchJustOnMap(int [] buggy) {
		try {
			info.setResult(new ResultObject());
			PrototypeSearch.searchOnlyMatchType(info, this.getRepo());
			this.ruleOutFalsePositive(buggy);
		} catch (Exception e) {
			e.printStackTrace();
		}

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
		
		List<int[]> buggys = getMultipleBuggyLines();


		for(int[] range : buggys){
			boolean pass = constructProfile(range);
			if (!pass)
				continue;
			searchOverRepository();
			ruleOutFalsePositive(range);
		
			if(info.getResult().getState() == ResultState.SUCCESS || info.getResult().getState() == ResultState.PARTIAL){
				break;
			} else{
				if(this.whiteOrBlack != WhiteOrBlack.WHITEBOX)continue;
				this.searchJustOnMap(range);
				if(info.getResult().getState() == ResultState.SUCCESS){
					break;
				}
			}
		}
	}


//why is this different between the search cases?  I feel like it should all be the same...	

	protected List<int[]> getMultipleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		double average = getAverage();
		int index = 12;
		while(index < this.getSuspiciousness().keySet().size()){
			if(this.getSuspiciousness().get(index) >= average){
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

}
