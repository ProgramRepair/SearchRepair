package main;

import org.apache.log4j.Logger;

import Database.DataBaseManager;
import Experiment.Analyzer;
import Experiment.ExperimentType;
import Experiment.WhiteOrBlack;
import ProcessIntroClass.GenerateStandardTestCases;
import Repository.EntryAddition;

public class Main {
	protected static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		if (args.length > 0) {
			Configuration.configure(args[0]);
			logger.info("Configuration loaded.");
		}
		if (Configuration.operation == 0) {
			logger.info("searchRepair configured to use existing analysis results; printing data.");

			Analyzer.getExistingData();
		} else {
			logger.info("searchRepair configured to regenerate results; starting recomputation.");
			GenerateStandardTestCases test = new GenerateStandardTestCases();
			if (!Configuration.skipGenerate) {
				logger.info("searchRepair configured to reprocess all program instances; generating.");
				test.generate();
			} else {
				logger.info("searchRepair configured to skip IntroClass reprocessing; using previously-existent instances.");
			}
			rerun(Configuration.wb, Configuration.repositoryType);
			logger.info("searchRepair rerun complete; printing data to CSV");
		}
		
		
	}

	private static void rerun(WhiteOrBlack wb, ExperimentType repositoryType) {
		logger.info("Initializing database connection.");
		DataBaseManager.connect();
		if (!DataBaseManager.isConnected()) {
			logger.error("Database connection failed, process terminating.");
			return;
		}
		DataBaseManager.rebuildTables();
		initRepository();
		logger.info("Repositories initialized, running all experiments");
		RepairIntroClass.rerun(wb, repositoryType);
		Analyzer.getCSVData();
	}

	private static void initRepository() {
		logger.info("Initializing searchRepair repositories.");
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
