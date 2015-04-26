package ProcessIntroClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class GcovTest {
	
	//test case folder
	private String folder;
	
	//the buggy source file in that folder
	private String fileName;
	
	private Map<String, String> positives;
	private Map<String, String> negatives;
	private Map<Integer, Integer> positiveExecutions;
	private Map<Integer, Integer> negativeExecutions;
	private Map<Integer, Double> suspiciousness;

	public GcovTest(String folder, String fileName) {
		super();
		this.folder = folder;
		this.fileName = fileName;
		System.out.println(folder);
		this.positiveExecutions = new HashMap<Integer, Integer>();
		this.negativeExecutions = new HashMap<Integer, Integer>();
		this.positives = new HashMap<String, String>();
		this.negatives = new HashMap<String, String>();
		this.suspiciousness = new HashMap<Integer, Double>();
		initInputs();
		initExecutions();
	}

	private void initExecutions() {
		if(!compile()) return;
		initPositiveExecutions();
		if(this.positiveExecutions.isEmpty()) return;
		initNegativeExecutions();
		if(this.negativeExecutions.isEmpty()) return;
		calculatesuspiciousness();
//		for(int num : this.suspiciousness.keySet()){
//			System.out.println("suspiciousness: " + num + " " + this.suspiciousness.get(num));
//		}
		recordSuspiciousness();
	}

	private void recordSuspiciousness() {
		String filePath = this.folder + "/suspicious";
		try{
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
			for(int num = 1;  num <= this.suspiciousness.keySet().size(); num++){
				bw.write(Integer.toString(num));
				bw.write(" ");
				bw.write(Double.toString(this.suspiciousness.get(num)));
				bw.write("\n");
			}
			bw.flush();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void calculatesuspiciousness() {
		int totalFail = this.negatives.size();
		for(int num : this.negativeExecutions.keySet()){
			int failed = this.negativeExecutions.get(num);
			int success = this.positiveExecutions.get(num);
			int denom = totalFail * (failed + success);
			if(denom == 0) this.suspiciousness.put(num, 0.0);
			else{
				this.suspiciousness.put(num, failed * 1.0 / denom);
			}
		}
	}

	private void initNegativeExecutions() {
		String functionName = this.fileName.substring(0, this.fileName.lastIndexOf('.'));
		for(String input : this.negatives.keySet()){
			String cleanCommand = "rm " + functionName + ".gcda";
			Utility.runCProgram(cleanCommand);
			//System.out.println(input);
			String s = runWithUserInput("./a.out", input);
			//System.out.println(s);
			String gcovCommand = "gcov " + "./" + fileName;
			Utility.runCProgram(gcovCommand);
			String gcovFile = this.fileName + ".gcov";
			GcovFileParse parser = new GcovFileParse(gcovFile);
			for(int lineNumber : parser.getExecutions().keySet()){
				if(!this.negativeExecutions.containsKey(lineNumber)){
					this.negativeExecutions.put(lineNumber, parser.getExecutions().get(lineNumber));
				}
				else{
					this.negativeExecutions.put(lineNumber, parser.getExecutions().get(lineNumber) + this.negativeExecutions.get(lineNumber));
				}
			}
		}
		
	}

	private boolean compile() {
		Utility.copy(folder + "/" + fileName, "./" + fileName);
		String command = "gcc -fprofile-arcs -ftest-coverage " + "./" + fileName;
		String s = Utility.runCProgram(command);
		if(s.equals("failed")) return false;
		return true;
		//String cleanCommand = "rm median.gcda";
		//Utility.runCProgram(cleanCommand);
	}

	private void initPositiveExecutions() {
		String functionName = this.fileName.substring(0, this.fileName.lastIndexOf('.'));
		for(String input : this.positives.keySet()){
			String cleanCommand = "rm " + functionName + ".gcda";
			Utility.runCProgram(cleanCommand);
			//System.out.println(input);
			String s = runWithUserInput("./a.out", input);
			//System.out.println(s);
			String gcovCommand = "gcov " + "./" + fileName;
			Utility.runCProgram(gcovCommand);
			String gcovFile = this.fileName + ".gcov";
			GcovFileParse parser = new GcovFileParse(gcovFile);
			for(int lineNumber : parser.getExecutions().keySet()){
				if(!this.positiveExecutions.containsKey(lineNumber)){
					this.positiveExecutions.put(lineNumber, parser.getExecutions().get(lineNumber));
				}
				else{
					this.positiveExecutions.put(lineNumber, parser.getExecutions().get(lineNumber) + this.positiveExecutions.get(lineNumber));
				}
			}
		}
		
	}

	private String runWithUserInput(String command, String input) {
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try {
			Process ls_proc = Runtime.getRuntime().exec(command);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(ls_proc.getOutputStream()));
			writer.write(input);
			writer.flush();

			BufferedReader ls_in = new BufferedReader(new InputStreamReader(
					ls_proc.getInputStream()));
			BufferedReader ls_err = new BufferedReader(new InputStreamReader(
					ls_proc.getErrorStream()));

			long now = System.currentTimeMillis();
			long timeoutInMillis = 100L * 10; // timeout in seconds
			long finish = now + timeoutInMillis;

			try {
				while (Utility.isAlive(ls_proc)
						&& (System.currentTimeMillis() < finish)) {
					Thread.sleep(10);
				}
				if (Utility.isAlive(ls_proc)) {
					ls_proc.destroy();
					sb.append("");
				}
				while ((ls_str = ls_in.readLine()) != null) {
					sb.append(ls_str);
					// System.out.println(ls_str);
				}
				while((ls_str = ls_err.readLine()) != null){
					//System.out.println(ls_str);
					sb.append(ls_str);
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

	private void initInputs() {
		//obtainPositives
		initPositives();
		initNegatives();
//		for(String s : positives.keySet()){
//			System.out.println("input: " + s + " output: " + positives.get(s));
//		}
//		
//		for(String s : negatives.keySet()){
//			System.out.println("input: " + s + " output: " + negatives.get(s));
//		}
	}

	private void initNegatives() {
		
		String dir = this.folder + "/whitebox/negative";
		initNegatives(dir);
		String blackdir = this.folder + "/blackbox/negative";
		initNegatives(blackdir);
	}

	private void initNegatives(String dir) {
		File directory = new File(dir);
		if(!directory.exists() || !directory.isDirectory()) return;
		//System.out.println(dir);
		for(File file : directory.listFiles()){
			String name = file.getAbsolutePath();
			if(name.endsWith(".in")){				
				String input = Utility.getStringFromFile(name);
				String outputFile = name.substring(0, name.length() - 3) + ".out";
				String output = Utility.getStringFromFile(outputFile);
				this.negatives.put(input, output);
			}
		}
		
	}

	private void initPositives() {
		//fetch from whitebox
		String dir = this.folder + "/whitebox/positive";
		initPositives(dir);
		String blackdir = this.folder + "/blackbox/positive";
		initPositives(blackdir);
	}

	private void initPositives(String dir) {
		File directory = new File(dir);
		if(!directory.exists() || !directory.isDirectory()) return;
		for(File file : directory.listFiles()){
			String name = file.getAbsolutePath();
			if(name.endsWith(".in")){				
				String input = Utility.getStringFromFile(name);
				String outputFile = name.substring(0, name.length() - 3) + ".out";
				String output = Utility.getStringFromFile(outputFile);
				this.positives.put(input, output);
			}
		}
		
	}
	
	public static void groupExperiment(String root){
		try{
			File dir = new File(root);
			for(String typeName : dir.list()){
				if(typeName.equals("smallest")){
					generate(root + "/smallest", "smallest.c");
				}
				else if(typeName.equals("median")){
					generate(root + "/median", "median.c");
				}
				else if(typeName.equals("grade")){
					generate(root + "/grade", "grade.c");
				}
				else if(typeName.equals("checksum")){
					generate(root + "/checksum", "checksum.c");
				}
				else if(typeName.equals("digits")){
					generate(root + "/digits", "digits.c");
				}
				if(typeName.equals("syllables")){
					generate(root + "/syllables", "syllables.c");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	private static void generate(String root, String fileName) {
		try{
			File dir = new File(root);
			for(File file : dir.listFiles()){
				if(file.isDirectory()){
					String path = file.getAbsolutePath();
					GcovTest test = new GcovTest(path, fileName);
					//test.
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args){
		//GcovTest test = new GcovTest("./bughunt/syllables/129", "syllables.c");
		groupExperiment("./bughunt");
	}

}
