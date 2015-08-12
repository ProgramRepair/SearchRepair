package Experiment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import Library.Utility;

public class ProgramTests {

	protected static Logger logger = Logger.getLogger(ProgramTests.class);

	private Map<String, String> blackPositives;
	private Map<String, String> blackNegatives;
	private Map<String, String> whitePositives;
	private Map<String, String> whiteNegatives;
	private Map<String, String> positives;
	private Map<String, String> negatives;
	
	public ProgramTests() {
		blackPositives = new HashMap<String,String> ();
		blackNegatives = new HashMap<String,String> ();
		whitePositives = new HashMap<String,String> ();
		whiteNegatives = new HashMap<String,String> ();
		positives = new HashMap<String,String> ();
		negatives = new HashMap<String,String> ();
		
	}
	public Map<String,String> getNegatives() {
		return this.negatives;
	}

	public void setNegatives(Map<String, String> negatives2) {
		this.negatives = negatives2;
	}

	public Map<String, String> getPositives() {
		return this.positives;
	}
	public void setPositives(Map<String, String> positives2) {
		this.positives = positives2;
	}

	public Map<String, String> getWhitePositives() {
		return whitePositives;
	}

	public void setWhitePositives(Map<String, String> whitePositives) {
		this.whitePositives = whitePositives;
	}

	public Map<String, String> getWhiteNegatives() {
		return whiteNegatives;
	}

	public void setWhiteNegatives(Map<String, String> whiteNegatives) {
		this.whiteNegatives = whiteNegatives;
	}

	public Map<String, String> getBlackNegatives() {
		return blackNegatives;
	}

	public void setBlackNegatives(Map<String, String> blackNegatives) {
		this.blackNegatives = blackNegatives;
	}

	public Map<String, String> getBlackPositives() {
		return blackPositives;
	}

	public void setBlackPositives(Map<String, String> blackPositives) {
		this.blackPositives = blackPositives;
	}
	
	public int passNegatives(String source, String outputFile, String casePrefix) {
		File file = new File(casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + casePrefix;
		Utility.runCProgram(command1);
		if(!new File(casePrefix).exists()){
			return 0;
		}
		int count = 0;
		for(String input : this.getNegatives().keySet()){
			String output = this.getNegatives().get(input);
			
			String command2 = "./" + casePrefix;
			
			String s2 = Utility.runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				continue;
			}
			System.out.println(input);
			System.out.println(s2);
			System.out.println(output);
			System.out.println(output.equals(s2));
			if(s2.equals(output)) count++;
		}
		return count;
	}

	public boolean passAllPositive(String source, String outputFile, String casePrefix) {
		File file = new File(casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + casePrefix;
		Utility.runCProgram(command1);
		if(!new File(casePrefix).exists()){
			return false;
		}
		for(String input : this.getPositives().keySet()){
			String output = this.getPositives().get(input);
			
			String command2 = "./" + casePrefix;
			
			String s2 = Utility.runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				return false;
			}
			System.out.println(input);
			System.out.println(output);
			System.out.println(s2);
			if(!s2.equals(output)) return false;
		}
		return true;
	}


}
