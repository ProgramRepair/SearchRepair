package Repository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Library.CharMethodTranslator;
import Library.StringMethodTranslator;
import Library.StringRepresentation;
import antlr.preprocess.PathLexer;
import antlr.preprocess.PathParser;
import antlr.preprocess.PathParser.AddressExprContext;
import antlr.preprocess.PathParser.AssignStatContext;
import antlr.preprocess.PathParser.AssumeStatContext;
import antlr.preprocess.PathParser.CallExprContext;
import antlr.preprocess.PathParser.CallStatContext;
import antlr.preprocess.PathParser.CondExprContext;
import antlr.preprocess.PathParser.DeclarationStatContext;
import antlr.preprocess.PathParser.DefExprContext;
import antlr.preprocess.PathParser.ExprContext;
import antlr.preprocess.PathParser.FormalArgumentContext;
import antlr.preprocess.PathParser.NotExprContext;
import antlr.preprocess.PathParser.ProgContext;
import antlr.preprocess.PathParser.ReturnStatContext;
import antlr.preprocess.PathParser.SelfIncreStatContext;
import antlr.preprocess.PathParser.StatementContext;

public class PathTranslator {
	
	private String path;
	private Map<String, String> formalVariables;
	private Map<String, String> variableTrack;
	private Map<String, String> variableType;
	private Map<String, String> variableMap;
	private List<String> ssa ;
	//for generating new name only
	private String fileName;
	private int count;
	
	private static class NullOutputStream extends OutputStream {
	    @Override
	    public void write(int b){
	         return;
	    }
	    @Override
	    public void write(byte[] b){
	         return;
	    }
	    @Override
	    public void write(byte[] b, int off, int len){
	         return;
	    }
	    public NullOutputStream(){
	    }
	}

	

	public PathTranslator(String path, String formalVariables) {
		super();
		this.path = path;
		this.count = 0;
		this.fileName = "_test_";
		this.ssa = new ArrayList<String>();
		this.variableMap = new HashMap<String, String>();
		this.variableTrack = new HashMap<String, String>();
		this.variableType = new HashMap<String, String>();
		this.formalVariables = new HashMap<String, String>();
		//init formalVariables
		for(String var : formalVariables.split("\n")){
			String id  = var.split(" ")[1];
			String type = var.split(" ")[0];
			if(id.charAt(0) == '*') {
				type = type + '*';
				id = id.substring(1);
			}
			
			this.formalVariables.put(id, type);
		}
		applySSA();
	}
	
	private PrintStream realSystemErr = System.err;
	private PrintStream nullSystemErr = new PrintStream(new NullOutputStream());

	private void applySSA() {
		//add formal parameters
		trackFormal();
		
		InputStream stream = new ByteArrayInputStream(path.getBytes());
		try {
			System.setErr(nullSystemErr);
			ANTLRInputStream input = new ANTLRInputStream(stream);
			PathLexer lexer = new PathLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			PathParser parser = new PathParser(tokens);
			ProgContext prog = parser.prog();
			List<StatementContext> statements = prog.statement();
			convertStatementToConstraints(statements);
			System.setErr(realSystemErr);

		} catch (IOException e) {
			//
			e.printStackTrace();
		}
	}





	private void trackFormal() {
		for(String id : this.formalVariables.keySet()){
			String type = this.formalVariables.get(id);
			this.variableMap.put(id, id);
			this.variableTrack.put(id, id);
			this.variableType.put(id, type);
		}
		
	}





	private void convertStatementToConstraints(List<StatementContext> statements) {
		for(StatementContext statement : statements){
			for (int i = 0; i < statement.getChildCount(); i++) {
				ParseTree child = statement.getChild(i);
				if (child instanceof DeclarationStatContext) {
					DeclarationStatContext c = (DeclarationStatContext) child;
					convert(c);
				} else if (child instanceof AssignStatContext) {
					AssignStatContext c = (AssignStatContext) child;
					convert(c);
				} else if (child instanceof ReturnStatContext) {
					//do nothing
					ReturnStatContext c = (ReturnStatContext) child;
					convert(c);
				} else if (child instanceof AssumeStatContext) {
					AssumeStatContext c = (AssumeStatContext) child;
					convert(c);
				} else if(child instanceof CallStatContext){
					CallStatContext c = (CallStatContext) child;
					convert(c);
				}
				else if(child instanceof SelfIncreStatContext){
					SelfIncreStatContext c = (SelfIncreStatContext) child;
					convert(c);
				}

			}

		}
		
	}




