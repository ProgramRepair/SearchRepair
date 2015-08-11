package Experiment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import util.Utility;

public class ProgramTests {

	private WhiteOrBlack testsType;
	
	private HashMap<NegOrPos,HashMap<String,String>> tests = new HashMap<NegOrPos,HashMap<String,String>>();
	
	public void setType(WhiteOrBlack whiteOrBlack) {
		testsType = whiteOrBlack;
	}

	public void addTestFromFile(String root1, NegOrPos whichTest) {
		HashMap<String,String> actualTests = null;
		if(!this.tests.containsKey(whichTest)) {
			actualTests = new HashMap<String,String>();
			this.tests.put(whichTest, actualTests);
		} else {
			actualTests = this.tests.get(whichTest);
		}
		File dir = new File(root1);
		if(!dir.exists() ||!dir.isDirectory()) return;
		for(File file : dir.listFiles()){
			String name = file.getAbsolutePath();
			if(name.endsWith(".in")){
				String output = name.substring(0, name.length() - 3) + ".out";
				String inputString = Utility.getStringFromFile(name);
				String outputString = Utility.getStringFromFile(output);
				actualTests.put(inputString, outputString);
			}

		}				
	}

	
	public HashMap<String, String> getPositives() {
		return this.tests.get(NegOrPos.POSITIVE); 
	}

	public HashMap<String, String> getNegatives() {
		return this.tests.get(NegOrPos.NEGATIVE);
	}

	public void setPositives(HashMap<String, String> positives) {
		tests.put(NegOrPos.POSITIVE, positives);
	}

	public void setNegatives(HashMap<String, String> negatives) {
		tests.put(NegOrPos.NEGATIVE, negatives);
	}

	private void addTestFromStrings(String trim, String trim2, NegOrPos whichTests) {
		HashMap<String,String> actualTests = null;
		if(this.tests.containsKey(whichTests)) {
			actualTests = this.tests.get(whichTests);
		} else {
			actualTests = new HashMap<String,String>();
		}
		actualTests.put(trim,  trim2);
		this.tests.put(whichTests, actualTests);
	}
	public void addNegativeTest(String trim, String trim2) {
		this.addTestFromStrings(trim, trim2, NegOrPos.NEGATIVE);
	}
	
	public void addPositiveTest(String trim, String trim2) {
		this.addTestFromStrings(trim, trim2, NegOrPos.POSITIVE);
	}
	
	// FIXME: lose the compilation from the test case execution
	public boolean passAllPositive(String source, String outputFile, Path compiledBinary) {
		int numPassed = passAllTests(source, outputFile, this.getPositives(), compiledBinary); 
		return (numPassed == this.getPositives().size());  
	}

	private int passAllTests(String source, String outputFile, Map<String,String> testSuite, Path compiledBinary) {
		try {
			Files.deleteIfExists(compiledBinary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// FIXME: don't need to do this twice
		String command1 = "gcc " + outputFile + " -o " + compiledBinary.toString();
		Utility.runCProgram(command1);
		if(!Files.exists(compiledBinary)) {
			return 0;
		}
		int count = 0;
		for(String input : testSuite.keySet()){
			String output = testSuite.get(input);

			String s2 = Utility.runCProgramWithInput(compiledBinary.toString(), input);

			if(s2.isEmpty() ){
				continue;
			}

			if(s2.equals(output)) count++;
		}
		return count;
	}
	
	 public int passNegatives(String source, String outputFile, Path compiledBinary) {
			return passAllTests(source, outputFile, this.getNegatives(), compiledBinary);
		}



}
