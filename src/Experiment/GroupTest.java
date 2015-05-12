package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class GroupTest {

	public static void main(String[] args) {
//		medianTest();
//		smallestTest();
		//gradeTest();
		//checkSumTest();
		syllablesTest();
	}
	
	public static void checkSumTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/checkSum");
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/checkSum/" + root.getName();
				String fileName = "checkSum.c";
				CheckSumSearchCase searcher = new CheckSumSearchCase(folder, fileName);
				searcher.transformAndInitRunDir(false);
				searcher.initInputAndOutput();
				searcher.search(true);
				searcher.recordResult(true);
				searcher.search(false);
				searcher.recordResult(false);
				if(searcher.getInfo().getResult().getState() == ResultState.SUCCESS){
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
	
	public static void medianTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/median");
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/median/" + root.getName();
				String fileName = "median.c";
				System.out.println(folder);
				MedianSearchCase searcher = new MedianSearchCase(folder, fileName);
				searcher.initInputAndOutput();
//				searcher.search(true);
//				searcher.recordResult(true);
				searcher.search(false);
				searcher.recordResult(false);
				if(searcher.getInfo().getResult().getState() == ResultState.SUCCESS){
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
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/smallest/" + root.getName();
				String fileName = "smallest.c";
				System.out.println(folder);
				MedianSearchCase searcher = new MedianSearchCase(folder, fileName);
				searcher.initInputAndOutput();
//				searcher.search(true);
//				searcher.recordResult(true);
				searcher.search(false);
				searcher.recordResult(false);
				if(searcher.getInfo().getResult().getState() == ResultState.SUCCESS){
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
	
	public static void gradeTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/grade");
		int i = 0;
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/grade/" + root.getName();
				String fileName = "grade.c";
				GradeSearchCase instan = new GradeSearchCase(folder, fileName);
				instan.transformAndInitRunDir(true);
				instan.initInputAndOutput();
				instan.search(true);
				instan.recordResult(true);
				instan.search(false);
				instan.recordResult(false);
				if(instan.getInfo().getResult().getState() == ResultState.SUCCESS){
					list.add(folder);
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
	
	public static void syllablesTest(){
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/syllables");
		int i = 0;
		for(File root : file.listFiles()){
			try{
				//if(root.getName().charAt(0) < '5') continue;
				String folder = "./bughunt/syllables/" + root.getName();
				String fileName = "syllables.c";
				SyllableSearchCase searcher = new SyllableSearchCase(folder, fileName);
				searcher.transformAndInitRunDir(false);
				searcher.initInputAndOutput();
				searcher.search(true);
				searcher.recordResult(true);
				searcher.search(false);
				searcher.search(false);
				if(searcher.getInfo().getResult().getState() == ResultState.SUCCESS){
					list.add(folder);
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
