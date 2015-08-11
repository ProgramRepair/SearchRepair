package Experiment;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import test.Configuration;

public class GroupTest {

//	public static void main(String[] args) {
//		//medianTest(false, 2);
//		//smallestTest(false, 2);
//		//gradeTest(false, 2);
//		//checkSumTest(false, 2);
//		syllablesTest(false, 2);
//	}

	// FIXME: this used to just iterate over programs but I undid that change
	// in light of Yalin's changes to the "actualRepository configuration.  Should fix it again!
	// FIXME: alo rename initWb or BB
	public static void rerun(WhiteOrBlack wb, int repositoryType) {
		medianTest(wb, repositoryType);
		// smallestTest(wb, repositoryType);
		// gradeTest(wb, repositoryType);
		// checkSumTest(wb, repositoryType);
		// syllablesTest(wb, repositoryType);
	}

	public static void checkSumTest(WhiteOrBlack wb, int type) {
		String program = "checkSum";
		
		File file = new File("./bughunt/checkSum");
		int size = file.listFiles().length;
		int actualRepository = 0;
		for (File root : file.listFiles()) {
			try {
				Path folder = Paths.get(Configuration.outputPath + program + "/" + root.getName());
				Path fileName = Paths.get(folder.toString() + "/" + program + ".c"); 

				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if(value < size / 2) actualRepository = 3;
					else actualRepository = 4;
				}
				CheckSumSearchCase searcher = new CheckSumSearchCase(program, folder, fileName, actualRepository);
				searcher.transformAndInitRunDir(false, "");
				searcher.initWbOrBB(wb);
				searcher.search(wb);
				searcher.recordResult(wb);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public static void medianTest(WhiteOrBlack wb, int type) {
		String program = "median";
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/median");
		int size = file.listFiles().length;
		int actualRepository = 0;
		for (File root : file.listFiles()) {
			try {
				// if(!root.getName().equals("225"))continue;
				Path folder = Paths.get(Configuration.outputPath + program + "/" + root.getName());
				Path fileName = Paths.get(folder.toString() + "/" + program + ".c"); 

				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if(value < 49 || value > 100) continue;
					if(value < size / 2) actualRepository = 3;
					else actualRepository = 4;
				}
				MedianSearchCase searcher = new MedianSearchCase(program, folder, fileName, actualRepository);
				searcher.transformAndInitRunDir(true, "");
				searcher.initWbOrBB(wb);
				searcher.search(wb);
				searcher.recordResult(wb);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public static void smallestTest(WhiteOrBlack wb, int type) {
		String program = "smallest";
		File file = new File("./bughunt/smallest");
		int size = file.listFiles().length;
		int actualRepository = 0;
		for (File root : file.listFiles()) {
			try {
				Path folder = Paths.get(Configuration.outputPath + program + "/" + root.getName());
				Path fileName = Paths.get(folder.toString() + "/" + program + ".c"); 

				if (type == 2) {
//					String name = root.getName();
//					if(name.charAt(0) == '0') continue;
//					if(name.charAt(0) == '1'){
//						if(name.length() == 1) continue;
//						if((name.length() == 2 || name.length() == 3) && name.charAt(1) < '4') continue;
//						if(name.length() == 3 && name.charAt(1) == '4' && name.charAt(2) < '6') continue;
//					}
					int value = Integer.parseInt(root.getName());
					if(value < size / 2) actualRepository = 3;
					else actualRepository = 4;
				}
				MedianSearchCase searcher = new MedianSearchCase(program, folder, fileName, actualRepository);
				searcher.transformAndInitRunDir(true, "");
				searcher.initWbOrBB(wb);
				searcher.search(wb);
				searcher.recordResult(wb);

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public static void gradeTest(WhiteOrBlack wb, int type) {
		String program = "grade";
		File file = new File("./bughunt/grade");
		int size = file.listFiles().length;
		int actualRepository = 0;
		for (File root : file.listFiles()) {
			try {
				Path folder = Paths.get(Configuration.outputPath + program + "/" + root.getName());
				Path fileName = Paths.get(folder.toString() + "/" + program + ".c"); 

				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if(value < size / 2) actualRepository = 3;
					else actualRepository = 4;
					//if(value != 120) continue;
				}
				System.out.println(folder);
				GradeSearchCase instan = new GradeSearchCase(program, folder, fileName, actualRepository);
				instan.transformAndInitRunDir(true, "--type grade");
				instan.initWbOrBB(wb);
				instan.search(wb);
				instan.recordResult(wb);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public static void syllablesTest(WhiteOrBlack wb, int type) {
		String program = "syllables";
		File file = new File("./bughunt/syllables");
		int size = file.listFiles().length;
		int actualRepository = 0;
		for (File root : file.listFiles()) {
			try {
				Path folder = Paths.get(Configuration.outputPath + program + "/" + root.getName());
				Path fileName = Paths.get(folder.toString() + "/" + program + ".c"); 
				// if(root.getName().charAt(0) < '5') continue;

				String name = root.getName();
				if(name.length() >= 2 && name.charAt(0) <=1 && name.charAt(0) <= 1)continue;
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if(value < size / 2) actualRepository = 3;
					else actualRepository = 4;
				}
				SyllableSearchCase searcher = new SyllableSearchCase(program, folder, fileName, actualRepository);
				searcher.transformAndInitRunDir(false, "");
				searcher.initWbOrBB(wb);
				searcher.search(wb);
				searcher.recordResult(wb);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

}
