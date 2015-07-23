package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;
import test.Configuration;

public class GroupTest {

	// FIXME: consider adding back in for testing when done refactoring
	//	public static void main(String[] args) {
	//		medianTest(false, 2);
	//		// smallestTest();
	//		// gradeTest();
	//		// checkSumTest();
	//		// syllablesTest();
	//	}

	public static void rerun(boolean wb, int repositoryType) {
		for(String program : Configuration.programs) {
			ESearchCase searcher = null;
			List<String> list = new ArrayList<String>();
			File file = new File("./bughunt/" + program);
			int size = file.listFiles().length;
			for (File root : file.listFiles()) {
				try { // FIXME: the bughunts here are configurable, change!
					String folder = "./bughunt/" + program + "/" + root.getName();
					String fileName = program + ".c"; 
					if (repositoryType == 2) { // FIXME: CLG has NO IDEA what this does.
						// OK beginning to figure it out: root is the variant number. 
						int value = Integer.parseInt(root.getName());
						repositoryType = (value < size / 2) ? 3 : 4; 				
					}
					
					String transformArgs = "";

					switch(program) {
					case "checksum":
						searcher = new CheckSumSearchCase(folder,
								fileName, repositoryType);
						break;
					case "median":
					case "smallest":
						searcher =  new MedianSearchCase(folder,
								fileName, repositoryType);
						break;
					case "grade":
						searcher = new GradeSearchCase(folder, fileName,
								repositoryType);
						transformArgs = "--type grade";
						break;
					case "syllables":
						new SyllableSearchCase(folder,
								fileName, repositoryType);
					}

					searcher.transformAndInitRunDir(false, transformArgs);
					searcher.initInputAndOutput();
					searcher.search(wb);
					searcher.recordResult(wb);
					if (searcher.getInfo().getResult().getState() == ResultState.SUCCESS) {
						list.add(folder);
					}
					for (String s : list) {
						System.out.println(s);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}


}
