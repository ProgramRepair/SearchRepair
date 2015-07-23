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
import Library.Utility;
import ProcessIntroClass.BugLineSearcher;
import ProcessIntroClass.GcovTest;
import ProcessIntroClass.GetInputStateAndOutputState;
import ProcessIntroClass.Transform;
// FIXME: note to self: nuke gcc and gdb at least!

public  class ESearchCase {
	protected static Logger logger = Logger.getLogger(ESearchCase.class);

	private Map<Integer, Double> suspiciousness;
	private Path folder;
	private Path runDir;
	private Path transformFile;
	private Path fileName;

	private Map<String, String> blackPositives = new HashMap<String, String>();
	private Map<String, String> blackNegatives = new HashMap<String, String>();
	private Map<String, String> whitePositives = new HashMap<String, String>();
	private Map<String, String> whiteNegatives = new HashMap<String, String>();
	private Map<String, String> positives = new HashMap<String, String>();
	private Map<String, String> negatives = new HashMap<String, String>();
	private Map<String, String> verifications = new HashMap<String, String>();
	private int[] buggy;
	private String casePrefix;
	private CaseInfo info;
	private int repo;
	private List<String> content;
	private String program;
	
	public ESearchCase(String program, Path folder, Path fileName, int repo){
		this.repo = repo;
		this.folder = folder;
		this.fileName = fileName;
		this.buggy = new int[2];
		// FIXME: what is casePrefix actually?
		this.casePrefix = this.folder.toString() + "/" + fileName.toString().substring(0, fileName.toString().lastIndexOf("."));
		this.info = new CaseInfo();
		this.suspiciousness = new HashMap<Integer, Double>();
		this.runDir = Paths.get(this.folder.toString() + "/temp");
		this.content = new ArrayList<String>();
		this.setProgram(program);
	}
	
	public int getRepo() {
		return repo;
	}

	public void setRepo(int repo) {
		this.repo = repo;
	}

	protected void initContent() {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.folder + "/" + this.transformFile)));
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

	public String getCasePrefix() {
		return casePrefix;
	}

	public Path getFileName() {
		return fileName;
	}
	
	protected void transformAndInitRunDir(boolean transform, String typeParameter){ 
		if(!Files.exists(runDir)) {
			runDir.toFile().mkdir();
		}
		try {
		Path targetFile = Paths.get(runDir.toString() + this.getFileName().toString());
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
			Utility.copy(pass, runDir + "/" + this.getFileName());
			this.transformFile = Paths.get(pass.substring(pass.lastIndexOf('/') + 1));
		}
		else{
			this.transformFile = this.getFileName();;
			Utility.copyDirOK(this.getFileName(), targetFile); 

		}
		} catch (IOException e) {
			logger.error("IOException in transformAndInitRunDir, likely a problem with transform file name mangling.");
		}
	}
	
	protected void initWbOrBB(boolean wb){
		this.verifications.clear();
		if(wb){
			this.setPositives(this.whitePositives);
			this.setNegatives(this.whiteNegatives);
			this.verifications.putAll(this.blackNegatives);
			this.verifications.putAll(this.blackPositives);
			
		}
		else{
			this.setPositives(this.blackPositives);
			this.setNegatives(this.blackNegatives);
			this.verifications.putAll(this.whiteNegatives);
			this.verifications.putAll(this.whitePositives);
		}
		GcovTest test = new GcovTest(this.getProgram(), this.folder, this.transformFile, wb);
	}

	public  void search(boolean wb){
		initInputAndOutput();
		
		if(this.getPositives().size() == 0) {
			this.info.getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.negatives.size() == 0){
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

	public void recordResult(boolean wb) {
		String filec;
		int type = repo;
		if(repo == 3 || repo == 4){
			type = 2;
		}
		if(wb){
			filec="searchfix-wb" + type;
		}
		else{
			filec="searchfix-bb" + type;
		}
		File dir = new File(this.folder + "/repair");
		if(!dir.exists()){
			dir.mkdir();
		}
		recordLog(this.folder + "/repair/" + filec);
		
		
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
	
	public boolean test(){
		this.initWbOrBB(false);
		this.initInputAndOutput();
		String outputFile = this.casePrefix + ".c";
		boolean pass = passAllPositive("result", outputFile);
		//if(!pass) return false;
		int count = passNegatives("result", outputFile);
		if(count == this.negatives.keySet().size()) return true;
		return false;
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
		File file = new File( this.casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		Utility.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return 0;
		}
		int count = 0;
		for(String input : this.negatives.keySet()){
			String output = this.negatives.get(input);
			
			String command2 = "./" + this.casePrefix;
			
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

	private boolean passAllPositive(String source, String outputFile) {
		File file = new File( this.casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		Utility.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return false;
		}
		for(String input : this.positives.keySet()){
			String output = this.positives.get(input);
			
			String command2 = "./" + this.casePrefix;
			
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

	private String generateOutputFile(String input) {
		String outputfile = this.casePrefix + "new.c";
		try{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputfile)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.casePrefix + ".c")));	
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
		info.setPositives(instan.getStates());;
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

	protected void initInputAndOutput() {
		initPositiveInputAndOutput();
		initNegativeInputAndOutput();
		
	}

	private void initNegativeInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/negative";
		String root2 = this.getFolder() + "/whitebox/negative";
		addToInputOutputMap(root1, this.blackNegatives);
		addToInputOutputMap(root2, this.whiteNegatives);
		
	}

	private void initPositiveInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/positive";
		String root2 = this.getFolder() + "/whitebox/positive";
		addToInputOutputMap(root1, this.blackPositives);
		addToInputOutputMap(root2, this.whitePositives);
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
	
	protected void initSuspicious() {
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
		
	protected Map<Integer, Double> getSuspiciousness() {
		return suspiciousness;
	}

	protected void setSuspiciousness(Map<Integer, Double> suspiciousness) {
		this.suspiciousness = suspiciousness;
	}

	public Map<String, String> getBlackPositives() {
		return blackPositives;
	}

	public void setBlackPositives(Map<String, String> blackPositives) {
		this.blackPositives = blackPositives;
	}

	public Map<String, String> getBlackNegatives() {
		return blackNegatives;
	}

	public void setBlackNegatives(Map<String, String> blackNegatives) {
		this.blackNegatives = blackNegatives;
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

	public Map<String, String> getPositives() {
		return positives;
	}

	public void setPositives(Map<String, String> positives) {
		this.positives = positives;
	}

	public Map<String, String> getNegatives() {
		return negatives;
	}

	public void setNegatives(Map<String, String> negatives) {
		this.negatives = negatives;
	}

	public Map<String, String> getVerifications() {
		return verifications;
	}

	public void setVerifications(Map<String, String> verifications) {
		this.verifications = verifications;
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

// FIXME: consider adding unit testing back in at end.
//	public static void main(String[] args) {
//		ESearchCase instan = new ESearchCase("./bughunt/smallest/43", "smallest.c", 2);
//		//instan.search();
//		//instan.recordResult();
//		System.out.println(instan.test());
//	}

}
