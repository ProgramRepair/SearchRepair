// Generated from FunctionExtractor.g4 by ANTLR 4.4
package antlr.preprocess;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionExtractorParser}.
 */
public interface FunctionExtractorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull FunctionExtractorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull FunctionExtractorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull FunctionExtractorParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull FunctionExtractorParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull FunctionExtractorParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull FunctionExtractorParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull FunctionExtractorParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull FunctionExtractorParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(@NotNull FunctionExtractorParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(@NotNull FunctionExtractorParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(@NotNull FunctionExtractorParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(@NotNull FunctionExtractorParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(@NotNull FunctionExtractorParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(@NotNull FunctionExtractorParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(@NotNull FunctionExtractorParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(@NotNull FunctionExtractorParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull FunctionExtractorParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull FunctionExtractorParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull FunctionExtractorParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull FunctionExtractorParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(@NotNull FunctionExtractorParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(@NotNull FunctionExtractorParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(@NotNull FunctionExtractorParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(@NotNull FunctionExtractorParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(@NotNull FunctionExtractorParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(@NotNull FunctionExtractorParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(@NotNull FunctionExtractorParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(@NotNull FunctionExtractorParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(@NotNull FunctionExtractorParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(@NotNull FunctionExtractorParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull FunctionExtractorParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull FunctionExtractorParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull FunctionExtractorParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull FunctionExtractorParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(@NotNull FunctionExtractorParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(@NotNull FunctionExtractorParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull FunctionExtractorParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull FunctionExtractorParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(@NotNull FunctionExtractorParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(@NotNull FunctionExtractorParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(@NotNull FunctionExtractorParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(@NotNull FunctionExtractorParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull FunctionExtractorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull FunctionExtractorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(@NotNull FunctionExtractorParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(@NotNull FunctionExtractorParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull FunctionExtractorParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull FunctionExtractorParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(@NotNull FunctionExtractorParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(@NotNull FunctionExtractorParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(@NotNull FunctionExtractorParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(@NotNull FunctionExtractorParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(@NotNull FunctionExtractorParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(@NotNull FunctionExtractorParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull FunctionExtractorParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull FunctionExtractorParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(@NotNull FunctionExtractorParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(@NotNull FunctionExtractorParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull FunctionExtractorParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull FunctionExtractorParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(@NotNull FunctionExtractorParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(@NotNull FunctionExtractorParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull FunctionExtractorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull FunctionExtractorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull FunctionExtractorParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull FunctionExtractorParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(@NotNull FunctionExtractorParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(@NotNull FunctionExtractorParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(@NotNull FunctionExtractorParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(@NotNull FunctionExtractorParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull FunctionExtractorParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull FunctionExtractorParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull FunctionExtractorParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull FunctionExtractorParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(@NotNull FunctionExtractorParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(@NotNull FunctionExtractorParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(@NotNull FunctionExtractorParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(@NotNull FunctionExtractorParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(@NotNull FunctionExtractorParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(@NotNull FunctionExtractorParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(@NotNull FunctionExtractorParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(@NotNull FunctionExtractorParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(@NotNull FunctionExtractorParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(@NotNull FunctionExtractorParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(@NotNull FunctionExtractorParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(@NotNull FunctionExtractorParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull FunctionExtractorParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull FunctionExtractorParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull FunctionExtractorParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull FunctionExtractorParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(@NotNull FunctionExtractorParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(@NotNull FunctionExtractorParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(@NotNull FunctionExtractorParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(@NotNull FunctionExtractorParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(@NotNull FunctionExtractorParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(@NotNull FunctionExtractorParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull FunctionExtractorParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull FunctionExtractorParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(@NotNull FunctionExtractorParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(@NotNull FunctionExtractorParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(@NotNull FunctionExtractorParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(@NotNull FunctionExtractorParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(@NotNull FunctionExtractorParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(@NotNull FunctionExtractorParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull FunctionExtractorParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull FunctionExtractorParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(@NotNull FunctionExtractorParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(@NotNull FunctionExtractorParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull FunctionExtractorParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull FunctionExtractorParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(@NotNull FunctionExtractorParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(@NotNull FunctionExtractorParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull FunctionExtractorParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull FunctionExtractorParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(@NotNull FunctionExtractorParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(@NotNull FunctionExtractorParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull FunctionExtractorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull FunctionExtractorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull FunctionExtractorParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull FunctionExtractorParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull FunctionExtractorParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull FunctionExtractorParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(@NotNull FunctionExtractorParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(@NotNull FunctionExtractorParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(@NotNull FunctionExtractorParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(@NotNull FunctionExtractorParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(@NotNull FunctionExtractorParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(@NotNull FunctionExtractorParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(@NotNull FunctionExtractorParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(@NotNull FunctionExtractorParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(@NotNull FunctionExtractorParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(@NotNull FunctionExtractorParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(@NotNull FunctionExtractorParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(@NotNull FunctionExtractorParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(@NotNull FunctionExtractorParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(@NotNull FunctionExtractorParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(@NotNull FunctionExtractorParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(@NotNull FunctionExtractorParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(@NotNull FunctionExtractorParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(@NotNull FunctionExtractorParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(@NotNull FunctionExtractorParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(@NotNull FunctionExtractorParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull FunctionExtractorParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull FunctionExtractorParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(@NotNull FunctionExtractorParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(@NotNull FunctionExtractorParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull FunctionExtractorParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull FunctionExtractorParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull FunctionExtractorParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull FunctionExtractorParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull FunctionExtractorParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull FunctionExtractorParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(@NotNull FunctionExtractorParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(@NotNull FunctionExtractorParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(@NotNull FunctionExtractorParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(@NotNull FunctionExtractorParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull FunctionExtractorParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull FunctionExtractorParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(@NotNull FunctionExtractorParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(@NotNull FunctionExtractorParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull FunctionExtractorParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull FunctionExtractorParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(@NotNull FunctionExtractorParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(@NotNull FunctionExtractorParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(@NotNull FunctionExtractorParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(@NotNull FunctionExtractorParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull FunctionExtractorParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull FunctionExtractorParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionExtractorParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(@NotNull FunctionExtractorParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionExtractorParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(@NotNull FunctionExtractorParser.InitDeclaratorListContext ctx);
}