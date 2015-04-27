package Experiment;

import java.util.ArrayList;
import java.util.List;

public class SyllableSearchCase extends ESearchCase{

	public SyllableSearchCase(String folder, String fileName) {
		super(folder, fileName);
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		super.search();
	}

	
	protected List<int[]> getMultpleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{});
		return list;
	}
}
