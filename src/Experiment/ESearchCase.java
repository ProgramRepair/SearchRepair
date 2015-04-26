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

import search.PrototypeSearch;
import search.ResultObject;
import search.ResultObject.ResultState;
import Library.CTest;
import Library.Utility;
import ProcessIntroClass.BugLineSearcher;
import ProcessIntroClass.GetInputStateAndOutputState;

public  class ESearchCase {
	private String folder;
	private Map<String, String> positives;
	private Map<String, String> negatives;
	private String fileName;
	private int[] buggy;
	private String casePrefix;
	private CaseInfo info;
	private boolean bracket;
	private boolean hasPrintf ;
	
	
	
	public ESearchCase(String folder, String fileName){
		this.folder = folder;
		this.fileName = fileName;
		this.positives = new HashMap<String, String>();
		this.negatives = new HashMap<String, String>();
		this.buggy = new int[2];
		this.casePrefix = this.folder + "/" + fileName.substring(0, fileName.lastIndexOf("."));
		this.info = new CaseInfo();
		this.bracket = false;
		this.hasPrintf = false;
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
	public String getFileName() {
		return fileName;
	}
	
	public  void search(){
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
		if(this.hasPrintf) {
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
			this.info.getResult().setState(ResultState.SUCCESS);
			return;
		}
		
	}
	
	
	
	
	public boolean isHasPrintf() {
		return hasPrintf;
	}



	public void setHasPrintf(boolean hasPrintf) {
		this.hasPrintf = hasPrintf;
	}



	protected boolean isEmpty(ResultObject result) {
		return result.getPositive().isEmpty();
	}



	public void recordResult() {
		File dir = new File(this.folder + "/repair");
		if(!dir.exists()){
			dir.mkdir();
		}
		recordLog(this.folder + "/repair/semantic");
		
		
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
			else if(info.getResult().getState() == ResultState.SUCCESS){
				pw.println("success");
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
				pw.close();
			}
			
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
	
	public void test(){
		String outputFile = this.casePrefix + "new.c";
		boolean pass = passAllPositive("result", outputFile);
		int count = passNegatives("result", outputFile);
		System.out.println(count);
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
			return false;
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
			PrototypeSearch.search(info);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	protected void initPositiveStates() {
		GetInputStateAndOutputState instan = new GetInputStateAndOutputState(this.getFolder(), this.getFileName(), this.getBuggy(), this.getPositives().keySet());
		info.setPositives(instan.getStates());;
	}
	/**
	 * if no bug, the buggy lines will be 0-0
	 */
	protected void getBugLines() {
		BugLineSearcher bug = new BugLineSearcher(this.getFolder(), this.getFileName());
		this.getBuggy()[0] = bug.getBuggy()[0];
		this.getBuggy()[1] = bug.getBuggy()[1];
		this.bracket = bug.isAddBracket();
		this.hasPrintf = bug.getHasPrintf();
	}



	protected void initInputAndOutput() {
		initPositveInputAndOutput();
		initNegativeInputAndOutput();
		
	}



	private void initNegativeInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/negative";
		String root2 = this.getFolder() + "/whitebox/negative";
		Map<String, String> map = this.getNegatives();
		addToInputOutputMap(root1, map);
		addToInputOutputMap(root2, map);
		
	}



	private void initPositveInputAndOutput() {
		String root1 = this.getFolder() + "/blackbox/positive";
		String root2 = this.getFolder() + "/whitebox/positive";
		Map<String, String> map = this.getPositives();
		addToInputOutputMap(root1, map);
		addToInputOutputMap(root2, map);
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
	
	public static void main(String[] args) {
		ESearchCase instan = new ESearchCase("./bughunt/grade/0", "grade.c");
		instan.search();
		//instan.test();
	}

}
