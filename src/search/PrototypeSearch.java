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
import Library.Utility;

public class PrototypeSearch {
	private static String SEARCHPROTOTYPE = "select * from prototype";
	private static String SEARCHPAUTOBUGFIX= "select * from autobugfix";
	public static void search(CaseInfo info) throws SQLException, IOException{
		Database.DataBaseManager.connect();
		ResultSet result = Database.DataBaseManager.query(SEARCHPAUTOBUGFIX);
		while(result.next()){
			String source = result.getString(1);
			String[] pathconstraint = result.getString(2).split(EntryHandler.PATH_SEPERATOR);
			String[] pathtypes = result.getString(3).split(EntryHandler.PATH_SEPERATOR);			
			String[] pathtracks= result.getString(4).split(EntryHandler.PATH_SEPERATOR);
			String[] pathmapping = result.getString(5).split(EntryHandler.PATH_SEPERATOR);
			String[] pathformals = result.getString(6).split(EntryHandler.PATH_SEPERATOR);
			
			searchAllPath(pathconstraint, pathtypes, source, info, pathtracks, pathmapping, pathformals);
		}
	}
	


	private static void searchAllPath(String[] pathconstraint,
			String[] pathtypes, String source, CaseInfo info,
			String[] pathtracks, String[] pathmapping, String[] pathformals) {
		// only one path can succeed
		int success = 0;
		if(!(pathconstraint.length == pathtypes.length && pathtypes.length == pathtracks.length && pathtracks.length == pathmapping.length && pathmapping.length == pathformals.length)) return;
		
		for(int i = 0; i < pathconstraint.length; i++){
			String[] pathAndCon = pathconstraint[i].split(EntryHandler.PATH_CONSTRAINT);
			String[] pathAndType = pathtypes[i].split(EntryHandler.PATH_VARIABLE_TYPE);
			String[] pathAndTrack = pathtracks[i].split(EntryHandler.PATH_VARIABLE_TRACK);
			String[] pathAndMap = pathmapping[i].split(EntryHandler.PATH_VARIABLE_MAP);
			String[] pathAndFormal = pathformals[i].split(EntryHandler.PATH_VARIABLE_Formal);
			String path = pathAndCon[0];
			String constraint = pathAndCon[1];
			String[] variableTypes = pathAndType[1].split(DataHandler.VARIABLE_END);
			String[] variableTracks = pathAndTrack[1].split(DataHandler.VARIABLE_END);
			String[] mapping = pathAndMap[1].split(DataHandler.VARIABLE_END);
			String[] formals = pathAndFormal[1].split(DataHandler.VARIABLE_END);
			if(searchWithMapping(path, constraint, variableTypes, source, info, variableTracks, mapping, formals)){
				if(success == 1){
					info.getResult().clear();
					return;
				}
				else{
					success += 1;
				}
			}
			
		}
		
	}



	private static boolean searchWithMapping(String path, String constraint, String[] variableTypes,
			String source, CaseInfo info, String[] variableTracks, String[] mapping, String[] formals) {
		//wait
		List<Map<String, String>> list = getValidateMapping(variableTypes, info, variableTracks, formals);
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
			
			
			recordOnePath(path, source, map, variableTypes, variableTracks, info, mapping, formals);						
			return true;
		}
		return false;	
		
	}

	private static void recordOnePath(String path, String source, Map<String, String> map,
			String[] variableTypes, String[] variableTracks, CaseInfo info,
			String[] mapping, String[] formals) {
			info.getResult().setSource(source);
			info.getResult().setPath(path);
			Map<String, String> types = getVariableTrack(variableTypes);
			Map<String, String> tracks = getVariableTrack(variableTracks);
			Map<String, String> backTracking = getVariableTrack(mapping);
			
			info.getResult().setPathVariablesTypes(types);
			info.getResult().setPathVariableMap(tracks);
			info.getResult().setSearchMapping(map);
			info.getResult().setPathVariableMap(backTracking);
		
	}



	private static String getMapping(Map<String, String> m) {
		String temp = "(assert (and ";
		for(String s : m.keySet()){
			temp = temp + "(= " + s +  " " + m.get(s) + ")";
		}
		temp = temp + "))";
		return temp;
	}

//	private static void search(String constraint, String[] variableTypes,
//			String source, CaseInfo info, String[] variableTracks, String[] variableMapping) {
//		//List<String> variableConstraint = getVariableTypeConstraint(variableTypes);
//		//if(!source.contains("a:int, b:char*, c:char*,;")) return;
//		//List<Map<String, String>> list = getValidateMapping(variableTypes, info);
//		//List<Map<String, String>> list = getValidateMapping(variableTypes, info);
//		List<Map<String, String>> list = getValidateMapping(variableTypes, info, variableTracks);
//		if(list.isEmpty()) return;
//		String mappingConstraint = getMappingConstraint(list);
//		System.out.println(mappingConstraint);
//		List<String> delcarations = getVariableTypeConstraint(variableTypes);
//		//
//		
//		boolean pass = true;
//		for(List<String> pInputs : info.getPositives().keySet()){
//			List<String> states = new ArrayList<String>();
//			List<String> pOutputs = info.getPositives().get(pInputs);
//			states.addAll(getStateConstraint(pInputs, "_in"));
//			states.addAll(getStateConstraint(pOutputs, "_out"));
//			if(!validate(delcarations, mappingConstraint, constraint, states)) pass = false;
//		}
//		if(!pass) return;
//		
//		for(List<String> pInputs : info.getNegatives().keySet()){
//			List<String> states = new ArrayList<String>();
//			List<String> pOutputs = info.getNegatives().get(pInputs);
//			states.addAll(getStateConstraint(pInputs, "_in"));
//			states.addAll(getStateConstraint(pOutputs, "_out"));
//			if(validate(delcarations, mappingConstraint, constraint, states)) pass = false;
//		}
//		if(!pass) return;
////		System.out.println(constraint);
//		//info.getResult().add(source);
//		
//	}
	
	//get validate mapping by variableTracks
	private static List<Map<String, String>> getValidateMapping(
			String[] variableTypes, CaseInfo info, String[] variableTracks, String[] formals) {
		Map<String, String> track = getVariableTrack(variableTracks);
		Map<String, String> typeTrack = getVariableTrack(variableTypes);
		Map<String, String> formalTypes = getVariableTrack(formals);
		
		List<String> inputs = new ArrayList<String>();
		for(List<String> l : info.getPositives().keySet()){
			inputs = l;
			break;
		}
		List<List<String>> inputPerms = getPermutation(inputs);
		//state
//		List<String> variables = new ArrayList<String>();
//		for(String s : track.keySet()){
//			variables.add(s);
//		}
		
		/*
		 * change this place, inputPerms must be more than formals
		 */
		//List<List<String>> varPerms = getPermutation(variables);
		
		List<String> variables = new ArrayList<String>();
		for(String s : formalTypes.keySet()){
			variables.add(s);
		}
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
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(DataHandler.z3TempFile)));
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
			String res = Utility.invokeZ3onFile(DataHandler.z3TempFile);
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

	
	private static List<Map<String, String>> getValidateMapping(
			String[] variableTypes, CaseInfo info, String[] variableTracks) {
		Map<String, String> track = getVariableTrack(variableTracks);
		Map<String, String> typeTrack = getVariableTrack(variableTypes);
		//Map<String, String> formalTypes = getVariableTrack(formals);
		
		List<String> inputs = new ArrayList<String>();
		for(List<String> l : info.getPositives().keySet()){
			inputs = l;
			break;
		}
		//state
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

}
