// Generated from Arith.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithParser}.
 */
public interface ArithListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ArithParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ArithParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull ArithParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull ArithParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull ArithParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull ArithParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull ArithParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull ArithParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull ArithParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull ArithParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull ArithParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull ArithParser.AddOperatorContext ctx);
}