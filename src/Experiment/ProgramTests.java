package Experiment;

import java.io.File;
import java.util.HashMap;

import Library.Utility;

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
	
}
