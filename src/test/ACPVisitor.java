// Generated from ACP.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ACPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ACPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ACPParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(@NotNull ACPParser.SubContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#justAnotherBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustAnotherBlock(@NotNull ACPParser.JustAnotherBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#ifwithout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfwithout(@NotNull ACPParser.IfwithoutContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull ACPParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(@NotNull ACPParser.PrintstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull ACPParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackoperation(@NotNull ACPParser.StackoperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ACPParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(@NotNull ACPParser.ElsepartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull ACPParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ACPParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#gotofactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotofactor(@NotNull ACPParser.GotofactorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull ACPParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#callfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(@NotNull ACPParser.CallfuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#funcwithparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithparam(@NotNull ACPParser.FuncwithparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull ACPParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull ACPParser.CompContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull ACPParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#andwithout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndwithout(@NotNull ACPParser.AndwithoutContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ACPParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull ACPParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#funcwithoutparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithoutparam(@NotNull ACPParser.FuncwithoutparamContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull ACPParser.CallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(@NotNull ACPParser.WhilestmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(@NotNull ACPParser.BooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#ifonly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfonly(@NotNull ACPParser.IfonlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackdecl(@NotNull ACPParser.StackdeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(@NotNull ACPParser.ReturnstmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#orwithout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrwithout(@NotNull ACPParser.OrwithoutContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#gototerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGototerm(@NotNull ACPParser.GototermContext ctx);

	/**
	 * Visit a parse tree produced by {@link ACPParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ACPParser.AssignContext ctx);
}