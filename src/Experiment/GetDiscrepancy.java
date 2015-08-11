package Experiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.Utility;

public class GetDiscrepancy {
	
	private Set<String> smallest;
	private Set<String> median;
	private Set<String> checksum;
	private Set<String> syllables;
	private Set<String> grade;
	private Set<String> digits;
	private Set<String> tedSmallest;
	private Set<String> tedMedian;
	private Set<String> tedChecksum;
	private Set<String> tedSyllables;
	private Set<String> tedGrade;
	private Set<String> tedDigits;
	private String folder;
	
	public GetDiscrepancy(String folder){
		this.smallest = new HashSet<String>();
		this.median = new HashSet<String>();
		this.checksum = new HashSet<String>();;
		this.syllables = new HashSet<String>();
		this.grade = new HashSet<String>();
		this.digits = new HashSet<String>();
		this.tedChecksum = new HashSet<String>();
		this.tedSmallest = new HashSet<String>();
		this.tedGrade = new HashSet<String>();
		this.tedDigits = new HashSet<String>();
		this.tedMedian = new HashSet<String>();
		this.tedSyllables = new HashSet<String>();
		this.folder = folder;
	}
	
	public void init(){
		for(File dir : new File(folder).listFiles()){
			String name = dir.getName();
			if(!dir.isDirectory()) continue;
			if(name.equals("median")){
				init(dir, this.median);
			}
			else if(name.equals("smallest")){
				init(dir, this.smallest);
			}
			else if(name.equals("syllables")){
				init(dir, this.syllables);
			}
			else if(name.equals("checksum")){
				init(dir, this.checksum);
			}
			else if(name.equals("digits")){
				init(dir, this.digits);
			}
			else if(name.equals("grade")){
				init(dir, this.grade);
			}
		}
	}

	private void init(File dir, Set<String> set) {
		for(File version : dir.listFiles()){
			if(!version.isDirectory()) continue;
			String path = version.getAbsolutePath() + "/original";
			String content = Utility.getStringFromFile(path);
			content = content.substring(content.indexOf("introclass"), content.length() - 1);
			//System.out.println(content);
			set.add(content);
		}		
	}
	
	public void initTed(String csvFile){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile)));
			String s = br.readLine();
			while((s = br.readLine()) != null){
				String[] array = s.split(",");
				String name = array[0].trim();
				String submission = array[1].trim();
				String version = array[2].trim();
				version = modifiy(version);
				String path = "introclass/" + name + "/" + submission + "/" + version;
				//System.out.println(path);
				if(name.equals("median")){
					this.tedMedian.add(path);
				}
				else if(name.equals("smallest")){
					this.tedSmallest.add(path);
				}
				else if(name.equals("syllables")){
					this.tedSyllables.add(path);
				}
				else if(name.equals("checksum")){
					this.tedChecksum.add(path);
				}
				else if(name.equals("digits")){
					this.tedDigits.add(path);
				}
				else if(name.equals("grade")){
					this.tedGrade.add(path);
				}
			}
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void checkDiff(){
		int count = 0;
		try {
			System.setOut(new PrintStream("smallestdiscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedSmallest){
			if(!this.smallest.contains(s)){
				System.out.println(s);
				count++;
			}
		}
		System.out.println(count);
		
		
		count = 0;
		try {
			System.setOut(new PrintStream("mediandiscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedMedian){
			if(!this.median.contains(s)){
				System.out.println(s);
				count++;
				
			}
		}
		System.out.println(count);
		
		count = 0;
		try {
			System.setOut(new PrintStream("checkSumdiscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedChecksum){
			if(!this.checksum.contains(s)){
				System.out.println(s);
				count++;
				
			}
		}
		System.out.println(count);
		
		count = 0;
		try {
			System.setOut(new PrintStream("syllablesdiscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedSyllables){
			if(!this.syllables.contains(s)){
				System.out.println(s);
				count++;
				
			}
		}
		System.out.println(count);
		
		count = 0;
		try {
			System.setOut(new PrintStream("digitsdiscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedDigits){
			if(!this.digits.contains(s)){
				System.out.println(s);
				count++;
				
			}
		}
		System.out.println(count);
		
		count = 0;
		try {
			System.setOut(new PrintStream("gradediscrepency"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : this.tedGrade){
			if(!this.grade.contains(s)){
				System.out.println(s);
				count++;
				
			}
		}
		System.out.println(count);
	}
	
	private String modifiy(String version) {
		String map = version.substring(0, version.indexOf('_'));
		String pre = "";
		for(int i = 0; i < 3 - map.length(); i++){
			pre = pre +  '0';
		}
				
		return pre + map;
	}

	public void printOut(){
		System.out.println(smallest.size());
		System.out.println(median.size());
	}
	
	
	public static void main(String[] args){
		GetDiscrepancy gd = new GetDiscrepancy("./bughunt");
		gd.init();
		gd.initTed("./tempFolder/ted.csv");
		gd.checkDiff();
		
	}

}
