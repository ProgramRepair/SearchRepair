package ProcessIntroClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Library.Utility;

public class GetInputStateAndOutputState {
	private String folder;
	private String fileName;
	private int[] buggyLines;
	private Set<String> inputs;
	private String gdbLogPath;
	private Map<List<String>, List<String>> states;
	public GetInputStateAndOutputState(String folder, String fileName,
			int[] buggyLines, Set<String> inputs) {
		super();
		this.folder = folder;
		this.fileName = fileName;
		this.buggyLines = buggyLines;
		this.states = new HashMap<List<String>, List<String>>();
		this.gdbLogPath = this.folder + "/gdblog"; 
		this.inputs = inputs;
		this.states = new HashMap<List<String>, List<String>>();
		compileGDB();
	}
	
	
	public Map<List<String>, List<String>> getStates() {
		return states;
	}


	public void setStates(Map<List<String>, List<String>> states) {
		this.states = states;
	}


	private void compileGDB() {
		String exeFile =  this.folder + "/a.out";
		String command = "gcc -g " + this.folder + "/" + this.fileName + " -o " + exeFile;
		Utility.runCProgram(command);
		
		for(String input : inputs){
			try{
				runOnBreak(exeFile, this.buggyLines[0], input);
				Map<String, String> inputStates = getLocals();
				if(inputStates.isEmpty()) continue;
				runOnBreak(exeFile, this.buggyLines[1] + 1, input);
				Map<String, String> outputStates = getLocals();
				if(outputStates.isEmpty()) continue;
				runOnTypes(exeFile, this.buggyLines[0], input, inputStates);
				List<String> types = getTypes();
			mergeToStates(inputStates, outputStates, types);
			}catch(Exception e){
				System.out.println(e);
				continue;
			}
		}		
	}
	
	private void mergeToStates(Map<String, String> inputStates,
			Map<String, String> outputStates, List<String> types) {
		if(types.size() != inputStates.size()) return;
		int count  = 0;
		List<String> inStates = new ArrayList<String>();
		List<String> outStates = new ArrayList<String>();
		for(String variable : inputStates.keySet()){
			String inV = inputStates.get(variable);
			String outV = outputStates.get(variable);
			String type = types.get(count++);
			inStates.add(variable + ":" + inV + ":" + type);
			outStates.add(variable + ":" + outV + ":" + type);
		}
		this.states.put(inStates, outStates);
		
	}
	private List<String> getTypes() {
		File file = new File(this.gdbLogPath);
		List<String> list = new ArrayList<String>();
		if(!file.exists()) return list;
		try{			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String s = null;
			boolean find = false;
			while((s = br.readLine()) != null){
				s = s.trim();
				if(!find && s.startsWith("Breakpoint 1")){
					find = true;
				}
				else if(find){
					if(s.isEmpty()) continue;
					else if(s.startsWith("(gdb)")) break;
					else{
						String[] array = s.split(" ");
						if(array.length != 3 || !array[1].startsWith("=")) continue;
						list.add(array[2]);
					}
				}
			}
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		return list;
	}
	private void runOnTypes(String exeFile, int buggy, String input,
			Map<String, String> inputStates) {
		String typeCommand = getTypeCommand(inputStates);
		File file = new File(this.gdbLogPath);
		//if(file.exists()) file.delete();
		try{
			Process p = Runtime.getRuntime().exec("gdb " + exeFile);
			PrintWriter writer = new PrintWriter(p.getOutputStream());
			//writer.println("set logging on " + this.gdbLogPath);
			writer.println("break " + buggy);
			writer.println("command 1\n" + typeCommand + "\nend");
			writer.flush();
			writer.println("run");
			writer.println(input);
			writer.flush();
			
			writer.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			PrintWriter log = new PrintWriter(new FileOutputStream(file));
			String s = null;
			while((s = br.readLine()) != null){
				log.println(s);
			}
			br.close();
			log.close();
			p.destroy();
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
		}
		
	}
	
	private String getTypeCommand(Map<String, String> inputStates) {
		String output = "";
		for(String s : inputStates.keySet()){
			output += "whatis " + s + "\n";
		}
		return output;
	}
	private Map<String, String> getLocals() {
		Map<String, String> list = new HashMap<String, String>();
		File file = new File(this.gdbLogPath);
		if(!file.exists()) return list;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String s = null;
			boolean find = false;
			while((s = br.readLine()) != null){
				s = s.trim();
				if(!find && s.startsWith("Breakpoint 1")){
					find = true;
				}
				else if(find){
					if(s.isEmpty()) continue;
					else if(s.startsWith("(gdb)")) break;
					else{
						String[] array = s.split(" ");
						if(!array[1].startsWith("=")) continue;
						if(array[2].length() > 3) array[2] = "0";
						list.put(array[0], array[2]);
					}
				}
			}
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return list;
	}
	
	private void runOnBreak(String exeFile, int buggy, String input){
		//run on first breakpoint
		try{
			File file = new File(this.gdbLogPath);
			//if(file.exists()) file.delete();
			Process p = Runtime.getRuntime().exec("gdb " + exeFile);
			PrintWriter writer = new PrintWriter(p.getOutputStream());
			
			writer.println("set logging on " + this.gdbLogPath);
			writer.println("break " + buggy);
			writer.println("command 1\ninfo locals\nend");
			writer.flush();
			writer.println("run");
			writer.println(input);
			writer.flush();
			writer.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			PrintWriter log = new PrintWriter(new FileOutputStream(file));
			String s = null;
			while((s = br.readLine()) != null){
				log.println(s);
			}
			br.close();
			log.close();
			p.destroy();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
		}
	}
	
	public static void main(String[] args){
		//GetInputStateAndOutputState instan = new GetInputStateAndOutputState("./bughunt/median/0", "median.c", new int[]{12, 17});
	}

}





