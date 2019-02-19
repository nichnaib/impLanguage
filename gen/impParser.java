// Generated from /home/davide/IdeaProjects/impLanguage/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class impParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, BOOL=35, ID=36, INT=37, WS=38, SPACE=39;
	public static final int
		RULE_prog = 0, RULE_st = 1, RULE_lexp = 2, RULE_exp = 3, RULE_aexp = 4, 
		RULE_aop = 5, RULE_bexp = 6, RULE_bop = 7, RULE_mexp = 8;
	public static final String[] ruleNames = {
		"prog", "st", "lexp", "exp", "aexp", "aop", "bexp", "bop", "mexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'skip'", "'input'", "'('", "')'", "'output'", "'while'", 
		"'do'", "'endw'", "'if'", "'then'", "'else'", "'fi'", "'var '", "':='", 
		"'list '", "'map '", "'.'", "'_'", "'push'", "','", "'top'", "'pop'", 
		"'cons'", "'*'", "'/'", "'+'", "'-'", "'!'", "'&&'", "'=='", "'||'", "'['", 
		"']'", null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "BOOL", 
		"ID", "INT", "WS", "SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public impParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				st();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				st();
				setState(20);
				match(T__0);
				setState(21);
				prog();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StContext extends ParserRuleContext {
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_st);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__2);
				setState(27);
				match(T__3);
				setState(28);
				prog();
				setState(29);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(T__5);
				setState(32);
				match(T__3);
				setState(33);
				lexp();
				setState(34);
				match(T__4);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(T__6);
				setState(37);
				bexp();
				setState(38);
				match(T__7);
				setState(39);
				prog();
				setState(40);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(T__9);
				setState(43);
				bexp();
				setState(44);
				match(T__10);
				setState(45);
				prog();
				setState(46);
				match(T__11);
				setState(47);
				prog();
				setState(48);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(T__13);
				setState(51);
				match(ID);
				setState(52);
				match(T__14);
				setState(53);
				exp();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__15);
				setState(55);
				match(ID);
				setState(56);
				match(T__14);
				setState(57);
				lexp();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(T__16);
				setState(59);
				match(ID);
				setState(60);
				match(T__14);
				setState(61);
				mexp();
				}
				break;
			case T__3:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__28:
			case T__32:
			case BOOL:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				exp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public List<LexpContext> lexp() {
			return getRuleContexts(LexpContext.class);
		}
		public LexpContext lexp(int i) {
			return getRuleContext(LexpContext.class,i);
		}
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitLexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitLexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		LexpContext _localctx = new LexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lexp);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(ID);
				setState(67);
				match(T__17);
				setState(68);
				lexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__19);
				setState(71);
				match(T__3);
				setState(72);
				lexp();
				setState(73);
				match(T__20);
				setState(74);
				lexp();
				setState(75);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(T__21);
				setState(78);
				match(T__3);
				setState(79);
				lexp();
				setState(80);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(T__22);
				setState(83);
				match(T__3);
				setState(84);
				lexp();
				setState(85);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(T__23);
				setState(88);
				match(T__3);
				setState(89);
				lexp();
				setState(90);
				match(T__20);
				setState(91);
				lexp();
				setState(92);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				aexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				bexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				lexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				mexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AexpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(impParser.INT, 0); }
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public AopContext aop() {
			return getRuleContext(AopContext.class,0);
		}
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterAexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitAexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitAexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aexp);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(INT);
				setState(106);
				aop();
				setState(107);
				aexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(ID);
				setState(110);
				aop();
				setState(111);
				aexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(T__3);
				setState(114);
				aexp();
				setState(115);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__3);
				setState(118);
				aexp();
				setState(119);
				match(T__4);
				setState(120);
				aop();
				setState(121);
				aexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AopContext extends ParserRuleContext {
		public AopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterAop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitAop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitAop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AopContext aop() throws RecognitionException {
		AopContext _localctx = new AopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BexpContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(impParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterBexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitBexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		BexpContext _localctx = new BexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bexp);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(BOOL);
				setState(130);
				bop();
				setState(131);
				bexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(ID);
				setState(134);
				bop();
				setState(135);
				bexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__3);
				setState(138);
				bexp();
				setState(139);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(T__3);
				setState(142);
				bexp();
				setState(143);
				match(T__4);
				setState(144);
				bop();
				setState(145);
				bexp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(T__28);
				setState(148);
				bexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitBop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MexpContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(impParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(impParser.ID, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterMexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitMexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitMexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MexpContext mexp() throws RecognitionException {
		MexpContext _localctx = new MexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mexp);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__32);
				setState(154);
				match(ID);
				setState(155);
				match(T__20);
				setState(156);
				exp();
				setState(157);
				match(T__33);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__32);
				setState(160);
				match(ID);
				setState(161);
				match(T__20);
				setState(162);
				exp();
				setState(163);
				match(T__33);
				setState(164);
				mexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__3);
				setState(168);
				match(ID);
				setState(169);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6~\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n"+
		"\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\33\36\3\2 \"\2\u00c5\2\31\3\2"+
		"\2\2\4A\3\2\2\2\6`\3\2\2\2\bg\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u0099\3\2\2\2\22\u00ac\3\2\2\2\24\32\5\4\3\2\25\26\5\4\3\2"+
		"\26\27\7\3\2\2\27\30\5\2\2\2\30\32\3\2\2\2\31\24\3\2\2\2\31\25\3\2\2\2"+
		"\32\3\3\2\2\2\33B\7\4\2\2\34\35\7\5\2\2\35\36\7\6\2\2\36\37\5\2\2\2\37"+
		" \7\7\2\2 B\3\2\2\2!\"\7\b\2\2\"#\7\6\2\2#$\5\6\4\2$%\7\7\2\2%B\3\2\2"+
		"\2&\'\7\t\2\2\'(\5\16\b\2()\7\n\2\2)*\5\2\2\2*+\7\13\2\2+B\3\2\2\2,-\7"+
		"\f\2\2-.\5\16\b\2./\7\r\2\2/\60\5\2\2\2\60\61\7\16\2\2\61\62\5\2\2\2\62"+
		"\63\7\17\2\2\63B\3\2\2\2\64\65\7\20\2\2\65\66\7&\2\2\66\67\7\21\2\2\67"+
		"B\5\b\5\289\7\22\2\29:\7&\2\2:;\7\21\2\2;B\5\6\4\2<=\7\23\2\2=>\7&\2\2"+
		">?\7\21\2\2?B\5\22\n\2@B\5\b\5\2A\33\3\2\2\2A\34\3\2\2\2A!\3\2\2\2A&\3"+
		"\2\2\2A,\3\2\2\2A\64\3\2\2\2A8\3\2\2\2A<\3\2\2\2A@\3\2\2\2B\5\3\2\2\2"+
		"Ca\7&\2\2DE\7&\2\2EF\7\24\2\2Fa\5\6\4\2Ga\7\25\2\2HI\7\26\2\2IJ\7\6\2"+
		"\2JK\5\6\4\2KL\7\27\2\2LM\5\6\4\2MN\7\7\2\2Na\3\2\2\2OP\7\30\2\2PQ\7\6"+
		"\2\2QR\5\6\4\2RS\7\7\2\2Sa\3\2\2\2TU\7\31\2\2UV\7\6\2\2VW\5\6\4\2WX\7"+
		"\7\2\2Xa\3\2\2\2YZ\7\32\2\2Z[\7\6\2\2[\\\5\6\4\2\\]\7\27\2\2]^\5\6\4\2"+
		"^_\7\7\2\2_a\3\2\2\2`C\3\2\2\2`D\3\2\2\2`G\3\2\2\2`H\3\2\2\2`O\3\2\2\2"+
		"`T\3\2\2\2`Y\3\2\2\2a\7\3\2\2\2bh\7&\2\2ch\5\n\6\2dh\5\16\b\2eh\5\6\4"+
		"\2fh\5\22\n\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\t\3\2"+
		"\2\2i~\7\'\2\2j~\7&\2\2kl\7\'\2\2lm\5\f\7\2mn\5\n\6\2n~\3\2\2\2op\7&\2"+
		"\2pq\5\f\7\2qr\5\n\6\2r~\3\2\2\2st\7\6\2\2tu\5\n\6\2uv\7\7\2\2v~\3\2\2"+
		"\2wx\7\6\2\2xy\5\n\6\2yz\7\7\2\2z{\5\f\7\2{|\5\n\6\2|~\3\2\2\2}i\3\2\2"+
		"\2}j\3\2\2\2}k\3\2\2\2}o\3\2\2\2}s\3\2\2\2}w\3\2\2\2~\13\3\2\2\2\177\u0080"+
		"\t\2\2\2\u0080\r\3\2\2\2\u0081\u0098\7%\2\2\u0082\u0098\7&\2\2\u0083\u0084"+
		"\7%\2\2\u0084\u0085\5\20\t\2\u0085\u0086\5\16\b\2\u0086\u0098\3\2\2\2"+
		"\u0087\u0088\7&\2\2\u0088\u0089\5\20\t\2\u0089\u008a\5\16\b\2\u008a\u0098"+
		"\3\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\7\2\2"+
		"\u008e\u0098\3\2\2\2\u008f\u0090\7\6\2\2\u0090\u0091\5\16\b\2\u0091\u0092"+
		"\7\7\2\2\u0092\u0093\5\20\t\2\u0093\u0094\5\16\b\2\u0094\u0098\3\2\2\2"+
		"\u0095\u0096\7\37\2\2\u0096\u0098\5\16\b\2\u0097\u0081\3\2\2\2\u0097\u0082"+
		"\3\2\2\2\u0097\u0083\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u008b\3\2\2\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0095\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\t\3\2"+
		"\2\u009a\21\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7&\2\2\u009d\u009e"+
		"\7\27\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7$\2\2\u00a0\u00ad\3\2\2\2\u00a1"+
		"\u00a2\7#\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5\b"+
		"\5\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00ad\3\2\2\2\u00a8"+
		"\u00a9\7&\2\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ad\7\7\2"+
		"\2\u00ac\u009b\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\23"+
		"\3\2\2\2\t\31A`g}\u0097\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}