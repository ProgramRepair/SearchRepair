package Library;

public class CharMethodTranslator {
	
	//int newId =  isdigit ( int c );
	public static String getIsDigitConstraint(String left, String right){
		String condition = "(and (> " + right + " 47 ) ( < " + right + " 58)" + ")";
		String constraint = "(assert (= " + left +  "(ite " + condition +  " 1 0) ))";
		return constraint;
	}
	
	//int isupper ( int c );
	public static String getIsUpperConstraint(String left, String right){
		String condition = "(and (> " + right + " 64 ) ( < " + right + " 91)" + ")";
		String constraint = "(assert (= " + left +  "(ite " + condition +  " 1 0) ))";
		return constraint;
	}
	
	//int islower ( int c );
	public static String getIsLowerConstraint(String left, String right){
		String condition = "(and (> " + right + " 96 ) ( < " + right + " 123)" + ")";
		String constraint = "(assert (= " + left +  "(ite " + condition +  " 1 0) ))";
		return constraint;
	}
	
	//int toUpper ( int c );
	public static String getToUpperConstraint(String left, String right){
		String condition = "(and (<= " + right + " 96 ) ( >= " + right + " 123)" + ")";
		String result = "(= " + left + " " + right + ")" + " (= " +  left + " " + "(- " + right + " 32))";
		String constraint = "(assert (ite " + condition +  " " + result + " ))";
		return constraint;
	}
	
	
	//int toLower ( int c );
	public static String getToLowerConstraint(String left, String right){
		String condition = "(and (<= " + right + " 64 ) ( >= " + right + " 91)" + ")";
		String result = "(= " + left + " " + right + ")" + " (= " +  left + " " + "(+ " + right + " 32))";
		String constraint = "(assert (ite " + condition +  " " + result + " ))";
		return constraint;
	}
	
	public static void main(String[] args){
		System.out.println(CharMethodTranslator.getToLowerConstraint("y", "x"));
	}
}
