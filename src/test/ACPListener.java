// Generated from ACP.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACPParser}.
 */
public interface ACPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ACPParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ACPParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithparam(ACPParser.FuncwithparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcwithparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithparam(ACPParser.FuncwithparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithoutparam(ACPParser.FuncwithoutparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcwithoutparam}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithoutparam(ACPParser.FuncwithoutparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void enterJustAnotherBlock(ACPParser.JustAnotherBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code justAnotherBlock}
	 * labeled alternative in {@link ACPParser#func}.
	 * @param ctx the parse tree
	 */
	void exitJustAnotherBlock(ACPParser.JustAnotherBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ACPParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ACPParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfonly(ACPParser.IfonlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifonly}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfonly(ACPParser.IfonlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfwithout(ACPParser.IfwithoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifwithout}
	 * labeled alternative in {@link ACPParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfwithout(ACPParser.IfwithoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(ACPParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(ACPParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(ACPParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(ACPParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(ACPParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(ACPParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orwithout}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrwithout(ACPParser.OrwithoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orwithout}
	 * labeled alternative in {@link ACPParser#compexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrwithout(ACPParser.OrwithoutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andwithout}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 */
	void enterAndwithout(ACPParser.AndwithoutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andwithout}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 */
	void exitAndwithout(ACPParser.AndwithoutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ACPParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ACPParser#andcomp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ACPParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link ACPParser#relexpr}.
	 * @param ctx the parse tree
	 */
	void enterComp(ACPParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link ACPParser#relexpr}.
	 * @param ctx the parse tree
	 */
	void exitComp(ACPParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ACPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ACPParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printString}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(ACPParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(ACPParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printvariable}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintvariable(ACPParser.PrintvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printvariable}
	 * labeled alternative in {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintvariable(ACPParser.PrintvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(ACPParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(ACPParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplecall}
	 * labeled alternative in {@link ACPParser#call}.
	 * @param ctx the parse tree
	 */
	void enterSimplecall(ACPParser.SimplecallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplecall}
	 * labeled alternative in {@link ACPParser#call}.
	 * @param ctx the parse tree
	 */
	void exitSimplecall(ACPParser.SimplecallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 */
	void enterStackdecl(ACPParser.StackdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 */
	void exitStackdecl(ACPParser.StackdeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stackpush}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void enterStackpush(ACPParser.StackpushContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stackpush}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void exitStackpush(ACPParser.StackpushContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stackpop}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void enterStackpop(ACPParser.StackpopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stackpop}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void exitStackpop(ACPParser.StackpopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stackshow}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void enterStackshow(ACPParser.StackshowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stackshow}
	 * labeled alternative in {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void exitStackshow(ACPParser.StackshowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ACPParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ACPParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignIncrDecr}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void enterAssignIncrDecr(ACPParser.AssignIncrDecrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignIncrDecr}
	 * labeled alternative in {@link ACPParser#assignmentStatment}.
	 * @param ctx the parse tree
	 */
	void exitAssignIncrDecr(ACPParser.AssignIncrDecrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ACPParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ACPParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterSub(ACPParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitSub(ACPParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void enterGototerm(ACPParser.GototermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gototerm}
	 * labeled alternative in {@link ACPParser#sumexpr}.
	 * @param ctx the parse tree
	 */
	void exitGototerm(ACPParser.GototermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ACPParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ACPParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMul(ACPParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMul(ACPParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void enterGotofactor(ACPParser.GotofactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotofactor}
	 * labeled alternative in {@link ACPParser#term}.
	 * @param ctx the parse tree
	 */
	void exitGotofactor(ACPParser.GotofactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterId(ACPParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitId(ACPParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ACPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ACPParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ACPParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ACPParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(ACPParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link ACPParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(ACPParser.CallfuncContext ctx);
}