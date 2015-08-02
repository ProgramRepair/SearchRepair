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
import Database.DataBaseManager;
import Database.DataHandler;
import Database.EntryHandler;
import Experiment.CaseInfo;
import Library.StringRepresentation;
import Library.Utility;


public class PrototypeSearch {
	private static String SEARCHFUTURE1= "select * from " + DataBaseManager.TABLEFUTURE1;
	private static String SEARCHFUTURE2= "select * from " + DataBaseManager.TABLEFUTURE2;
	private static String SEARCHALL= "select * from " + DataBaseManager.TABLEALL;
	private static String SEARCHLINUX= "select * from " + DataBaseManager.TABLELINUX;
	
	public static void searchOnlyMatchType(CaseInfo info, int repo) throws SQLException{
		DataBaseManager.connect();
		String database;
		switch(repo){
		case 0: database=SEARCHLINUX; break;
		case 1: database=SEARCHALL; break;
		case 3: database=SEARCHFUTURE1; break;
		case 4: database=SEARCHFUTURE2; break; 
		default: return;
		}
		ResultSet result = Database.DataBaseManager.query(database);
		while(result.next()){
			String source = result.getString(1).trim();
			String[] pathformals = result.getString(6).split(EntryHandler.PATH_SEPERATOR);
			try{
				searchMatchType(source, info, pathformals);
			}catch(Exception e){
				result.close();
				System.out.println(source);
				continue;
			}
			
		}
		result.close();
		DataBaseManager.close();
	}
	
	private static void searchMatchType(String source, CaseInfo info,
			String[] pathformals) {
		String[] variableFor = pathformals[0].split(EntryHandler.PATH_VARIABLE_Formal)[1].split(DataHandler.VARIABLE_END);
		List<Map<String, String>> mapp = getValidateMapping( info, variableFor);
		for(Map<String, String> map : mapp)
		{
			info.getResult().addSearchMapping(source, map);;
		}
		//info.clear(
		
	}

	public static void search(CaseInfo info, int repo) throws SQLException, IOException{
		Database.DataBaseManager.connect();
		String database;
		switch(repo){
		case 0: database=SEARCHLINUX; break;
		case 1: database=SEARCHALL; break;
		case 3: database=SEARCHFUTURE1; break;
		case 4: database=SEARCHFUTURE2; break; 
		default: return;
		}
		ResultSet result = Database.DataBaseManager.query(database);
		while(result.next()){
			String source = result.getString(1).trim();
			//System.out.println(source);
			//if(!source.startsWith("if (string[i]") ) continue;
			String[] pathconstraint = result.getString(2).split(EntryHandler.PATH_SEPERATOR);
			String[] pathtypes = result.getString(3).split(EntryHandler.PATH_SEPERATOR);			
			String[] pathtracks= result.getString(4).split(EntryHandler.PATH_SEPERATOR);
			String[] pathmapping = result.getString(5).split(EntryHandler.PATH_SEPERATOR);
			String[] pathformals = result.getString(6).split(EntryHandler.PATH_SEPERATOR);
			try{
				searchAllPath(pathconstraint, pathtypes, source, info, pathtracks, pathmapping, pathformals);
			}catch(Exception e){
				System.out.println(source);
				continue;
			}
			
		}
		result.close();
		DataBaseManager.close();
	}
	

	

