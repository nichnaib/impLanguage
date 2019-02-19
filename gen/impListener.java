// Generated from /home/davide/IdeaProjects/impLanguage/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link impParser}.
 */
public interface impListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link impParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(impParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(impParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(impParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(impParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterLexp(impParser.LexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitLexp(impParser.LexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(impParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(impParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(impParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(impParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#aop}.
	 * @param ctx the parse tree
	 */
	void enterAop(impParser.AopContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#aop}.
	 * @param ctx the parse tree
	 */
	void exitAop(impParser.AopContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBexp(impParser.BexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBexp(impParser.BexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(impParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(impParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link impParser#mexp}.
	 * @param ctx the parse tree
	 */
	void enterMexp(impParser.MexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link impParser#mexp}.
	 * @param ctx the parse tree
	 */
	void exitMexp(impParser.MexpContext ctx);
}