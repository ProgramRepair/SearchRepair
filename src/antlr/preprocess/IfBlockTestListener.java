// Generated from IfBlockTest.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfBlockTestParser}.
 */
public interface IfBlockTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull IfBlockTestParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull IfBlockTestParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(@NotNull IfBlockTestParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(@NotNull IfBlockTestParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull IfBlockTestParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull IfBlockTestParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull IfBlockTestParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull IfBlockTestParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull IfBlockTestParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull IfBlockTestParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull IfBlockTestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull IfBlockTestParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull IfBlockTestParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull IfBlockTestParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#callStat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull IfBlockTestParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#callStat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull IfBlockTestParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull IfBlockTestParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull IfBlockTestParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStat(@NotNull IfBlockTestParser.DeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStat(@NotNull IfBlockTestParser.DeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull IfBlockTestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull IfBlockTestParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull IfBlockTestParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull IfBlockTestParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmAssignOperator(@NotNull IfBlockTestParser.ArithmAssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmAssignOperator(@NotNull IfBlockTestParser.ArithmAssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull IfBlockTestParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull IfBlockTestParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void enterSelfIncreStat(@NotNull IfBlockTestParser.SelfIncreStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void exitSelfIncreStat(@NotNull IfBlockTestParser.SelfIncreStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncreOperator(@NotNull IfBlockTestParser.IncreOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncreOperator(@NotNull IfBlockTestParser.IncreOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull IfBlockTestParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull IfBlockTestParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull IfBlockTestParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull IfBlockTestParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull IfBlockTestParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull IfBlockTestParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull IfBlockTestParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull IfBlockTestParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull IfBlockTestParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull IfBlockTestParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull IfBlockTestParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull IfBlockTestParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull IfBlockTestParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull IfBlockTestParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull IfBlockTestParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull IfBlockTestParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull IfBlockTestParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull IfBlockTestParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull IfBlockTestParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull IfBlockTestParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull IfBlockTestParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull IfBlockTestParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull IfBlockTestParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull IfBlockTestParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull IfBlockTestParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull IfBlockTestParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfBlockTestParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull IfBlockTestParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfBlockTestParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull IfBlockTestParser.If_statContext ctx);
}