	private static void searchAllPath(String[] pathconstraint,
			String[] pathtypes, String source, CaseInfo info,
			String[] pathtracks, String[] pathmapping, String[] pathformals) {
		// only one path can succeed
		if(!(pathconstraint.length == pathtypes.length && pathtypes.length == pathtracks.length && pathtracks.length == pathmapping.length && pathmapping.length == pathformals.length)) return;
		
		
		String[] variableTyp = pathtypes[0].split(EntryHandler.PATH_VARIABLE_TYPE)[1].split(DataHandler.VARIABLE_END);
		String[] variableTra = pathtracks[0].split(EntryHandler.PATH_VARIABLE_TRACK)[1].split(DataHandler.VARIABLE_END);
		String[] variableFor = pathformals[0].split(EntryHandler.PATH_VARIABLE_Formal)[1].split(DataHandler.VARIABLE_END);
		List<Map<String, String>> mapp = getValidateMapping(info, variableFor);
		if(mapp.isEmpty()) return;
		//if(!source.contains("if(((a>=b)&&(a<=c))")) return;
		//System.out.println(mapp);
		for(Map<String, String> map : mapp){
			String s = map.toString().trim();
			//if(!s.equals("{count=count, string=string, i=i}")) continue;
			boolean passAllPositive = true;
			for(List<String> pInputs : info.getPositives().keySet()){				
				List<String> pOutputs = info.getPositives().get(pInputs);
				boolean passOnePath = false;
				for(int i = 0; i < pathconstraint.length; i++){
					passOnePath = false;
					String[] pathAndCon = pathconstraint[i].split(EntryHandler.PATH_CONSTRAINT);
					String[] pathAndType = pathtypes[i].split(EntryHandler.PATH_VARIABLE_TYPE);
					String[] pathAndTrack = pathtracks[i].split(EntryHandler.PATH_VARIABLE_TRACK);
					String[] pathAndMap = pathmapping[i].split(EntryHandler.PATH_VARIABLE_MAP);
					String[] pathAndFormal = pathformals[i].split(EntryHandler.PATH_VARIABLE_Formal);
					String constraint = pathAndCon[1];
					String[] variableTypes = pathAndType[1].split(DataHandler.VARIABLE_END);
					String[] variableTracks = pathAndTrack[1].split(DataHandler.VARIABLE_END);
					String[] mapping = pathAndMap[1].split(DataHandler.VARIABLE_END);
					String[] formals = pathAndFormal[1].split(DataHandler.VARIABLE_END);
					if(searchWithMapping(constraint, variableTypes, variableTracks, mapping, formals, map, pInputs, pOutputs)){
						passOnePath = true;
						break;
					}						
				}
				
				if(passOnePath) continue;
				else {
					passAllPositive = false;
					break;
				}
			}
			
			if(!passAllPositive) continue;

			info.getResult().addSearchMapping(source, map);
			break;
			
		}
		
	}



	private static boolean searchWithMapping( String constraint, String[] variableTypes,
			 String[] variableTracks, String[] mapping, String[] formals, Map<String, String> map, List<String> pInputs, List<String> pOutputs) {
		
			List<String> delcarations = getVariableTypeConstraint(variableTypes);
		//
			Map<String, String> tracks = PrototypeSearch.getVariableTrack(variableTracks);
			boolean isReturn = false;
			if(pOutputs.get(0).contains("_result_")){
				isReturn = true;
			}
			
			boolean loadString = checkLoadString(variableTypes, pInputs);
			
			String mappingConstraint = getMapping(map, tracks, isReturn);
			//System.out.println(mappingConstraint);
			//if(!mappingConstraint.trim().equals("(assert (and (= g g_in )(= g g_out )(= h h_in )(= h h_out )))")) return false;
			List<String> states = new ArrayList<String>();
			states.addAll(getStateConstraint(pInputs, "_in"));
			List<String> output = getStateConstraint(pOutputs, "_out");
			if(!validate(delcarations, mappingConstraint, constraint, states, output, isReturn, loadString)) {
				return false;
			}
			
			return true;
		
	}




	private static boolean checkLoadString(String[] variableTypes,
			List<String> pInputs) {
		for(String s : variableTypes){
			String[] info = s.split(":");
			if(info[1].contains("char*")) return true;
		}
		
		for(String s : pInputs){
			String[] info = s.split(":");
			if(info[info.length - 1].contains("char*")) return true;
		}
		return false;
		
	}



