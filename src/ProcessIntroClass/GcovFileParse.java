package ProcessIntroClass;

import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class GcovFileParse {
	private String fileName;
	private Map<Integer, Integer> executions;

	public GcovFileParse(String fileName) {
		super();
		executions = new HashMap<Integer, Integer>();
		this.fileName = fileName;
		parse();
	}

	private void parse() {
		String fileString = Utility.getStringFromFile(this.fileName);
		String[] lines = fileString.split("\n");
		for(String line : lines){
			line = line.trim();
			//System.out.println(line);
			if(line.isEmpty()) continue;
			String[] segs = line.split(":");
			//System.out.println(segs[1]);
			int lineNumber = getValueOfString(segs[1]);
			if(lineNumber != 0){
				String times = segs[0].trim();
				if(times.startsWith("-") || times.startsWith("#")) 
					this.executions.put(lineNumber, 0);
				else this.executions.put(lineNumber, 1);
			}
		}
		
	}
	
	private static int getValueOfString(String s){
		int index = 0;
		while(index < s.length() && Character.isWhitespace(s.charAt(index))){
			index++;
		}
		int a = 0;
		while(index < s.length() && Character.isDigit(s.charAt(index))){
			a = a * 10 + (s.charAt(index) - '0');
			index++;
		}
		return a;
	}

	public Map<Integer, Integer> getExecutions() {
		return executions;
	}

	public void setExecutions(Map<Integer, Integer> executions) {
		this.executions = executions;
	}
	
	
	
}
