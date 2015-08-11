package Experiment;

import java.nio.file.Path;

public class MedianInstance extends ProgramInstance {
	
	public MedianInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName,  repo);
		this.transformAndInitRunDir(true, "");
		this.initTests(wb);
	}
	
//	public static void main(String[] args){
//		MedianSearchCase instan = new MedianSearchCase("./bughunt/median/0", "median.c",  2);
//		instan.transformAndInitRunDir(true, "");
//		instan.initInputAndOutput();
//		instan.search(false);
////		instan.search(false);
//		instan.recordResult(false);
//	}

}
