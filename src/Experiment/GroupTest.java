package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GroupTest {

	public static void main(String[] args) {
		//medianTest();
		//smallestTest();
		//gradeTest();
		checkSumTest();
	}
	
	public static void medianTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/median");
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/median/" + root.getName();
				String fileName = "median.c";
				ESearchCase searcher = new ESearchCase(folder, fileName);
				System.out.println(root);
				if(searcher.search()){
					list.add(folder);
				}
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}
		}
		
		for(String s : list){
			System.out.println(s);
		}
	}
	
	public static void smallestTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/smallest");
		int i = 0;
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/smallest/" + root.getName();
				String fileName = "smallest.c";
				ESearchCase searcher = new ESearchCase(folder, fileName);
				if(!searcher.search()){
					if(searcher.isHasPrintf()) i++;
					list.add(root.getName());
				}
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}
		}
		System.out.println(i);
		for(String s : list){
			System.out.println(s);
		}
	}
	
	public static void gradeTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/grade");
		int i = 0;
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/grade/" + root.getName();
				String fileName = "grade.c";
				ESearchCase searcher = new ESearchCase(folder, fileName);
				if(searcher.search()){
					if(searcher.isHasPrintf()) i++;
					else list.add(root.getName());
				}
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}
		}
		System.out.println(i);
		for(String s : list){
			System.out.println(s);
		}
	}
	
	public static void checkSumTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/checkSum");
		int i = 0;
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/checkSum/" + root.getName();
				String fileName = "checkSum.c";
				ESearchCase searcher = new ESearchCase(folder, fileName);
				if(searcher.search()){
					if(searcher.isHasPrintf()) i++;
					else list.add(root.getName());
				}
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}
		}
		System.out.println(i);
		for(String s : list){
			System.out.println(s);
		}
	}
	

}