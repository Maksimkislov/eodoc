// Generated from EOlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EOlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OB=2, NEWLINE=3, OPEN_PAREN=4, CLOSE_PAREN=5, OPEN_BRACK=6, CLOSE_BRACK=7, 
		SKIP_=8, COMMENT=9, INDENT=10, DEDENT=11;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_compound_stmt = 3, 
		RULE_suite = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "simple_stmt", "compound_stmt", "suite", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OB", "NEWLINE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", 
			"CLOSE_BRACK", "SKIP_", "COMMENT", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "EOlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EOlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EOlangParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EOlangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EOlangParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitFile_input(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 604L) != 0)) {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(12);
					match(NEWLINE);
					}
					break;
				case OB:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case COMMENT:
					{
					setState(13);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				compound_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_stmtContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(EOlangParser.COMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(EOlangParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(COMMENT);
				setState(26);
				match(NEWLINE);
				}
				break;
			case OB:
			case OPEN_PAREN:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				expr(0);
				setState(28);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_stmtContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(EOlangParser.COMMENT, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compound_stmt);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(COMMENT);
				setState(33);
				suite();
				}
				break;
			case OB:
			case OPEN_PAREN:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				expr(0);
				setState(35);
				suite();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EOlangParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(EOlangParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(EOlangParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_suite);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OB:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(NEWLINE);
				setState(41);
				match(INDENT);
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					stmt();
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 596L) != 0) );
				setState(47);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamingExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OB() { return getToken(EOlangParser.OB, 0); }
		public NamingExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterNamingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitNamingExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SquareExprContext extends ExprContext {
		public TerminalNode OPEN_BRACK() { return getToken(EOlangParser.OPEN_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(EOlangParser.CLOSE_BRACK, 0); }
		public SquareExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterSquareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitSquareExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AbstractExprContext extends ExprContext {
		public TerminalNode OPEN_BRACK() { return getToken(EOlangParser.OPEN_BRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(EOlangParser.CLOSE_BRACK, 0); }
		public TerminalNode OB() { return getToken(EOlangParser.OB, 0); }
		public AbstractExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterAbstractExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitAbstractExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensExprContext extends ExprContext {
		public TerminalNode OPEN_PAREN() { return getToken(EOlangParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(EOlangParser.CLOSE_PAREN, 0); }
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitParensExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectListContext extends ExprContext {
		public List<TerminalNode> OB() { return getTokens(EOlangParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(EOlangParser.OB, i);
		}
		public ObjectListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitObjectList(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ExprContext {
		public TerminalNode OB() { return getToken(EOlangParser.OB, 0); }
		public ObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EOlangListener ) ((EOlangListener)listener).exitObject(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new AbstractExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(OPEN_BRACK);
				setState(53);
				expr(0);
				setState(54);
				match(CLOSE_BRACK);
				setState(55);
				match(T__0);
				setState(56);
				match(OB);
				}
				break;
			case 2:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(OPEN_PAREN);
				setState(59);
				expr(0);
				setState(60);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new SquareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(OPEN_BRACK);
				setState(63);
				expr(0);
				setState(64);
				match(CLOSE_BRACK);
				}
				break;
			case 4:
				{
				_localctx = new ObjectListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(OB);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(69); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				{
				_localctx = new ObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(OB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NamingExprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(74);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(75);
					match(T__0);
					setState(76);
					match(OB);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000bS\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n"+
		"\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004,\b\u0004\u000b\u0004\f\u0004"+
		"-\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005D\b\u0005\u000b\u0005\f\u0005E\u0001"+
		"\u0005\u0003\u0005I\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0005\u0000\u0001\n\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0000Y\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000"+
		"\u0000\u0006%\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\nH\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0005\u0003\u0000\u0000\r\u000f\u0003\u0002"+
		"\u0001\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\r\u0001\u0000\u0000"+
		"\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000\u0000"+
		"\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0000\u0000"+
		"\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0018\u0003\u0004\u0002"+
		"\u0000\u0016\u0018\u0003\u0006\u0003\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005\t\u0000\u0000\u001a\u001f\u0005\u0003\u0000\u0000"+
		"\u001b\u001c\u0003\n\u0005\u0000\u001c\u001d\u0005\u0003\u0000\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e"+
		"\u001b\u0001\u0000\u0000\u0000\u001f\u0005\u0001\u0000\u0000\u0000 !\u0005"+
		"\t\u0000\u0000!&\u0003\b\u0004\u0000\"#\u0003\n\u0005\u0000#$\u0003\b"+
		"\u0004\u0000$&\u0001\u0000\u0000\u0000% \u0001\u0000\u0000\u0000%\"\u0001"+
		"\u0000\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\'2\u0003\u0004\u0002"+
		"\u0000()\u0005\u0003\u0000\u0000)+\u0005\n\u0000\u0000*,\u0003\u0002\u0001"+
		"\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005"+
		"\u000b\u0000\u000002\u0001\u0000\u0000\u00001\'\u0001\u0000\u0000\u0000"+
		"1(\u0001\u0000\u0000\u00002\t\u0001\u0000\u0000\u000034\u0006\u0005\uffff"+
		"\uffff\u000045\u0005\u0006\u0000\u000056\u0003\n\u0005\u000067\u0005\u0007"+
		"\u0000\u000078\u0005\u0001\u0000\u000089\u0005\u0002\u0000\u00009I\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005"+
		"\u0005\u0000\u0000=I\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@A\u0005\u0007\u0000\u0000AI\u0001\u0000\u0000\u0000"+
		"BD\u0005\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GI\u0005\u0002\u0000\u0000H3\u0001\u0000\u0000\u0000H:\u0001"+
		"\u0000\u0000\u0000H>\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IO\u0001\u0000\u0000\u0000JK\n\u0005\u0000\u0000"+
		"KL\u0005\u0001\u0000\u0000LN\u0005\u0002\u0000\u0000MJ\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"\n\u000e\u0010\u0017\u001e%-1EHO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}