	private void convert(SelfIncreStatContext c) {
		String id = c.ID().getText();
		String old = this.variableTrack.containsKey(id) ? this.variableTrack.get(id) : id;
		String newId = this.generateNewName(id);
		String op = c.getChild(1).getText();
		if(op.equals("++")){
			String constraint = "(assert (= " + newId + " (+ " + old + " 1)))";
			this.ssa.add(constraint);
		}
		else{
			String constraint = "(assert (= " + newId + " (- " + old + " 1)))";
			this.ssa.add(constraint);			
		}
		
	}





	private void convert(ReturnStatContext c) {
		ExprContext con = c.expr();
		//String delcare = "(declare-fun _output_ " + 
		if(con != null){
			String constraint = "(assert ( = _output_ " + this.getExpr(con) + "))";
			ssa.add(constraint);
		}
						
	}





	//this is used just for strcpy, strncpy, strncat, strncat
	private void convert(CallStatContext callStat) {
		CallExprContext c = callStat.callExpr();
		String function = c.ID().getText();
		if(function.equals("strcpy")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getstrcpyConstraints(newDest, source);
			ssa.addAll(constraints);
		}
		else if(function.equals("strncpy")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			FormalArgumentContext argument3 = c.arguments().formalArgument(2);
			String num = argument3.ID().getText();
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getstrncpyConstraints(newDest, source, num);
			ssa.addAll(constraints);
		
		}
		else if(function.equals("strcat")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getStrcatConstraints(dest, source, newDest);
			ssa.addAll(constraints);
		
		}
		else if(function.equals("strncat")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			FormalArgumentContext argument3 = c.arguments().formalArgument(2);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String num = argument3.ID().getText();
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getStrncatConstraints(dest, source, num, newDest);
			ssa.addAll(constraints);
		}
		else{
			
		}
		
		
	}


	private void convert(AssumeStatContext assum) {
		String expr = "";
		if(assum.notExpr() != null){
			expr = getNotExprInAssum(assum.notExpr());
		}
		else if(assum.condExpr() != null){
			expr = getCondExprInAssum(assum.condExpr());
		}
		String constraint = "(assert " + expr + ")";
		ssa.add(constraint);
	}




	private String getNotExprInAssum(NotExprContext notExpr) {
		String expr = getCondExprInAssum(notExpr.condExpr());
		expr = "( not " + expr + ")";  
		return expr;
	}





	private String getCondExprInAssum(CondExprContext condExpr) {
		String left = this.getExpr(condExpr.expr(0));
		String right = this.getExpr(condExpr.expr(1));
		String output = "";
		if(condExpr.comparator() != null){
			String op = condExpr.comparator().getText();
			if(op.equals("==")){
				output = "(= " + left + " " + right + ")";
			}
			else if(op.equals("!=")){
				output = "(not (= " + left + " " + right + "))";						
			}
			else{
				output = "( " + op + " " + left + " " + right + ")";
			}
		}
		else if(condExpr.booleanOperator() != null){
			String op = condExpr.booleanOperator().getText();
			if(op.equals("&&")){
				output = "(and " + "(= " + left + " 1)" + " (= " + right + " 1))";
			}
			else if(op.equals("||")){
				output = "(or " + "(= " + left + " 1)" + " (= " + right + " 1))";
			}
		}
		return output;
	}





	//// these constraints will be generated by decl
	private void convert(DeclarationStatContext decl) {
		String type = decl.type().getText();
		if(decl.getChildCount() == 4) type = type + '*';
		String id = decl.ID().getText();
		this.variableMap.put(id, id);
		this.variableTrack.put(id, id);
		this.variableType.put(id, type);		
	}





	private void convert(AssignStatContext assign) {
		if (assign.getChildCount() == 5) {						
			covertPointerAssgin(assign);
		}
		else if(assign.getChildCount() == 4){
			convertNonPointerAssign(assign);
		}
		
	}



	private void convertNonPointerAssign(AssignStatContext assign) {
		// call assign or no call assign
		if(assign.callExpr() != null){
			String id = assign.ID().getText();
			String returnId = this.generateNewName(id);
			convert(returnId, assign.callExpr());
		}
		else{
			convertNonCallExprAssign(assign);
		}
		
	}




	private void convertNonCallExprAssign(AssignStatContext assign) {
		if(assign.StringLiteral() != null || this.variableType.get(assign.ID().getText()).equals("char*")){
			convertString(assign);
		}
		else if(assign.condExpr() != null){
			convertCondAssign(assign);
		}
		else{
			converNonString(assign);
		}
		
	}







