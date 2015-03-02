package Repository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import antlr.preprocess.PathParser.DeclarationStatContext;
import antlr.preprocess.PathParser.DefExprContext;
import antlr.preprocess.PathParser.ExprContext;
import antlr.preprocess.PathParser.FormalArgumentContext;
import antlr.preprocess.PathParser.ProgContext;
import antlr.preprocess.PathParser.ReturnStatContext;
import antlr.preprocess.PathParser.StatementContext;

public class PathTranslator {
	
	private String path;
	private String[] formalVariables;
	private Map<String, String> variableTrack;
	private Map<String, String> variableType;
	private Map<String, String> variableMap;
	private List<String> ssa ;
	//for generating new name only
	private String fileName;
	private int count;
	
	
	
	
	
	
	public PathTranslator(String path, String formalVariables) {
		super();
		this.path = path;
		//System.out.println(formalVariables);
		System.out.println(path);
		this.formalVariables = formalVariables.split("\n");
		this.count = 0;
		this.fileName = "_test_";
		this.ssa = new ArrayList<String>();
		this.variableMap = new HashMap<String, String>();
		this.variableTrack = new HashMap<String, String>();
		this.variableType = new HashMap<String, String>();
		applySSA();
	}
	
	
	
	

	private void applySSA() {
		//add formal parameters
		
		trackFormal();
		
		InputStream stream = new ByteArrayInputStream(path.getBytes());
		try {
			ANTLRInputStream input = new ANTLRInputStream(stream);
			PathLexer lexer = new PathLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			PathParser parser = new PathParser(tokens);
			ProgContext prog = parser.prog();
			List<StatementContext> statements = prog.statement();
			convertStatementToConstraints(statements);
			
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
	}





	private void trackFormal() {
		for(String formal : this.formalVariables){
			String type = formal.split(" ")[0];
			String id = formal.split(" ")[1];
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
//					ReturnStatContext c = (ReturnStatContext) child;
//					convert(c);
				} else if (child instanceof AssumeStatContext) {
					AssumeStatContext c = (AssumeStatContext) child;
					convert(c);
				} else if(child instanceof CallStatContext){
					CallStatContext c = (CallStatContext) child;
					convert(c);
				}

			}

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
		String operator = assum.comparator().getText();
		String leftExpr = this.getExpr(assum.expr(0));
		String rightExpr = this.getExpr(assum.expr(1));
		String constraint = "";
		if(operator.equals("!=")){
			constraint = "(assert(not (= " + leftExpr +" "+ rightExpr + ")))";
		}
		if(operator.equals("==")){
			constraint = "(assert(= " + leftExpr +" "+ rightExpr + "))";
		}
		else{
			constraint = "(assert( " + operator + " " + leftExpr + " " + rightExpr +  " ))";
		}
		ssa.add(constraint);		
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
		if(assign.StringLiteral() != null){
			convertString(assign);
		}
		else{
			converNonString(assign);
		}
		
	}


	private void converNonString(AssignStatContext c) {
		String expr = getExpr(c.expr());
		String id = this.variableTrack.get(c.ID().getText());
		String newId = generateNewName(id);
		String constraint = "";
		if(c.assiginOperator().getText() .equals('=') ){
			constraint = "(assert(= " + newId + " " + expr + "))";
		}
		else{
			char operater = c.assiginOperator().getText().charAt(0);
			constraint = "(assert(= " + newId + "( " + operater + " " + id + " " + expr + " )))";
		}
		ssa.add(constraint);		
	}





	private void convertString(AssignStatContext c) {
		String content = c.StringLiteral().getText();
		content = content.substring(1, content.length() - 1);
		String id = c.ID().getText();
		String newId = this.generateNewName(id);
		StringRepresentation rep = new StringRepresentation(newId, content);
		//System.out.println(rep.getConstraints());
		ssa.addAll(rep.getConstraints());
		
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
				output = "(valueOf " + def.ID() +")";
			}
			else if(expr.addressExpr() != null){
				AddressExprContext add = expr.addressExpr();
				output = "(addressOf " + add.ID() + ")";
			}
			else if(expr.CharacterLiteral() != null){
				String ch = expr.CharacterLiteral().getText();
				int value = ch.charAt(1);
				return Integer.toString(value);
			}

		} else {
			return "(" + expr.getChild(1).getText() + " "
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

	
	
	public String[] getFormalVariables() {
		return formalVariables;
	}





	public void setFormalVariables(String[] formalVariables) {
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
