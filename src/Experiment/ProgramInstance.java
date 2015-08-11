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
import ProcessIntroClass.GetInputStateAndOutputState;
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

	private int[] buggy; // TODO: kill this, it's ridiculous.
	protected CaseInfo info;
	private int repo;
	private List<String> content;
	private String program;
	
	protected WhiteOrBlack whiteOrBlack;

	public ProgramInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb){
		this.repo = repo;
		this.folder = folder;
		this.fileName = fileName;
		this.compiledBinary = Paths.get(this.folder.toString() + File.separator + program);

		this.buggy = new int[2];
		this.info = new CaseInfo();

		this.runDir = Paths.get(this.folder.toString() + File.separator + "temp");
		this.content = new ArrayList<String>();
		this.setProgram(program);
		this.whiteOrBlack = wb;
	}

	public int getRepo() {
		return repo;
	}

	public void setRepo(int repo) {
		this.repo = repo;
	}

	protected void initContent() {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.folder + File.separator + this.transformFile)));
			String s = null;
			while((s = br.readLine()) != null){
				this.content.add(s.trim());
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public List<String> getContent() {
		return content;
	}

	public void setContent(List<String> content) {
		this.content = content;
	}

	protected CaseInfo getInfo() {
		return info;
	}

	protected void setInfo(CaseInfo info) {
		this.info = info;
	}

	public Path getFolder() {
		return folder;
	}

	public int[] getBuggy() {
		return buggy;
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

	protected void initTests(){
		initTraining(); 
		initValidation();

		// possible FIXME: initialize this without a useless variable.
		GcovTest test = new GcovTest(this.getProgram(), this.folder, this.transformFile, this.whiteOrBlack);
	}

	// precondition: assumes tests have been initialized
	public void search(){
		if(this.trainingTests.getPositives().size() == 0) {
			this.info.getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.trainingTests.getNegatives().size() == 0){
			this.info.getResult().setState(ResultState.CORRECT);
			return;
		}
		getBugLines();
		if(this.buggy[0] == 0) {
			this.info.getResult().setState(ResultState.FAILED);
			return;
		}

		initPositiveStates();
		if(this.info.getPositives().isEmpty()) {
			this.info.getResult().setState(ResultState.FAILED);
			return;
		}
		searchOverRepository();
		ruleOutFalsePositive();		
		if(isEmpty(info.getResult())) {
			this.info.getResult().setState(ResultState.FAILED);
			return;
		}
		else{
			if(!info.getResult().getPositive().isEmpty())
			{
				this.info.getResult().setState(ResultState.SUCCESS);
			}
			else{
				this.info.getResult().setState(ResultState.PARTIAL);
			}
		}

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


	protected void ruleOutFalsePositive() {
		for(String source : info.getResult().getSearchMapping().keySet()){
			for(Map<String, String> map : info.getResult().getSearchMapping().get(source)){
				String input = Restore.getMappingString(source, map);
				String outputFile = generateOutputFile(input);
				if(testAllResults(source, outputFile)){
					info.getResult().getMappingSource().put(source, input);
					break;
				}
				else continue;
			}
		}

	}	

	// FIXME: figure out why tf RegionInstance had a different ruleoutfalsepositive method than programinstance
//	protected void ruleOutFalsePositive() {
//		for (String source : info.getResult().getSearchMapping().keySet()) {
//			for (Map<String, String> map : info.getResult().getSearchMapping()
//					.get(source)) {
//				try {
//					String input = Restore.getMappingString(source, map);
//					String outputFile = generateOutputFile(input);
//					if (testAllResults(source, outputFile)) {
//						info.getResult().getMappingSource().put(source, input);
//						int extraPass = this.passTestSuite(source, outputFile,
//								this.validationTests.getPositives());
//						extraPass += this.passTestSuite(source, outputFile,
//								this.validationTests.getNegatives());
//						this.info.getResult().getExtraPass()
//								.put(source, extraPass);
//						break;
//					} else
//						continue;
//				} catch (Exception e) {
//					System.out.println(e);
//					continue;
//				}
//			}
//
//		}
//
//	}

	private boolean testAllResults(String source, String outputFile) {
		boolean pass = trainingTests.passAllPositive(source, outputFile, this.compiledBinary);
		if(!pass) return false;
		int count = trainingTests.passNegatives(source, outputFile, this.compiledBinary);
		if(count == this.trainingTests.getNegatives().size()) {
			info.getResult().getPositive().add(source);
			return true;
		}
		else if(count == 0){
			info.getResult().getFalsePositve().add(source);
			return false;
		}
		else {
			info.getResult().getPartial().put(source, count * 1.0 / this.trainingTests.getNegatives().size());
			return true;
		}
	}
	

	private String generateOutputFile(String input) {
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


	public void searchJustOnMap() {
		try {
			info.setResult(new ResultObject());
			PrototypeSearch.searchOnlyMatchType(info, repo);
			//this.printResult();
			this.ruleOutFalsePositive();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	protected void initPositiveStates() {
		GetInputStateAndOutputState instan = new GetInputStateAndOutputState(this.getFolder().toString(), this.getFileName().toString(), this.getBuggy(), this.trainingTests.getPositives().keySet());
		info.setPositives(instan.getStates());
	}
	/**
	 * if no bug, the buggy lines will be 0-0
	 */
	protected int[] getBugLines() {
		BugLineSearcher bug = new BugLineSearcher(this.getFolder().toString(), this.transformFile.toString());
		this.getBuggy()[0] = bug.getBuggy()[0];
		this.getBuggy()[1] = bug.getBuggy()[1];
		return bug.getBuggy();
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
	protected void initTraining() {
		this.initTests(this.trainingTests, this.whiteOrBlack);
	}
	
	protected void initValidation() {
		WhiteOrBlack which = this.whiteOrBlack == WhiteOrBlack.BLACKBOX ? WhiteOrBlack.WHITEBOX : WhiteOrBlack.BLACKBOX; 
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
		String markFile = RegionInstance.insertMark(this.getProgram(),this.compiledBinary.toString(), this.getProgram(), buggy);
 
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

	/**
	 * get input/output pairs, and buggy lines info
	 * 
	 * @param caseFile
	 */ 
	// FIXME: Why doesn't anyone use this??
	private void parse(String caseFile) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(caseFile)));
			String line = null;
			boolean neg = false;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.startsWith("positive:")) {
					neg = false;
				} else if (line.startsWith("negative:")) {
					neg = true;
				} else if (line.startsWith("buggy lines:")) {
					String[] lines = line.substring(12).split("-");
					buggy[0] = Integer.valueOf(lines[0]);
					buggy[1] = Integer.valueOf(lines[1]);
				} else if (line.startsWith("input:")) {
					int index = line.indexOf("output:");
					String input = line.substring(6, index);
					String output = line.substring(index + 7);
					if (neg) {
						this.trainingTests.addNegativeTest(input.trim(), output.trim());
					} else {
						this.trainingTests.addPositiveTest(input.trim(), output.trim());
					}
				} else {
					continue;
				}
			}
			br.close();
		} catch (Exception e) {
			return;
		}

	}

	// FIXME: consider adding unit testing back in at end.
	//	public static void main(String[] args) {
	//		ESearchCase instan = new ESearchCase("./bughunt/smallest/43", "smallest.c", 2);
	//		//instan.search();
	//		//instan.recordResult();
	//		System.out.println(instan.test());
	//	}

}
