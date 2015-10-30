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
import java.util.List;
import java.util.Map;

import util.Utility;
import lookups.ClassType;
import lookups.TypeTable;
import Database.DataBaseManager;
import Database.DataHandler;

public class SearchManager {
	
	private static String SEARCHURL = "select * from srcConstraints;";
	private static String SEARCHPROTOTYPE = "select * from prototype";
	
	public  static List<String> search(Object[] input, Object output) throws SQLException, IOException{
		List<String> finding = new ArrayList<String>();
		Database.DataBaseManager.connect();
		ResultSet result = Database.DataBaseManager.query(SEARCHURL);
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
			String res = Utility.invokeZ3onFile("ctest/test/temp");
			if(res.equals("sat")){
				finding.add(result.getString(3));
			}
		}
		return finding;
	}
	

	




	private static void loadPrototype(BufferedWriter bw) {
		try{
			loadPrototypeTypes(bw);
			loadPrototypeString(bw);
		}catch(Exception e){
			System.out.println(e);
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
	
	public static void loadPrototypeTypes(BufferedWriter bw) throws IOException{
		File file = new File(DataHandler.PROTOTYPE_TYPES);
		if(file.isFile()){
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String s;
			while((s = br.readLine()) != null){
				bw.write(s);
				bw.write('\n');
			}
			br.close();
		}
		
	}
	
	public static void loadPrototypeString(BufferedWriter bw) throws IOException {
		File file = new File(DataHandler.PROTOTYPE_STRING);
		if(file.isFile()){
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String s;
			while((s = br.readLine()) != null){
				bw.write(s);
				bw.write('\n');
			}
			br.close();
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
