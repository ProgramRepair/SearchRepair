package InputAndOuput;

import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.preprocess.SnippetListener;
import antlr.preprocess.SnippetParser.AddOperatorContext;
import antlr.preprocess.SnippetParser.Add_expressionContext;
import antlr.preprocess.SnippetParser.And_expressionContext;
import antlr.preprocess.SnippetParser.ArgumentsContext;
import antlr.preprocess.SnippetParser.Arith_expressionContext;
import antlr.preprocess.SnippetParser.ArithmAssignOperatorContext;
import antlr.preprocess.SnippetParser.AssignStatContext;
import antlr.preprocess.SnippetParser.Assign_expressionContext;
import antlr.preprocess.SnippetParser.AtomContext;
import antlr.preprocess.SnippetParser.BlockContext;
import antlr.preprocess.SnippetParser.CallExprContext;
import antlr.preprocess.SnippetParser.CallStatContext;
import antlr.preprocess.SnippetParser.CondExprContext;
import antlr.preprocess.SnippetParser.DeclarationStatContext;
import antlr.preprocess.SnippetParser.ExprContext;
import antlr.preprocess.SnippetParser.If_statContext;
import antlr.preprocess.SnippetParser.IncreOperatorContext;
import antlr.preprocess.SnippetParser.MultiOperatorContext;
import antlr.preprocess.SnippetParser.Multi_expressionContext;
import antlr.preprocess.SnippetParser.OperatorContext;
import antlr.preprocess.SnippetParser.Or_expressionContext;
import antlr.preprocess.SnippetParser.ProgContext;
import antlr.preprocess.SnippetParser.ReturnStatContext;
import antlr.preprocess.SnippetParser.SelfIncreStatContext;
import antlr.preprocess.SnippetParser.StatContext;
import antlr.preprocess.SnippetParser.TermContext;
import antlr.preprocess.SnippetParser.TypeContext;

public class SnippetIDListener implements SnippetListener {
	
	private Map<String, String> map;
	

	public SnippetIDListener(Map<String, String> map) {
		super();
		this.map = map;
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAtom(AtomContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAtom(AtomContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAssign_expression(Assign_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAssign_expression(Assign_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMultiOperator(MultiOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMultiOperator(MultiOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterBlock(BlockContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitBlock(BlockContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterExpr(ExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterType(TypeContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitType(TypeContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCallStat(CallStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCallStat(CallStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterDeclarationStat(DeclarationStatContext ctx) {
		//ctx.get

	}

	@Override
	public void exitDeclarationStat(DeclarationStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterProg(ProgContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitProg(ProgContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAdd_expression(Add_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAdd_expression(Add_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterArithmAssignOperator(ArithmAssignOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitArithmAssignOperator(ArithmAssignOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterSelfIncreStat(SelfIncreStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitSelfIncreStat(SelfIncreStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterIncreOperator(IncreOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitIncreOperator(IncreOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAddOperator(AddOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAddOperator(AddOperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterReturnStat(ReturnStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitReturnStat(ReturnStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAssignStat(AssignStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAssignStat(AssignStatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterOr_expression(Or_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitOr_expression(Or_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCallExpr(CallExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCallExpr(CallExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterArith_expression(Arith_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitArith_expression(Arith_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterOperator(OperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitOperator(OperatorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterStat(StatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitStat(StatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAnd_expression(And_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAnd_expression(And_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTerm(TermContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTerm(TermContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterCondExpr(CondExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitCondExpr(CondExprContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMulti_expression(Multi_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMulti_expression(Multi_expressionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterIf_stat(If_statContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitIf_stat(If_statContext ctx) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
