package Experiment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
	
	
	private Map<String, Map<String, String>> table;
	private String root;
	private boolean wb;
	private int repo;
	
	
	
	//statistics
	private int genprogfix;
	private int aefix;
	private int tspfix;
	private int searchfix;

	public Analyzer(String root, boolean wb, int repo) {
		this.root = root;
		this.wb = wb;
		this.table = new HashMap<String, Map<String, String>>();
		initTable();
		resetStatics();
	}
	
	
	private void resetStatics() {
		this.genprogfix = 0;
		this.aefix = 0;
		this.tspfix = 0;
		this.searchfix = 0;
		
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
				initCorrectForAll(version);
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
		if(wb) path = version.getAbsolutePath() + "/repair/tsp-wb";
		else path = version.getAbsolutePath() + "/repair/tsp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.CORRECT)){
			this.table.get(name).put(version.getName(), Analyzer.CORRECT);
		}
		else{
			this.table.get(name).put(version.getName(), Analyzer.FAILED);
		}
		
	}


	private void initTSP(File version, String name) {
		String path;
		if(wb) path = version.getAbsolutePath() + "/repair/tsp-wb";
		else path = version.getAbsolutePath() + "/repair/tsp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.CORRECT)){
			this.table.get(name).put(version.getName(), Analyzer.CORRECT);
		}
		else{
			this.table.get(name).put(version.getName(), Analyzer.FAILED);
		}
		
	}


	private void initAE(File version, String name) {
		String path;
		if(wb) path = version.getAbsolutePath() + "/repair/ae-wb";
		else path = version.getAbsolutePath() + "/repair/ae-bb";
		String content = Utility.getStringFromFile(path).trim();
		if(content.equals(Analyzer.CORRECT)){
			this.table.get(name).put(version.getName(), Analyzer.CORRECT);
		}
		else{
			this.table.get(name).put(version.getName(), Analyzer.FAILED);
		}
	}


	private void initCorrectForAll(File version) {
		this.table.get(Analyzer.MEDIAN).put(version.getName(), Analyzer.CORRECT);
		this.table.get(Analyzer.CHECKSUM).put(version.getName(), Analyzer.CORRECT);
		this.table.get(Analyzer.SMALLEST).put(version.getName(), Analyzer.CORRECT);
		this.table.get(Analyzer.SYLLABLES).put(version.getName(), Analyzer.CORRECT);
		this.table.get(Analyzer.GRADE).put(version.getName(), Analyzer.CORRECT);
		this.table.get(Analyzer.DIGITS).put(version.getName(), Analyzer.CORRECT);
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
		this.table.get(name).put(version.getName(), Analyzer.FAILED);
		
	}


	private void initTable() {
		table.put(Analyzer.MEDIAN, new HashMap<String, String>());
		table.put(Analyzer.SMALLEST, new HashMap<String, String>());
		table.put(Analyzer.DIGITS, new HashMap<String, String>());
		table.put(Analyzer.GRADE, new HashMap<String, String>());
		table.put(Analyzer.SYLLABLES, new HashMap<String, String>());
		table.put(Analyzer.CHECKSUM, new HashMap<String, String>());
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
		Analyzer ana = new Analyzer("./bughunt/median", true, 1);
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
		this.resetStatics();
		for(String s : this.table.get(Analyzer.MEDIAN))
		
	}


	private void printFormat() {
		System.out.println();
		
	}
	
}
