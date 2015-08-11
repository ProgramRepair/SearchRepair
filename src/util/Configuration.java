package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	// type: 0 linux, 1 introclass, 2 future
	public static int repositoryType = 1;

	public static String introclassPath = "/Users/clegoues/research/autobugfix/autobugfix-yalin/IntroClass/";

	// get data directly 0 or re run to get data:1
	public static int operation = 1;

	// run wb test or run bb test, wb : wb = true, bb: wb = false;
	public static WhiteOrBlack wb = WhiteOrBlack.BLACKBOX;

	public static String outputPath = "/Users/clegoues/research/autobugfix/autobugfix-yalin/bughunt/";

	public static boolean skipGenerate = true;

	public static String[] programs = new String[] { "checksum", // "digits", FIXME: we can't handle digits at all, right?
			"grade", "median", "smallest", "syllables" };

	public static void configure(String name) {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader(new File(name)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (prop.getProperty("reposType") != null) {
			repositoryType = Integer.parseInt(prop.getProperty("reposType")
					.trim());
		}

		if (prop.getProperty("introclassPath") != null) {
			introclassPath = prop.getProperty("introClassPath").trim();
		}
		if (prop.getProperty("operation") != null) {
			operation = Integer.parseInt(prop.getProperty("operation").trim());
		}

		if (prop.getProperty("training") != null) {
			String trainSet = prop.getProperty("training").trim();
			if (trainSet.equals("wb"))
				wb = WhiteOrBlack.WHITEBOX;
		}
		if (prop.getProperty("outputPath") != null) {
			outputPath = prop.getProperty("outputPath");
		}

		if (prop.getProperty("regenerate") != null) {
			skipGenerate = false;
		}
		if (prop.getProperty("skipGenerate") != null) {
			skipGenerate = true;
		}

		if (prop.getProperty("specifyPrograms") != null) {
			programs = prop.getProperty("specifyPrograms").split(",");
		}
	}

}
