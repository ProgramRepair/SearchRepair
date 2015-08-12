package Experiment;

import java.util.HashMap;
import java.util.Map;

public class ProgramTests {

	private Map<String, String> blackPositives;
	private Map<String, String> blackNegatives;
	private Map<String, String> whitePositives;
	private Map<String, String> whiteNegatives;
	private Map<String, String> positives;
	private Map<String, String> negatives;
	
	public ProgramTests() {
		blackPositives = new HashMap<String,String> ();
		blackNegatives = new HashMap<String,String> ();
		whitePositives = new HashMap<String,String> ();
		whiteNegatives = new HashMap<String,String> ();
		positives = new HashMap<String,String> ();
		negatives = new HashMap<String,String> ();
		
	}
	public Map<String,String> getNegatives() {
		return this.negatives;
	}

	public void setNegatives(Map<String, String> negatives2) {
		this.negatives = negatives2;
	}

	public Map<String, String> getPositives() {
		return this.positives;
	}
	public void setPositives(Map<String, String> positives2) {
		this.positives = positives2;
	}

	public Map<String, String> getWhitePositives() {
		return whitePositives;
	}

	public void setWhitePositives(Map<String, String> whitePositives) {
		this.whitePositives = whitePositives;
	}

	public Map<String, String> getWhiteNegatives() {
		return whiteNegatives;
	}

	public void setWhiteNegatives(Map<String, String> whiteNegatives) {
		this.whiteNegatives = whiteNegatives;
	}

	public Map<String, String> getBlackNegatives() {
		return blackNegatives;
	}

	public void setBlackNegatives(Map<String, String> blackNegatives) {
		this.blackNegatives = blackNegatives;
	}

	public Map<String, String> getBlackPositives() {
		return blackPositives;
	}

	public void setBlackPositives(Map<String, String> blackPositives) {
		this.blackPositives = blackPositives;
	}

}
