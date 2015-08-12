package Experiment;

import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class CheckSumSearchCase extends ESearchCase {
	

	public CheckSumSearchCase(String folder, String fileName, int repo) {
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
		
		List<int[]> buggylines = getMultpleBuggyLines();
		for(int[] range : buggylines){
			//System.out.println(Arrays.toString(range));
			String prefix = this.getRunDir() + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
			SearchCase instan = new SearchCase(prefix, this.getRepo());
			instan.setBuggy(range);
			instan.setTests(this.getTests());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
				this.setInfo(instan.getInfo());
				break;
			}
		}
	}

	protected List<int[]> getMultpleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
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
	
	

}
