package ProcessIntroClass;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import util.Utility;

public class Transform {
	Path cwd;
	Path originalFile;
	private String typeParameter;
	
	public Transform(Path folder, Path originalFile, String type){
		this.cwd = folder;
		this.originalFile = originalFile;
		this.typeParameter = type;
	}
	
	public String tranform(){
		String command = "./executors/transform " + this.typeParameter + " " + this.originalFile.toAbsolutePath().toString();
		String output = Utility.runCProgram(command);
		if(output.equals("failed")) return null;
		if(output.endsWith("failed")) {
			output = output.substring(0, output.length() - 6);
		}
		output = cropPre(output);
		output = addPrefix(Utility.getStringFromFile(this.originalFile.toString()), output);
		String pass = this.originalFile.toString() + ".T.c" ; 
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

//	public static void main(String[] args){
//		Transform form = new Transform("./bughunt/median/110", "median.c", "");
//		form.tranform();
//	}

}
