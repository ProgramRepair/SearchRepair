// Generated from Path.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PathParser}.
 */
public interface PathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PathParser#assiginOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssiginOperator(@NotNull PathParser.AssiginOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#assiginOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssiginOperator(@NotNull PathParser.AssiginOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull PathParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull PathParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void enterConvertExpr(@NotNull PathParser.ConvertExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#convertExpr}.
	 * @param ctx the parse tree
	 */
	void exitConvertExpr(@NotNull PathParser.ConvertExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull PathParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull PathParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#assumeStat}.
	 * @param ctx the parse tree
	 */
	void enterAssumeStat(@NotNull PathParser.AssumeStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#assumeStat}.
	 * @param ctx the parse tree
	 */
	void exitAssumeStat(@NotNull PathParser.AssumeStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull PathParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull PathParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#addressExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddressExpr(@NotNull PathParser.AddressExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#addressExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddressExpr(@NotNull PathParser.AddressExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(@NotNull PathParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(@NotNull PathParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(@NotNull PathParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(@NotNull PathParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PathParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PathParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#defExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefExpr(@NotNull PathParser.DefExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#defExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefExpr(@NotNull PathParser.DefExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#callStat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull PathParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#callStat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull PathParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#formalArgument}.
	 * @param ctx the parse tree
	 */
	void enterFormalArgument(@NotNull PathParser.FormalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#formalArgument}.
	 * @param ctx the parse tree
	 */
	void exitFormalArgument(@NotNull PathParser.FormalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PathParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PathParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStat(@NotNull PathParser.DeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStat(@NotNull PathParser.DeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PathParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PathParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull PathParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull PathParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#arithOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithOperator(@NotNull PathParser.ArithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#arithOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithOperator(@NotNull PathParser.ArithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull PathParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull PathParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#selfOperator}.
	 * @param ctx the parse tree
	 */
	void enterSelfOperator(@NotNull PathParser.SelfOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#selfOperator}.
	 * @param ctx the parse tree
	 */
	void exitSelfOperator(@NotNull PathParser.SelfOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void enterSelfIncreStat(@NotNull PathParser.SelfIncreStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void exitSelfIncreStat(@NotNull PathParser.SelfIncreStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PathParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull PathParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PathParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull PathParser.NotExprContext ctx);
}