package scraper;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import scraper.ScrapeParser.Arith_expressionContext;
import scraper.ScrapeParser.AssignStatContext;
import scraper.ScrapeParser.Assign_expressionContext;
import scraper.ScrapeParser.AtomContext;
import scraper.ScrapeParser.DeclarationStatContext;
import scraper.ScrapeParser.If_statContext;
import scraper.ScrapeParser.ProgContext;
import scraper.ScrapeParser.ReturnStatContext;
import scraper.ScrapeParser.StatContext;
import Library.Utility;


public class Scraper {
	public  static  List<String> scrape(File dir){
		List<String> list = new ArrayList<String>();
		for(File file : dir.listFiles()){
			getSupport(file, list);
		}
		return list;
	}
	
	private static void getSupport(File file, List<String> list) {
		if(file.isDirectory()){
			for(File g : file.listFiles()){
				getSupport(g, list);
			}
		}
		else{
			parse(file, list);
		}
		
	}

	private static void parse(File file, List<String> list) {
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
				//target = Utility.getStringFromFile(this.casePrefix + ".c");
				InputStream stream = new ByteArrayInputStream(target.getBytes());
				ANTLRInputStream input = new ANTLRInputStream(stream);
				ScrapeLexer lexer = new ScrapeLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ScrapeParser parser = new ScrapeParser(tokens);
				ProgContext prog = parser.prog();
				//List<StatContext> stats = prog.stat();
				List<StatContext> stats = prog.stat();
				int i = 0;
				boolean g = true;
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
						list.add(getTreeString(child));
					}
					else if(child instanceof ReturnStatContext){
						ReturnStatContext returnStat = (ReturnStatContext) child;
						list.add(getTreeString(child) + ";");
					}
					else{
						g = false;
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
			generate("./repository/scrape/test" + i++ + ".c", s);
		}
		
	}
	


	public static String getTreeString(ParseTree root){
		StringBuilder sb = new StringBuilder();
		if(root.getChildCount() == 0) return root.getText();
		for(int i = 0; i < root.getChildCount(); i++){
			ParseTree child = root.getChild(i);
			System.out.println(child.getText());
			sb.append(getTreeString(child) + " ");
		}
		return sb.toString();
	}

	
	public static void generate(String file, String s){
		Set<String> variables = getUndeclaredVariable(s);
		if(variables.isEmpty()) return;
		String param = generateHead(variables);
		String methodName = "test";
		String functionType = getFunctionType(s);
		String function = functionType + " " + methodName + param + "{\n" + s + "}";
		try {
			File temp = new File(file);
			if(!temp.exists()) temp.createNewFile();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(temp)));
			bw.write(function);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static String getFunctionType(String s) {
		if(s.contains("return")) return "int";
		else return "void";
	}

	private static String generateHead(Set<String> variables) {
		String s = "(";
		for(String v : variables){
			s = s + "int " + v + ", ";
		}
		s = s.substring(0, s.length() - 2) + ")";
		return s;
	}

	private static Set<String> getUndeclaredVariable(String s) {
		Set<String> list = new HashSet<String>();
		Set<String> declared = new HashSet<String>();
		try{
			InputStream stream = new ByteArrayInputStream(s.getBytes());
			ANTLRInputStream input = new ANTLRInputStream(stream);
			ScrapeLexer lexer = new ScrapeLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ScrapeParser parser = new ScrapeParser(tokens);
			ProgContext prog = parser.prog();
			List<StatContext> stats = prog.stat();
			StatContext con = stats.get(0);
			ParseTree child = con.getChild(0);
			if(child instanceof DeclarationStatContext){
				//list.add(getTreeString(child) + ";");
			}
			else if(child instanceof AssignStatContext){
				AssignStatContext assign = (AssignStatContext) child;
				//list.add(getTreeString(child) + ";");
				if(assign.type() == null){
					list.add(assign.ID().getText());
					update(assign.assign_expression(), list, declared);
				}
				else{
					declared.add(assign.ID().getText());
					update(assign.assign_expression(), list, declared);
				}
				
			}
			else if(child instanceof If_statContext) {
				If_statContext ifstat = (If_statContext) child;
				update(ifstat, list, declared);
				//list.add(getTreeString(child));
			}
			else if(child instanceof ReturnStatContext){
				//update
				ReturnStatContext returnStat = (ReturnStatContext) child;
				update(returnStat.arith_expression(), list, declared);
				//list.add(getTreeString(child) + ";");
			}
			else{
				return list;
			}
			
			
		}catch(Exception e){
			return list;
		}
		return list;
	}

	private static void update(If_statContext ifstat, Set<String> list, Set<String> declared) {
		for(int i = 0; i < ifstat.getChildCount(); i++){
			ParseTree tree = ifstat.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				String id = atom.ID().getText();
				if(!declared.contains(id)) list.add(id);
			}
			else{
				update(tree, list, declared);
			}
		}
		
	}

	private static void update(Arith_expressionContext arith_expression,
			Set<String> list, Set<String> declared) {
		for(int i = 0; i < arith_expression.getChildCount(); i++){
			ParseTree tree = arith_expression.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				String id = atom.ID().getText();
				if(!declared.contains(id)) list.add(id);
			}
			else{
				update(tree, list, declared);
			}
		}
		
	}

	private static void update(Assign_expressionContext assign_expression,
			Set<String> list, Set<String> declared) {
		for(int i = 0; i < assign_expression.getChildCount(); i++){
			ParseTree tree = assign_expression.getChild(i);
			if(tree instanceof AtomContext){
				AtomContext atom = (AtomContext) tree;
				String id = atom.ID().getText();
				if(!declared.contains(id)) list.add(id);
			}
			else{
				update(tree, list, declared);
			}
		}
		
	}

	private static void update(ParseTree tree, Set<String> list,
			Set<String> declared) {
		for(int i = 0; i < tree.getChildCount(); i++){
			ParseTree child = tree.getChild(i);
			if(child instanceof AtomContext){
				AtomContext atom = (AtomContext) child;
				String id = atom.ID().getText();
				if(!declared.contains(id)) list.add(id);
			}
			else if(child instanceof AssignStatContext){
				AssignStatContext assign = (AssignStatContext) child;
				//list.add(getTreeString(child) + ";");
				if(assign.type() == null){
					if(!declared.contains(assign.ID().getText()))list.add(assign.ID().getText());
					update(assign.assign_expression(), list, declared);
				}
				else{
					declared.add(assign.ID().getText());
					update(assign.assign_expression(), list, declared);
				}
			}
			else if (child instanceof DeclarationStatContext){
				DeclarationStatContext decl = (DeclarationStatContext) child;
				declared.add(decl.ID().getText());
			}
			else{
				update(child, list, declared);
			}
		}
		
	}

	public static void main(String[] args){
		List<String> list = scrape(new File("./project-euler-c"));
		for(String s : list){
			System.out.println("------------");
			System.out.println(s);
		}
		//System.out.println(scrape(new File("./project-euler-c")));
	}
}