	private void convertCondAssign(AssignStatContext assign) {
		String condExpr = getCondExprInAssign(assign.condExpr());
		String id = this.variableTrack.get(assign.ID().getText());
		String newId = generateNewName(id);
		String constraint = "";
		if(assign.assiginOperator().getText() .equals("=") ){
			constraint = "(assert(= " + newId + " " + condExpr + "))";
		}
		else{
			char operater = assign.assiginOperator().getText().charAt(0);
			constraint = "(assert(= " + newId + "( " + operater + " " + id + " " + condExpr + " )))";
		}
		ssa.add(constraint);
	}





	private String getCondExprInAssign(CondExprContext condExpr) {
		String left = this.getExpr(condExpr.expr(0));
		String right = this.getExpr(condExpr.expr(1));
		String output = "";
		if(condExpr.comparator() != null){
			String operator = condExpr.comparator().getText();
			if(operator.equals("==")){
				output = "(ite (= " + left + " " + right + ") 1 0)";
			}
			else if(operator.equals("!=")){
				output = "(ite (= " + left + " " + right + ") 0 1)";
			}
			else{
				output = "(ite (" + operator + " " + left + " " + right + ") 1 0)";
			}
		}
		else if(condExpr.booleanOperator() != null){
			String operator = condExpr.booleanOperator().getText();
			if(operator.equals("&&")){
				output = "(ite (and " + " (= " + left + " 1)" + " (= " + right + " 1)" + ") 1 0)";
			}
			else if(operator.equals("||")){
				output = "(ite (or " + " (= " + left + " 1)" + " (= " + right + " 1)" + ") 1 0)";
			}
		}
		return output;
	}







	private void converNonString(AssignStatContext c) {
		String expr = getExpr(c.expr());
		String id = this.variableTrack.get(c.ID().getText());
		String newId = generateNewName(id);
		String constraint = "";
		if(c.assiginOperator().getText() .equals("=") ){
			constraint = "(assert(= " + newId + " " + expr + "))";
		}
		else{
			char operater = c.assiginOperator().getText().charAt(0);
			constraint = "(assert(= " + newId + "( " + operater + " " + id + " " + expr + " )))";
		}
		ssa.add(constraint);		
	}





	private void convertString(AssignStatContext c) {
		if(c.StringLiteral() != null){
			String content = c.StringLiteral().getText().replace("\\n", "\n");
			content = content.substring(1, content.length() - 1);
			String id = c.ID().getText();
			String newId = this.generateNewName(id);
			StringRepresentation rep = new StringRepresentation(newId, content);
			//System.out.println(rep.getConstraints());
			ssa.addAll(rep.getConstraints());
		}
		else{
			ExprContext expr = c.expr();
			if(expr.getChildCount() == 1){
				String id = c.ID().getText();
				String newId = this.generateNewName(id);
				String constraint = "(assert (= " + newId + " " + this.getExpr(expr) + "))";
				this.ssa.add(constraint);
			}
			else{
				String id = c.ID().getText();
				String newId = this.generateNewName(id);
				String constraint = "(assert (= " + "(valueOf " + newId + ") (charOf " + this.getExpr(expr.expr(0)) + " " + this.getExpr(expr.expr(1)) + ")))";
				this.ssa.add(constraint);
			}
		}
		
	}





