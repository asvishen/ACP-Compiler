// Generated from ./ACP/ACP.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ACPParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithparam(ACPParser.FuncwithparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncwithoutparam(ACPParser.FuncwithoutparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustAnotherBlock(ACPParser.JustAnotherBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ACPParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfonly(ACPParser.IfonlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfwithout(ACPParser.IfwithoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(ACPParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(ACPParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ACPParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orwithout}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrwithout(ACPParser.OrwithoutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andwithout}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndwithout(ACPParser.AndwithoutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ACPParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link ACPParser#relexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(ACPParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ACPParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(ACPParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printvariable}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintvariable(ACPParser.PrintvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(ACPParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplecall}
	 * labeled alternative in {@link ACPParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplecall(ACPParser.SimplecallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackdecl(ACPParser.StackdeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stackpush}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackpush(ACPParser.StackpushContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stackpop}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackpop(ACPParser.StackpopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stackshow}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackshow(ACPParser.StackshowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ACPParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignIncrDecr}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIncrDecr(ACPParser.AssignIncrDecrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ACPParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ACPParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGototerm(ACPParser.GototermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ACPParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ACPParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotofactor(ACPParser.GotofactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ACPParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ACPParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ACPParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(ACPParser.CallfuncContext ctx);
}