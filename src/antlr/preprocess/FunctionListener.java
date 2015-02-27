// Generated from Function.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionParser}.
 */
public interface FunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull FunctionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull FunctionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expression(@NotNull FunctionParser.Assign_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expression(@NotNull FunctionParser.Assign_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull FunctionParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull FunctionParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull FunctionParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull FunctionParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void enterIfPart(@NotNull FunctionParser.IfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void exitIfPart(@NotNull FunctionParser.IfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull FunctionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull FunctionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#addressExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddressExpr(@NotNull FunctionParser.AddressExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#addressExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddressExpr(@NotNull FunctionParser.AddressExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull FunctionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull FunctionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull FunctionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull FunctionParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#callStat}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(@NotNull FunctionParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#callStat}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(@NotNull FunctionParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#defExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefExpr(@NotNull FunctionParser.DefExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#defExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefExpr(@NotNull FunctionParser.DefExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull FunctionParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull FunctionParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStat(@NotNull FunctionParser.DeclarationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#declarationStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStat(@NotNull FunctionParser.DeclarationStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull FunctionParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull FunctionParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#elseifPart}.
	 * @param ctx the parse tree
	 */
	void enterElseifPart(@NotNull FunctionParser.ElseifPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#elseifPart}.
	 * @param ctx the parse tree
	 */
	void exitElseifPart(@NotNull FunctionParser.ElseifPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmAssignOperator(@NotNull FunctionParser.ArithmAssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmAssignOperator(@NotNull FunctionParser.ArithmAssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void enterSelfIncreStat(@NotNull FunctionParser.SelfIncreStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#selfIncreStat}.
	 * @param ctx the parse tree
	 */
	void exitSelfIncreStat(@NotNull FunctionParser.SelfIncreStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull FunctionParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull FunctionParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncreOperator(@NotNull FunctionParser.IncreOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#increOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncreOperator(@NotNull FunctionParser.IncreOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull FunctionParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull FunctionParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull FunctionParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull FunctionParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#condOperator}.
	 * @param ctx the parse tree
	 */
	void enterCondOperator(@NotNull FunctionParser.CondOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#condOperator}.
	 * @param ctx the parse tree
	 */
	void exitCondOperator(@NotNull FunctionParser.CondOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull FunctionParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull FunctionParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull FunctionParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull FunctionParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(@NotNull FunctionParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(@NotNull FunctionParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(@NotNull FunctionParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(@NotNull FunctionParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull FunctionParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull FunctionParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(@NotNull FunctionParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(@NotNull FunctionParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull FunctionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull FunctionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull FunctionParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull FunctionParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull FunctionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull FunctionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull FunctionParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull FunctionParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull FunctionParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull FunctionParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull FunctionParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull FunctionParser.Multi_expressionContext ctx);
}