	//convert assign call statement
	private void convert(String returnId, CallExprContext c) {
	
		
		String function = c.ID().getText();
		if(function.equals("strcpy")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getstrcpyConstraints(newDest, source);
			ssa.addAll(constraints);
			String returnCon = "(assert (= " + returnId + " " + newDest + "))";
			ssa.add(returnCon);
		}
		else if(function.equals("strncpy")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			FormalArgumentContext argument3 = c.arguments().formalArgument(2);
			String num = argument3.ID().getText();
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getstrncpyConstraints(newDest, source, num);
			ssa.addAll(constraints);
			String returnCon = "(assert (= " + returnId + " " + newDest + "))";
			ssa.add(returnCon);			
		}
		else if(function.equals("strcat")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getStrcatConstraints(dest, source, newDest);
			ssa.addAll(constraints);
			String returnCon = "(assert (= " + returnId + " " + newDest + "))";
			ssa.add(returnCon);			
		}
		else if(function.equals("strncat")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			FormalArgumentContext argument3 = c.arguments().formalArgument(2);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String num = argument3.ID().getText();
			String newDest = generateNewName(dest);
			List<String> constraints = StringMethodTranslator.getStrncatConstraints(dest, source, num, newDest);
			ssa.addAll(constraints);
			String returnCon = "(assert (= " + returnId + " " + newDest + "))";
			ssa.add(returnCon);
		}
		else if(function.equals("strcmp")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String compare = StringMethodTranslator.getStrcmpConstraints(dest, source);
			String returnCon = "(assert (= " + returnId + " " + compare + "))";
			ssa.add(returnCon);
		}
		else if(function.equals("strncmp")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			FormalArgumentContext argument2 = c.arguments().formalArgument(1);
			FormalArgumentContext argument3 = c.arguments().formalArgument(2);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String source = this.variableTrack.get(argument2.ID().getText());
			String num = argument3.ID().getText();
			String compare = StringMethodTranslator.getStrncmpConstraints(dest, source, num);
			String returnCon = "(assert (= " + returnId + " " + compare + "))";
			ssa.add(returnCon);
		}
		else if(function.equals("strlen")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String len = StringMethodTranslator.getStrlenConstraints(dest);
			String returnCon = "(assert (= " + returnId + " " + len + "))";
			ssa.add(returnCon);
		}
		else if(function.equals("isdigit")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String result = CharMethodTranslator.getIsDigitConstraint(returnId, dest);
			
			ssa.add(result);
		}
		else if(function.equals("isupper")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String result = CharMethodTranslator.getIsUpperConstraint(returnId, dest);			
			ssa.add(result);
		}
		else if(function.equals("islower")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String result = CharMethodTranslator.getIsLowerConstraint(returnId, dest);			
			ssa.add(result);
		}
		else if(function.equals("tolower")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String result = CharMethodTranslator.getToLowerConstraint(returnId, dest);			
			ssa.add(result);
		}
		else if(function.equals("toupper")){
			FormalArgumentContext argument1 = c.arguments().formalArgument(0);
			String dest = this.variableTrack.get(argument1.ID().getText());
			String result = CharMethodTranslator.getToUpperConstraint(returnId, dest);			
			ssa.add(result);
		}
		
	}





	private void covertPointerAssgin(AssignStatContext assign) {
		String ID = assign.ID().getText();
		ExprContext temp = assign.expr();
		String id = this.variableTrack.get(ID);
		String newId = generateNewName(id);
		String constraint = "(assert (= valueOf " + newId + " " + getExpr(temp) + "))";
		ssa.add(constraint);
		
	}


	private String getExpr(ExprContext expr) {
		String output = "";
		/////
		// float, int, char, char*

		if (expr.getChildCount() == 1) {
			if ( expr.FLOAT() != null || expr.INT() != null) {
				return expr.getText().toString();
			}
			else if(expr.ID() != null){
				return this.variableTrack.get(expr.getText());
			}
			else if(expr.defExpr() != null){
				DefExprContext def = expr.defExpr();
				output = "(valueOf " + this.variableTrack.get(def.ID().getText()) +")";
			}
			else if(expr.addressExpr() != null){
				AddressExprContext add = expr.addressExpr();
				output = "(addressOf " + this.variableTrack.get(add.ID().getText()) + ")";
			}
			else if(expr.CharacterLiteral() != null){
				String ch = expr.CharacterLiteral().getText();
				int value = ch.charAt(1);
				return Integer.toString(value);
			}
			else if(expr.convertExpr() != null){
				return expr.convertExpr().ID().getText();
			}

		} else {
			String operator = expr.getChild(1).getText();
			if(operator.equals("%")) operator = "mod";
			return "(" + operator + " "
					+ getExpr(expr.expr(0)) + " " + getExpr(expr.expr(1)) + ")";
		}
		return output;
	}





	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}



	public Map<String, String> getVariableTrack() {
		return variableTrack;
	}
	public void setVariableTrack(Map<String, String> variableTrack) {
		this.variableTrack = variableTrack;
	}
	public Map<String, String> getVariableType() {
		return variableType;
	}
	public void setVariableType(Map<String, String> variableType) {
		this.variableType = variableType;
	}
	public Map<String, String> getVariableMap() {
		return variableMap;
	}
	public void setVariableMap(Map<String, String> variableMap) {
		this.variableMap = variableMap;
	}

	
	






	public Map<String, String> getFormalVariables() {
		return formalVariables;
	}





	public void setFormalVariables(Map<String, String> formalVariables) {
		this.formalVariables = formalVariables;
	}





	public List<String> getSsa() {
		return ssa;
	}





	public void setSsa(List<String> ssa) {
		this.ssa = ssa;
	}





	private String generateNewName(String dest) {
		String newName = "_" + this.fileName + "_" + count++;
//		this.variableTrack.put(dest, newName);
		this.variableTrack.put(this.variableMap.get(dest), newName);
		this.variableType.put(newName, this.variableType.get(dest));
		this.variableMap.put(newName, this.variableMap.get(dest));
		return newName;
	}
	

}
