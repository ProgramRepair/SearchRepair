package Experiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
			Utility.copy(this.folder + File.separator + this.fileName, runDir + File.separator + this.getFileName());
			return;
		}
		Transform trans = new Transform(this.getFolder(), this.getFileName(), typeParameter);
		String pass = trans.tranform();
		
		//transform here, if there is a true transform, no need to copy
		if(pass != null) {
			Utility.copy(pass, runDir + File.separator + this.getFileName());
			this.transformFile = pass.substring(pass.lastIndexOf('/') + 1);
		}
		else{
			this.transformFile = this.fileName;
			Utility.copy(this.folder + File.separator + this.fileName, runDir + File.separator + this.getFileName());
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
		this.initWbOrBB(wb);
		if(this.getPositives().size() == 0) {
			this.getInfo().getResult().setState(ResultState.NOPOSITIVE);
			return;
		}
		if(this.getNegatives().size() == 0){
			this.getInfo().getResult().setState(ResultState.CORRECT);
			return;
		}
		
		List<int[]> buggylines = getMultipleBuggyLines();
		for(int[] range : buggylines){
			//System.out.println(Arrays.toString(range));
			String prefix = this.getRunDir() + "/" + this.getFileName().substring(0, this.getFileName().lastIndexOf('.'));
			SearchCase instan = new SearchCase(prefix, this.getRepo());
			instan.setBuggy(range);
			instan.setTests(this.getTests());
			instan.search();
			if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
				this.setInfo(instan.getInfo());
				break;
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
		info.recordLog(this.folder + "/repair/" + filec);	
	}

	public ProgramTests getTests() {
		return this.programTests;
	}
	
	protected List<int[]> getMultipleBuggyLines(){
		List<int[]> list = new ArrayList<int[]>();
		BugLineSearcher bug = new BugLineSearcher(this.getFolder(), this.transformFile);
		list.add(bug.getBuggy());
		return list;
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
	
	protected double getAverage() {
		int denominator = 0;
		double numerator = 0;
		for(int i = 1; i <= this.getSuspiciousness().keySet().size(); i++){
				denominator++;
				numerator += this.getSuspiciousness().get(i);
		}
		if(denominator == 0) return 1;
		else return numerator / denominator;
	}
	

}
