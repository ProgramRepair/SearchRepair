package search;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lookups.TypeTable;
import test.Test;
import Database.DataHandler;
import Database.EntryHandler;
import InputAndOuput.CaseInfo;
import InputAndOuput.SearchCase;
import Library.StringRepresentation;

public class PrototypeSearch {
	private static String SEARCHPROTOTYPE = "select * from prototype";	
	public static void search(CaseInfo info) throws SQLException, IOException{
		Database.DataBaseManager.connect();
		ResultSet result = Database.DataBaseManager.query(SEARCHPROTOTYPE);
		while(result.next()){
			String source = result.getString(1);
			String[] pathconstraint = result.getString(2).split(EntryHandler.PATH_SEPERATOR);
			String[] pathtypes = result.getString(3).split(EntryHandler.PATH_SEPERATOR);			
			String[] pathtracks= result.getString(4).split(EntryHandler.PATH_SEPERATOR);
			String[] pathmapping = result.getString(5).split(EntryHandler.PATH_SEPERATOR);
			
			searchAllPath(pathconstraint, pathtypes, source, info, pathtracks, pathmapping);
		}
	}
	


	private static void searchAllPath(String[] pathconstraint,
			String[] pathtypes, String source, CaseInfo info,
			String[] pathtracks, String[] pathmapping) {
		// only one path can succeed
		int success = 0;
		if(!(pathconstraint.length == pathtypes.length && pathtypes.length == pathtracks.length && pathtracks.length == pathmapping.length)) return;
		
		for(int i = 0; i < pathconstraint.length; i++){
			String[] pathAndCon = pathconstraint[i].split(EntryHandler.PATH_CONSTRAINT);
			String[] pathAndType = pathtypes[i].split(EntryHandler.PATH_VARIABLE_TYPE);
			String[] pathAndTrack = pathtracks[i].split(EntryHandler.PATH_VARIABLE_TRACK);
			String[] pathAndMap = pathmapping[i].split(EntryHandler.PATH_VARIABLE_MAP);
			String path = pathAndCon[0];
			String constraint = pathAndCon[1];
			String[] variableTypes = pathAndType[1].split(DataHandler.VARIABLE_TYPE);
			String[] variableTracks = pathAndTrack[1].split(DataHandler.VARIABLE_TRACK);
			String[] mapping = pathAndMap[1].split(DataHandler.VARIABLE_MAP);
			if(searchWithMapping(path, constraint, variableTypes, source, info, variableTracks, mapping)){
				if(success == 1){
					//return false;
				}
				else{
					success += 1;
				}
			}
			
		}
		
	}



	private static boolean searchWithMapping(String path, String constraint, String[] variableTypes,
			String source, CaseInfo info, String[] variableTracks, String[] mapping) {
		List<Map<String, String>> list = getValidateMapping(variableTypes, info, variableTracks);
		if(list.isEmpty()) return false;
		
		List<String> delcarations = getVariableTypeConstraint(variableTypes);
		//
		for(Map<String, String> map : list){
			boolean pass = true;
			String mappingConstraint = getMapping(map);
			//System.out.println(mappingConstraint);
			for(List<String> pInputs : info.getPositives().keySet()){
				List<String> states = new ArrayList<String>();
				List<String> pOutputs = info.getPositives().get(pInputs);
				states.addAll(getStateConstraint(pInputs, "_in"));
				states.addAll(getStateConstraint(pOutputs, "_out"));
				if(!validate(delcarations, mappingConstraint, constraint, states)) pass = false;
			}
			if(!pass) continue;
			
			for(List<String> pInputs : info.getNegatives().keySet()){
				List<String> states = new ArrayList<String>();
				List<String> pOutputs = info.getNegatives().get(pInputs);
				states.addAll(getStateConstraint(pInputs, "_in"));
				states.addAll(getStateConstraint(pOutputs, "_out"));
				if(validate(delcarations, mappingConstraint, constraint, states)) pass = false;
			}
			if(!pass) continue;
			
			
			recordOnePath(path, source, path, variableTypes, variableTracks, info, mapping);

			//System.out.println(mappingConstraint);
			Map<String, String> track = getVariableTrack(mapping);
			Map<String, String> rel = new HashMap<String, String>();
			for(String s : map.keySet()){
				rel.put(s, track.get(map.get(s)));
			}
			info.getMapping().put(source, rel);
			
			break;
		}
			
		
	}

	private static void recordOnePath(String path, String source, String path2,
			String[] variableTypes, String[] variableTracks, CaseInfo info,
			String[] mapping) {
			info.getResult().setSource(source);
			info.getResult().setPath(path);
			Map<String, String> types = getVariableTrack(variableTypes);
			Map<String, String> tracks = getVariableTrack(variableTracks);
			Map<String, String> backTracking = getVariableTrack(mapping);
			
			for()
			
			info.getResult().set
		
	}



