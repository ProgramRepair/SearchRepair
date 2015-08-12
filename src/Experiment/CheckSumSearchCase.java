package Experiment;

import java.util.ArrayList;
import java.util.List;

public class CheckSumSearchCase extends ESearchCase {

	public CheckSumSearchCase(String folder, String fileName, int repo) {
		super("checksum", folder, fileName, repo);
	}
	
	protected List<int[]> getMultipleBuggyLines(){
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
