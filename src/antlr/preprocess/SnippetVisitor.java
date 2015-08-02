// Generated from Snippet.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SnippetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SnippetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SnippetParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull SnippetParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#assign_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expression(@NotNull SnippetParser.Assign_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#multiOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiOperator(@NotNull SnippetParser.MultiOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SnippetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull SnippetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull SnippetParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(@NotNull SnippetParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#callStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(@NotNull SnippetParser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#declarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStat(@NotNull SnippetParser.DeclarationStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(@NotNull SnippetParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull SnippetParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(@NotNull SnippetParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#arithmAssignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmAssignOperator(@NotNull SnippetParser.ArithmAssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#selfIncreStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfIncreStat(@NotNull SnippetParser.SelfIncreStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#increOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncreOperator(@NotNull SnippetParser.IncreOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#addOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperator(@NotNull SnippetParser.AddOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(@NotNull SnippetParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#convertExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertExpr(@NotNull SnippetParser.ConvertExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(@NotNull SnippetParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull SnippetParser.Or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#ifpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfpart(@NotNull SnippetParser.IfpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(@NotNull SnippetParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(@NotNull SnippetParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#arith_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expression(@NotNull SnippetParser.Arith_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(@NotNull SnippetParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#elseifpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifpart(@NotNull SnippetParser.ElseifpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull SnippetParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull SnippetParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull SnippetParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull SnippetParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull SnippetParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(@NotNull SnippetParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#multi_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_expression(@NotNull SnippetParser.Multi_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnippetParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull SnippetParser.If_statContext ctx);
}