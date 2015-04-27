package ProcessIntroClass;

import java.util.ArrayList;
import java.util.List;

import Library.Utility;

public class Transform {
	String folder;
	String originalFile;
	String transformFile;
	
	public Transform(String folder, String originalFile){
		this.folder = folder;
		this.originalFile = originalFile;
	}
	
	public boolean tranform(){
		String command = "./executors/transform " + this.folder + "/" + this.originalFile;
		String output = Utility.runCProgram(command);
		if(output.equals("failed")) return false;
		output = cropPre(output);
		output = addPrefix(Utility.getStringFromFile(this.folder + "/" + this.originalFile), output);
		Utility.copy(this.folder + "/" + this.originalFile, this.folder + "/backup");
		Utility.writeTOFile(this.folder + "/" + this.originalFile, output);
		
		return true;
	}
	

	
	private String addPrefix(String input, String output) {
		StringBuilder sb = new StringBuilder();
		String[] lines = input.split("\n");
		for(String line : lines){
			String temp = line.trim();
			if(temp.startsWith("#")) {
				sb.append(line);
				sb.append("\n");
			}
		}
		sb.append(output);
		sb.append("\n");
		return sb.toString();
	}

	private String cropPre(String output) {
		String[] lines = output.split("\n");
		List<String> list = new ArrayList<String>();
		for(String line : lines){
			String temp = line.trim();
			if(temp.startsWith("/*") || temp.startsWith("extern int (")) continue;
			else{
				list.add(line);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String line : list){
			sb.append(line);
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args){
		Transform form = new Transform("./bughunt/median/110", "median.c");
		form.tranform();
	}

}
