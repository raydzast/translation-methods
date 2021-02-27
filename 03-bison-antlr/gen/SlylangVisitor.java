// Generated from /Users/personal/translation-methods/03-bison-antlr/src/Slylang.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlylangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlylangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlylangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SlylangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(SlylangParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SlylangParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#argumentsClosure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsClosure(SlylangParser.ArgumentsClosureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(SlylangParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#argumentS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentS(SlylangParser.ArgumentSContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#arguments_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_(SlylangParser.Arguments_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SlylangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SlylangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#scan_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan_stmt(SlylangParser.Scan_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#echo_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho_stmt(SlylangParser.Echo_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SlylangParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(SlylangParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#elifs_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifs_(SlylangParser.Elifs_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(SlylangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(SlylangParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SlylangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#expressionS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionS(SlylangParser.ExpressionSContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlylangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SlylangParser.ExpressionContext ctx);
}