package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import lookups.StringReturnTable;

public class StringMethodTranslator {
	
	private static int count = 0;
	
	//int strcmp(const char *str1, const char *str2)
	
	public static String getStrcmpConstraints(String left, String right){
		return compare(left, right, 0);
	}
	
	//int strncmp(const char *str1, const char *str2, size_t n)

	public static String getStrncmpConstraints(String left, String right, String n){
		
		return compareN(left, right, 0, n);
	}
	
	private static String compareN(String left, String right, int i, String n) {
		if(i > 20) return "0";
		
		//String condition = "(ite (> (length " + left + " ) ( length " +  right + ")) (length " + left + ") (length " + right + "))";
		String constraint = "(\nite\n("
								+ "\tand (< " + i +" " + n +")(= (compare " + left + " " + right + "  " + i + " ) 0)) "
								+ compareN(left, right, i + 1, n)
								+ " \n " 
									+ "\n(ite\n"
										+ "\t(= (compare " + left + " " + right + " " + i + " ) 1) "
										+ "1"
										+ "  -1)) ";
		return constraint;
	}

	private static String compare(String left, String right, int i){
		if(i > 20) return "0";
		
		String condition = "(ite (> (length " + left + " ) ( length " +  right + ")) (length " + right + ") (length " + left + "))";
		String overFlow = "(>= " + i +" " + condition +")";
		String equalResult = "(ite (= (length " + left + " ) ( length " +  right + ")) 0 -1)";
		String overResult = "(ite (> (length " + left + " ) ( length " +  right + ")) 1 " + equalResult + ")";
		String constraint = "(\nite\n("
								+ "\tand (< " + i +" " + condition +")(= (compare " + left + " " + right + "  " + i + " ) 0)) "
								+ compare(left, right, i + 1)
								+ " \n " 
									+ "(ite " + overFlow + overResult 
									+ "\n(ite\n" 
										+ "\t(= (compare " + left + " " + right + " " + i + " ) 1) "
										+ "1"
										+ "  -1)) )";
		return constraint;
										
									
	}
	
	//char *strcpy(char *dest, const char *src)
	public static List<String> getstrcpyConstraints(String dest, String srcContent){
		List<String> constraints = new ArrayList<String>();
		String assertion = "(assert (= " + dest +  " " + srcContent + "))";
		constraints.add(assertion);
		return constraints;
	}
	
	//char *strncpy(char *dest, const char *src)
	public static List<String> getstrncpyConstraints(String dest, String srcContent, String n){
		List<String> constraints = new ArrayList<String>();
		String length = "(assert (= (length "+ dest + ") " + n + "))";
		String assertion = "(assert (forall ((index Int)) (ite (and (>= index 0) (< index " + n + ")) (= (charOf " + dest + " index) (charOf " + srcContent  + " index)) true)))";
		constraints.add(length);
		constraints.add(assertion);
		return constraints;
	}
	
	
	//char * strcat ( char * destination, const char * source );
	public static List<String> getStrcatConstraints(String dest, String src, String result){
		List<String> constraints = new ArrayList<String>();
		String assertion = "(assert " + "(forall ((index Int))" + "(ite "
				+ "(and" + "(>= index 0)" + "(< index (length "
				+ dest
				+ ")))"
				+ "(= (charOf "
				+ result
				+ " index) (charOf "
				+ dest
				+ " index))"
				+ "(ite "
				+ "(and"
				+ "(>= index (length "
				+ dest
				+ "))"
				+ "(< index (+ (length "
				+ dest
				+ ") (length "
				+ src
				+ "))))"
				+ "(= (charOf "
				+ result
				+ " index) (charOf "
				+ src
				+ " (- index (length " + dest + "))))" + "true))))";
		String length = "(assert (= (length " + result + ") (+ (length " + dest
				+ ") (length " + src + "))))";
		String length2 = "(assert (>= (length " + dest + ") 0))";
		String length3 = "(assert (>= (length " + result + ") 0))";
		String length4 = "(assert (>= (length " + src + ") 0))";
		constraints.add(assertion);
		constraints.add(length);
		constraints.add(length2);
		constraints.add(length3);
		constraints.add(length4);
		return constraints;
	}
	
	//char *strncat(char *dest, const char *src, size_t n)
	public static List<String> getStrncatConstraints(String dest, String src, String n, String result){
		List<String> constraints = new ArrayList<String>();
		//String copyLengthAssertion = "(assert (= copyLength (+ (length dest) (ite (> (length src) n) (length src) n))))";
		String copyLengthAssertion = "(assert(= (length "+ result + ") " + "(+ (length " + dest +") "+ n + ")))";
		String assertion = "(assert " + "(forall ((index Int))" + "(ite "
				+ "(and" + "(>= index 0)" + "(< index (length "
				+ dest
				+ ")))"
				+ "(= (charOf "
				+ result
				+ " index) (charOf "
				+ dest
				+ " index))"
				+ "(ite "
				+ "(and"
				+ "(>= index (length "
				+ dest
				+ "))"
				+ "(< index  "
				+ dest
				+ "(length " + result + " )" + "))"
				+ "(= (charOf "
				+ result
				+ " index) (charOf "
				+ src
				+ " (- index (length " + dest + "))))" + "true))))";
		String length2 = "(assert (>= (length " + dest + ") 0))";
		String length3 = "(assert (>= (length " + result + ") 0))";
		String length4 = "(assert (>= (length " + src + ") 0))";
		constraints.add(assertion);
		constraints.add(length2);
		constraints.add(length3);
		constraints.add(length4);
		constraints.add(copyLengthAssertion);
		return constraints;
	}
	
	public static String getStrlenConstraints(String srcConstent)
	{
		String constraint =  " (length " + srcConstent + ")";
		return constraint;
	}
	
	

}
