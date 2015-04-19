// Generated from Scrape.g4 by ANTLR 4.4
package scraper;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScrapeParser}.
 */
public interface ScrapeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ScrapeParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ScrapeParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(@NotNull ScrapeParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(@NotNull ScrapeParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(@NotNull ScrapeParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(@NotNull ScrapeParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull ScrapeParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull ScrapeParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ScrapeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ScrapeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ScrapeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ScrapeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ScrapeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ScrapeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#callStat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull ScrapeParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#callStat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull ScrapeParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStat(@NotNull ScrapeParser.DeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStat(@NotNull ScrapeParser.DeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(@NotNull ScrapeParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(@NotNull ScrapeParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ScrapeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ScrapeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull ScrapeParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull ScrapeParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmAssignOperator(@NotNull ScrapeParser.ArithmAssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmAssignOperator(@NotNull ScrapeParser.ArithmAssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void enterSelfIncreStat(@NotNull ScrapeParser.SelfIncreStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void exitSelfIncreStat(@NotNull ScrapeParser.SelfIncreStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncreOperator(@NotNull ScrapeParser.IncreOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncreOperator(@NotNull ScrapeParser.IncreOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull ScrapeParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull ScrapeParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull ScrapeParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull ScrapeParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull ScrapeParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull ScrapeParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull ScrapeParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull ScrapeParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void enterIfpart(@NotNull ScrapeParser.IfpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void exitIfpart(@NotNull ScrapeParser.IfpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(@NotNull ScrapeParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(@NotNull ScrapeParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull ScrapeParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull ScrapeParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull ScrapeParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull ScrapeParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void enterElseifblock(@NotNull ScrapeParser.ElseifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void exitElseifblock(@NotNull ScrapeParser.ElseifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#elseifpart}.
	 * @param ctx the parse tree
	 */
	void enterElseifpart(@NotNull ScrapeParser.ElseifpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#elseifpart}.
	 * @param ctx the parse tree
	 */
	void exitElseifpart(@NotNull ScrapeParser.ElseifpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull ScrapeParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull ScrapeParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull ScrapeParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull ScrapeParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull ScrapeParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull ScrapeParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull ScrapeParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull ScrapeParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull ScrapeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull ScrapeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull ScrapeParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull ScrapeParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull ScrapeParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull ScrapeParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapeParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull ScrapeParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapeParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull ScrapeParser.If_statContext ctx);
}