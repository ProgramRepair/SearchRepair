package main;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import Experiment.CheckSumInstance;
import Experiment.GradeInstance;
import Experiment.MedianInstance;
import Experiment.ProgramInstance;
import Experiment.SyllablesInstance;
import util.Configuration;
import util.ExperimentType;
import util.WhiteOrBlack;

public class RepairIntroClass {

	//	public static void main(String[] args) {
	//		//medianTest(false, 2);
	//		//smallestTest(false, 2);
	//		//gradeTest(false, 2);
	//		//checkSumTest(false, 2);
	//		syllablesTest(false, 2);
	//	}

	private static int getActualRepository(String program, int size, int value) {
		switch(program) {
		case "median" :
			if(value < 49 || value > 100) return -1;
			if(value < size / 2) return 3;
			else return 4;
		default:
			if(value < size / 2) return 3;
			else return 4;
		}
	}

	// FIXME: this used to just iterate over programs but I undid that change
	// in light of Yalin's changes to the "actualRepository configuration.  Should fix it again!
	public static void rerun(WhiteOrBlack wb, ExperimentType repositoryType) {
		for(String program : Configuration.programs) {
			File file = new File(Configuration.outputPath + File.separator + program);
			int size = file.listFiles().length;
			int actualRepository = 0;
			ProgramInstance instance = null;
			for(File root : file.listFiles ()) {
				Path folder = Paths.get(Configuration.outputPath + program + File.separator + root.getName());
				Path fileName = Paths.get(folder.toString() + File.separator + program + ".c"); 	

				if(repositoryType == ExperimentType.FUTURE) {
					actualRepository = getActualRepository(program, size, Integer.parseInt(root.getName()));
				}
				if(actualRepository < 0) continue;
				switch(program) {
				case "checksum" : 
					instance = new CheckSumInstance(program, folder, fileName, actualRepository, wb);
					break;
				case "grade" :
					instance = new GradeInstance(program, folder,fileName, actualRepository, wb);
					break;
				case "median" : 
				case "smallest" :
					instance =  new MedianInstance(program, folder, fileName, actualRepository, wb);
					break;
				case "syllables" :
					String name = root.getName();
					if(name.length() >= 2 && name.charAt(0) <=1 && name.charAt(0) <= 1)continue;
					instance = new SyllablesInstance(program, folder, fileName, actualRepository, wb);
					break;
				default: continue;
				}
				instance.search();
				instance.recordResult(wb);
			}
			// FIXME: add digits, even though we don't do it.
		}
	}
}

