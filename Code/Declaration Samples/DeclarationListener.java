// Generated from Declaration.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeclarationParser}.
 */
public interface DeclarationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeclarationParser#gotosumexp}.
	 * @param ctx the parse tree
	 */
	void enterGotosumexp(@NotNull DeclarationParser.GotosumexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#gotosumexp}.
	 * @param ctx the parse tree
	 */
	void exitGotosumexp(@NotNull DeclarationParser.GotosumexpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull DeclarationParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull DeclarationParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull DeclarationParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull DeclarationParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull DeclarationParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull DeclarationParser.SubContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull DeclarationParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull DeclarationParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull DeclarationParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull DeclarationParser.DeclareContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull DeclarationParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull DeclarationParser.BoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull DeclarationParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull DeclarationParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#gotofactor}.
	 * @param ctx the parse tree
	 */
	void enterGotofactor(@NotNull DeclarationParser.GotofactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#gotofactor}.
	 * @param ctx the parse tree
	 */
	void exitGotofactor(@NotNull DeclarationParser.GotofactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DeclarationParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DeclarationParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#gototerm}.
	 * @param ctx the parse tree
	 */
	void enterGototerm(@NotNull DeclarationParser.GototermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#gototerm}.
	 * @param ctx the parse tree
	 */
	void exitGototerm(@NotNull DeclarationParser.GototermContext ctx);

	/**
	 * Enter a parse tree produced by {@link DeclarationParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull DeclarationParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeclarationParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull DeclarationParser.AssignContext ctx);
}