	private static String getMapping(Map<String, String> m) {
		String temp = "(assert (and ";
		for(String s : m.keySet()){
			temp = temp + "(= " + s +  " " + m.get(s) + ")";
		}
		temp = temp + "))";
		return temp;
	}

	private static void search(String constraint, String[] variableTypes,
			String source, CaseInfo info, String[] variableTracks, String[] variableMapping) {
		//List<String> variableConstraint = getVariableTypeConstraint(variableTypes);
		//if(!source.contains("a:int, b:char*, c:char*,;")) return;
		//List<Map<String, String>> list = getValidateMapping(variableTypes, info);
		//List<Map<String, String>> list = getValidateMapping(variableTypes, info);
		List<Map<String, String>> list = getValidateMapping(variableTypes, info, variableTracks);
		if(list.isEmpty()) return;
		String mappingConstraint = getMappingConstraint(list);
		System.out.println(mappingConstraint);
		List<String> delcarations = getVariableTypeConstraint(variableTypes);
		//
		
		boolean pass = true;
		for(List<String> pInputs : info.getPositives().keySet()){
			List<String> states = new ArrayList<String>();
			List<String> pOutputs = info.getPositives().get(pInputs);
			states.addAll(getStateConstraint(pInputs, "_in"));
			states.addAll(getStateConstraint(pOutputs, "_out"));
			if(!validate(delcarations, mappingConstraint, constraint, states)) pass = false;
		}
		if(!pass) return;
		
		for(List<String> pInputs : info.getNegatives().keySet()){
			List<String> states = new ArrayList<String>();
			List<String> pOutputs = info.getNegatives().get(pInputs);
			states.addAll(getStateConstraint(pInputs, "_in"));
			states.addAll(getStateConstraint(pOutputs, "_out"));
			if(validate(delcarations, mappingConstraint, constraint, states)) pass = false;
		}
		if(!pass) return;
//		System.out.println(constraint);
		//info.getResult().add(source);
		
	}
	
	//get validate mapping by variableTracks
	private static List<Map<String, String>> getValidateMapping(
			String[] variableTypes, CaseInfo info, String[] variableTracks) {
		Map<String, String> track = getVariableTrack(variableTracks);
		Map<String, String> typeTrack = getVariableTrack(variableTypes);
		
		List<String> inputs = new ArrayList<String>();
		for(List<String> l : info.getPositives().keySet()){
			inputs = l;
			break;
		}
		List<String> variables = new ArrayList<String>();
		for(String s : track.keySet()){
			variables.add(s);
		}
		
		List<List<String>> inputPerms = getPermutation(inputs);
		List<List<String>> varPerms = getPermutation(variables);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		if(inputs.size() > variables.size()){
			for(List<String> input : inputPerms){
				Map<String, String> map = new HashMap<String, String>();
				boolean val = true;
				for(int i = 0; i < variables.size(); i++){
					String[] in = input.get(i).split(":");
					String var = variables.get(i);
					if(!in[in.length - 1].equals(typeTrack.get(var))) {
						val = false;
						break;
					}
					map.put(in[0]+"_in", var);
					map.put(in[0]+"_out", track.get(var));
				}
				if(!val) continue;
				list.add(map);
			}
		}
		else{
			for(List<String> variable : varPerms){
				Map<String, String> map = new HashMap<String, String>();
				boolean val = true;
				for(int i = 0; i < inputs.size(); i++){
					String[] in = inputs.get(i).split(":");
					String var = variable.get(i);
					if(!in[in.length - 1].equals(typeTrack.get(var))) {
						val = false;
						break;
					}
					map.put(in[0]+"_in", var);
					map.put(in[0]+"_out", track.get(var));
				}
				if(!val) continue;
				list.add(map);
			}
		}
		
		return list;
	}

	private static Map<String, String> getVariableTrack(String[] variableTracks) {
		 Map<String, String> map = new HashMap<String, String>();
		 
		 for(String s : variableTracks){
			 String[] array = s.split(":");
			 map.put(array[0], array[1]);
		 }
		return map;
	}


	private static List<Map<String, String>> mergeMapping(
			List<Map<String, String>> inputMapping,
			List<Map<String, String>> outputMapping) {
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for(Map<String, String> m : inputMapping){
			for(Map<String, String> n : outputMapping){
				Map<String, String> map = new HashMap<String, String>();
				for(String s : m.keySet()){
					map.put(s, m.get(s));
				}
				for(String s : n.keySet()){
					map.put(s, n.get(s));
				}
				list.add(map);
			}
		}
		return list;
	}

