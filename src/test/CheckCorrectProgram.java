package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Library.Utility;

public class CheckCorrectProgram {
	private String folder;
	private List<String> paths;
	
	public CheckCorrectProgram(String folder){
		this.folder = folder;
		this.paths = new ArrayList<String>();
		init();
	}

	private void init() {
		File dir = new File(folder);
		for(File subdir : dir.listFiles()){
			if(subdir.isDirectory())
			{
				for(File subsubDir : subdir.listFiles()){
					if(subsubDir.isDirectory())
					{
						if(!checkNeg(subsubDir))
						{
							this.paths.add(subsubDir.getAbsolutePath());
						}
						
					}
				}
			}
		}
		
	}

	private boolean checkNeg(File subsubDir) {
		String dirPath = subsubDir.getAbsolutePath();
		//System.out.println(dirPath);
		File dir1 = new File(dirPath + "/blackbox/negative");
		File dir2 = new File(dirPath + "/whitebox/negative");
		boolean hasNeg = false;
		if(dir1.exists() && dir1.list().length != 0) hasNeg = true;
		if(dir2.exists() && dir2.list().length != 0) hasNeg = true;
		return hasNeg;
	}
	
	public void print(){
		for(String s : this.paths){
			System.out.println(s);
		}
	}
	
	public int countLines(String folder){
		int count = 0;
		File file = new File(folder);
		if(file.isDirectory()){
			for(File temp : file.listFiles())
			{
				count += countLines(temp.getAbsolutePath());
			}
		}
		else{
			String fileString = Utility.getStringFromFile(file.getAbsolutePath());
			count = fileString.split("\n").length;
		}
		return count;
	}
	
	
	public static void main(String[] args){
		CheckCorrectProgram check = new CheckCorrectProgram("./bughunt");
		//System.out.println(check.countLines("./src"));
		check.print();
	}
	
	
	
}
