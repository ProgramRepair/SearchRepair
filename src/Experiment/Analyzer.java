package Experiment;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import Library.Utility;

public class Analyzer {
	private final String CORRECT = "correct";
	private final String SUCCESS = "success";
	private final String FAIL = "failed";
	private String folder;
	private Map<String, String> sem;
	private Map<String, String> gp;
	private int gpfixed;
	private int semfixed;
	private int correct;
	private int neither;
	private int both;
	public Analyzer(String folder) {
		super();
		this.folder = folder;
		this.sem = new HashMap<String, String>();
		this.gp = new HashMap<String, String>();
		this.gpfixed  = 0;
		this.semfixed = 0;
		this.correct = 0;
		this.neither = 0;
		this.both = 0;
	}
	
	public void fetch(){
		for(File file : new File(folder).listFiles()){
			String path = file.getAbsolutePath();
			String index = path.substring(path.lastIndexOf("/") + 1);
			if(new File(path + "/repair/gp").exists()) {
				this.gpfixed++;
				gp.put(index, this.SUCCESS);
			}
			else gp.put(index, this.FAIL);
			
			File autolog = new File(path + "/repair/semantic");
			if(autolog.exists()){
				String fileString = Utility.getStringFromFile(path + "/repair/semantic");
				String firstLine = fileString.split("\n")[0];
				if(firstLine.startsWith("success")){
					this.semfixed++;
					if(this.gp.get(index).equals(this.SUCCESS)){
						this.both++;
					}
					this.sem.put(index, this.SUCCESS);
				}
				else if(firstLine.startsWith("correct")){
					this.correct++;
					this.sem.put(index, this.CORRECT);
					this.gp.put(index, this.CORRECT);
				}
				else {
					this.sem.put(index, this.FAIL);
					if(this.gp.get(index).equals(this.FAIL)){
						this.neither++;
					}
				}
				
			}
			else{
				this.sem.put(index, this.FAIL);
				if(this.gp.get(index).equals(this.FAIL)){
					this.neither++;
				}
			}
		}
	}
	
	public void printFormat(){
		System.out.println("There are " + this.gp.keySet().size() + " versions of checksum program.");
		System.out.println("In which, there are " + this.correct + " correct versions! Among the other buggy " + (this.gp.keySet().size() - this.correct) + " versions: ");
		System.out.println("" + this.both  + " versions can be fixed by both genprog and semantic search");
		System.out.println("" + this.gpfixed  + " versions can be fixed by genprog");
		System.out.println("" + this.semfixed  + " versions can be fixed by semantic search");
		System.out.println("" + this.neither  + " versions can not be fixed by neither");
		
		System.out.println("version\tgenprog\tsemantic");
		for(int i = 0; i < this.gp.keySet().size(); i++){
			System.out.println("" + i + "\t" + this.gp.get(Integer.toString(i)) + "\t" + this.sem.get(Integer.toString(i)));
		}
		
	}
	
	public static void main(String[] args){
		Analyzer ana = new Analyzer("./bughunt/digits");
		ana.fetch();
		ana.printFormat();
	}
	
}
