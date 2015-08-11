package Experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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

	private int[] buggy;
	private CaseInfo info;
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
		if(this.getPositives().size() == 0) {
			this.info.getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
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
		recordLog(this.folder + File.separator + "repair" + filec);

	}

	private void recordLog(String path) {
		if(new File(path).exists()) new File(path).delete();
		try {
			new File(path).createNewFile();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		try{
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			if(info.getResult().getState() == ResultState.FAILED){
				pw.println("failed");
			}
			else if(info.getResult().getState() == ResultState.CORRECT){
				pw.println("correct");
			}
			else if(info.getResult().getState() == ResultState.NOPOSITIVE){
				pw.println("no positive");
			}
			else{
				if(!info.getResult().getPositive().isEmpty())
					pw.print("success");

				if(!info.getResult().getPartial().isEmpty()){
					pw.print(" partial");
				}
				pw.println();
				pw.println("extra pass:" + info.getResult().getBigExtra());
				pw.println("True fix:" + info.getResult().getPositive().size());
				int count = 0;
				for(String source : info.getResult().getPositive()){
					pw.println();
					pw.println();
					pw.println("True fix " + ++count);
					pw.println("From: ");
					pw.println(source);
					pw.println("To: ");
					pw.print(info.getResult().getMappingSource().get(source));
				}



				pw.println("Partial fix:" + info.getResult().getPartial().keySet().size());
				count = 0;
				for(String source : info.getResult().getPartial().keySet()){

					pw.println();
					pw.println();
					pw.println("Partial fix " + ++count);
					pw.println("success: " + info.getResult().getPartial().get(source));
					pw.println("From: ");
					pw.println(source);
					pw.println("To: ");
					pw.print(info.getResult().getMappingSource().get(source));
				}

				pw.println("Not a fix:" + info.getResult().getFalsePositve().size());
				count = 0;
				for(String source : info.getResult().getFalsePositve()){

					pw.println();
					pw.println();
					pw.println("Not a fix " + ++count);
					pw.println(source);
				}

			}
			pw.close();

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	private void ruleOutFalsePositive() {
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

	private boolean testAllResults(String source, String outputFile) {
		boolean pass = passAllPositive(source, outputFile);
		if(!pass) return false;
		int count = passNegatives(source, outputFile);
		if(count == this.getNegatives().size()) {
			info.getResult().getPositive().add(source);
			return true;
		}
		else if(count == 0){
			info.getResult().getFalsePositve().add(source);
			return false;
		}
		else {
			info.getResult().getPartial().put(source, count * 1.0 / this.getNegatives().size());
			return true;
		}
	}

	private int passNegatives(String source, String outputFile) {
		return passAllTests(source, outputFile, this.getNegatives());
	}

	private boolean passAllPositive(String source, String outputFile) {
		int numPassed = passAllTests(source, outputFile, this.getPositives()); 
		return (numPassed == this.getPositives().size());  
	}

	private int passAllTests(String source, String outputFile, Map<String,String> testSuite) {
		try {
			Files.deleteIfExists(this.compiledBinary);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// FIXME: don't need to do this twice
		String command1 = "gcc " + outputFile + " -o " + this.compiledBinary.toString();
		Utility.runCProgram(command1);
		if(!Files.exists(this.compiledBinary)) {
			return 0;
		}
		int count = 0;
		for(String input : testSuite.keySet()){
			String output = testSuite.get(input);

			String s2 = Utility.runCProgramWithInput(this.compiledBinary.toString(), input);

			if(s2.isEmpty() ){
				continue;
			}

			if(s2.equals(output)) count++;
		}
		return count;
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

	protected void initPositiveStates() {
		GetInputStateAndOutputState instan = new GetInputStateAndOutputState(this.getFolder().toString(), this.getFileName().toString(), this.getBuggy(), this.getPositives().keySet());
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


	public HashMap<String, String> getNegatives() {
		return this.trainingTests.getNegatives();
	}

	public HashMap<String, String> getPositives() {
		return this.trainingTests.getPositives();
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
	// FIXME: consider adding unit testing back in at end.
	//	public static void main(String[] args) {
	//		ESearchCase instan = new ESearchCase("./bughunt/smallest/43", "smallest.c", 2);
	//		//instan.search();
	//		//instan.recordResult();
	//		System.out.println(instan.test());
	//	}

}
