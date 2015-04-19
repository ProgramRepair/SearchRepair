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
import InputAndOuput.CaseInfo;
import InputAndOuput.Restore;
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
	
	public ESearchCase(String folder, String fileName){
		this.folder = folder;
		this.fileName = fileName;
		this.positives = new HashMap<String, String>();
		this.negatives = new HashMap<String, String>();
		this.buggy = new int[2];
		this.casePrefix = this.folder + "/" + fileName.substring(0, fileName.lastIndexOf("."));
		this.info = new CaseInfo();
		this.bracket = false;
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
	
	public  boolean search(){
		initInputAndOutput();
		if(this.getPositives().size() == 0) return false; 
		getBugLines();
		if(this.buggy[0] == 0) return false;
		initPositiveStates();
		if(this.info.getPositives().isEmpty()) return false;
		searchOverRepository();
		ruleOutFalsePositive();
		recordResult();
		return true;
	}
	
	
	private void recordResult() {
		File dir = new File(this.folder + "/result");
		if(dir.exists()){
			dir.delete();
		}
		dir.mkdir();
		recordLog(this.folder + "/result/log");
		
		
	}



	private void recordLog(String path) {
		try{
			PrintWriter pw = new PrintWriter(new FileOutputStream(path));
			pw.println("True fix:" + info.getResult().getFalsePositve().size());
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
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}



	private void ruleOutFalsePositive() {
		for(String source : info.getResult().getSource()){
			//if(!source.contains("maxlen")) return;
			//if(!source.startsWith("a=b")) continue;
			String input =Restore.getMappingString(source, info.getResult().getSearchMapping().get(source));
			String outputFile = generateOutputFile(input);
			testAllResults(source, outputFile);
			info.getResult().getMappingSource().put(source, input);
		}
		
	}

	
	private void testAllResults(String source, String outputFile) {
		boolean pass = passAllPositive(source, outputFile);
		if(!pass) return;
		int count = passNegatives(source, outputFile);
		if(count == this.getNegatives().size()) {
			info.getResult().getPositive().add(source);
			return;
		}
		else if(count == 0){
			info.getResult().getFalsePositve().add(source);
		}
		else info.getResult().getPartial().put(source, count * 1.0 / this.getNegatives().size());
	}



	private int passNegatives(String source, String outputFile) {
		File file = new File( this.casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		CTest.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return 0;
		}
		int count = 0;
		for(String input : this.negatives.keySet()){
			String output = this.negatives.get(input);
			
			String command2 = "./" + this.casePrefix;
			
			String s2 = runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				continue;
			}
			if(s2.equals(output)) count++;
		}
		return count;
	}



	private boolean passAllPositive(String source, String outputFile) {
		File file = new File( this.casePrefix);
		if(file.exists()) file.delete();
		String command1 = "gcc " + outputFile + " -o " + this.casePrefix;
		CTest.runCProgram(command1);
		if(!new File(this.casePrefix).exists()){
			return false;
		}
		for(String input : this.positives.keySet()){
			String output = this.positives.get(input);
			
			String command2 = "./" + this.casePrefix;
			
			String s2 = runCProgramWithInput(command2, input);
			
			if(s2.isEmpty() ){
				return false;
			}
			if(!s2.equals(output)) return false;
		}
		return true;
	}



	private String runCProgramWithInput(String command2, String input) {
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(command2);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ls_proc.getOutputStream()));
			writer.write(input);
			writer.flush();

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));
			BufferedReader ls_err = new BufferedReader(new InputStreamReader(
					ls_proc.getErrorStream()));

//			long now = System.currentTimeMillis();
//			long timeoutInMillis = 100L * 10; // timeout in seconds
//			long finish = now + timeoutInMillis;

			try {
//				while (CTest.isAlive(ls_proc)
//						&& (System.currentTimeMillis() < finish)) {
//					Thread.sleep(10);
//				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					sb.append("\n");
					// System.out.println(ls_str);
				}
//				while((ls_str = ls_err.readLine()) != null){
//					System.out.println(ls_str);
//					sb.append(ls_str);
//				}
				if (CTest.isAlive(ls_proc)) {
					ls_proc.destroy();
				//sb.append("unknown - killed");
				}
			} catch (IOException e) {
				out = "";
				// System.exit(0);
			} catch (Exception e) {
				out = "";
			}
		} catch (Exception e) {
			e.printStackTrace();
			out= "";
		}
		out = sb.toString();
		return out;
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


	private void searchOverRepository() {
		try {
			PrototypeSearch.search(info);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private void initPositiveStates() {
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
		ESearchCase instan = new ESearchCase("./bughunt/median/0", "median.c");
		instan.search();
	}

}
