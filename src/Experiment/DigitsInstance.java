package Experiment;

import java.nio.file.Path;

import search.ResultObject.ResultState;

public class DigitsInstance extends ProgramInstance {

	public DigitsInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo);
		this.initTests(wb);
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
		// FIXME: we don't bother searching right now because we know we can't.
		this.getInfo().getResult().setState(ResultState.FAILED);
	}
}
