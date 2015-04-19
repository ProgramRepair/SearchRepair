// Generated from Scrape.g4 by ANTLR 4.4
package scraper;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScrapeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScrapeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull ScrapeParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(@NotNull ScrapeParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expression(@NotNull ScrapeParser.Assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#multiOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiOperator(@NotNull ScrapeParser.MultiOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ScrapeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ScrapeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull ScrapeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#callStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(@NotNull ScrapeParser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#declarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStat(@NotNull ScrapeParser.DeclarationStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(@NotNull ScrapeParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ScrapeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(@NotNull ScrapeParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmAssignOperator(@NotNull ScrapeParser.ArithmAssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#selfIncreStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfIncreStat(@NotNull ScrapeParser.SelfIncreStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#increOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreOperator(@NotNull ScrapeParser.IncreOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#addOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperator(@NotNull ScrapeParser.AddOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(@NotNull ScrapeParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(@NotNull ScrapeParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull ScrapeParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#ifpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfpart(@NotNull ScrapeParser.IfpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(@NotNull ScrapeParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(@NotNull ScrapeParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#arith_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expression(@NotNull ScrapeParser.Arith_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(@NotNull ScrapeParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#elseifpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifpart(@NotNull ScrapeParser.ElseifpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull ScrapeParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull ScrapeParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull ScrapeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull ScrapeParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull ScrapeParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(@NotNull ScrapeParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#multi_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_expression(@NotNull ScrapeParser.Multi_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapeParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull ScrapeParser.If_statContext ctx);
}