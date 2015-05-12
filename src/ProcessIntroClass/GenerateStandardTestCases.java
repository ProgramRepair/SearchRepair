package ProcessIntroClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Library.Utility;


public class GenerateStandardTestCases {
	private static int count = 0;
	
	private String introPath;
	private String outputFolderPath;
	public GenerateStandardTestCases(String introPath, String outputFolderPath) {
		super();
		this.introPath = introPath;
		this.outputFolderPath = outputFolderPath;
		new File(outputFolderPath).mkdir();
		this.list = new ArrayList<String>();
	}
	private List<String> list;
	
	public void printFailed(){
		System.out.println(list);
	}
	
	public void generate(){
		try{
			File dir = new File(introPath);
			for(String typeName : dir.list()){
				if(typeName.equals("smallest")){
					generate(introPath + "/smallest", outputFolderPath + "/smallest");
				}
				else if(typeName.equals("median")){
					generate(introPath + "/median", outputFolderPath + "/median");
				}
				if(typeName.equals("grade")){
					generate(introPath + "/grade", outputFolderPath + "/grade");
				}
				else if(typeName.equals("checksum")){
					generate(introPath + "/checksum", outputFolderPath + "/checksum");
				}
				else if(typeName.equals("digits")){
					generate(introPath + "/digits", outputFolderPath + "/digits");
				}
				else if(typeName.equals("syllables")){
					generate(introPath + "/syllables", outputFolderPath + "/syllables");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void generate(String inputFolder, String outputFolder) {
		String functionName = inputFolder.substring(inputFolder.lastIndexOf("/") + 1);
		File outputFolderFile = new File(outputFolder);
		outputFolderFile.mkdir();
		try{
			int depth = 0;
			File file = new File(inputFolder);
			List<File> queue = new ArrayList<File>();
			queue.add(file);
			while(!queue.isEmpty() && depth != 2){
				List<File> list = new ArrayList<File>();
				for(int i = 0; i < queue.size();i++){
					File temp = queue.get(i);
					if(temp.getName().equals("tests")) continue;
					if(temp.isDirectory()){
						for(File f : temp.listFiles()){
							if(f.isDirectory()) list.add(f);
						}
					}
				}
				queue = list;
				depth++;
			}
			if(depth != 2) return;
			
			int count = 0;
			for(File temp : queue){
				File caseFolder = new File(outputFolderFile.getAbsolutePath() + "/" + count++);
				init(temp, caseFolder, functionName);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void init(File temp, File caseFolder, String functionName) {
		String inputFolder = temp.getAbsolutePath();
		String outputFolder = caseFolder.getAbsolutePath();
		new File(outputFolder).mkdir();
		System.out.println(inputFolder + "\n" + outputFolder);
	
		Utility.copy(inputFolder + "/" + functionName + ".c", outputFolder + "/" + functionName + ".c");
		Utility.writeTOFile(outputFolder + "/original", inputFolder);
		generateWhiteAndBlack(outputFolder, inputFolder, functionName + ".c");
		getOtherTechInfo(inputFolder, outputFolder);
	}
	
	private void getOtherTechInfo(String inputFolder, String outputFolder) {
		new File(outputFolder + "/repair").mkdir();
		File dir = new File(inputFolder);
		for(File file : dir.listFiles()){
			String name = file.getName();
			if(name.endsWith("log") && name.startsWith("gp")){
				String fileString = Utility.getStringFromFile(file.getAbsolutePath());
				if(fileString.contains("Repair Found") || fileString.contains("repair found")){
					if(name.contains("wb"))
					{
						Utility.writeTOFile(outputFolder + "/repair/gp-wb", "success");
					}
					else if(name.contains("bb")){
						Utility.writeTOFile(outputFolder + "/repair/gp-bb", "success");
					}
				}
			}
			else if(name.endsWith("log") && name.startsWith("ae")){
				String fileString = Utility.getStringFromFile(file.getAbsolutePath());
				if(fileString.contains("Repair Found") || fileString.contains("repair found")){
					if(name.contains("wb"))
					{
						Utility.writeTOFile(outputFolder + "/repair/ae-wb", "success");
					}
					else if(name.contains("bb")){
						Utility.writeTOFile(outputFolder + "/repair/ae-bb", "success");
					}
				}
			}
			else if(name.endsWith("log") && name.startsWith("tsp")){
				String fileString = Utility.getStringFromFile(file.getAbsolutePath());
				if(fileString.contains("Repair Found") || fileString.contains("repair found")){
					if(name.contains("-wb-"))
					{
						Utility.writeTOFile(outputFolder + "/repair/tsp-wb", "success");
					}
					else if(name.contains("-bb-")){
						Utility.writeTOFile(outputFolder + "/repair/tsp-bb", "success");
					}
				}
			}
		}
		
	}

	private void generateWhiteAndBlack(String outputFolder, String inputFolder, String fileName) {
		String whiteboxPath = inputFolder + "/../../tests/whitebox";
		String blackboxPath = inputFolder + "/../../tests/blackbox";
		new File(outputFolder + "/whitebox").mkdir();
		new File(outputFolder + "/whitebox/positive").mkdir();
		new File(outputFolder + "/whitebox/negative").mkdir();
		new File(outputFolder + "/blackbox").mkdir();
		//new File(outputFolder + "/blackbox").mkdir();
		new File(outputFolder + "/blackbox/positive").mkdir();
		new File(outputFolder + "/blackbox/negative").mkdir();
		try{
			if(new File("./tempFolder/a.out").exists()) new File("./tempFolder/a.out").delete();
			String s = Utility.runCProgram("gcc -o ./tempFolder/a.out " + inputFolder + '/'+fileName);
			if(s.equals("failed")) {
				return;
			}
			initWhiteBox(whiteboxPath, inputFolder, outputFolder);
			initBlackBox(blackboxPath, inputFolder, outputFolder);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void initBlackBox(String blackboxPath, String inputFolder,
			String outputFolder) {
		for(File file : new File(blackboxPath).listFiles()){
			String path = file.getAbsolutePath();
			if(path.endsWith(".in")){
				String input = Utility.getStringFromFile1(path);
				String outPath = path.substring(0, path.length() - 3) + ".out";
				String output = Utility.getStringFromFile(outPath);
				String runOutput = Utility.runCProgramWithInput("./tempFolder/a.out", input);
				if(runOutput.equals(output)){
					String index = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.'));
					Utility.copy(path, outputFolder + "/blackbox/positive/" + index + ".in");
					Utility.copy(outPath, outputFolder + "/blackbox/positive/" + index + ".out");
				}
				else{
					String index = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.'));
					Utility.copy(path, outputFolder + "/blackbox/negative/" + index + ".in");
					Utility.copy(outPath, outputFolder + "/blackbox/negative/" + index + ".out");
				}
			}
		}
		
	}

	private void initWhiteBox(String whiteboxPath, String inputFolder,
			String outputFolder) {
		for(File file : new File(whiteboxPath).listFiles()){
			String path = file.getAbsolutePath();
			if(path.endsWith(".in")){
				String input = Utility.getStringFromFile1(path);
				String outPath = path.substring(0, path.length() - 3) + ".out";
				String output = Utility.getStringFromFile(outPath);
				String runOutput = Utility.runCProgramWithInput("./tempFolder/a.out", input);
				if(runOutput.equals(output)){
					String index = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.'));
					Utility.copy(path, outputFolder + "/whitebox/positive/" + index + ".in");
					Utility.copy(outPath, outputFolder + "/whitebox/positive/" + index + ".out");
				}
				else{
					String index = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.'));
					Utility.copy(path, outputFolder + "/whitebox/negative/" + index + ".in");
					Utility.copy(outPath, outputFolder + "/whitebox/negative/" + index + ".out");
				}
			}
		}
		
	}
	



	
	public static void main(String[] args){
		GenerateStandardTestCases test = new GenerateStandardTestCases("/users/yke/documents/coding/project/introclass-may-2015", "./bughunt");
		test.generate();
		test.printFailed();
	}

}
