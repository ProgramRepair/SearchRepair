package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import Library.Utility;
import antlr.preprocess.ConditionLexer;
import antlr.preprocess.ConditionParser;
import antlr.preprocess.IfBlockTestLexer;
import antlr.preprocess.IfBlockTestParser;
import antlr.preprocess.IfBlockTestParser.FunctionContext;




public class Test {
	
	public static void main(String[] args) throws IOException{
		String file = Utility.getStringFromFile("TestCases/condition/condition");
		InputStream stream = new ByteArrayInputStream(file.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(stream);
		IfBlockTestLexer lexer = new IfBlockTestLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		IfBlockTestParser parser = new IfBlockTestParser(tokens);
		//System.out.println(parser.);
		//parser.parse();
		//System.out.println(parser.if_stat().getText());
		//System.out.println(parser.prog().function().getText());
		FunctionContext sc = parser.prog().function();
		System.out.println(sc.block().getText());
		
		for(int i = 0; i < sc.getChildCount(); i++){
			System.out.println(sc.getChild(i).getText());
			System.out.println("--------------------");
		}
//		for(StatContext sc : parser.function().block().stat()){
//			System.out.println(sc.getText());
//		}

	}
	
	@org.junit.Test
	public void test1() throws IOException{
		String file = Utility.getStringFromFile("TestCases/condition/test");
		InputStream stream = new ByteArrayInputStream(file.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(stream);
		ConditionLexer lexer = new ConditionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ConditionParser parser = new ConditionParser(tokens);
		parser.arith_expression();
		//p
	}

}
