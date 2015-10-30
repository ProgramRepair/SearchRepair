package Experiment;

import java.nio.file.Path;

public class GradeInstance extends ProgramInstance {
// FIXME: make all the .gcov .gcda .gcno etc files end up not at the top level.
	public GradeInstance(String program, Path folder, Path fileName, int repo, WhiteOrBlack wb) {
		super(program, folder, fileName, repo);
		this.transformAndInitRunDir(true, "--type grade");
		this.initTests(wb);

	}

}
