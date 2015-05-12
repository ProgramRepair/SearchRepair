package scraper;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import scraper.ScrapeParser.AssignStatContext;
import scraper.ScrapeParser.Assign_expressionContext;
import scraper.ScrapeParser.AtomContext;
import scraper.ScrapeParser.DeclarationStatContext;
import scraper.ScrapeParser.ElseifblockContext;
import scraper.ScrapeParser.If_statContext;
import scraper.ScrapeParser.ProgContext;
import scraper.ScrapeParser.ReturnStatContext;
import scraper.ScrapeParser.StatContext;
import Library.Utility;


public class Scraper {
	private String folder;
	private String projecName;
	private static final String scrapRoot = "./repository/scraper";
	private String returnType;
	
	
	public Scraper(String folder) {
		super();
		this.folder = folder;
		int temp = this.folder.substring(0, this.folder.lastIndexOf("/")).lastIndexOf("/");
		this.projecName = this.folder.substring(temp + 1);
		this.returnType = "void";
		File dir = new File(scrapRoot + "/" + projecName);
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdir();
		}
		//scrape(new File(folder));
	}
	
	public List<String> scrape(){
		return scrape(new File(this.folder));
	}

	public  List<String> scrape(File dir){
		List<String> list = new ArrayList<String>();
		for(File file : dir.listFiles()){
			getSupport(file, list);
		}
		return list;
	}
	
	public  List<String> scrape(String filePath){
		List<String> list = new ArrayList<String>();
//		for(File file : dir.listFiles()){
			getSupport(new File(filePath), list);
//		}
		return list;
	}
	
	private  void getSupport(File file, List<String> list) {
		if(file.isDirectory()){
			for(File g : file.listFiles()){
				getSupport(g, list);
			}
		}
		else{
			parse(file, list);
		}
		
	}

	private  void parse(File file, List<String> list) {
		if(!file.getAbsolutePath().endsWith(".c")) return;
		String fileString = Utility.getStringFromFile1(file.getAbsolutePath());
		List<String> array = new ArrayList<String>();
		
		int start = -1;
		int end = -1;
		Stack<Character> stack = new Stack<Character>();
		Stack<Integer> index = new Stack<Integer>();
		for(int i = 0; i < fileString.length(); i++)
		{
			char c = fileString.charAt(i);
			if(c == '{' ){
				stack.add(c);
				index.push(i);
			}
			else if(c == '}'){
				if(stack.isEmpty()) {
					index.clear();
					continue;
				}
				stack.pop();
				int temp = index.pop();
				if(stack.isEmpty()){
					start = temp;
					end = i;
					start = fileString.substring(0, start - 1).lastIndexOf('}');
					//System.out.println(fileString.substring(start + 1, end + 1));
					array.add (fileString.substring(start + 1, end + 1));
				}				
			}
		}
		
		for(String target : array){
			try{
				//System.out.println(target);
				//target = Utility.getStringFromFile(this.casePrefix + ".c");
				InputStream stream = new ByteArrayInputStream(target.getBytes());
				ANTLRInputStream input = new ANTLRInputStream(stream);
				ScrapeLexer lexer = new ScrapeLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ScrapeParser parser = new ScrapeParser(tokens);
				ProgContext prog = parser.prog();
				//List<StatContext> stats = prog.stat();
				List<StatContext> stats = prog.stat();;
				for(StatContext con : stats){
					ParseTree child = con.getChild(0);
					if(child instanceof DeclarationStatContext){
						list.add(getTreeString(child) + ";");
					}
					else if(child instanceof AssignStatContext){
						AssignStatContext assign = (AssignStatContext) child;
						list.add(getTreeString(child) + ";");
					}
					else if(child instanceof If_statContext) {
						If_statContext ifstat = (If_statContext) child;
						list.add(getTreeString(ifstat));
					}
					else if(child instanceof ReturnStatContext){
						ReturnStatContext returnStat = (ReturnStatContext) child;
						list.add(getTreeString(child) + ";");
					}
					else{
						//do nothing
					}
				}
				//if(!g) continue;
				//for()
				//System.out.println(parser.prog().function().block().getText());
				//list.add(target);

//				}
//				
			}catch(Exception e){
				continue;
			}
		}
		//
		
		int i = 0;
		for(String s : list){
			//System.out.println(s);
			if(i > 5000){
				return;
			}
			generate(scrapRoot + "/" + this.projecName + "/test" + i++ + ".c", s);
		}
		
	}
	


	public   String getTreeString(ParseTree root){
		StringBuilder sb = new StringBuilder();
		if(root.getChildCount() == 0) return root.getText();
		for(int i = 0; i < root.getChildCount(); i++){
			ParseTree child = root.getChild(i);
			//System.out.println(child.getText());
			sb.append(getTreeString(child) + " ");
		}
		return sb.toString();
	}

	
	public String getTreeString(If_statContext ifstat){
		StringBuilder sb = new StringBuilder();
		sb.append(getTreeString(ifstat.ifpart()));
		if(ifstat.elseifpart() != null){
			sb.append(getTreeString(ifstat.elseifpart().elseifblock()));
		}
		
		if(ifstat.elsepart() != null){
			sb.append(getTreeString(ifstat.elsepart()));
		}
		return sb.toString();
	}
	
	private Object getTreeString(List<ElseifblockContext> elseifblock) {
		StringBuilder sb = new StringBuilder();
		for(ElseifblockContext block : elseifblock){
			sb.append(getTreeString(block));
		}
		return sb.toString();
	}

	public   void generate(String file, String s){
		Map<String, String> variables = getUndeclaredVariable(s);
		//if(!s.trim().startsWith("publish")) return;
		if(variables.keySet().isEmpty()) return;
		String param = generateHead(variables);
		String methodName = "test";
		String functionType = getFunctionType(s);
		String function = functionType + " " + methodName + param + "{\n" + s + "}";
		try {
			File temp = new File(file);
			if(temp.exists()) temp.delete();
			temp.createNewFile();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(temp)));
			bw.write(function);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	private  String getFunctionType(String s) {
		return s.contains("return") ? this.returnType : "void";
	}

	private  String generateHead(Map<String, String> variables) {
		String s = "(";
		for(String v : variables.keySet()){
			s = s  +  variables.get(v) + " "+ v + ", ";
		}
		s = s.substring(0, s.length() - 2) + ")";
		return s;
	}

	private  Map<String, String> getUndeclaredVariable(String s) {
		Map<String, String> list = new HashMap<String, String>();
		Map<String, String> declared = new HashMap<String, String>();
		try{
			InputStream stream = new ByteArrayInputStream(s.getBytes());
			ANTLRInputStream input = new ANTLRInputStream(stream);
			ScrapeLexer lexer = new ScrapeLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ScrapeParser parser = new ScrapeParser(tokens);
			ProgContext prog = parser.prog();
			List<StatContext> stats = prog.stat();
			for(StatContext con : stats){
				ParseTree child = con.getChild(0);
				if(child instanceof DeclarationStatContext){
					DeclarationStatContext decStat = (DeclarationStatContext) child;
					declared.put(decStat.ID().getText(), decStat.type().getText());
					//list.add(getTreeString(child) + ";");
				}
				else if(child instanceof AssignStatContext){
					AssignStatContext assign = (AssignStatContext) child;
					//list.add(getTreeString(child) + ";");
					if(assign.type() == null){
						String id = assign.ID().getText();
						String type = speculateType(assign.assign_expression(), declared);
						list.put(id, type);
						update(assign.assign_expression(), list, declared, type);
					}
					else{
						declared.put(assign.ID().getText(), assign.type().getText());
						update(assign.assign_expression(), list, declared, assign.type().getText());
					}
					
				}
				else if(child instanceof If_statContext) {
					
					If_statContext ifstat = (If_statContext) child;
					update(ifstat, list, declared, "int");
					//list.add(getTreeString(child));
				}
				else if(child instanceof ReturnStatContext){
					//update
					this.returnType = "int";
					ReturnStatContext returnStat = (ReturnStatContext) child;
					updateOnReturn(returnStat.arith_expression(), list, declared, "int");
					//list.add(getTreeString(child) + ";");
				}
				else{
					return list;
				}
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}
		return list;
	}

	private String speculateType(
			Assign_expressionContext assign_expression, Map<String, String> declared) {
		for(int i = 0; i < assign_expression.getChildCount(); i++){
			ParseTree tree = assign_expression.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				String id = atom.ID().getText();
				if(declared.containsKey(id)) return declared.get(id);
			}
			else{
				String temp = speculateType(tree, declared);
				if(temp != null) return temp;
			}
		}
		return "int";
	}
	// no if stat for sure, not statement for sure, as a complement method for speculateType(assign_expression)
	private  String speculateType(ParseTree tree,
			Map<String, String> declared) {
		for(int i = 0; i < tree.getChildCount(); i++){
			ParseTree child = tree.getChild(i);
			if(child instanceof AtomContext){
				AtomContext atom = (AtomContext) child;
				if(atom.ID() == null) continue;
				String id = atom.ID().getText();
				if(declared.containsKey(id)) return declared.get(id);
			}
			else{
				String temp = speculateType(child, declared);
				if(temp != null) return temp;
			}
		}
		return null;
	}

	private   void update(If_statContext ifstat, Map<String, String> list, Map<String, String> declared, String backType) {
		for(int i = 0; i < ifstat.getChildCount(); i++){
			ParseTree tree = ifstat.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				if(atom.ID() == null) continue;
				String id = atom.ID().getText();
				if(!declared.containsKey(id)) list.put(id, backType);
			}
			else{
				update(tree, list, declared, backType);
			}
		}
		
	}

	private  void updateOnReturn(ParseTree parseTree,
			Map<String, String> list, Map<String, String> declared, String backType) {
		for(int i = 0; i < parseTree.getChildCount(); i++){
			ParseTree tree = parseTree.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				if(atom.ID() == null) continue;
				String id = atom.ID().getText();
				if(!declared.containsKey(id)) list.put(id, backType);
				else this.returnType = declared.get(id);
			}
			else{
				updateOnReturn(tree, list, declared, backType);
			}
		}
		//return "in"
		
	}

	//no statement for sure and no if block
	private   void update(Assign_expressionContext assign_expression,
			Map<String, String> list, Map<String, String> declared, String typeBack) {
		for(int i = 0; i < assign_expression.getChildCount(); i++){
			ParseTree tree = assign_expression.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				if(atom.ID() == null) continue;
				String id = atom.ID().getText();
				if(!declared.containsKey(id)) list.put(id, typeBack);
			}
			else{
				update(tree, list, declared, typeBack);
			}
		}
		
	}

	//no statement and no if in this tree
	private   void update(ParseTree tree, Map<String, String> list, Map<String, String> declared, String typeBack) {
		for(int i = 0; i < tree.getChildCount(); i++){
			ParseTree child = tree.getChild(i);
			if(child instanceof AtomContext){
				AtomContext atom = (AtomContext) child;
				if(atom.ID() == null) continue;
				String id = atom.ID().getText();
				if(!declared.containsKey(id)) list.put(id, typeBack);
			}
			else if(child instanceof AssignStatContext){
				AssignStatContext assign = (AssignStatContext) child;
				//list.add(getTreeString(child) + ";");
				if(assign.type() == null){
					String type = speculateType(assign.assign_expression(), declared);
					if(!declared.containsKey(assign.ID().getText())){
					
						list.put(assign.ID().getText(),type);
					}
					update(assign.assign_expression(), list, declared, type);
				}
				else{
					declared.put(assign.ID().getText(), assign.type().getText());
					update(assign.assign_expression(), list, declared, typeBack);
				}
			}
			else if (child instanceof DeclarationStatContext){
				DeclarationStatContext decl = (DeclarationStatContext) child;
				declared.put(decl.ID().getText(), decl.type().getText());
			}
			else{
				update(child, list, declared, typeBack);
			}
		}
		
	}

	public static void main(String[] args){
		List<String> list = new Scraper("./bughunt/syllables/33").scrape("./bughunt/syllables/33/syllables.c");
		for(String s : list){
			System.out.println("------------");
			System.out.println(s);
		}
		//System.out.println(scrape(new File("./project-euler-c")));
	}
}
