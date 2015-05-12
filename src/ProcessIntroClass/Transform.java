package ProcessIntroClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Library.Utility;

public class Transform {
	private String folder;
	private String originalFile;
	private String typeParameter;
	
	public Transform(String folder, String originalFile, String type){
		this.folder = folder;
		this.originalFile = originalFile;
		this.typeParameter = type;
	}
	
	public String tranform(){
		String command = "./executors/transform " + this.typeParameter + " " +  this.folder + "/" + this.originalFile;
		String output = Utility.runCProgram(command);
		if(output.equals("failed")) return null;
		if(output.endsWith("failed")) {
			output = output.substring(0, output.length() - 6);
		}
		output = cropPre(output);
		output = addPrefix(Utility.getStringFromFile(this.folder + "/" + this.originalFile), output);
		String pass = this.folder + "/" + this.originalFile.substring(0, this.originalFile.lastIndexOf(".")) + "T.c";
		Utility.writeTOFile(pass, output);
		
		return pass;
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
		Transform form = new Transform("./bughunt/median/110", "median.c", "");
		form.tranform();
	}

}
