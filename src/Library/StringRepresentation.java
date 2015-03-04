package Library;

import java.util.ArrayList;
import java.util.List;


/**
 * this is used to interpret a c string by z3
 * @author yke
 *
 */
public class StringRepresentation {
	private String name;
	private String content;
	private List<String> constraints;
	private String declareConstraint;
	public StringRepresentation(String name, String content){
		this.name = name;
		this.content = content;
		constraints = new ArrayList<String>();
		generateConstraints();
	}
	
	
			



	/**
	 * be careful, there is no declaration cosntraint in this set
	 * @return
	 */
	public List<String> getConstraints() {
		return constraints;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public void setConstraints(List<String> constraints) {
		this.constraints = constraints;
	}

	
	public void print(){
		for(String constraint : this.constraints){
			System.out.println(constraint);
		}
	}




	private void generateConstraints(){
		this.declareConstraint = getDeclareConstraint(name);
		//constraints.add(getDeclareConstraint(name));
		constraints.add(getLengthConstraints(name, content));
		for(int i = 0; i < content.length(); i++){
			constraints.add(getCharOfConstraint(name, content,i));
		}
	}
	
	
	public  String getDeclareConstraint(String name){
		String constraint = "(declare-fun " + name + " () String)";
		return constraint;
	}
	
	public static String getCharOfConstraint(String name, String content, int index){
		String constraint = "(assert (= (charOf " + name +  " " + index + ") " + encodeLetter(content.charAt(index)) + " ))";
		return constraint;
	}
	
	public String toString(){
		String s = "";
		for(String str : constraints){
			s = s + str + "\n";
		}
		return s;
	}
	
	
	
	public static String getLengthConstraints(String name, String content){
		String constraint = "(assert (= (length " + name + ") " + content.length() + "))";
		return constraint;
	}
	
	public static void main(String[] args){
		StringRepresentation g = new StringRepresentation("c", "ababc");
		System.out.println(g);
//		getCharToInt();
	}
	
	
	public static String encodeLetter(char c) {
		if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e'
				|| c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j'
				|| c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o'
				|| c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't'
				|| c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
				|| c == 'z' || c == 'A' || c == 'B' || c == 'C' || c == 'D'
				|| c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
				|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N'
				|| c == 'O' || c == 'P' || c == 'Q' || c == 'R' || c == 'S'
				|| c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X'
				|| c == 'Y' || c == 'Z' || c == '1' || c == '2' || c == '3'
				|| c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9' || c == '0') {
			return "_" + c + "_";
		} else if (c == ':' || c == '/' || c == '_' || c == ',' || c == '.'
				|| c == '\\' || c == '\'' || c == '"' || c == '-' || c == ' '
				|| c == '?' || c == '(' || c == ')' || c == ';' || c == '{'
				|| c == '@' || c == '}' || c == '=' || c == '[' || c == '%'
				|| c == ']' || c == '&' || c == '!' || c == '#' || c == '+'
				|| c == '*' || c == '^' || c == '~' || c == '`' || c == '<'
				|| c == '>' || c == '|' || c == '$' || c == '\n' || c == '\b'
				|| c == '\t' || c == '\f' || c == '\r') {
			switch (c) {
			case '|':
				return "_mid_";
			case '+':
				return "_plus_";
			case '*':
				return "_star_";
			case '^':
				return "_carrot_";
			case '~':
				return "_tilde_";
			case '`':
				return "_backtick_";
			case '<':
				return "_langle_";
			case '>':
				return "_rangle_";
			case ':':
				return "_colon_";
			case '/':
				return "_fwdslash_";
			case '_':
				return "_underscore_";
			case ',':
				return "_comma_";
			case '.':
				return "_period_";
			case '"':
				return "_dblquote_";
			case '\'':
				return "_siglequote_";
			case '\\':
				return "_backslash_";
			case '-':
				return "_dash_";
			case ' ':
				return "_space_";
			case '?':
				return "_question_";
			case '(':
				return "_openparen_";
			case ')':
				return "_closeparen_";
			case ';':
				return "_semicolon_";
			case '{':
				return "_lcurly_";
			case '}':
				return "_rcurly_";
			case '=':
				return "_equals_";
			case '@':
				return "_at_";
			case '[':
				return "_lbracket_";
			case ']':
				return "_rbracket_";
			case '&':
				return "_amp_";
			case '!':
				return "_excl_";
			case '#':
				return "_pound_";
			case '%':
				return "_percent_";
			case '$':
				return "_dollar_";
			case '\n':
				return "_newline_";
			case '\t':
				return "_tab_";
			case '\r':
				return "_return_";
			case '\f':
				return "_slashf_";
			case '\b':
				return "_slashb_";
			}
		}
		//System.err.println("Unsupported: " + c);
		return "";
	}
	
	public static void getCharToInt(){
		for(int i = 0; i < 256; i++)
		{
			char c = (char)i;
			String g = encodeLetter(c);
			if(g.length() != 0)System.out.println("(assert (= " +  encodeLetter(c) + " " + i + "))");
		}
	}

}
