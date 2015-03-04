// Generated from Snippet.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnippetParser}.
 */
public interface SnippetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnippetParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull SnippetParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull SnippetParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(@NotNull SnippetParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(@NotNull SnippetParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull SnippetParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull SnippetParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SnippetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SnippetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SnippetParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SnippetParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SnippetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SnippetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#callStat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull SnippetParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#callStat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull SnippetParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStat(@NotNull SnippetParser.DeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStat(@NotNull SnippetParser.DeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(@NotNull SnippetParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(@NotNull SnippetParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SnippetParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SnippetParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull SnippetParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull SnippetParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmAssignOperator(@NotNull SnippetParser.ArithmAssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmAssignOperator(@NotNull SnippetParser.ArithmAssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void enterSelfIncreStat(@NotNull SnippetParser.SelfIncreStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void exitSelfIncreStat(@NotNull SnippetParser.SelfIncreStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncreOperator(@NotNull SnippetParser.IncreOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncreOperator(@NotNull SnippetParser.IncreOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull SnippetParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull SnippetParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull SnippetParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull SnippetParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull SnippetParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull SnippetParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull SnippetParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull SnippetParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void enterIfpart(@NotNull SnippetParser.IfpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void exitIfpart(@NotNull SnippetParser.IfpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(@NotNull SnippetParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(@NotNull SnippetParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull SnippetParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull SnippetParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void enterElseifblock(@NotNull SnippetParser.ElseifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void exitElseifblock(@NotNull SnippetParser.ElseifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull SnippetParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull SnippetParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#elseifpart}.
	 * @param ctx the parse tree
	 */
	void enterElseifpart(@NotNull SnippetParser.ElseifpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#elseifpart}.
	 * @param ctx the parse tree
	 */
	void exitElseifpart(@NotNull SnippetParser.ElseifpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull SnippetParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull SnippetParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SnippetParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SnippetParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull SnippetParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull SnippetParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull SnippetParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull SnippetParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SnippetParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SnippetParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull SnippetParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull SnippetParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull SnippetParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull SnippetParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull SnippetParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull SnippetParser.If_statContext ctx);
}