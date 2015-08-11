package Experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import search.PrototypeSearch;
import search.ResultObject;
import search.ResultObject.ResultState;
import util.Utility;
import ProcessIntroClass.BugLineSearcher;
import ProcessIntroClass.GcovTest;
import ProcessIntroClass.Transform;
// FIXME: note to self: nuke gcc and gdb at least!

public  class ProgramInstance {
	protected static Logger logger = Logger.getLogger(ProgramInstance.class);

	private Path folder;
	private Path runDir;
	private Path transformFile;
	private Path fileName;
	private Path compiledBinary;


	private ProgramTests trainingTests = new ProgramTests(); 
	private ProgramTests validationTests = new ProgramTests();

	private Map<Integer, Double> suspiciousness = new HashMap<Integer, Double>();

	protected CaseInfo info;
	private int repo;
	private String program;

	// FIXME: FIGURE OUT THE REPO THING
	public ProgramInstance(String program, Path folder, Path fileName, int repo){
		this.repo = repo;
		this.folder = folder;
		this.fileName = fileName;
		this.compiledBinary = Paths.get(this.folder.toString() + File.separator + program);

		this.info = new CaseInfo();

		this.runDir = Paths.get(this.folder.toString() + File.separator + "temp");
		this.program = program;
		
	}

	public int getRepo() {
		return repo;
	}

	protected CaseInfo getInfo() {
		return info;
	}


	public Path getFolder() {
		return folder;
	}

	public Path getFileName() {
		return fileName;
	}

	protected void transformAndInitRunDir(boolean transform, String typeParameter){ 
		if(!Files.exists(runDir)) {
			runDir.toFile().mkdir();
		}
		try {
			Path targetFile = Paths.get(runDir.toString() + File.separator + program + ".c"); 
			if(!transform) {
				this.transformFile = this.getFileName();
				// TODO: make sure this does what it should do (copy original to runDir); 
				Utility.copyDirOK(this.getFileName(), targetFile); 
				return;
			}
			Transform trans = new Transform(this.getFolder(), this.getFileName(), typeParameter);
			String pass = trans.tranform();

			//transform here, if there is a true transform, no need to copy
			if(pass != null) {
				Utility.copy(pass, runDir + File.separator + program + ".c");
				this.transformFile = Paths.get(runDir + File.separator + program + ".c"); 
			}
			else{
				this.transformFile = this.getFileName();
				Utility.copyDirOK(this.getFileName(), targetFile); 

			}
		} catch (IOException e) {
			logger.error("IOException in transformAndInitRunDir, likely a problem with transform file name mangling.");
		}
	}

	protected void initTests(WhiteOrBlack wb){
		initTraining(wb); 
		initValidation(wb);
		GcovTest test = new GcovTest(this.getProgram(), this.folder, this.transformFile, wb);
		test.init();
	}

