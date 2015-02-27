// Generated from Condition.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConditionParser}.
 */
public interface ConditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ConditionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ConditionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull ConditionParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull ConditionParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull ConditionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull ConditionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull ConditionParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull ConditionParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(@NotNull ConditionParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(@NotNull ConditionParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(@NotNull ConditionParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(@NotNull ConditionParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiOperator(@NotNull ConditionParser.MultiOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#multiOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiOperator(@NotNull ConditionParser.MultiOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ConditionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ConditionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void enterArith_expression(@NotNull ConditionParser.Arith_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#arith_expression}.
	 * @param ctx the parse tree
	 */
	void exitArith_expression(@NotNull ConditionParser.Arith_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expression(@NotNull ConditionParser.Multi_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#multi_expression}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expression(@NotNull ConditionParser.Multi_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull ConditionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull ConditionParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(@NotNull ConditionParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(@NotNull ConditionParser.AddOperatorContext ctx);
}