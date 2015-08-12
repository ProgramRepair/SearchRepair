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
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import search.PrototypeSearch;
import search.ResultObject;
import search.ResultObject.ResultState;
import Library.Utility;
import ProcessIntroClass.BugLineSearcher;
import ProcessIntroClass.GcovTest;
import ProcessIntroClass.Transform;

public  class ESearchCase {
	protected static Logger logger = Logger.getLogger(ESearchCase.class);

	private Map<Integer, Double> suspiciousness;
	private String folder;

	private ProgramTests trainingTests;
	private Map<String,String> validationTests;

	private String fileName;
	private int[] buggy;
	private String casePrefix;
	private CaseInfo info;
	private boolean bracket;
	private boolean hasPrintf ;
	private String runDir;
	private String transformFile;
	private int repo;	
	
	
	public void setBuggy(int[] buggy) {
		this.buggy = buggy;
	}

	public Map<String,String> getValidationTests() {
		return this.validationTests;
	}
	public ESearchCase(String folder, String fileName, int repo){
		this.repo = repo;
		this.folder = folder;
		this.fileName = fileName;
		this.trainingTests = new ProgramTests();
		this.validationTests = new HashMap<String,String>();
		this.buggy = new int[2];
		this.casePrefix = this.folder + "/" + fileName.substring(0, fileName.lastIndexOf("."));
		this.info = new CaseInfo();
		this.bracket = false;
		this.hasPrintf = false;
		this.suspiciousness = new HashMap<Integer, Double>();
		this.runDir = this.folder + "/temp";
	}
	
	
	
	public int getRepo() {
		return repo;
	}

	public void setRepo(int repo) {
		this.repo = repo;
	}


	protected CaseInfo getInfo() {
		return info;
	}




	protected void setInfo(CaseInfo info) {
		this.info = info;
	}




	public String getFolder() {
		return folder;
	}

	
	
	
	public int[] getBuggy() {
		return buggy;
	}

	public String getCasePrefix() {
		return casePrefix;
	}


	public String getFileName() {
		return fileName;
	}
	
	protected void transformAndInitRunDir(boolean transform, String typeParameter){
		runDir = this.getFolder() + "/temp";
		if(!new File(runDir).exists()) new File(runDir).mkdir();
		if(!transform) {
			this.transformFile = this.fileName;
			Utility.copy(this.folder + "/" + this.fileName, runDir + "/" + this.getFileName());
			return;
		}
		Transform trans = new Transform(this.getFolder(), this.getFileName(), typeParameter);
		String pass = trans.tranform();
		
		//transform here, if there is a true transform, no need to copy
		if(pass != null) {
			Utility.copy(pass, runDir + "/" + this.getFileName());
			this.transformFile = pass.substring(pass.lastIndexOf('/') + 1);
		}
		else{
			this.transformFile = this.fileName;
			Utility.copy(this.folder + "/" + this.fileName, runDir + "/" + this.getFileName());
		}
	}
	
	protected void initWbOrBB(boolean wb){
		if(wb){
			
			this.setPositives(this.getWhitePositives());
			this.setNegatives(this.getWhiteNegatives());
			this.validationTests.putAll(this.getBlackNegatives());
			this.validationTests.putAll(this.getBlackPositives());
			
		}
		else{
			this.setPositives(this.getBlackPositives());
			this.setNegatives(this.getBlackNegatives());
			this.validationTests.putAll(this.getWhiteNegatives());
			this.validationTests.putAll(this.getWhitePositives());
		}
		GcovTest test = new GcovTest(this.folder, this.transformFile, wb);
	}
	
	public  void search(boolean wb){
		// FIXME: not implemented at this level
		
	}
	
	
	
	
	public boolean isHasPrintf() {
		return hasPrintf;
	}



	public void setHasPrintf(boolean hasPrintf) {
		this.hasPrintf = hasPrintf;
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
		if(count == this.getNegatives().keySet().size()) return true;
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
		for(String input : this.getNegatives().keySet()){
			String output = this.getNegatives().get(input);
			
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
		for(String input : this.getPositives().keySet()){
			String output = this.getPositives().get(input);
			
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
			if(this.bracket) writer.write("{\n");
			
			writer.write(input);
			if(this.bracket) writer.write("}\n");
			
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
	protected int[] getBugLines() {
		BugLineSearcher bug = new BugLineSearcher(this.getFolder(), this.transformFile);
		this.getBuggy()[0] = bug.getBuggy()[0];
		this.getBuggy()[1] = bug.getBuggy()[1];
//		this.bracket = bug.isAddBracket();
//		this.hasPrintf = bug.getHasPrintf();
		return bug.getBuggy();
	}



	protected void initInputAndOutput() {
		initPositveInputAndOutput();
		initNegativeInputAndOutput();
		
	}



	private void initNegativeInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/negative";
		String root2 = this.getFolder() + "/whitebox/negative";
		addToInputOutputMap(root1, this.getBlackNegatives());
		addToInputOutputMap(root2, this.getWhiteNegatives());
		
	}

	private void initPositveInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/positive";
		String root2 = this.getFolder() + "/whitebox/positive";
		addToInputOutputMap(root1, this.getBlackPositives());
		addToInputOutputMap(root2, this.getWhitePositives());
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
		return this.trainingTests.getBlackPositives();
	}

	public void setBlackPositives(Map<String, String> blackPositives) {
		this.trainingTests.setBlackPositives(blackPositives);
	}

	public Map<String, String> getBlackNegatives() {
		return this.trainingTests.getBlackNegatives();
	}

	public void setBlackNegatives(Map<String, String> blackNegatives) {
		this.trainingTests.setBlackNegatives(blackNegatives);
	}

	public Map<String, String> getWhitePositives() {
		return this.trainingTests.getWhitePositives();
	}

	public void setWhitePositives(Map<String, String> whitePositives) {
		this.trainingTests.setWhitePositives(whitePositives);
	}

	public Map<String, String> getWhiteNegatives() {
		return this.trainingTests.getWhiteNegatives();
	}

	public void setWhiteNegatives(Map<String, String> whiteNegatives) {
		this.trainingTests.setWhiteNegatives(whiteNegatives);
	}

	public Map<String, String> getPositives() {
		return this.trainingTests.getPositives();
	}


	public void setPositives(Map<String, String> positives) {
		this.trainingTests.setPositives(positives);
	}


	public Map<String, String> getNegatives() {
		return trainingTests.getNegatives();
	}

	public void setNegatives(Map<String, String> negatives) {
		this.trainingTests.setNegatives(negatives);
	}


	public String getRunDir() {
		return runDir;
	}

	public void setRunDir(String runDir) {
		this.runDir = runDir;
	}


}
