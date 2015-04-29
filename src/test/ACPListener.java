// Generated from ACP.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACPParser}.
 */
public interface ACPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACPParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull ACPParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull ACPParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#justAnotherBlock}.
	 * @param ctx the parse tree
	 */
	void enterJustAnotherBlock(@NotNull ACPParser.JustAnotherBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#justAnotherBlock}.
	 * @param ctx the parse tree
	 */
	void exitJustAnotherBlock(@NotNull ACPParser.JustAnotherBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#ifwithout}.
	 * @param ctx the parse tree
	 */
	void enterIfwithout(@NotNull ACPParser.IfwithoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#ifwithout}.
	 * @param ctx the parse tree
	 */
	void exitIfwithout(@NotNull ACPParser.IfwithoutContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull ACPParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull ACPParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(@NotNull ACPParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(@NotNull ACPParser.PrintstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull ACPParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull ACPParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void enterStackoperation(@NotNull ACPParser.StackoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#stackoperation}.
	 * @param ctx the parse tree
	 */
	void exitStackoperation(@NotNull ACPParser.StackoperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ACPParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ACPParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(@NotNull ACPParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(@NotNull ACPParser.ElsepartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull ACPParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull ACPParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ACPParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ACPParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#gotofactor}.
	 * @param ctx the parse tree
	 */
	void enterGotofactor(@NotNull ACPParser.GotofactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#gotofactor}.
	 * @param ctx the parse tree
	 */
	void exitGotofactor(@NotNull ACPParser.GotofactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ACPParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ACPParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(@NotNull ACPParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(@NotNull ACPParser.CallfuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#funcwithparam}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithparam(@NotNull ACPParser.FuncwithparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#funcwithparam}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithparam(@NotNull ACPParser.FuncwithparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull ACPParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull ACPParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull ACPParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull ACPParser.CompContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull ACPParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull ACPParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#andwithout}.
	 * @param ctx the parse tree
	 */
	void enterAndwithout(@NotNull ACPParser.AndwithoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#andwithout}.
	 * @param ctx the parse tree
	 */
	void exitAndwithout(@NotNull ACPParser.AndwithoutContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull ACPParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull ACPParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull ACPParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull ACPParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#funcwithoutparam}.
	 * @param ctx the parse tree
	 */
	void enterFuncwithoutparam(@NotNull ACPParser.FuncwithoutparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#funcwithoutparam}.
	 * @param ctx the parse tree
	 */
	void exitFuncwithoutparam(@NotNull ACPParser.FuncwithoutparamContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull ACPParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull ACPParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(@NotNull ACPParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(@NotNull ACPParser.WhilestmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(@NotNull ACPParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(@NotNull ACPParser.BooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#ifonly}.
	 * @param ctx the parse tree
	 */
	void enterIfonly(@NotNull ACPParser.IfonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#ifonly}.
	 * @param ctx the parse tree
	 */
	void exitIfonly(@NotNull ACPParser.IfonlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 */
	void enterStackdecl(@NotNull ACPParser.StackdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#stackdecl}.
	 * @param ctx the parse tree
	 */
	void exitStackdecl(@NotNull ACPParser.StackdeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(@NotNull ACPParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(@NotNull ACPParser.ReturnstmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#orwithout}.
	 * @param ctx the parse tree
	 */
	void enterOrwithout(@NotNull ACPParser.OrwithoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#orwithout}.
	 * @param ctx the parse tree
	 */
	void exitOrwithout(@NotNull ACPParser.OrwithoutContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#gototerm}.
	 * @param ctx the parse tree
	 */
	void enterGototerm(@NotNull ACPParser.GototermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#gototerm}.
	 * @param ctx the parse tree
	 */
	void exitGototerm(@NotNull ACPParser.GototermContext ctx);

	/**
	 * Enter a parse tree produced by {@link ACPParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull ACPParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACPParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull ACPParser.AssignContext ctx);
}