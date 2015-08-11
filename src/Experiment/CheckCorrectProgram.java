package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import util.Utility;

public class CheckCorrectProgram {
	private String folder;
	private List<String> pathsForCorrect;
	private List<String> pathsForRepair;
	
	public CheckCorrectProgram(String folder){
		this.folder = folder;
		this.pathsForCorrect = new ArrayList<String>();
		this.pathsForRepair = new ArrayList<String>();
	}
	
	public void checkRepairProgram(){
		File dir = new File(folder);
		for(File subdir : dir.listFiles()){
			if(subdir.isDirectory())
			{
				for(File subsubDir : subdir.listFiles()){
					if(subsubDir.isDirectory())
					{
						if(checkRepair(subsubDir))
						{
							this.pathsForRepair.add(subsubDir.getAbsolutePath());
						}						
					}
				}
			}
		}
	}

	private boolean checkRepair(File subsubDir) {
		String dirPath = subsubDir.getAbsolutePath();
		//System.out.println(dirPath);
		File dir1 = new File(dirPath + "/repair");
		if(dir1.isDirectory() && dir1.list().length != 0) return true;
		return false;
	}

	public void checkCorrectProgram() {
		File dir = new File(folder);
		for(File subdir : dir.listFiles()){
			if(subdir.isDirectory())
			{
				for(File subsubDir : subdir.listFiles()){
					if(subsubDir.isDirectory())
					{
						if(!checkNeg(subsubDir))
						{
							this.pathsForCorrect.add(subsubDir.getAbsolutePath());
						}
						
					}
				}
			}
		}
		
	}

	private boolean checkNeg(File subsubDir) {
		String dirPath = subsubDir.getAbsolutePath();
		File dir1 = new File(dirPath + "/blackbox/negative");
		File dir2 = new File(dirPath + "/whitebox/negative");
		boolean hasNeg = false;
		if(dir1.exists() && dir1.list().length != 0) hasNeg = true;
		if(dir2.exists() && dir2.list().length != 0) hasNeg = true;
		return hasNeg;
	}
	
	public void printCorrect(){
		System.out.println(this.pathsForCorrect.size());
		for(String s : this.pathsForCorrect){
			System.out.println(s);
		}
	}
	
	public void printRepair(){
		System.out.println(this.pathsForRepair.size());
		for(String s : this.pathsForRepair){
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
//		check.checkRepairProgram();;
//		check.printRepair();
		check.checkCorrectProgram();
		check.printCorrect();
	}
	
	
	
}
