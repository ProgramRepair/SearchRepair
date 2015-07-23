package test;

import Database.DataBaseManager;
import Experiment.Analyzer;
import Experiment.GroupTest;
import ProcessIntroClass.GenerateStandardTestCases;
import Repository.EntryAddition;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0)
			Configuration.configure(args[0]);

		if (Configuration.operation == 0) {
			Analyzer.getExistingData();
		} else {
			GenerateStandardTestCases test = new GenerateStandardTestCases();
			if (!Configuration.skipGenerate)
				test.generate();
			rerun(Configuration.wb, Configuration.repositoryType);
			Analyzer.getCSVData();
		}

	}

	private static void rerun(boolean wb, int repositoryType) {
		DataBaseManager.connect();
		if (!DataBaseManager.isConnected()) {
			System.out.println("Database not connected!");
			return;
		}
		DataBaseManager.rebuildTables();
		initRepository();
		GroupTest.rerun(wb, repositoryType);
	}

	private static void initRepository() {
		EntryAddition.addOneFolder("./repository/future",
				DataBaseManager.TABLEFUTURE1);
		EntryAddition.addOneFolder("./repository/future2",
				DataBaseManager.TABLEFUTURE2);
		EntryAddition.addOneFolder("./repository/introclass",
				DataBaseManager.TABLEALL);
		EntryAddition.addOneFolder("./repository/linux",
				DataBaseManager.TABLELINUX);
	}

}