	private static String getMapping(Map<String, String> m, Map<String, String> variableTrack, boolean isReturn) {
		String temp = "(assert (and ";
		for(String s : m.keySet()){
			temp = temp + "(= " + s + " "  + m.get(s) + "_in " + ")";
			if(!isReturn)temp = temp + "(= " + variableTrack.get(s) +  " " + m.get(s) + "_out " + ")";
		}
		
		temp = temp + "))";
		return temp;
		
		//map.put(in[0]+"_out", track.get(var));
	}


	
	//get validate mapping by variableTracks
	private static List<Map<String, String>> getValidateMapping(
			CaseInfo info, String[] formals) {
		//Map<String, String> track = getVariableTrack(variableTracks);
		//Map<String, String> typeTrack = getVariableTrack(variableTypes);
		Map<String, String> formalTypes = getVariableTrack(formals);
		
		List<String> inputs = new ArrayList<String>();
		for(List<String> l : info.getPositives().keySet()){
			inputs = l;
			break;
		}
		List<String> variables = new ArrayList<String>();
		for(String s : formalTypes.keySet()){
			variables.add(s);
		}
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		if(inputs.size() < variables.size()) return list;
		if(inputs.size() > 7 || variables.size() > 6) return list;
		List<List<String>> inputPerms = getPermutation(inputs, variables.size());
		
		
		
		for(List<String> input : inputPerms){
			Map<String, String> map = new HashMap<String, String>();
			boolean val = true;
			for(int i = 0; i < variables.size(); i++){
				String[] in = input.get(i).split(":");
				String var = variables.get(i);
				if(!in[in.length - 1].equals(formalTypes.get(var))) {
					val = false;
					break;
				}
				map.put(var, in[0]);
				//map.put(in[0]+"_out", track.get(var));
			}
			if(!val) continue;
			list.add(map);
		}

		
		System.out.println(list.size());
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





	private static List<String> getStateConstraint(List<String> states, String prefix) {
		List<String> list = new ArrayList<String>();
		//list.add"(declare-fun _output_"  + " () " + type+ ")");
		for(String s : states){
			String[] con = s.split(":");
			if(con[2].equals("char")){
				int value = con[1].charAt(0);
				con[1] =  Integer.toString(value);;
			}
			String type = TypeTable.getInstance().getType(con[2]);
			String id;
			//dustinguish output
			if(con[0].contains("_result_")){
				id = con[0];
			}
			else id = con[0] + prefix;
			String value = con[1];
			//System.out.println(type);
			if(!type.equals("String"))
			{	
				String delcare = "(declare-fun " + id + " () " + type+ ")";
				String assign = "(assert (= " + id + " " + value +"))";
				list.add(delcare);
				list.add(assign);
			}
			
			else if(type.equals("String")){
				//StringRepresentation rep = new StringRepresentation(id, value.substring(1, value.length() - 1));
				
				StringRepresentation rep = new StringRepresentation(id, value);
				list.add(rep.getDeclareConstraint(id));
				list.addAll(rep.getConstraints());
			}
			if(id.contains("_result_")){
				
				String assign = "(assert (= " + id + " _output_ ))";
				//list.add(delcare);
				list.add(assign);
			}
		}
		
		return list;
	}

	private static List<List<String>> getPermutation(String[] inputs, int k) {
		List<String> list = new ArrayList<String>();
		for(String s : inputs){
			list.add(s);
		}
		return getPermutation(list, k);
	}

	private static boolean validate(List<String> variableConstraint,
			String mapping, String constraint, List<String> stateConstraint, List<String> output, boolean isReturn, boolean loadString) {
		try{
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(DataHandler.z3TempFile)));
			SearchManager.loadPrototypeTypes(bw);
			if(loadString)SearchManager.loadPrototypeString(bw);
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
			if(!isReturn){
				for(String s : output){
					bw.write(s);
					bw.write("\n");	
				}
			}
			bw.write(mapping);
			bw.write("\n");	
			bw.flush();
			bw.write(constraint);
			bw.write("\n");	
			if(isReturn){
				for(String s : output){
					bw.write(s);
					bw.write("\n");	
				}				
			}
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

	public static List<List<String>> getPermutation(List<String> list, int k){
		List<List<String>> lists = new ArrayList<List<String>>();
		if(k > list.size()) return lists;
		if(k == 0){
			lists.add(new ArrayList<String>());
			return lists;
		}
		
		for(int i = 0; i < list.size(); i++){
			List<String> temp = new ArrayList<String>(list);
			temp.remove(i);
			List<List<String>> permutations = getPermutation(temp, k - 1);
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
		list.add("4");
		List<List<String>> permutation = getPermutation(list, 4);
		System.out.println("size:" + permutation.size());
		for(List<String> t : permutation){
			for(String s : t){
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		validatePermuation();
//		List<Map<String, String>> map = new ArrayList<Map<String, String>>();
//		for(int i = 0; i < 3; i++){
//			HashMap<String, String> m = new HashMap<String, String>();
//			m.put("a", "b");
//			m.put("b", Integer.toBinaryString(i));
//			map.add(m);
//		}
//		System.out.println(getMappingConstraint(map));
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