	private static List<Map<String, String>> getMapping(List<String> variables,
			List<String> inputs, String post) {
		List<List<String>> perms;
		List<String> mapping;
		if(inputs.size() > variables.size()){
			perms = getPermutation(inputs);
			mapping = variables;
		}
		else{
			perms = getPermutation(variables);
			mapping = inputs;
		}
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for(List<String> var : perms){
			Map<String, String> map = new HashMap<String, String>();
			boolean val = true;
			for(int i = 0; i < mapping.size(); i++){
				String a = mapping.get(i);
				String[] infos = a.split(":");
				String[] variabe = var.get(i).split(":");
				if(!infos[infos.length - 1].equals(variabe[variabe.length - 1])) {
					
					val = false;
					break;
				}
				map.put(infos[0]+post, variabe[0]);
			}
			if(val) list.add(map);
		}
		return list;
	}

	private static List<String> getStateConstraint(List<String> states, String prefix) {
		List<String> list = new ArrayList<String>();
		for(String s : states){
			String[] con = s.split(":");
			String type = TypeTable.getInstance().getType(con[2]);
			String id = con[0] + prefix;
			String value = con[1];
			if(!type.equals("String"))
			{	
				String delcare = "(declare-fun " + id + " () " + type+ ")";
				String assign = "(assert (= " + id + " " + value +"))";
				list.add(delcare);
				list.add(assign);
			}
			else{
				//StringRepresentation rep = new StringRepresentation(id, value.substring(1, value.length() - 1));
				StringRepresentation rep = new StringRepresentation(id, value);
				list.addAll(rep.getConstraints());
			}
		}
		return list;
	}

	private static List<List<String>> getPermutation(String[] inputs) {
		List<String> list = new ArrayList<String>();
		for(String s : inputs){
			list.add(s);
		}
		return getPermutation(list);
	}

	private static boolean validate(List<String> variableConstraint,
			String mapping, String constraint, List<String> stateConstraint) {
		try{
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ctest/test/temp")));
			SearchManager.loadPrototype(bw);
			bw.flush();
			for(String s : variableConstraint){
				bw.write(s);
				bw.write("\n");
			}
			bw.flush();
			for(String s : stateConstraint){
				bw.write(s);
				bw.write("\n");	
			}
			bw.flush();
			bw.write(mapping);
			bw.write("\n");	
			bw.flush();
			bw.write(constraint);
			bw.write("\n");	
			bw.write("(check-sat)\n");
			//bw.write("(get-model)\n");
			bw.close();
			String res = Test.invokeZ3onFile("ctest/test/temp");
			//System.out.println(res);
			if(res.equals("sat")){
				return true;
			}
			else return false;
		}catch(Exception e){
			
		}
		return false;
	}

	/**
	 * get variable type declaration
	 * @param inputs
	 * @return
	 */
	private static List<String> getVariableTypeConstraint(String[] inputs) {
		List<String> list = new ArrayList<String>();
		for(String s : inputs){
			String[] variable = s.split(":");
			String declare = "(declare-fun " + variable[0] + " () " + TypeTable.getInstance().getType(variable[1])+ ")";
			list.add(declare);
		}
		return list;
	}

	public static List<List<String>> getPermutation(List<String> list){
		List<List<String>> lists = new ArrayList<List<String>>();
		if(list.size() == 0){
			lists.add(new ArrayList<String>());
		}
		
		for(int i = 0; i < list.size(); i++){
			List<String> temp = new ArrayList<String>(list);
			temp.remove(i);
			List<List<String>> permutations = getPermutation(temp);
			for(List<String> t : permutations){
				t.add(list.get(i));
				lists.add(t);
			}
		}
		return lists;
	}
	
	public static void validatePermuation(){
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("3");
		List<List<String>> permutation = getPermutation(list);
		System.out.println("size:" + permutation.size());
		for(List<String> t : permutation){
			for(String s : t){
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		//validatePermuation();
		List<Map<String, String>> map = new ArrayList<Map<String, String>>();
		for(int i = 0; i < 3; i++){
			HashMap<String, String> m = new HashMap<String, String>();
			m.put("a", "b");
			m.put("b", Integer.toBinaryString(i));
			map.add(m);
		}
		System.out.println(getMappingConstraint(map));
	}
	
	
	public static String getMappingConstraint(List<Map<String, String>> map){
		if(map.isEmpty()) return "";
		String constraint = "(assert(or " + getMapping(map) + " ))";
		return constraint;
	}

	private static String getMapping(List<Map<String, String>> map) {
		String expr = "";
		for(Map<String, String> m : map){
			String temp = "(and ";
			for(String s : m.keySet()){
				temp = temp + "(= " + s +  " " + m.get(s) + ")";
			}
			temp = temp + ")";
			expr = expr + temp;
		}
		return expr;
	}


}
