package Experiment;

import search.ResultObject.ResultState;

public class DigitSearchCase extends ESearchCase {

	public DigitSearchCase(String folder, String fileName, int repo) {
		super(folder, fileName,  repo);
		
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
		
		this.getInfo().getResult().setState(ResultState.FAILED);
	}
}
