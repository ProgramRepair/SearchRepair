package Experiment;

import java.io.File;

public class GroupTest {

	public static void main(String[] args) {
		medianTest();
	}
	
	public static void medianTest(){
		File file = new File("./bughunt/median");
		for(File root : file.listFiles()){
			try{
				String folder = "./bughunt/median/" + root.getName();
				String fileName = "median.c";
				ESearchCase searcher = new ESearchCase(folder, fileName);
				System.out.println(root);
				searcher.search();
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}
		}
	}

}
