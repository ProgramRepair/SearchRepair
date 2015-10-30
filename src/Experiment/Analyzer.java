package Experiment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.Utility;

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
	public static final String NOPOSITIVE = "NOPOSITIVE";
	public static final String SUCCESSANDPARTIAL = "successAndPartial";
	public static final String PARTIAL = "partial";

	// program, tech, version, status
	private Map<String, Map<String, Map<String, String>>> table;
	private String root;
	private boolean wb;
	private int repo;
	private Map<String, Integer> extraSuiteSize;

	// tech, program and fixed number
	private Map<String, Map<String, Integer>> fixedTable;
	private Map<String, Integer> correctProgram;
	private Map<String, Integer> extraPass;
	private Map<String, Integer> extraComplete;

	private Map<String, Integer> nopositive;
	// private Map

	private Map<String, Integer> searchOnly;
	private Map<String, Integer> genprogOnly;
	private Map<String, Integer> tspOnly;
	private Map<String, Integer> aeOnly;

	private Map<String, Integer> searchAndGenprog;
	private Map<String, Integer> searchAndTSP;
	private Map<String, Integer> searchAndAE;
	private Map<String, Integer> genprogAndAE;
	private Map<String, Integer> genprogAndTsp;
	private Map<String, Integer> aeAndTsp;

	private Map<String, Integer> searchANDaeANDgenprog;
	private Map<String, Integer> searchANDtspANDgenprog;
	private Map<String, Integer> searchANDaeANDtsp;
	private Map<String, Integer> aeANDtspANDgenprog;

	private Map<String, Integer> allsuccess;
	private Map<String, Integer> allfailed;

	private Map<String, Integer> successlist;

	public Analyzer(String root, boolean wb, int repo) {
		this.root = root;
		this.wb = wb;
		this.table = new HashMap<String, Map<String, Map<String, String>>>();
		this.extraSuiteSize = this.generateExtraTable();
		initTable();
		resetStatics();
		this.successlist = new HashMap<String, Integer>();
	}

	private Map<String, Integer> generateExtraTable() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		if (wb) {
			map.put(Analyzer.MEDIAN, 7);
			map.put(Analyzer.SMALLEST, 8);
			map.put(Analyzer.SYLLABLES, 6);
			map.put(Analyzer.GRADE, 9);
			map.put(Analyzer.DIGITS, 6);
			map.put(Analyzer.CHECKSUM, 6);
		} else {
			map.put(Analyzer.MEDIAN, 6);
			map.put(Analyzer.SMALLEST, 8);
			map.put(Analyzer.SYLLABLES, 9);
			map.put(Analyzer.GRADE, 9);
			map.put(Analyzer.DIGITS, 9);
			map.put(Analyzer.CHECKSUM, 9);
		}
		return map;
	}

	private void resetStatics() {
		this.nopositive = this.initOneProgramFix(false);
		this.correctProgram = this.initOneProgramFix(false);
		this.extraPass = this.initOneProgramFix(false);
		this.extraComplete = this.initOneProgramFix(false);
		this.fixedTable = new HashMap<String, Map<String, Integer>>();
		Map<String, Integer> genprogfix = initOneProgramFix(true);
		Map<String, Integer> aefix = initOneProgramFix(true);
		Map<String, Integer> tspfix = initOneProgramFix(true);
		Map<String, Integer> searchfix = initOneProgramFix(true);
		this.fixedTable.put("genprog", genprogfix);
		this.fixedTable.put("ae", aefix);
		this.fixedTable.put("tsp", tspfix);
		this.fixedTable.put("searchfix", searchfix);

		this.searchOnly = initOneProgramFix(false);
		this.aeOnly = this.initOneProgramFix(false);
		this.genprogOnly = this.initOneProgramFix(false);
		this.tspOnly = this.initOneProgramFix(false);

		this.searchAndAE = initOneProgramFix(false);
		this.searchAndTSP = this.initOneProgramFix(false);
		this.searchAndGenprog = this.initOneProgramFix(false);
		this.genprogAndAE = this.initOneProgramFix(false);
		this.genprogAndTsp = this.initOneProgramFix(false);
		this.aeAndTsp = this.initOneProgramFix(false);

		this.searchANDaeANDgenprog = this.initOneProgramFix(false);
		this.searchANDaeANDtsp = this.initOneProgramFix(false);
		this.searchANDtspANDgenprog = this.initOneProgramFix(false);
		this.aeANDtspANDgenprog = this.initOneProgramFix(false);

		this.allfailed = this.initOneProgramFix(false);
		this.allsuccess = this.initOneProgramFix(false);

	}

	private Map<String, Integer> initOneProgramFix(boolean partial) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(Analyzer.MEDIAN, 0);
		map.put(Analyzer.SMALLEST, 0);
		map.put(Analyzer.DIGITS, 0);
		map.put(Analyzer.GRADE, 0);
		map.put(Analyzer.SYLLABLES, 0);
		map.put(Analyzer.CHECKSUM, 0);
		if (!partial)
			return map;
		map.put(Analyzer.MEDIAN + "p", 0);
		map.put(Analyzer.SMALLEST + "p", 0);
		map.put(Analyzer.DIGITS + "p", 0);
		map.put(Analyzer.GRADE + "p", 0);
		map.put(Analyzer.SYLLABLES + "p", 0);
		map.put(Analyzer.CHECKSUM + "p", 0);
		return map;
	}

	public void fetch() {
		File rootDir = new File(root);
		for (File dir : rootDir.listFiles()) {
			String name = dir.getName();
			if (name.equals(Analyzer.MEDIAN) || name.equals(Analyzer.SMALLEST)
					|| name.equals(Analyzer.DIGITS)
					|| name.equals(Analyzer.CHECKSUM)
					|| name.equals(Analyzer.SYLLABLES)
					|| name.equals(Analyzer.GRADE)) {
				fetch(dir, name);
			}
		}
	}

	private static int i = 0;

	private void fetch(File dir, String name) {

		
		for(File version : dir.listFiles()){
			if(!checkDefect(version)){
				initNonDefect(version, name);
				continue;
			}

//			if(checkBroken(version)){
//				i++;
//				initBroken(version, name);
//				continue;
//			}
//			if(checkIsCorrect(version)){
//				
//				initCorrectForAll(version, name);
//				continue;
//			}
//			if(this.checkNopositve(version)){
//				
//				initNopositive(version, name);
//				continue;
//			}
			initSearchFix(version, name);
			initAE(version, name);
			initTSP(version, name);
			initGenprog(version, name);
		}
	}




	private void initNonDefect(File version, String program) {
		this.table.get(program).get("genprog").put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("ae").put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("tsp").put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("searchfix").put(version.getName(), Analyzer.NOPOSITIVE);
		this.nopositive.put(program, this.nopositive.get(program) + 1);
		
	}

	int g = 0;
	private boolean checkDefect(File version) {
		File file =  new File(version.getAbsolutePath() + "/repair/bbdefect");
		if(file.exists()){
			g++;
			return true;
		}
		return false;
	}


	private void initBroken(File version, String name) {
		initSearchFix(version, name);
		initAE(version, name);
		initTSP(version, name);
		initGenprog(version, name);

	}

	private boolean checkBroken(File version) {
		String checkDir;
		if (wb) {
			checkDir = version.getAbsolutePath() + "/whitebox/negative";
		} else
			checkDir = version.getAbsolutePath() + "/blackbox/negative";
		File temp = new File(checkDir);
		if (temp.exists() && temp.list().length != 0) {
			return false;
		}
		if (wb) {
			checkDir = version.getAbsolutePath() + "/whitebox/positive";
		} else
			checkDir = version.getAbsolutePath() + "/blackbox/positive";
		temp = new File(checkDir);
		if (temp.exists() && temp.list().length != 0) {
			return false;
		}
		return true;
	}

	private void initNopositive(File version, String program) {
		this.table.get(program).get("genprog")
				.put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("ae")
				.put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("tsp")
				.put(version.getName(), Analyzer.NOPOSITIVE);
		this.table.get(program).get("searchfix")
				.put(version.getName(), Analyzer.NOPOSITIVE);
		this.nopositive.put(program, this.nopositive.get(program) + 1);

	}

	private void initGenprog(File version, String name) {
		String path;
		if (wb)
			path = version.getAbsolutePath() + "/repair/gp-wb";
		else
			path = version.getAbsolutePath() + "/repair/gp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if (content.equals(Analyzer.SUCCESS)) {
			this.table.get(name).get("genprog")
					.put(version.getName(), Analyzer.SUCCESS);
		} else {
			this.table.get(name).get("genprog")
					.put(version.getName(), Analyzer.FAILED);
		}

	}

	private void initTSP(File version, String name) {
		String path;
		if (wb)
			path = version.getAbsolutePath() + "/repair/tsp-wb";
		else
			path = version.getAbsolutePath() + "/repair/tsp-bb";
		String content = Utility.getStringFromFile(path).trim();
		if (content.equals(Analyzer.SUCCESS)) {
			this.table.get(name).get("tsp")
					.put(version.getName(), Analyzer.SUCCESS);
		} else {
			this.table.get(name).get("tsp")
					.put(version.getName(), Analyzer.FAILED);
		}

	}

	private void initAE(File version, String name) {
		String path;
		if (wb)
			path = version.getAbsolutePath() + "/repair/ae-wb";
		else
			path = version.getAbsolutePath() + "/repair/ae-bb";
		String content = Utility.getStringFromFile(path).trim();
		if (content.equals(Analyzer.SUCCESS)) {
			this.table.get(name).get("ae")
					.put(version.getName(), Analyzer.SUCCESS);
		} else {
			this.table.get(name).get("ae")
					.put(version.getName(), Analyzer.FAILED);
		}
	}

	private void initCorrectForAll(File version, String program) {
		this.table.get(program).get("genprog")
				.put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("ae")
				.put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("tsp")
				.put(version.getName(), Analyzer.CORRECT);
		this.table.get(program).get("searchfix")
				.put(version.getName(), Analyzer.CORRECT);
		this.correctProgram.put(program, this.correctProgram.get(program) + 1);
		// System.out.println(version.getAbsolutePath());
	}

	private boolean checkNopositve(File version) {
		String checkDir;
		if (wb) {
			checkDir = version.getAbsolutePath() + "/whitebox/positive";
		} else
			checkDir = version.getAbsolutePath() + "/blackbox/positive";

		return !new File(checkDir).exists()
				|| new File(checkDir).list().length == 0;
	}

	private boolean checkIsCorrect(File version) {
		String checkDir;
		if (wb) {
			checkDir = version.getAbsolutePath() + "/whitebox/negative";
		} else
			checkDir = version.getAbsolutePath() + "/blackbox/negative";

		return !new File(checkDir).exists()
				|| new File(checkDir).list().length == 0;
	}

	private void initSearchFix(File version, String name) {

		//i++;
		//if(!name.equals(Analyzer.CHECKSUM)) return;
		//if(!version.getName().equals("8")) return;
		String path;
		if (wb)
			path = version.getAbsolutePath() + "/repair/searchfix-wb2";
		else
			path = version.getAbsolutePath() + "/repair/searchfix-bb2";

		String content = Utility.getStringFromFile(path).trim();
		if (content.isEmpty()) {
			this.table.get(name).get("searchfix")
					.put(version.getName(), Analyzer.FAILED);
			return;
		}
		String[] lines = content.split("\n");
		String firstline = lines[0].trim();
		if (firstline.startsWith("success")) {

			if (firstline.endsWith("partial")) {
				this.table.get(name).get("searchfix")
						.put(version.getName(), Analyzer.SUCCESSANDPARTIAL);
			} else {
				this.table.get(name).get("searchfix")
						.put(version.getName(), Analyzer.SUCCESS);
			}

			String id = Utility.getStringFromFile(version.getAbsolutePath()+ "/original");
			//id = id.substring(id.indexOf("IntroClass"));
			//this.successlist.add(id);
			String secondline = lines[1].trim();
			int value = Integer.parseInt(secondline.substring(secondline
					.lastIndexOf(":") + 1));
			this.successlist.put(id, value);
			this.extraPass.put(name, this.extraPass.get(name) + value);
			if (value == this.extraSuiteSize.get(name)) {
				this.extraComplete.put(name, this.extraComplete.get(name) + 1);
			}
		} else if (firstline.startsWith("partial")) {
			this.table.get(name).get("searchfix")
					.put(version.getName(), Analyzer.PARTIAL);
		} else if (firstline.startsWith("no positive")) {
			this.table.get(name).get("searchfix")
					.put(version.getName(), Analyzer.NOPOSITIVE);
		} else {
			this.table.get(name).get("searchfix")
					.put(version.getName(), Analyzer.FAILED);
		}

	}

	// program ,tech, versionnumber, correct
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
		// System.out.println(dirPath);
		File dir1 = new File(dirPath + "/blackbox/negative");
		File dir2 = new File(dirPath + "/whitebox/negative");
		boolean hasNeg = false;
		if (dir1.exists() && dir1.list().length != 0)
			hasNeg = true;
		if (dir2.exists() && dir2.list().length != 0)
			hasNeg = true;
		return hasNeg;
	}

	public int checkVersions(String root) {
		int count = 0;
		File dir = new File(root);
		for (File file : dir.listFiles()) {
			if (!file.getName().equals("tests") && file.isDirectory()) {
				count += getSubdir(file);
			}
		}
		return count;
	}

	private int getSubdir(File file) {
		int count = 0;
		for (File temp : file.listFiles()) {
			if (temp.isDirectory())
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream("./csvlog/log"));
			String backup = "/users/keyalin/documents/coding/backup/bughunt";
		
			Analyzer ana = new Analyzer("./bughunt", false, 2);
			ana.fetch();
			//System.out.println(ana.g);
			ana.initStatics();
////			
			ana.printFormat();
			ana.resetStatics();
			ana.getYuriy(ana);
			ana.writeLogIntoZip();
//////		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getCSVData() {
		try {
			System.setOut(new PrintStream("./csvlog/log"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Analyzer ana = new Analyzer("./bughunt", false, 2);
		ana.fetch();
		ana.initStatics();
		ana.printFormat();
		ana.resetStatics();
		ana.getYuriy(ana);
	}

	public static void getExistingData() {
		try {
			System.setOut(new PrintStream("./csvlog/log"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Analyzer ana = new Analyzer("./bughunt", false, 2);
		ana.fetch();
		ana.initStatics();
////		
		ana.printFormat();
		ana.resetStatics();
		ana.getYuriy(ana);
		
	}
	
	public void getYuriy(Analyzer ana){

		ana.initOnlys();
		ana.initTwoConbines();
		ana.initThreeCombines();
		ana.initAll();
		ana.printyury();
	}

	private void printSuccessList() {
		for (String s : this.successlist.keySet()) {
			System.out.println(s + this.successlist.get(s));
		}

	}

	private boolean verifySearch(String version, String program) {
		if (this.table.get(program).get("searchfix").get(version)
				.equals(Analyzer.SUCCESS)
				|| this.table.get(program).get("searchfix").get(version)
						.equals(Analyzer.SUCCESSANDPARTIAL)) {
			return true;
		} else
			return false;
	}

	private void printyury() {
		int i = 0;
		System.out.println("searchfix only, ae only, genprog only, tsp only");
		for (String program : this.searchOnly.keySet()) {
			i += this.searchOnly.get(program) + this.aeOnly.get(program)
					+ this.genprogOnly.get(program) + this.tspOnly.get(program);
			System.out.println(program + ", " + this.searchOnly.get(program)
					+ ", " + this.aeOnly.get(program) + ", "
					+ this.genprogOnly.get(program) + ", "
					+ this.tspOnly.get(program));
		}

		System.out
				.println("search & genprog, search & Ae, search & Tsp, genprog & Tsp, genprog & Ae, ae & Tsp");
		for (String program : this.searchAndAE.keySet()) {
			System.out.println(program + ", "
					+ this.searchAndGenprog.get(program) + ", "
					+ this.searchAndAE.get(program) + ", "
					+ this.searchAndTSP.get(program) + ", "
					+ this.genprogAndTsp.get(program) + ", "
					+ this.genprogAndAE.get(program) + ", "
					+ this.aeAndTsp.get(program));
			i += this.searchAndGenprog.get(program);
			i += this.searchAndAE.get(program);
			i += this.searchAndTSP.get(program);
			i += this.genprogAndTsp.get(program);
			i += this.genprogAndAE.get(program);
			i += this.aeAndTsp.get(program);
		}

		System.out
				.println("search & genprog & tsp, search & genprog & ae, search & ae & tsp, genprog & ae & tsp");
		for (String program : this.searchANDaeANDgenprog.keySet()) {
			System.out.println(program + ", "
					+ this.searchANDtspANDgenprog.get(program) + ", "
					+ this.searchANDaeANDgenprog.get(program) + ", "
					+ this.searchANDaeANDtsp.get(program) + ", "
					+ this.aeANDtspANDgenprog.get(program));
			i += this.searchANDtspANDgenprog.get(program);
			i += this.searchANDaeANDgenprog.get(program);
			i += this.searchANDaeANDtsp.get(program);
			i += this.aeANDtspANDgenprog.get(program);
		}

		System.out.println("all succeed, all failed");
		for (String program : this.allsuccess.keySet()) {
			i += this.allsuccess.get(program);
			i += this.allfailed.get(program);
			System.out.println(program + ", " + this.allsuccess.get(program)
					+ ", " + this.allfailed.get(program));
		}
	}

	private void initStatics() {
		// this.resetStatics();
		for (String program : this.table.keySet()) {
			for (String tech : this.table.get(program).keySet()) {
				for (String version : this.table.get(program).get(tech)
						.keySet()) {
					if (this.table.get(program).get(tech).get(version)
							.equals(Analyzer.SUCCESS)
							|| this.table.get(program).get(tech).get(version)
									.equals(Analyzer.SUCCESSANDPARTIAL)) {
						this.fixedTable.get(tech).put(program,
								this.fixedTable.get(tech).get(program) + 1);
						if (tech.equals("searchfix")) {
							if (this.table.get(program).get("ae").get(version)
									.equals(Analyzer.SUCCESS)) {
								this.searchAndAE.put(program,
										searchAndAE.get(program) + 1);
							}
							if (this.table.get(program).get("genprog")
									.get(version).equals(Analyzer.SUCCESS)) {
								this.searchAndGenprog.put(program,
										this.searchAndGenprog.get(program) + 1);
							}
							if (this.table.get(program).get("tsp").get(version)
									.equals(Analyzer.SUCCESS)) {
								this.searchAndTSP.put(program,
										this.searchAndTSP.get(program) + 1);
							}
							if (this.table.get(program).get("tsp").get(version)
									.equals(Analyzer.FAILED)
									&& this.table.get(program).get("ae")
											.get(version)
											.equals(Analyzer.FAILED)
									&& this.table.get(program).get("genprog")
											.get(version)
											.equals(Analyzer.FAILED)) {
								this.searchOnly.put(program,
										this.searchOnly.get(program) + 1);
							}

						}

					} else {
						if (this.table.get(program).get(tech).get(version)
								.equals(Analyzer.PARTIAL)) {
							this.fixedTable.get(tech).put(
									program + "p",
									this.fixedTable.get(tech)
											.get(program + "p") + 1);
						}
					}
				}
			}
		}

	}

	public void initOnlys() {

		for (String program : this.searchOnly.keySet()) {
			for (String tech : this.table.get(program).keySet()) {
				for (String version : this.table.get(program).get(tech)
						.keySet()) {
					// if(this.table.get(program).)
					if (tech.equals("searchfix")
							&& this.verifySearch(version, program)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.FAILED)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.FAILED)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchOnly.put(program,
									this.searchOnly.get(program) + 1);
						}
					}

					if (tech.equals("ae")
							&& this.table.get(program).get("ae").get(version)
									.equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.FAILED)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)
								&& !this.verifySearch(version, program)) {
							this.aeOnly.put(program,
									this.aeOnly.get(program) + 1);
						}
					}

					if (tech.equals("tsp")
							&& this.table.get(program).get("tsp").get(version)
									.equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("ae").get(version)
								.equals(Analyzer.FAILED)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)
								&& !this.verifySearch(version, program)) {
							this.tspOnly.put(program,
									this.tspOnly.get(program) + 1);
						}
					}

					if (tech.equals("genprog")
							&& this.table.get(program).get("genprog")
									.get(version).equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("ae").get(version)
								.equals(Analyzer.FAILED)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.FAILED)
								&& !this.verifySearch(version, program)) {
							this.genprogOnly.put(program,
									this.genprogOnly.get(program) + 1);
						}
						// this.genprogOnly.put(program,
						// this.genprogOnly.get(program) + 1);
					}
				}
			}
		}
	}

	public void initTwoConbines() {
		for (String program : this.searchOnly.keySet()) {
			for (String tech : this.table.get(program).keySet()) {
				for (String version : this.table.get(program).get(tech)
						.keySet()) {
					if (tech.equals("searchfix")
							&& this.verifySearch(version, program)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.FAILED)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchAndTSP.put(program,
									this.searchAndTSP.get(program) + 1);
						}
						if (this.table.get(program).get("ae").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.FAILED)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchAndAE.put(program,
									this.searchAndAE.get(program) + 1);
						}
						if (this.table.get(program).get("genprog").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.FAILED)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchAndGenprog.put(program,
									this.searchAndGenprog.get(program) + 1);
						}
					}

					if (tech.equals("genprog")
							&& this.table.get(program).get("genprog")
									.get(version).equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.FAILED)
								&& !this.verifySearch(version, program)) {
							this.genprogAndTsp.put(program,
									this.genprogAndTsp.get(program) + 1);
						}
						if (this.table.get(program).get("ae").get(version)
								.equals(Analyzer.SUCCESS)
								&& !this.verifySearch(version, program)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.FAILED)) {
							this.genprogAndAE.put(program,
									this.genprogAndAE.get(program) + 1);
						}
					}

					if (tech.equals("ae")
							&& this.table.get(program).get("ae").get(version)
									.equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.SUCCESS)
								&& !this.verifySearch(version, program)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.aeAndTsp.put(program,
									this.aeAndTsp.get(program) + 1);
						}
					}
				}
			}
		}
	}

	// public void

	public void initThreeCombines() {
		for (String program : this.searchOnly.keySet()) {
			for (String tech : this.table.get(program).keySet()) {
				for (String version : this.table.get(program).get(tech)
						.keySet()) {
					if (tech.equals("searchfix")
							&& this.verifySearch(version, program)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchANDaeANDtsp.put(program,
									this.searchANDaeANDtsp.get(program) + 1);
						}
						if (this.table.get(program).get("ae").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchANDaeANDgenprog
									.put(program, this.searchANDaeANDgenprog
											.get(program) + 1);
						}
						if (this.table.get(program).get("genprog").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.FAILED)) {
							this.searchANDtspANDgenprog
									.put(program, this.searchANDtspANDgenprog
											.get(program) + 1);
						}
					}

					if (tech.equals("ae")
							&& this.table.get(program).get("ae").get(version)
									.equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("genprog").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("tsp")
										.get(version).equals(Analyzer.SUCCESS)
								&& !this.verifySearch(version, program)) {
							this.aeANDtspANDgenprog.put(program,
									this.aeANDtspANDgenprog.get(program) + 1);
						}
					}

				}
			}
		}
	}

	public boolean aeSearch(String version, String program) {
		if (this.table.get(program).get("ae").get(version)
				.equals(Analyzer.SUCCESS))
			return true;
		else
			return false;
	}

	public boolean genprogSearch(String version, String program) {
		if (this.table.get(program).get("genprog").get(version)
				.equals(Analyzer.SUCCESS))
			return true;
		else
			return false;
	}

	public boolean tspSearch(String version, String program) {
		if (this.table.get(program).get("tsp").get(version)
				.equals(Analyzer.SUCCESS))
			return true;
		else
			return false;
	}

	public void initAll() {
		for (String program : this.searchOnly.keySet()) {
			for (String tech : this.table.get(program).keySet()) {
				for (String version : this.table.get(program).get(tech)
						.keySet()) {
					if (tech.equals("searchfix")
							&& this.verifySearch(version, program)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("ae")
										.get(version).equals(Analyzer.SUCCESS)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.SUCCESS)) {
							this.allsuccess.put(program,
									this.allsuccess.get(program) + 1);
						}
					}
					if (tech.equals("ae")
							&& !this.table.get(program).get("ae").get(version)
									.equals(Analyzer.SUCCESS)) {
						if (this.table.get(program).get("tsp").get(version)
								.equals(Analyzer.FAILED)
								&& !this.verifySearch(version, program)
								&& this.table.get(program).get("genprog")
										.get(version).equals(Analyzer.FAILED)) {
							this.allfailed.put(program,
									this.allfailed.get(program) + 1);
						}
					}

				}
			}
		}
	}

	private void printFormat() {
		System.out.println(i);
		System.out.println("fixed by each technique");
		for (String tech : this.fixedTable.keySet()) {
			System.out.println(tech);
			for (String program : this.fixedTable.get(tech).keySet()) {
				if (program.endsWith("p"))
					continue;
				System.out.print(program + ',');
			}
			System.out.println();
			for (String program : this.fixedTable.get(tech).keySet()) {
				if (program.endsWith("p"))
					continue;
				System.out.print(this.fixedTable.get(tech).get(program) + ",");
			}
			System.out.println();
		}

		
		System.out.println("total number of defects of each program");
		for(String program : this.correctProgram.keySet()){
			if(program.endsWith("p")) continue;
			System.out.print(program + ", ");
		}
		System.out.println();
		for (String program : this.correctProgram.keySet()) {
			if (program.endsWith("p"))
				continue;
			System.out
					.print(""
							+ (this.table.get(program).get("searchfix")
									.keySet().size()
									- this.correctProgram.get(program) - this.nopositive
										.get(program)) + ",");
		}
		System.out.println();

		System.out.println("overfitting data, average passing number");

		for (String program : this.extraPass.keySet()) {
			if (program.endsWith("p"))
				continue;
			System.out.print(program + ",");
		}
		System.out.println();
		for (String program : this.extraPass.keySet()) {
			if (program.endsWith("p"))
				continue;
			System.out.print("" + this.extraPass.get(program) * 1.0
					/ this.fixedTable.get("searchfix").get(program) + ", ");
		}

		System.out.println();

		System.out
				.println("overfitting data, number of fixes passing all of extra test suites");
		for (String program : this.extraComplete.keySet()) {
			if (program.endsWith("p"))
				continue;
			System.out.print(program + ", ");
		}
		System.out.println();
		for (String program : this.extraComplete.keySet()) {
			if (program.endsWith("p"))
				continue;
			System.out.print("," + this.extraComplete.get(program) + " ");
		}

		System.out.println();

		System.out.println("partial fixes");
		for (String program : this.fixedTable.get("searchfix").keySet()) {
			if (!program.endsWith("p"))
				continue;
			System.out.print(program + ", ");

		}
		System.out.println();
		for (String program : this.fixedTable.get("searchfix").keySet()) {
			if (!program.endsWith("p"))
				continue;
			System.out.print(this.fixedTable.get("searchfix").get(program)
					+ " ");

		}
		System.out.println();		
	}
	
	public void writeLogIntoZip(){
		File rootDir = new File(root);
		for(File dir : rootDir.listFiles()){
			String name = dir.getName();
//			if(name.equals(Analyzer.MEDIAN) || name.equals(Analyzer.SMALLEST) || name.equals(Analyzer.DIGITS) || name.equals(Analyzer.CHECKSUM )|| name.equals(Analyzer.SYLLABLES) || name.equals(Analyzer.GRADE) ){
//				fetch(dir, name);
//			}	
			if(name.equals("syllables")){
				findSuccessVersion(dir,name);
			}
		}
	}


	private void findSuccessVersion(File root, String name) {
		List<String> list = new ArrayList<String>();
		for(File dir : root.listFiles()){
			String path = dir.getAbsolutePath();
			String searchfix = path + "/repair/searchfix-bb2";
			String content = Utility.getStringFromFile(searchfix);
			if(content.trim().startsWith("success")){
				list.add(searchfix);
			}
		}
		
		try {
			PrintWriter pw = new PrintWriter(new File("./csvlog/success"));
			for(String s : list){
				pw.println(s);
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
