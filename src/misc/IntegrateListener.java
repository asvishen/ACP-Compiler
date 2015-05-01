// Generated from Integrate.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntegrateParser}.
 */
public interface IntegrateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(IntegrateParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(IntegrateParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithparam(IntegrateParser.FuncwithparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithparam(IntegrateParser.FuncwithparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithoutparam(IntegrateParser.FuncwithoutparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithoutparam(IntegrateParser.FuncwithoutparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code main}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void enterMain(IntegrateParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code main}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void exitMain(IntegrateParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void enterJustAnotherBlock(IntegrateParser.JustAnotherBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link IntegrateParser#func}.
	 * @param ctx the parse tree
	 */
	void exitJustAnotherBlock(IntegrateParser.JustAnotherBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(IntegrateParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(IntegrateParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfonly(IntegrateParser.IfonlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfonly(IntegrateParser.IfonlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfwithout(IntegrateParser.IfwithoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link IntegrateParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfwithout(IntegrateParser.IfwithoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(IntegrateParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(IntegrateParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(IntegrateParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(IntegrateParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link IntegrateParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void enterComp(IntegrateParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link IntegrateParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void exitComp(IntegrateParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IntegrateParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IntegrateParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(IntegrateParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(IntegrateParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(IntegrateParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(IntegrateParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegrateParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(IntegrateParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegrateParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(IntegrateParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link IntegrateParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(IntegrateParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link IntegrateParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(IntegrateParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(IntegrateParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(IntegrateParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterSub(IntegrateParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitSub(IntegrateParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterGototerm(IntegrateParser.GototermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link IntegrateParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitGototerm(IntegrateParser.GototermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDiv(IntegrateParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDiv(IntegrateParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMul(IntegrateParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMul(IntegrateParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void enterGotofactor(IntegrateParser.GotofactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link IntegrateParser#term}.
	 * @param ctx the parse tree
	 */
	void exitGotofactor(IntegrateParser.GotofactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterId(IntegrateParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitId(IntegrateParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(IntegrateParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(IntegrateParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(IntegrateParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(IntegrateParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(IntegrateParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link IntegrateParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(IntegrateParser.CallfuncContext ctx);
}