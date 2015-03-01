package search;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lookups.ClassType;
import lookups.TypeTable;
import test.Test;
import db.DataBaseManager;

public class SearchManager {
	
	private static String SEARCHURL = "select * from srcConstraints;";
	private static String SEARCHPROTOTYPE = "select * from prototype";
	
	public  static List<String> search(Object[] input, Object output) throws SQLException, IOException{
		List<String> finding = new ArrayList<String>();
		DataBaseManager.connect();
		ResultSet result = DataBaseManager.query(SEARCHURL);
		while(result.next()){
			String[] input1 = result.getString(5).split("\n");
			if(input1.length != input.length || !CheckInputType(input1, input)){
				continue;
			}
//			String[] constraints = result.getString(3).split("\n");
//			addResultToconstraints(input, output, constraints, input1);
			//System.out.println(result.getString(3));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ctest/test/temp")));
			loadPrototype(bw);
			String constraint = result.getString(4);
			List<String> searchOver = loadInputAndOutput(constraint, input1, input, output);
			loadSearchOver(bw, searchOver);
			bw.close();
			String res = Test.invokeZ3onFile("ctest/test/temp");
			if(res.equals("sat")){
				finding.add(result.getString(3));
			}
		}
		return finding;
	}
	
	public static List<String> search(SSATranslator translator) throws SQLException{
		DataBaseManager.connect();
		ResultSet result = DataBaseManager.query(SEARCHPROTOTYPE);
		List<String> list = new ArrayList<String>();
		while(result.next()){
			String constraint = result.getString(2);
			String[] inputs = result.getString(3).split("\n");
			Map<String, String> variables = translator.getVariableTypeTrack();
			String source = result.getString(1);
			List<Map<String, String>> permutations = new ArrayList<Map<String, String>>();
			

		}
		return list;
	}
	
	private static void loadVariableFromInput(BufferedWriter bw, String input) throws IOException {
		String[] vars = input.split("\n");
		for(String var : vars){
			String[] re = var.split(":");
			String type = TypeTable.getInstance().getType(re[1]);
			String declare = "(declare " + re[0]  + " " + type + ")\n";
			bw.write(declare);
			bw.flush();
		}
		
	}

	private static void loadAllVariable(SSATranslator translator,
			BufferedWriter bw) throws IOException {
		for(String v : translator.getVariableTypeTrack().keySet()){
			String type = TypeTable.getInstance().getType(translator.getVariableTypeTrack().get(v));
			String declare = "(declare " + v  + " " + type + ")\n";
			bw.write(declare);
			bw.flush();
		}
		
	}

	private static void loadSearchOver(BufferedWriter bw,
			List<String> searchOver) throws IOException {
		for(String s : searchOver){
			bw.write(s);
			bw.write('\n');
		}
		
	}

	private  static List<String> loadInputAndOutput(String constraint, String[] input1, Object[] input,
			Object output) {
		String[] constraints = constraint.split("\n");
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < input1.length; i++){
			result.add(constraints[i]);
			String[] args = input1[i].split(" ");
			String classType2 = input[i].getClass().getSimpleName();
			
			if(classType2.equals("Integer")){
				String temp = "(assert(= " + args[1] + " " + input[i] + "))";
				result.add(temp);
			}
		}
		
		for(int i = input1.length; i < constraints.length; i++){
			result.add(constraints[i]);
		}
		
		String outputCon = "(assert(= _output_ " + output + "))";
		result.add(outputCon);
		result.add("(check-sat)");
		return result;
	}

	//check type 
	
	public static void loadPrototype(BufferedWriter bw) throws IOException {
		File dir = new File("smt/prototype");
		for(File file : dir.listFiles()){
			if(file.isFile()){
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				String s;
				while((s = br.readLine()) != null){
					bw.write(s);
					bw.write('\n');
				}
			}
		}
		
	}

	private static boolean CheckInputType(String[] input1, Object[] input2){
		for(int i = 0; i < input1.length; i++){
			String[] args = input1[i].split(" ");
			
			String classType1 = ClassType.getInstance().getType(args[0]);
			String classType2 = input2[i].getClass().getSimpleName();
			if(!classType1.equals(classType2)) return false;
		}
		return true;
	}


	
	public  static  void main(String[] args) throws SQLException, IOException{
		Integer[] input = new Integer[]{2, 2};
		String[] input1 = new String[]{"int a", "int b"};
		//System.out.println(CheckInputType(input1, input));
		List<String> result = search(input, 0);
		
		for(String s : result){
			System.out.println(s);
		}
	}

}
