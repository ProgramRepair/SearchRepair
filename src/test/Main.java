package test;

import Database.DataBaseManager;
import Experiment.Analyzer;
import Experiment.GroupTest;
import Repository.EntryAddition;

public class Main {

	public static void main(String[] args) {
		//repository type: 0 linux, 1 introclass, 2 future
		int repositoryType = 2;
		
		
		//get data directly 0 or re run to get data:1
		int operation = 1;
		
		//run wb test or run bb test, wb : wb = true, bb: wb = false; 
		boolean wb = false;

		if(operation == 0){
			Analyzer.getExistingData();
		}
		else{
			//TODO rerun
			rerun(wb, repositoryType);
			Analyzer.getCSVData();
		}
		
		
	}

	private static void rerun(boolean wb, int repositoryType) {
		DataBaseManager.connect();
		if(!DataBaseManager.isConnected()){
			System.out.println("Database not connected!");
			return;
		}
		DataBaseManager.rebuildTables();
		initRepository();
		GroupTest.rerun(wb, repositoryType);
		//Analyzer.getCSVData();
	}

	private static void initRepository() {
		EntryAddition.addOneFolder("./repository/future", DataBaseManager.TABLEFUTURE1);
		EntryAddition.addOneFolder("./repository/future2", DataBaseManager.TABLEFUTURE2);
		EntryAddition.addOneFolder("./repository/introclass", DataBaseManager.TABLEALL);
		EntryAddition.addOneFolder("./repository/linux", DataBaseManager.TABLELINUX);
	}

}
