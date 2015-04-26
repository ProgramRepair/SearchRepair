package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;
import Library.Utility;

public class CheckSumSearchCase extends ESearchCase {

	public CheckSumSearchCase(String folder, String fileName) {
		super(folder, fileName);
	}

	@Override
	public void search() {
		initInputAndOutput();
		String runDir = this.getFolder() + "/temp";
		if(!new File(runDir).exists()) new File(runDir).mkdir();
		Utility.copy(this.getFolder() + "/" + this.getFileName(), runDir + "/" + this.getFileName());
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		
		List<int[]> buggylines = getMultipleBugLines();
		for(int[] range : buggylines){
			String prefix = runDir + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
			SearchCase instan = new SearchCase(prefix);
			instan.setBuggy(range);
			instan.setNegatives(this.getNegatives());
			instan.setPositives(this.getPositives());
			//TODO
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
				
				this.setInfo(instan.getInfo());
				break;
			}
		}
		this.recordResult();
	}

	
	
	


	protected List<int[]> getMultipleBugLines() {
		List<int[]> list = new ArrayList<int[]>();
		list.add(new int[] {20, 20});
		return list;
		
	}
	
	public static void main(String[] args){
		CheckSumSearchCase instan = new CheckSumSearchCase("./bughunt/checksum/13", "checksum.c");
		instan.search();
	}
	
	
	
	

}
