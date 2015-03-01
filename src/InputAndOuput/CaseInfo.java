package InputAndOuput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import Library.Utility;
import antlr.preprocess.FunctionExtractorLexer;
import antlr.preprocess.FunctionExtractorParser;
import antlr.preprocess.FunctionExtractorParser.FunctionDefinitionContext;
import antlr.preprocess.FunctionExtractorParser.ProgContext;
import antlr.preprocess.FunctionLexer;
import antlr.preprocess.FunctionParser;



/**
 * This class is used to store  information of one test case. The information includes the file name of test case, positive and negative i/o pairs, results
 * For every test case, it includes two files. One is "prefix_TS", which contains i/o pairs. The other one is "prefix.c", which is source file with buggy lines.
 * @author keyalin
 *
 */
public class CaseInfo {
	
	public static final String MARKINPUT = "//_yalin_mark(\"input\");";
	public static final String MARKOUTPUT = "//_yalin_mark(\"output\");";
	
	private String casePrefix;
	private Map<String, String> positives;
	private Map<String, String> negatives;
	private int[] buggy;
	private SearchCase searchBag;
	
	
	


	public CaseInfo(String casePrefix) {
		this.casePrefix = casePrefix;
		this.positives = new HashMap<String, String>();
		this.negatives = new HashMap<String, String>();
		this.searchBag = new SearchCase();
		this.buggy = new int[2];
		init();
	}

	private void init() {
		String IOFileName = this.casePrefix + "_TS";
		parse(IOFileName);
		fillSearchCase();
	}
	
	
	private void fillSearchCase() {
		String filePath = insertStateStatements(this.casePrefix + ".c");
		obtainInputAndOutputStates();
	}

	private void obtainInputAndOutputStates() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 
	 * firstly, erase all of include statements and insert Mark, make a copy in prefix.mark
	 * get the target function using FuncitionExtractor, the entire function String
	 * Using state to obtain input and output variables and its types
	 * make a copy prefix_copy.c of original source file, and insert input and put statements
	 * @return
	 */
	private String insertStateStatements(String original) {
		String markFile = insertMark(original);
		String target = getFunction(markFile);
		System.out.println(target);
		String[] states = getStatesStatement(target);
//		return writeStatesStatement(states);
		return markFile;
	}

	private String[] getStatesStatement(String target) {
		String[] states = new String[2];
		try{
			//target = Utility.getStringFromFile(this.casePrefix + ".c");
			InputStream stream = new ByteArrayInputStream(target.getBytes());
			ANTLRInputStream input = new ANTLRInputStream(stream);
			FunctionLexer lexer = new FunctionLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FunctionParser parser = new FunctionParser(tokens);
			System.out.println(parser.prog().function().block().getText());
			
		}catch(Exception e){
			
		}
		return states;
	}

	/**
	 * extract the target function, whose name is the same as casePrefix
	 * @param markFile
	 * @return
	 */
	private String getFunction(String markFile) {
		String output = "";
		try{
			String file = Utility.getStringFromFile(markFile);
			InputStream stream = new ByteArrayInputStream(file.getBytes());
			ANTLRInputStream input = new ANTLRInputStream(stream);
			FunctionExtractorLexer lexer = new FunctionExtractorLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			FunctionExtractorParser parser = new FunctionExtractorParser(tokens);
			ProgContext con = parser.prog();
			for(FunctionDefinitionContext fun : con.functionDefinition()){
				//fun.declarator().
				String functionName = this.casePrefix.substring(this.casePrefix.lastIndexOf("/") + 1);
				if(fun.declarator().directDeclarator().directDeclarator().getText().equals(functionName)){
					output = fun.getText();
					break;
				}
			}
		}catch(Exception e){
			return "";
		}
		return output;
	}

	/**
	 * insert mark, and erase include statement, write the content into this.casePrefix.mark
	 * @param original
	 * @return
	 */
	private String insertMark(String original) {
		String output = this.casePrefix + ".mark";
		try{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.casePrefix + ".c")));
			String s = null;
			
			boolean find = false;
			String function = " " + this.casePrefix.substring(this.casePrefix.lastIndexOf("/") + 1) + "(";
			
			for(int i = 1; i < buggy[0]; i++){
				s = reader.readLine();
				if(s.trim().startsWith("#")) continue;
				//if(!find && !s.contains(function)) continue;
				find = true;
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			
			writer.write(CaseInfo.MARKINPUT);
			writer.write("\n");
			writer.flush();
			
			for(int i = buggy[0]; i <= buggy[1]; i++){
				s = reader.readLine();
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			writer.write(CaseInfo.MARKOUTPUT);
			writer.write("\n");
			writer.flush();
			
			while((s = reader.readLine()) != null){
				writer.write(s);
				writer.write("\n");
				writer.flush();
			}
			reader.close();
			writer.close();
		}catch(Exception e){
			return "";
		}
		return output;
	}

	
	/**
	 * get input/output pairs, and buggy lines info
	 * @param caseFile
	 */
	private void parse(String caseFile) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caseFile)));
			String line = null;
			boolean neg = false;
			while((line = br.readLine()) != null){
				line = line.trim();
				if(line.startsWith("positive:")){
					neg = false;
				}
				else if(line.startsWith("negative:")){
					neg = true;
				}
				else if(line.startsWith("buggy lines:")){
					String[] lines = line.substring(12).split("-");
					buggy[0] = Integer.valueOf(lines[0]);
					buggy[1] = Integer.valueOf(lines[1]);
				}
				else if(line.startsWith("input:")){
					int index = line.indexOf("output:");
					String input = line.substring(6, index);
					String output = line.substring(index + 7);
					if(neg){
						this.negatives.put(input.trim(), output.trim());
					}
					else{
						this.positives.put(input.trim(), output.trim());
					}
				}
				else{
					continue;
				}
			}
			br.close();
		}catch(Exception e){
			return;
		}
		
	}

	public String getCasePrefix() {
		return casePrefix;
	}

	public void setCasePrefix(String casePrefix) {
		this.casePrefix = casePrefix;
	}

	public Map<String, String> getPositives() {
		return positives;
	}

	public void setPositives(Map<String, String> positives) {
		this.positives = positives;
	}

	public Map<String, String> getNegatives() {
		return negatives;
	}

	public void setNegatives(Map<String, String> negatives) {
		this.negatives = negatives;
	}

	public SearchCase getSearchBag() {
		return searchBag;
	}

	public void setSearchBag(SearchCase searchBag) {
		this.searchBag = searchBag;
	}

	public int[] getBuggy() {
		return buggy;
	}

	public void setBuggy(int[] buggy) {
		this.buggy = buggy;
	}
	
	public void print(){
		System.out.println("positive:");
		for(String s : this.positives.keySet()){
			System.out.println("input: " + s + ";");
			System.out.println("output: " + this.positives.get(s) + ";");
		}
		System.out.println("negative:");
		for(String s : this.negatives.keySet()){
			System.out.println("input: " + s + ";");
			System.out.println("output: " + this.negatives.get(s) + ";");
		}
		
		System.out.println("buggy lines:");
		System.out.println("" + buggy[0] + "-" + buggy[1]);
	}
	
	public static void main(String[] args){
		CaseInfo case1 = new CaseInfo("TestCases/test/case1");
		//case1.print();
	}

}