	public void search(){
		if(this.getTrainingTests().getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getTrainingTests().getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		List<int[]> buggyLines = this.getMultipleBuggyLines();
		for(int[] range : buggyLines) {
			boolean pass = constructProfile(range);
			if (!pass)
				continue;
			searchOverRepository(); 
			ruleOutFalsePositive(range);
			if (isEmpty(this.info.getResult())) {
				this.info.getResult().setState(ResultState.FAILED);
			} else {
				if (!info.getResult().getPositive().isEmpty()) {
					this.info.getResult().setState(ResultState.SUCCESS);
					break;
				} else {
					this.info.getResult().setState(ResultState.PARTIAL);
				}
			}
		}
		//FIXME: does this do anything any more? initPositiveStates();
	}

	protected boolean isEmpty(ResultObject result) {
		return result.getPositive().isEmpty() && result.getPartial().isEmpty();
	}

	public void recordResult(WhiteOrBlack wb) {
		String filec;
		int type = repo;
		if(repo == 3 || repo == 4){
			type = 2;
		} 
		if(wb == WhiteOrBlack.WHITEBOX){
			filec="searchfix-wb" + type;
		}
		else{
			filec="searchfix-bb" + type;
		}
		File dir = new File(this.folder + File.separator + "repair");
		if(!dir.exists()){
			dir.mkdir();
		}
		info.recordLog(this.folder + File.separator + "repair" + filec);

	}


	protected void ruleOutFalsePositive(int [] buggy) {
		for(String source : info.getResult().getSearchMapping().keySet()){
			for(Map<String, String> map : info.getResult().getSearchMapping().get(source)){
				String input = Restore.getMappingString(source, map);
				String outputFile = generateOutputFile(input, buggy);
				if(trainingTests.passAllPositive(source, outputFile, this.compiledBinary)) {
					int count = trainingTests.passNegatives(source, outputFile, this.compiledBinary);
					if(count == this.trainingTests.getNegatives().size()) {
						info.getResult().getPositive().add(source);
					}
					else if(count == 0){
						info.getResult().getFalsePositve().add(source);
						continue;
					}
					else {
						info.getResult().getPartial().put(source, count * 1.0 / this.trainingTests.getNegatives().size());
					}

				} else continue;
				info.getResult().getMappingSource().put(source, input);
				int extraPass = this.validationTests.passPositives(source, outputFile,compiledBinary);
				extraPass += this.validationTests.passNegatives(source, outputFile,compiledBinary);
				this.info.getResult().getExtraPass().put(source, extraPass);
				break;
			}
		}

	}	



	private String generateOutputFile(String input, int [] buggy) {
		String outputfile = this.compiledBinary.toString() + ".new.c"; 
		try{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputfile)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.compiledBinary.toString() + ".c")));	
			String s = null;

			for(int i = 1; i < buggy[0]; i++){
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}

			writer.write(input);

			for(int i = buggy[0]; i <= buggy[1]; i++){
				s = reader.readLine();

			}

			while((s = reader.readLine()) != null){
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			reader.close();
			writer.close();
		}catch(Exception e){
			return "";
		}
		return outputfile;
	}


	protected void searchOverRepository() {
		try {
			PrototypeSearch.search(info, repo);

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * if no bug, the buggy lines will be 0-0
	 */
	// FIXME: why doesn't this get multiple buggy lines normally?
	protected List<int[]> getMultipleBuggyLines() {
		BugLineSearcher bug = new BugLineSearcher(this.getFolder().toString(), this.transformFile.toString());
		List<int[]> retval = new ArrayList<int[]> ();
		retval.add(bug.getBuggy());
		return retval;
	}

	private void initTests(ProgramTests tests, WhiteOrBlack whiteOrBlack) {
		if(whiteOrBlack.equals("")) {
			logger.error("training tests cannot be initialized without setting test type");
			return;
		}
		tests.setType(whiteOrBlack);
		for(NegOrPos negOrPos : new NegOrPos[]{ NegOrPos.NEGATIVE, NegOrPos.POSITIVE}) {
			String negOrPosDir = negOrPos == NegOrPos.NEGATIVE ? "negative" : "positive";
			String whiteOrBlackDir = whiteOrBlack == WhiteOrBlack.BLACKBOX ? "blackbox" : "whitebox";
			String root1 = this.getFolder() + File.separator + whiteOrBlackDir + File.separator + negOrPosDir;
			tests.addTestFromFile(root1,negOrPos); 
		}
	}
	protected void initTraining(WhiteOrBlack wb) {
		this.initTests(this.trainingTests, wb);
	}

	protected void initValidation(WhiteOrBlack wb) {
		WhiteOrBlack which = wb == WhiteOrBlack.BLACKBOX ? WhiteOrBlack.WHITEBOX : WhiteOrBlack.BLACKBOX; 
		this.initTests(this.validationTests, which);
	}


	protected void initSuspicious() {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.getFolder() + File.separator + "suspicious")));
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

	protected Map<Integer, Double> getSuspiciousness() {
		return suspiciousness;
	}

	protected void setSuspiciousness(Map<Integer, Double> suspiciousness) {
		this.suspiciousness = suspiciousness;
	}

	public ProgramTests getTrainingTests() {
		return trainingTests;
	}

	public ProgramTests getValidationTests() {
		return validationTests;
	}

	public void setValidationTests(ProgramTests verifications) {
		this.validationTests = verifications;
	}

	public Path getRunDir() {
		return runDir;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	protected double getAverage() {
		int denominator = 0;
		double numerator = 0;
		for(int i = 1; i <= this.getSuspiciousness().keySet().size(); i++){
			if(this.getSuspiciousness().get(i) > 0){
				denominator++;
				numerator += this.getSuspiciousness().get(i);
			}
		}
		if(denominator == 0) return 1;
		else return numerator / denominator;

	}

	/* 
	 * firstly, erase all of include statements and insert Mark, make a copy in
	 * prefix.mark get the target function using FuncitionExtractor, the entire
	 * function String Using state to obtain input and output variables and its
	 * types make a copy prefix_copy.c of original source file, and insert input
	 * and put statements
	 * 
	 * @return
	 */
	private boolean insertStateStatements(int[] buggy) {
		// FIXME: the getProgram here cannot possibly be correct
		String markFile = RegionInstance.insertMark(this.fileName.toString(),this.compiledBinary.toString(), buggy);

		String target = RegionInstance.getFunction(markFile);
		String[] states = RegionInstance.getStatesStatement(target);
		if (states == null)
			return false;

		RegionInstance.writeStatesStatement(states, this.compiledBinary.toString(), buggy);
		return true;
	}

	protected boolean constructProfile(int[] buggy) {
		if (insertStateStatements(buggy)) {  
			obtainPositiveStates();
			return true;
		} else
			return false;
	}

	private void obtainPositiveStates() {
		String sourceFile = this.compiledBinary + ".state.c";  
		for (String input : this.trainingTests.getPositives().keySet()) {
			try {
				Files.deleteIfExists(this.compiledBinary);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String command1 = "gcc " + sourceFile + " -o " + this.compiledBinary;
			String s1 = Utility.runCProgram(command1);
			if (s1.equals("failed"))
				continue;
			String s2 = Utility.runCProgramWithInput(this.compiledBinary.toString(), input);
			if (s2.trim().isEmpty())
				return;
			String[] entries = s2.split("_nextloop_");
			for (String entry : entries) {
				int inputStart = entry.indexOf("inputStart:");
				int inputEnd = entry.indexOf("inputEnd");
				int outputStart = entry.indexOf("outputStart:");
				// int outputEnd = s2.indexOf("outputEnd");
				if (inputStart == -1)
					continue;
				if (outputStart == -1)
					continue;

				List<String> inputList = new ArrayList<String>();
				List<String> outputList = new ArrayList<String>();

				String[] elems = entry.substring(inputStart + 11, inputEnd)
						.split("_VBC_");
				for (String e : elems) {
					if (e.equals(""))
						continue;
					inputList.add(e);
				}
				for (String o : entry.substring(outputStart + 12)
						.split("_VBC_")) {
					if (o.equals(""))
						continue;
					outputList.add(o);
				}
				info.getPositives().put(inputList, outputList);
			}
		}

	}
}
