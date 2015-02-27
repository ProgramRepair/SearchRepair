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
	 * Enter a parse tree produced by {@link SnippetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SnippetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SnippetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnippetParser#multiOperater}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperater(@NotNull SnippetParser.MultiOperaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#multiOperater}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperater(@NotNull SnippetParser.MultiOperaterContext ctx);
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
	 * Enter a parse tree produced by {@link SnippetParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(@NotNull SnippetParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(@NotNull SnippetParser.ExprStatContext ctx);
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
	 * Enter a parse tree produced by {@link SnippetParser#addictiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddictiveOperator(@NotNull SnippetParser.AddictiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnippetParser#addictiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddictiveOperator(@NotNull SnippetParser.AddictiveOperatorContext ctx);
}