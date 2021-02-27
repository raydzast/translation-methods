// Generated from /Users/personal/translation-methods/03-bison-antlr/src/Slylang.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlylangParser}.
 */
public interface SlylangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlylangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SlylangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SlylangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(SlylangParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(SlylangParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SlylangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SlylangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#argumentsClosure}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsClosure(SlylangParser.ArgumentsClosureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#argumentsClosure}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsClosure(SlylangParser.ArgumentsClosureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(SlylangParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(SlylangParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#argumentS}.
	 * @param ctx the parse tree
	 */
	void enterArgumentS(SlylangParser.ArgumentSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#argumentS}.
	 * @param ctx the parse tree
	 */
	void exitArgumentS(SlylangParser.ArgumentSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#arguments_}.
	 * @param ctx the parse tree
	 */
	void enterArguments_(SlylangParser.Arguments_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#arguments_}.
	 * @param ctx the parse tree
	 */
	void exitArguments_(SlylangParser.Arguments_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SlylangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SlylangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SlylangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SlylangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#scan_stmt}.
	 * @param ctx the parse tree
	 */
	void enterScan_stmt(SlylangParser.Scan_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#scan_stmt}.
	 * @param ctx the parse tree
	 */
	void exitScan_stmt(SlylangParser.Scan_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#echo_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEcho_stmt(SlylangParser.Echo_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#echo_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEcho_stmt(SlylangParser.Echo_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SlylangParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SlylangParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(SlylangParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(SlylangParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#elifs_}.
	 * @param ctx the parse tree
	 */
	void enterElifs_(SlylangParser.Elifs_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#elifs_}.
	 * @param ctx the parse tree
	 */
	void exitElifs_(SlylangParser.Elifs_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(SlylangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(SlylangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SlylangParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SlylangParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SlylangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SlylangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#expressionS}.
	 * @param ctx the parse tree
	 */
	void enterExpressionS(SlylangParser.ExpressionSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#expressionS}.
	 * @param ctx the parse tree
	 */
	void exitExpressionS(SlylangParser.ExpressionSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SlylangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SlylangParser.ExpressionContext ctx);
}