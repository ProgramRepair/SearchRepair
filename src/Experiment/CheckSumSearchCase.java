package Experiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import search.ResultObject.ResultState;
import Library.Utility;

public class CheckSumSearchCase extends ESearchCase {
	private Map<Integer, Double> suspiciousness;

	public CheckSumSearchCase(String folder, String fileName) {
		super(folder, fileName);
		this.suspiciousness = new HashMap<Integer, Double>();
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
		System.out.println(buggylines.size());
		for(int[] range : buggylines){
			System.out.println(Arrays.toString(range));
			String prefix = runDir + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
			SearchCase instan = new SearchCase(prefix);
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

	
	
	


	protected List<int[]> getMultipleBugLines() {
		List<int[]> list = new ArrayList<int[]>();
		initSuspicious();
		double average = getAverage();
		for(int i = 10; i <= this.suspiciousness.keySet().size(); i++){
			if(this.suspiciousness.get(i) >= average){
				list.add(new int[]{i, i});
			}
		}
		
		
		int index = 10;
		while(index < this.suspiciousness.keySet().size()){
			if(this.suspiciousness.get(index) >= average){
				int right = index + 1;
				while(right <= this.suspiciousness.keySet().size()) {
					if(this.suspiciousness.get(right) >= average) break;
					right++;
				}
				if(right != this.suspiciousness.keySet().size()) {
					list.add(new int[] {index, right});
				}
			}
			index++;
		}
		
		//list.add(new int[]{42, 42});
		
		return list;
		
	}
	
	private double getAverage() {
		int denomerator = 0;
		double numerator = 0;
		for(int i = 1; i <= this.suspiciousness.keySet().size(); i++){
			if(this.suspiciousness.get(i) > 0){
				denomerator++;
				numerator += this.suspiciousness.get(i);
			}
		}
		if(denomerator == 0) return 1;
		else return numerator / denomerator;
	}

	private void initSuspicious() {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.getFolder() + "/suspicious")));
			String s = null;
			while((s = br.readLine()) != null){
				String[] info = s.split(" ");
				this.suspiciousness.put(Integer.parseInt(info[0]), Double.parseDouble(info[1]));
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args){
		CheckSumSearchCase instan = new CheckSumSearchCase("./bughunt/checksum/32", "checksum.c");
		instan.search();
		instan.recordResult();
	}
	
	
	
	

}
