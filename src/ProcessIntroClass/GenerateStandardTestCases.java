package ProcessIntroClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateStandardTestCases {
	
	private String introPath;
	private String outputFolderPath;
	public GenerateStandardTestCases(String introPath, String outputFolderPath) {
		super();
		this.introPath = introPath;
		this.outputFolderPath = outputFolderPath;
		new File(outputFolderPath).mkdir();
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
				else if(typeName.equals("grade")){
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
			int count = 0;
			File file = new File(inputFolder);
			Queue<File> queue = new LinkedList<File>();
			queue.add(file);
			while(!queue.isEmpty()){
				File temp = queue.poll();
				if(temp.isDirectory()){
					for(File f : temp.listFiles()){
						queue.add(f);
					}					
				}
				else{
					String name = temp.getName();
					if(name.equals(functionName + ".c")){
						File caseFolder = new File(outputFolder + "/" + count++);
						caseFolder.mkdir();
						init(temp, caseFolder);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void init(File temp, File caseFolder) {
		String filePath = temp.getAbsolutePath();
		String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
		String outputFolder = caseFolder.getAbsolutePath();
		String inputFolder = filePath.substring(0, filePath.lastIndexOf("/") + 1);
		
		copy(filePath, outputFolder + "/" + fileName);
		generateWhiteAndBlack(outputFolder, inputFolder);
	}
	
	private void generateWhiteAndBlack(String outputFolder, String inputFolder) {
		String whiteboxPath = inputFolder + "/../../tests/whitebox";
		String blackboxPath = inputFolder + "/../../tests/blackbox";
		String whiteFilePath = inputFolder + "/whitebox_test.sh";
		String blackFilePath = inputFolder + "/blackbox_test.sh";
		new File(outputFolder + "/whitebox").mkdir();
		new File(outputFolder + "/whitebox/positive").mkdir();
		new File(outputFolder + "/whitebox/negative").mkdir();
		new File(outputFolder + "/blackbox").mkdir();
		//new File(outputFolder + "/blackbox").mkdir();
		new File(outputFolder + "/blackbox/positive").mkdir();
		new File(outputFolder + "/blackbox/negative").mkdir();
		try{
			BufferedReader white = new BufferedReader(new InputStreamReader(new FileInputStream(whiteFilePath)));
			String s1 = null;
			while((s1 = white.readLine()) != null){
				s1 = s1.trim();
				if(s1.startsWith("p")){
					int index = s1.indexOf("whitebox");
					String prefix = s1.substring(index + 9, s1.indexOf('.', index));
					System.out.println(prefix);
					copy(whiteboxPath + "/" + prefix + ".in", outputFolder + "/whitebox/positive/" + prefix + ".in");
					copy(whiteboxPath + "/" + prefix + ".out", outputFolder + "/whitebox/positive/" + prefix + ".out");
				}
				else if(s1.startsWith("n")){
					int index = s1.indexOf("whitebox");
					String prefix = s1.substring(index + 9, s1.indexOf('.', index));
					System.out.println(prefix);
					copy(whiteboxPath + "/" + prefix + ".in", outputFolder + "/whitebox/negative/" + prefix + ".in");
					copy(whiteboxPath + "/" + prefix + ".out", outputFolder + "/whitebox/negative/" + prefix + ".out");
				}
			}
			white.close();
			
			BufferedReader black = new BufferedReader(new InputStreamReader(new FileInputStream(blackFilePath)));
			String s2 = null;
			while((s2 = black.readLine()) != null){
				s2 = s2.trim();
				if(s2.startsWith("p")){
					int index = s2.indexOf("blackbox");
					String prefix = s2.substring(index + 9, s2.indexOf('.', index));
					System.out.println(prefix);
					copy(blackboxPath + "/" + prefix + ".in", outputFolder + "/blackbox/positive/" + prefix + ".in");
					copy(blackboxPath + "/" + prefix + ".out", outputFolder + "/blackbox/positive/" + prefix + ".out");
				}
				else if(s2.startsWith("n")){
					int index = s2.indexOf("blackbox");
					String prefix = s2.substring(index + 9, s2.indexOf('.', index));
					System.out.println(prefix);
					copy(blackboxPath + "/" + prefix + ".in", outputFolder + "/blackbox/negative/" + prefix + ".in");
					copy(blackboxPath + "/" + prefix + ".out", outputFolder + "/blackbox/negative/" + prefix + ".out");
				}
			}
			black.close();
		}catch(Exception e){
			
		}
		
	}

	public static void copy(String file1, String file2){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
			String s = null;
			while((s = br.readLine()) != null){
				bw.write(s);
				bw.write("\n");
			}
			bw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args){
		//GenerateStandardTestCases test = new GenerateStandardTestCases("./introclass", "./bughunt");
		//test.generate();
	}

}
