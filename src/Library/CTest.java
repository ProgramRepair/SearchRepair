package Library;

import java.util.ArrayList;
import java.util.List;

import Experiment.CaseInfo;




public class CTest {
	
	public List<List<String>> getPositiveParameters(CaseInfo info){
		List<List<String>> lists = new ArrayList<List<String>>();
		for(List<String> input : info.getPositives().keySet()){
			List<String> parameters = new ArrayList<String>();
			for(String s : input){
				String p = s.split(":")[0];
				if(p.startsWith("\"")) p = p.substring(1, p.length() - 1);
				parameters.add(p);
			}
			lists.add(parameters);
		}
		return lists;
	}
	
	public List<List<String>> getNegativeParameters(CaseInfo info){
		List<List<String>> lists = new ArrayList<List<String>>();
		for(List<String> input : info.getNegatives().keySet()){
			List<String> parameters = new ArrayList<String>();
			for(String s : input){
				String p = s.split(":")[0];
				if(p.startsWith("\"")) p = p.substring(1, p.length() - 1);
				parameters.add(p);
			}
			lists.add(parameters);
		}
		return lists;
	}
	
	
	public String processBuilder(String command, String inputFile, String outputFile){
		String out = "";
		String ls_str;
		StringBuffer sb = new StringBuffer();
		try{
			
		}catch(Exception e){
			ProcessBuilder process = new ProcessBuilder(command);
			//process.redirectInput();
		}
		
		return out;
	}
	
	
	public String[] getCommand(List<String> args, String filePath){
		String[] command = new String[2];
		command[0] = "gcc " + filePath + " " + args.size() + " ";
		for(String s : args){
			command[0] = command[0] + s + " ";
		}
		command[0] = command[0]  + " -o test ";
		command[1] = "./test";
		return command;
	}
	

}
