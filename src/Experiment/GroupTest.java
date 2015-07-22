package Experiment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import search.ResultObject.ResultState;

public class GroupTest {

	public static void main(String[] args) {
		medianTest(false, 2);
		// smallestTest();
		// gradeTest();
		// checkSumTest();
		// syllablesTest();
	}

	public static void rerun(boolean wb, int repositoryType) {
		medianTest(wb, repositoryType);
		// smallestTest(wb, repositoryType);
		// gradeTest(wb, repositoryType);
		// checkSumTest(wb, repositoryType);
		// syllablesTest(wb, repositoryType);
	}

	public static void checkSumTest(boolean wb, int type) {
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/checkSum");
		int size = file.listFiles().length;
		for (File root : file.listFiles()) {
			try {
				String folder = "./bughunt/checkSum/" + root.getName();
				String fileName = "checkSum.c";
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if (value < size / 2)
						type = 3;
					else
						type = 4;
				}
				CheckSumSearchCase searcher = new CheckSumSearchCase(folder,
						fileName, type);
				searcher.transformAndInitRunDir(false, "");
				searcher.initInputAndOutput();
				searcher.search(wb);
				searcher.recordResult(wb);
				if (searcher.getInfo().getResult().getState() == ResultState.SUCCESS) {
					list.add(folder);
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

		for (String s : list) {
			System.out.println(s);
		}
	}

	public static void medianTest(boolean wb, int type) {
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/median");
		int size = file.listFiles().length;
		for (File root : file.listFiles()) {
			try {
				// if(!root.getName().equals("225"))continue;
				String folder = "./bughunt/median/" + root.getName();
				String fileName = "median.c";
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if (value < size / 2)
						type = 3;
					else
						type = 4;
				}
				System.out.println(folder);
				MedianSearchCase searcher = new MedianSearchCase(folder,
						fileName, type);
				searcher.transformAndInitRunDir(true, "");
				searcher.initInputAndOutput();
				searcher.search(wb);
				searcher.recordResult(wb);
				if (searcher.getInfo().getResult().getState() == ResultState.SUCCESS) {
					list.add(folder);
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public static void smallestTest(boolean wb, int type) {
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/smallest");
		int size = file.listFiles().length;
		for (File root : file.listFiles()) {
			try {
				String folder = "./bughunt/smallest/" + root.getName();
				String fileName = "smallest.c";
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if (value < size / 2)
						type = 3;
					else
						type = 4;
				}
				System.out.println(folder);
				MedianSearchCase searcher = new MedianSearchCase(folder,
						fileName, type);
				searcher.transformAndInitRunDir(true, "");
				searcher.initInputAndOutput();
				searcher.search(wb);
				searcher.recordResult(wb);
				if (searcher.getInfo().getResult().getState() == ResultState.SUCCESS) {
					list.add(folder);
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

	public static void gradeTest(boolean wb, int type) {
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/grade");
		int size = file.listFiles().length;
		for (File root : file.listFiles()) {
			try {
				String folder = "./bughunt/grade/" + root.getName();
				String fileName = "grade.c";
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if (value < size / 2)
						type = 3;
					else
						type = 4;
				}
				// System.out.println(folder);
				GradeSearchCase instan = new GradeSearchCase(folder, fileName,
						type);
				instan.transformAndInitRunDir(true, "--type grade");
				instan.initInputAndOutput();
				instan.search(wb);
				if (instan.getInfo().getResult().getState() == ResultState.SUCCESS) {
					list.add(folder);
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public static void syllablesTest(boolean wb, int type) {
		List<String> list = new ArrayList<String>();
		File file = new File("./bughunt/syllables");
		int size = file.listFiles().length;
		for (File root : file.listFiles()) {
			try {
				// if(root.getName().charAt(0) < '5') continue;
				String folder = "./bughunt/syllables/" + root.getName();
				String fileName = "syllables.c";
				if (type == 2) {
					int value = Integer.parseInt(root.getName());
					if (value < size / 2)
						type = 3;
					else
						type = 4;
				}
				SyllableSearchCase searcher = new SyllableSearchCase(folder,
						fileName, type);
				searcher.transformAndInitRunDir(false, "");
				searcher.initInputAndOutput();
				searcher.search(wb);
				searcher.recordResult(wb);
				if (searcher.getInfo().getResult().getState() == ResultState.SUCCESS) {
					list.add(folder);
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

}
