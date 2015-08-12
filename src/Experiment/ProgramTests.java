package Experiment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import Library.Utility;

public class ProgramTests {

	protected static Logger logger = Logger.getLogger(ProgramTests.class);

	private String tempOutput;
	private String casePrefix;
	private  String folder;
	private  String inputfile;
	private  String outputfile;
	private String functionName;

	private Map<String, String> blackPositives;
	private Map<String, String> blackNegatives;
	private Map<String, String> whitePositives;
	private Map<String, String> whiteNegatives;
	private Map<String, String> positives;
	private Map<String, String> negatives;
	private Map<String, String> validationTests;
	
	public ProgramTests(String casePrefix) {
		blackPositives = new HashMap<String,String> ();
		blackNegatives = new HashMap<String,String> ();
		whitePositives = new HashMap<String,String> ();
		whiteNegatives = new HashMap<String,String> ();
		positives = new HashMap<String,String> ();
		negatives = new HashMap<String,String> ();
		validationTests = new HashMap<String,String>();
		
		this.casePrefix = casePrefix;
		this.folder = this.casePrefix.substring(0, this.casePrefix.lastIndexOf("/"));
		this.functionName = this.casePrefix.substring(this.casePrefix.lastIndexOf("/") + 1);
		this.inputfile = this.folder + "/1.in";
		this.outputfile = this.folder + "/1.out";
		this.tempOutput = this.folder + "/test.out";

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
	
	public Map<String,String> getValidationTests() {
		return this.validationTests;
	}

	public int passTestSuite(String source, String outputFile, Map<String, String> suite){
		File file = new File(casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		Utility.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return 0;
		}
		int count = 0;
		for(String input : suite.keySet()){
			String output = suite.get(input);
			
			String command2 = "./" + this.casePrefix;
			
			String s2 = Utility.runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				continue;
			}
			
			if(checkPassForOneCase(s2, output, input)) count++;
		}
		return count;
	}
	
	public boolean passAllPositive(String source, String outputFile) {
		File file = new File( this.casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		Utility.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return false;
		}
		for(String input : this.getPositives().keySet()){
			String output = this.getPositives().get(input);
			
			String command2 = "./" + this.casePrefix;
			
			String s2 = Utility.runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				return false;
			}
			if(!checkPassForOneCase(s2, output, input)) return false;
	
		}
		return true;
	}
	private boolean checkPassForOneCase(String s2, String output, String input) {
		Utility.writeTOFile(this.tempOutput, s2);
		Utility.writeTOFile(this.outputfile, output);
		Utility.writeTOFile(this.inputfile, input);
		String s = Utility.runCProgramWithPythonCommand(this.functionName, this.tempOutput, this.inputfile, this.outputfile);
		if(s.trim().endsWith("Test passed.")) return true;
		else return false;
		
	}
	public int passNegatives(String source, String outputFile) {
		return this.passTestSuite(source, outputFile, this.getNegatives());
	}


	public void putValidation(Map<String, String> blackNegatives2) {
		this.validationTests.putAll(blackNegatives2);
	}


}
