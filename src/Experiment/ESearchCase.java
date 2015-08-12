package Experiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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

	private ProgramTests programTests;

	private String fileName;
	private String casePrefix;
	private CaseInfo info;
	private String runDir;
	private String transformFile;
	private int repo;	
	
	public ESearchCase(String folder, String fileName, int repo){
		this.repo = repo;
		this.folder = folder;
		this.fileName = fileName;
		this.casePrefix = this.folder + "/" + fileName.substring(0, fileName.lastIndexOf("."));
		this.programTests = new ProgramTests(this.casePrefix);
		this.info = new CaseInfo();
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
	
	public Map<String,String> getValidationTests() {
		return this.programTests.getValidationTests();
	}

	protected void initWbOrBB(boolean wb){
		programTests.initTrainingAndValidationTests(wb, this.getFolder());
		GcovTest test = new GcovTest(this.folder, this.transformFile, wb);
	}
	
	public  void search(boolean wb){
		// FIXME: not implemented at this level
		
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
		return bug.getBuggy();
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

	public Map<String, String> getPositives() {
		return this.programTests.getPositives();
	}

	public Map<String, String> getNegatives() {
		return programTests.getNegatives();
	}

	public String getRunDir() {
		return runDir;
	}

	public void setRunDir(String runDir) {
		this.runDir = runDir;
	}


}
