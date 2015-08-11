package Experiment;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class CheckSumInstance extends ProgramInstance {

	// possible FIXME: do I want to set wb here, or do we ever need to change it in one experiment?
	public CheckSumInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo, wb);
		this.transformAndInitRunDir(false, "");
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
		
		List<int[]> buggylines = getMultipleBuggyLines();

		for(int[] range : buggylines){
			// I THINK I GET IT: we have a searchcase for every possible buggy region, and a CheckSumSearchCase for every possible buggy CheckSum.
			// so a program search case per program, and a regular search case per region of program.
			// the test case redundancy is still stupid
			// but at least it makes a little more sense now
			RegionInstance instan = new RegionInstance(this.getProgram(), this.getRunDir(), this.getRepo());
			instan.setBuggy(range);
			instan.setNegatives(this.getNegatives());
			instan.setPositives(this.getPositives());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
				this.setInfo(instan.getInfo());
				break;
			}
		}
	}
	
	protected List<int[]> getMultipleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		this.initContent();
		double average = getAverage();
		int index = 12;
		while(index < this.getSuspiciousness().keySet().size()){
			if(this.getSuspiciousness().get(index) >= average){
				list.add(new int[]{index,index});
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

//	public static void main(String[] args){
//		CheckSumSearchCase instan = new CheckSumSearchCase("./bughunt/checksum/6", "checksum.c", 5);
//		instan.transformAndInitRunDir(false, "");
//		instan.initInputAndOutput();
//		instan.search(true);
//		instan.recordResult(true);
//		instan.search(false);
//		instan.recordResult(false);
//	}

	

}
