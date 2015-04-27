// Generated from Integrate.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntegrateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntegrateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(IntegrateParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithparam(IntegrateParser.FuncwithparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithoutparam(IntegrateParser.FuncwithoutparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code main}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(IntegrateParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustAnotherBlock(IntegrateParser.JustAnotherBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(IntegrateParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfonly(IntegrateParser.IfonlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfwithout(IntegrateParser.IfwithoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(IntegrateParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(IntegrateParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link IntegrateParser#compexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(IntegrateParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(IntegrateParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt(IntegrateParser.PrintstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(IntegrateParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegrateParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(IntegrateParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link IntegrateParser#assignmentStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IntegrateParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(IntegrateParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(IntegrateParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGototerm(IntegrateParser.GototermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(IntegrateParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(IntegrateParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotofactor(IntegrateParser.GotofactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(IntegrateParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(IntegrateParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(IntegrateParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(IntegrateParser.CallfuncContext ctx);
}