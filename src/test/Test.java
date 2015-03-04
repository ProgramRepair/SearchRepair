package test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import Library.Utility;
import antlr.preprocess.ConditionLexer;
import antlr.preprocess.ConditionParser;




public class Test {
	
	
	@org.junit.Test
	public void test1() throws IOException{
		String file = Utility.getStringFromFile("TestCases/condition/test");
		InputStream stream = new ByteArrayInputStream(file.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(stream);
		Map<String, String> map = new HashMap<String, String>();
		map.put("a","b");
		ConditionLexer lexer = new ConditionLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ConditionParser parser = new ConditionParser(tokens);
		//parser.
		//System.out.println(parser.getTokenType("int"));
		//p
	}

}
