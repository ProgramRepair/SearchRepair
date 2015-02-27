// Generated from C.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull CParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull CParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull CParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull CParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(@NotNull CParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(@NotNull CParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull CParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull CParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull CParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull CParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull CParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull CParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(@NotNull CParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(@NotNull CParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#addictiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddictiveOperator(@NotNull CParser.AddictiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#addictiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddictiveOperator(@NotNull CParser.AddictiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull CParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull CParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multiOperater}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperater(@NotNull CParser.MultiOperaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiOperater}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperater(@NotNull CParser.MultiOperaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull CParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull CParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull CParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull CParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull CParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull CParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull CParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull CParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#mexpr}.
	 * @param ctx the parse tree
	 */
	void enterMexpr(@NotNull CParser.MexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#mexpr}.
	 * @param ctx the parse tree
	 */
	void exitMexpr(@NotNull CParser.MexprContext ctx);
}