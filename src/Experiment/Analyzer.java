package Experiment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class Analyzer {
	
	public static final String MEDIAN = "median";
	public static final String SMALLEST = "smallest";
	public static final String SYLLABLES = "syllables";
	public static final String DIGITS = "digits";
	public static final String GRADE = "grade";
	public static final String CHECKSUM = "checksum";
	public static final String CORRECT = "correct";
	public static final String FAILED = "failed";
	public static final String SUCCESS = "success";
	
	
	private Map<String, Map<String, Map<String, String>>> table;
	private String root;
	private boolean wb;
	private int repo;
	
	
	
	//statistics: program and fixed number
	private Map<String, Map<String, Integer>> fixedTable;
	private Map<String, Integer> genprogfix;
	private Map<String, Integer> aefix;
	private Map<String, Integer> tspfix;
	private Map<String, Integer> searchfix;
	private Map<String, Integer> correctProgram;

	public Analyzer(String root, boolean wb, int repo) {
		this.root = root;
		this.wb = wb;
		this.table = new HashMap<String, Map<String, Map<String, String>>>();
		initTable();
		resetStatics();
	}
	
	
	private void resetStatics() {
		this.correctProgram = this.initOneProgramFix();
		this.fixedTable = new HashMap<String, Map<String, Integer>>();
		this.genprogfix = initOneProgramFix();
		this.aefix = initOneProgramFix();
		this.tspfix = initOneProgramFix();
		this.searchfix = initOneProgramFix();
		this.fixedTable.put("genprog", genprogfix);
		this.fixedTable.put("ae", this.aefix);
		this.fixedTable.put("tsp", this.tspfix);
		this.fixedTable.put("searchfix", this.searchfix);
	}


	private Map<String, Integer> initOneProgramFix() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(Analyzer.MEDIAN, 0);
		map.put(Analyzer.SMALLEST, 0);
		map.put(Analyzer.DIGITS, 0);
		map.put(Analyzer.GRADE, 0);
		map.put(Analyzer.SYLLABLES, 0);
		map.put(Analyzer.CHECKSUM, 0);
		return map;
	}


	public void fetch(){
		File rootDir = new File(root);
		for(File dir : rootDir.listFiles()){
			String name = dir.getName();
			if(name.equals(Analyzer.MEDIAN) || name.equals(Analyzer.SMALLEST) || name.equals(Analyzer.DIGITS) || name.equals(Analyzer.CHECKSUM )|| name.equals(Analyzer.SYLLABLES) || name.equals(Analyzer.GRADE) ){
				fetch(dir, name);
			}			
		}
	}
	
	

	private void fetch(File dir, String name) {
		for(File version : dir.listFiles()){
			if(checkIsCorrect(version)){
				initCorrectForAll(version, name);
				continue;
			}
			initSearchFix(version, name);
			initAE(version, name);
			initTSP(version, name);
			initGenprog(version, name);
		}		
	}




	private void initGenprog(File version, String name) {
		String path;
		if(wb) path = version.getAbsolutePath() + "/repair/gp-wb";
		else path = version.getAbsolutePath() + "/repair/gp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.SUCCESS)){
			this.table.get(name).get("genprog").put(version.getName(), Analyzer.SUCCESS);
		}
		else{
			this.table.get(name).get("genprog").put(version.getName(), Analyzer.FAILED);
		}
		
	}


	private void initTSP(File version, String name) {
		String path;
		if(wb) path = version.getAbsolutePath() + "/repair/tsp-wb";
		else path = version.getAbsolutePath() + "/repair/tsp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.SUCCESS)){
			this.table.get(name).get("tsp").put(version.getName(), Analyzer.SUCCESS);
		}
		else{
			this.table.get(name).get("tsp").put(version.getName(), Analyzer.FAILED);
		}
		
	}


	private void initAE(File version, String name) {
		String path;
		if(wb) path = version.getAbsolutePath() + "/repair/ae-wb";
		else path = version.getAbsolutePath() + "/repair/ae-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.SUCCESS)){
			this.table.get(name).get("ae").put(version.getName(), Analyzer.SUCCESS);
		}
		else{
			this.table.get(name).get("ae").put(version.getName(), Analyzer.FAILED);
		}
	}


	private void initCorrectForAll(File version, String program) {
		this.table.get(program).get("genprog").put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("ae").put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("tsp").put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("searchfix").put(version.getName(), Analyzer.CORRECT);
		this.correctProgram.put(program, this.correctProgram.get(program) + 1);
	}


	private boolean checkIsCorrect(File version) {
		String checkDir;
		if(!wb){
			checkDir = version.getAbsolutePath() + "/whitebox/negative";
		}
		else checkDir = version.getAbsolutePath() + "/blackbox/negative";
		
		return !new File(checkDir).exists() || new File(checkDir).list().length == 0;
	}


	private void initSearchFix(File version, String name) {
		// TODO Auto-generated method stub
		this.table.get(name).get("searchfix").put(version.getName(), Analyzer.FAILED);
		
	}


	private void initTable() {
		
		table.put(Analyzer.MEDIAN, generateTable());
		table.put(Analyzer.SMALLEST, generateTable());
		table.put(Analyzer.DIGITS, generateTable());
		table.put(Analyzer.GRADE, generateTable());
		table.put(Analyzer.SYLLABLES, generateTable());
		table.put(Analyzer.CHECKSUM, generateTable());
	}



	// tech and versionNumber/correct pair
	private Map<String, Map<String, String>> generateTable() {
		Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
		map.put("genprog", new HashMap<String, String>());
		map.put("ae", new HashMap<String, String>());
		map.put("tsp", new HashMap<String, String>());
		map.put("searchfix", new HashMap<String, String>());
		return map;
	}


	private boolean checkNeg(File subsubDir) {
		String dirPath = subsubDir.getAbsolutePath();
		//System.out.println(dirPath);
		File dir1 = new File(dirPath + "/blackbox/negative");
		File dir2 = new File(dirPath + "/whitebox/negative");
		boolean hasNeg = false;
		if(dir1.exists() && dir1.list().length != 0) hasNeg = true;
		if(dir2.exists() && dir2.list().length != 0) hasNeg = true;
		return hasNeg;
	}
	

	
	public  int checkVersions(String root){
		int count = 0;
		File dir = new File(root);
		for(File file : dir.listFiles()){
			if(!file.getName().equals("tests") && file.isDirectory()){
				count += getSubdir(file);
			}
		}
		return count;
	}
	
	private int getSubdir(File file) {
		int count = 0;
		for(File temp : file.listFiles()){
			if(temp.isDirectory()) count++;
		}
		return count;
	}

	public static void main(String[] args){
		Analyzer ana = new Analyzer("./bughunt", false, 1);
		ana.fetch();
		ana.initStatics();
		ana.printFormat();
//		try {
//			System.setOut(new PrintStream("log"));
//			int count = ana.checkVersions("/users/yke/documents/coding/project/introclass-may-2015/median");
//			System.out.println(count);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}


	private void initStatics() {
		//this.resetStatics();
		for(String program : this.table.keySet()){
			for(String tech: this.table.get(program).keySet()){
				for(String version : this.table.get(program).get(tech).keySet()){
					if(this.table.get(program).get(tech).get(version).equals(Analyzer.SUCCESS)){
						this.fixedTable.get(tech).put(program, this.fixedTable.get(tech).get(program) + 1);
					}
				}
			}
		}
		
	}


	private void printFormat() {
		System.out.println(this.fixedTable);
		System.out.println(this.correctProgram);
		
	}
	
}
