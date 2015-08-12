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

	private Map<String, String> positives;
	private Map<String, String> negatives;
	private Map<String, String> validationTests;
	
	public ProgramTests(String casePrefix, String folder, String functionName) {
		positives = new HashMap<String,String> ();
		negatives = new HashMap<String,String> ();
		validationTests = new HashMap<String,String>();
		
		this.casePrefix = casePrefix;
		this.folder = folder; // this.casePrefix.substring(0, this.casePrefix.lastIndexOf("/"));
		this.functionName = functionName; //this.casePrefix.substring(this.casePrefix.lastIndexOf("/") + 1);
		this.inputfile = this.folder + File.separator + "1.in";
		this.outputfile = this.folder + File.separator + "1.out";
		this.tempOutput = this.folder + File.separator + "test.out";

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
	
	private void addToInputOutputMap(String root1, Map<String, String> map) {
		File dir = new File(root1);
		if(!dir.exists() ||!dir.isDirectory()) return;
		for(File file : dir.listFiles()){
			String name = file.getAbsolutePath();
			if(name.endsWith(".in")){
				String output = name.substring(0, name.length() - 3) + ".out";
				String inputString = Utility.getStringFromFile(name);
				String outputString = Utility.getStringFromFile(output);
				map.put(inputString, outputString);
			}
		}		
	}
	
	public void initTrainingAndValidationTests(boolean wb, String folder) {
	if(wb) { // wb training, bb validation 
		String root1 = folder + "/whitebox/positive";
		String root2 = folder + "/whitebox/negative";
		addToInputOutputMap(root1, this.getPositives());
		addToInputOutputMap(root2, this.getNegatives());
		
		root1 = folder + "/blackbox/positive";
		root2 = folder + "/blackbox/negative";		
		addToInputOutputMap(root1, this.getValidationTests());
		addToInputOutputMap(root2, this.getValidationTests());
	} else { // bb training, wb validation
		// initPositveInputAndOutput();
			String root1 = folder + "/blackbox/positive";
			String root2 = folder + "/blackbox/negative";
			addToInputOutputMap(root1, this.getPositives());
			addToInputOutputMap(root2, this.getNegatives());	
			root1 = folder + "/whitebox/positive";
			root2 = folder + "/whitebox/negative";
			addToInputOutputMap(root1, this.getValidationTests());
			addToInputOutputMap(root2, this.getValidationTests());
		}
	
	}


}
