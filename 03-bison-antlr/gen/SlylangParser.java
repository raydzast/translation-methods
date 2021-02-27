// Generated from /Users/personal/translation-methods/03-bison-antlr/src/Slylang.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.stream.Collectors;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlylangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, LOOP=4, FOR=5, IN=6, UNTIL=7, BREAK=8, CONTINUE=9, 
		SCAN=10, ECHO=11, RET=12, AND=13, OR=14, XOR=15, NOT=16, NOT_EQ=17, EQ=18, 
		PLUS=19, MINUS=20, MULTIPLY=21, DIVIDE=22, MOD=23, ASSIGN=24, COMMA=25, 
		LP=26, RP=27, LT=28, GT=29, LCB=30, RCB=31, ID=32, INT=33, WS=34;
	public static final int
		RULE_file = 0, RULE_functionDefinitions = 1, RULE_functionDefinition = 2, 
		RULE_argumentsClosure = 3, RULE_ret = 4, RULE_argumentS = 5, RULE_arguments_ = 6, 
		RULE_statements = 7, RULE_statement = 8, RULE_scan_stmt = 9, RULE_echo_stmt = 10, 
		RULE_if_stmt = 11, RULE_else_ = 12, RULE_elifs_ = 13, RULE_loop = 14, 
		RULE_for_stmt = 15, RULE_assignment = 16, RULE_expressionS = 17, RULE_expression = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "functionDefinitions", "functionDefinition", "argumentsClosure", 
			"ret", "argumentS", "arguments_", "statements", "statement", "scan_stmt", 
			"echo_stmt", "if_stmt", "else_", "elifs_", "loop", "for_stmt", "assignment", 
			"expressionS", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'loop'", "'for'", "'in'", "'until'", 
			"'break'", "'continue'", "'scan'", "'echo'", "'ret'", "'and'", "'or'", 
			"'xor'", "'not'", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "','", "'('", "')'", "'<'", "'>'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "LOOP", "FOR", "IN", "UNTIL", "BREAK", "CONTINUE", 
			"SCAN", "ECHO", "RET", "AND", "OR", "XOR", "NOT", "NOT_EQ", "EQ", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "ASSIGN", "COMMA", "LP", "RP", 
			"LT", "GT", "LCB", "RCB", "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "Slylang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlylangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public String cpp;
		public FunctionDefinitionsContext xs;
		public TerminalNode EOF() { return getToken(SlylangParser.EOF, 0); }
		public FunctionDefinitionsContext functionDefinitions() {
			return getRuleContext(FunctionDefinitionsContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((FileContext)_localctx).xs = functionDefinitions(0);
			setState(39);
			match(EOF);

			        ArrayList<String> lines = new ArrayList<String>();

			        lines.add("#include <iostream>");
			        lines.add("using namespace std;");
			        lines.add("");
			        lines.addAll(((FileContext)_localctx).xs.declarations);
			        lines.add(((FileContext)_localctx).xs.cpp);

			        ((FileContext)_localctx).cpp =  String.join("\n", lines);
			    
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

	public static class FunctionDefinitionsContext extends ParserRuleContext {
		public String cpp;
		public ArrayList<String> declarations;
		public FunctionDefinitionsContext xs;
		public FunctionDefinitionContext x;
		public FunctionDefinitionsContext functionDefinitions() {
			return getRuleContext(FunctionDefinitionsContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterFunctionDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitFunctionDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitFunctionDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionsContext functionDefinitions() throws RecognitionException {
		return functionDefinitions(0);
	}

	private FunctionDefinitionsContext functionDefinitions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionDefinitionsContext _localctx = new FunctionDefinitionsContext(_ctx, _parentState);
		FunctionDefinitionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_functionDefinitions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((FunctionDefinitionsContext)_localctx).cpp =  ""; ((FunctionDefinitionsContext)_localctx).declarations =  new ArrayList<String>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionDefinitionsContext(_parentctx, _parentState);
					_localctx.xs = _prevctx;
					_localctx.xs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionDefinitions);
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					((FunctionDefinitionsContext)_localctx).x = functionDefinition();
					 ((FunctionDefinitionsContext)_localctx).cpp =  String.format("%s\n\n%s", ((FunctionDefinitionsContext)_localctx).xs.cpp, ((FunctionDefinitionsContext)_localctx).x.cpp); ((FunctionDefinitionsContext)_localctx).declarations =  ((FunctionDefinitionsContext)_localctx).xs.declarations; _localctx.declarations.add(((FunctionDefinitionsContext)_localctx).x.declaration); 
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public String cpp;
		public String declaration;
		public Token ID;
		public ArgumentsClosureContext a;
		public StatementsContext s;
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public ArgumentsClosureContext argumentsClosure() {
			return getRuleContext(ArgumentsClosureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(55);
			((FunctionDefinitionContext)_localctx).a = argumentsClosure();
			setState(56);
			match(LCB);
			setState(57);
			((FunctionDefinitionContext)_localctx).s = statements(0);
			setState(58);
			match(RCB);

			        String args = String.join(", ", ((FunctionDefinitionContext)_localctx).a.list.stream().map(str -> "int " + str).collect(Collectors.toList()));
			        ((FunctionDefinitionContext)_localctx).declaration =  String.format(
			            "int %s(%s);",
			            (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null),
			            args
			        );
			        ((FunctionDefinitionContext)_localctx).s.used.removeAll(((FunctionDefinitionContext)_localctx).a.list);
			        ((FunctionDefinitionContext)_localctx).s.used.add("_");
			        ((FunctionDefinitionContext)_localctx).cpp =  String.format(
			            "int %s(%s) {\nint %s;\n\n%s\n}",
			            (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null),
			            args,
			            String.join(", ", ((FunctionDefinitionContext)_localctx).s.used),
			            String.join("\n", ((FunctionDefinitionContext)_localctx).s.list)
			        );
			    
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

	public static class ArgumentsClosureContext extends ParserRuleContext {
		public List<String> list;
		public ArgumentSContext xs;
		public TerminalNode LP() { return getToken(SlylangParser.LP, 0); }
		public TerminalNode RP() { return getToken(SlylangParser.RP, 0); }
		public ArgumentSContext argumentS() {
			return getRuleContext(ArgumentSContext.class,0);
		}
		public ArgumentsClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsClosure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterArgumentsClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitArgumentsClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitArgumentsClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsClosureContext argumentsClosure() throws RecognitionException {
		ArgumentsClosureContext _localctx = new ArgumentsClosureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentsClosure);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(LP);
				setState(62);
				((ArgumentsClosureContext)_localctx).xs = argumentS();
				setState(63);
				match(RP);
				 ((ArgumentsClosureContext)_localctx).list =  ((ArgumentsClosureContext)_localctx).xs.list.stream().map(str -> "_" + str).collect(Collectors.toList()); 
				}
				break;
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
				 ((ArgumentsClosureContext)_localctx).list =  new ArrayList<String>(); 
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

	public static class RetContext extends ParserRuleContext {
		public String cpp;
		public ExpressionContext x;
		public TerminalNode RET() { return getToken(SlylangParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RET);
			setState(70);
			((RetContext)_localctx).x = expression(0);
			 ((RetContext)_localctx).cpp =  String.format("return %s;", ((RetContext)_localctx).x.cpp); 
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

	public static class ArgumentSContext extends ParserRuleContext {
		public ArrayList<String> list;
		public Token ID;
		public Arguments_Context xs;
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(SlylangParser.COMMA, 0); }
		public Arguments_Context arguments_() {
			return getRuleContext(Arguments_Context.class,0);
		}
		public ArgumentSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterArgumentS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitArgumentS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitArgumentS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentSContext argumentS() throws RecognitionException {
		ArgumentSContext _localctx = new ArgumentSContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentS);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((ArgumentSContext)_localctx).ID = match(ID);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(74);
					match(COMMA);
					}
				}

				 ((ArgumentSContext)_localctx).list =  new ArrayList<String>(); _localctx.list.add((((ArgumentSContext)_localctx).ID!=null?((ArgumentSContext)_localctx).ID.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((ArgumentSContext)_localctx).xs = arguments_(0);
				setState(79);
				((ArgumentSContext)_localctx).ID = match(ID);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(80);
					match(COMMA);
					}
				}

				 ((ArgumentSContext)_localctx).list =  ((ArgumentSContext)_localctx).xs.list; _localctx.list.add((((ArgumentSContext)_localctx).ID!=null?((ArgumentSContext)_localctx).ID.getText():null)); 
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

	public static class Arguments_Context extends ParserRuleContext {
		public ArrayList<String> list;
		public Arguments_Context xs;
		public Token ID;
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(SlylangParser.COMMA, 0); }
		public Arguments_Context arguments_() {
			return getRuleContext(Arguments_Context.class,0);
		}
		public Arguments_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterArguments_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitArguments_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitArguments_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_Context arguments_() throws RecognitionException {
		return arguments_(0);
	}

	private Arguments_Context arguments_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arguments_Context _localctx = new Arguments_Context(_ctx, _parentState);
		Arguments_Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arguments_, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((Arguments_Context)_localctx).list =  new ArrayList<String>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arguments_Context(_parentctx, _parentState);
					_localctx.xs = _prevctx;
					_localctx.xs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arguments_);
					setState(90);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(91);
					((Arguments_Context)_localctx).ID = match(ID);
					setState(92);
					match(COMMA);
					 ((Arguments_Context)_localctx).list =  ((Arguments_Context)_localctx).xs.list; _localctx.list.add((((Arguments_Context)_localctx).ID!=null?((Arguments_Context)_localctx).ID.getText():null)); 
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class StatementsContext extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public StatementsContext xs;
		public StatementContext x;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{

			        ((StatementsContext)_localctx).list =  new ArrayList<String>();
			        ((StatementsContext)_localctx).used =  new HashSet<String>();
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					_localctx.xs = _prevctx;
					_localctx.xs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					((StatementsContext)_localctx).x = statement(((StatementsContext)_localctx).xs.list, ((StatementsContext)_localctx).xs.used);

					                  ((StatementsContext)_localctx).used =  ((StatementsContext)_localctx).xs.used;
					                  ((StatementsContext)_localctx).list =  ((StatementsContext)_localctx).xs.list;
					              
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public AssignmentContext x;
		public RetContext y;
		public ExpressionContext z;
		public Scan_stmtContext s;
		public Echo_stmtContext e;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Scan_stmtContext scan_stmt() {
			return getRuleContext(Scan_stmtContext.class,0);
		}
		public Echo_stmtContext echo_stmt() {
			return getRuleContext(Echo_stmtContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SlylangParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(SlylangParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, ArrayList<String> list, HashSet<String> used) {
			super(parent, invokingState);
			this.list = list;
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement(ArrayList<String> list,HashSet<String> used) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), list, used);
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((StatementContext)_localctx).x = assignment(used);
				 _localctx.list.add(((StatementContext)_localctx).x.cpp); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((StatementContext)_localctx).y = ret();
				 _localctx.list.add(((StatementContext)_localctx).y.cpp); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				((StatementContext)_localctx).z = expression(0);
				 _localctx.list.add(((StatementContext)_localctx).z.cpp); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				if_stmt(list, used);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				loop(list, used);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				for_stmt(list, used);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				((StatementContext)_localctx).s = scan_stmt(used);
				 _localctx.list.add(((StatementContext)_localctx).s.cpp); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				((StatementContext)_localctx).e = echo_stmt();
				 _localctx.list.add(((StatementContext)_localctx).e.cpp); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(BREAK);
				 _localctx.list.add("break;"); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				match(CONTINUE);
				 _localctx.list.add("continue;"); 
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

	public static class Scan_stmtContext extends ParserRuleContext {
		public HashSet<String> used;
		public String cpp;
		public Token ID;
		public TerminalNode SCAN() { return getToken(SlylangParser.SCAN, 0); }
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public Scan_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Scan_stmtContext(ParserRuleContext parent, int invokingState, HashSet<String> used) {
			super(parent, invokingState);
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_scan_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterScan_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitScan_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitScan_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_stmtContext scan_stmt(HashSet<String> used) throws RecognitionException {
		Scan_stmtContext _localctx = new Scan_stmtContext(_ctx, getState(), used);
		enterRule(_localctx, 18, RULE_scan_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(SCAN);
			setState(136);
			((Scan_stmtContext)_localctx).ID = match(ID);
			 ((Scan_stmtContext)_localctx).cpp =  String.format("cin >> %s;", "_" + (((Scan_stmtContext)_localctx).ID!=null?((Scan_stmtContext)_localctx).ID.getText():null)); _localctx.used.add("_" + (((Scan_stmtContext)_localctx).ID!=null?((Scan_stmtContext)_localctx).ID.getText():null)); 
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

	public static class Echo_stmtContext extends ParserRuleContext {
		public String cpp;
		public ExpressionContext x;
		public TerminalNode ECHO() { return getToken(SlylangParser.ECHO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Echo_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterEcho_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitEcho_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitEcho_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Echo_stmtContext echo_stmt() throws RecognitionException {
		Echo_stmtContext _localctx = new Echo_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_echo_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ECHO);
			setState(140);
			((Echo_stmtContext)_localctx).x = expression(0);
			 ((Echo_stmtContext)_localctx).cpp =  String.format("cout << %s << endl;", ((Echo_stmtContext)_localctx).x.cpp); 
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

	public static class If_stmtContext extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public ExpressionContext c;
		public StatementsContext ss;
		public Else_Context el;
		public TerminalNode IF() { return getToken(SlylangParser.IF, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_stmtContext(ParserRuleContext parent, int invokingState, ArrayList<String> list, HashSet<String> used) {
			super(parent, invokingState);
			this.list = list;
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt(ArrayList<String> list,HashSet<String> used) throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState(), list, used);
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IF);
			setState(144);
			((If_stmtContext)_localctx).c = expression(0);
			setState(145);
			match(LCB);
			setState(146);
			((If_stmtContext)_localctx).ss = statements(0);
			setState(147);
			match(RCB);
			setState(148);
			((If_stmtContext)_localctx).el = else_();

			        _localctx.list.add(String.format("if (%s) {", ((If_stmtContext)_localctx).c.cpp));
			        _localctx.list.addAll(((If_stmtContext)_localctx).ss.list);
			        _localctx.list.add("}");
			        _localctx.list.addAll(((If_stmtContext)_localctx).el.list);
			        _localctx.used.addAll(((If_stmtContext)_localctx).ss.used);
			        _localctx.used.addAll(((If_stmtContext)_localctx).el.used);
			    
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

	public static class Else_Context extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public Elifs_Context es;
		public StatementsContext ss;
		public Elifs_Context elifs_() {
			return getRuleContext(Elifs_Context.class,0);
		}
		public TerminalNode ELSE() { return getToken(SlylangParser.ELSE, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((Else_Context)_localctx).es = elifs_(0);
				 ((Else_Context)_localctx).list =  ((Else_Context)_localctx).es.list; ((Else_Context)_localctx).used =  ((Else_Context)_localctx).es.used; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((Else_Context)_localctx).es = elifs_(0);
				setState(155);
				match(ELSE);
				setState(156);
				match(LCB);
				setState(157);
				((Else_Context)_localctx).ss = statements(0);
				setState(158);
				match(RCB);

				        ((Else_Context)_localctx).list =  ((Else_Context)_localctx).es.list;
				        _localctx.list.add("else {");
				        _localctx.list.addAll(((Else_Context)_localctx).ss.list);
				        _localctx.list.add("}");
				        ((Else_Context)_localctx).used =  ((Else_Context)_localctx).es.used;
				        _localctx.used.addAll(((Else_Context)_localctx).ss.used);
				    
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

	public static class Elifs_Context extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public Elifs_Context i;
		public ExpressionContext c;
		public StatementsContext ss;
		public TerminalNode ELIF() { return getToken(SlylangParser.ELIF, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public Elifs_Context elifs_() {
			return getRuleContext(Elifs_Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Elifs_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifs_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterElifs_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitElifs_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitElifs_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elifs_Context elifs_() throws RecognitionException {
		return elifs_(0);
	}

	private Elifs_Context elifs_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Elifs_Context _localctx = new Elifs_Context(_ctx, _parentState);
		Elifs_Context _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_elifs_, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			 ((Elifs_Context)_localctx).list =  new ArrayList<String>(); ((Elifs_Context)_localctx).used =  new HashSet<String>(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Elifs_Context(_parentctx, _parentState);
					_localctx.i = _prevctx;
					_localctx.i = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_elifs_);
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167);
					match(ELIF);
					setState(168);
					((Elifs_Context)_localctx).c = expression(0);
					setState(169);
					match(LCB);
					setState(170);
					((Elifs_Context)_localctx).ss = statements(0);
					setState(171);
					match(RCB);

					                  ((Elifs_Context)_localctx).list =  ((Elifs_Context)_localctx).i.list;
					                  _localctx.list.add(String.format("else if (%s) {", ((Elifs_Context)_localctx).c.cpp));
					                  _localctx.list.addAll(((Elifs_Context)_localctx).ss.list);
					                  _localctx.list.add("}");
					                  ((Elifs_Context)_localctx).used =  ((Elifs_Context)_localctx).i.used;
					                  _localctx.used.addAll(((Elifs_Context)_localctx).ss.used);
					              
					}
					} 
				}
				setState(178);
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

	public static class LoopContext extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public ExpressionContext c;
		public StatementsContext ss;
		public TerminalNode LOOP() { return getToken(SlylangParser.LOOP, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LoopContext(ParserRuleContext parent, int invokingState, ArrayList<String> list, HashSet<String> used) {
			super(parent, invokingState);
			this.list = list;
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop(ArrayList<String> list,HashSet<String> used) throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState(), list, used);
		enterRule(_localctx, 28, RULE_loop);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(LOOP);
				setState(180);
				((LoopContext)_localctx).c = expression(0);
				setState(181);
				match(LCB);
				setState(182);
				((LoopContext)_localctx).ss = statements(0);
				setState(183);
				match(RCB);

				        _localctx.list.add(String.format("while (%s) {", ((LoopContext)_localctx).c.cpp));
				        _localctx.list.addAll(((LoopContext)_localctx).ss.list);
				        _localctx.list.add("}");
				        _localctx.used.addAll(((LoopContext)_localctx).ss.used);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(LOOP);
				setState(187);
				match(LCB);
				setState(188);
				((LoopContext)_localctx).ss = statements(0);
				setState(189);
				match(RCB);

				        _localctx.list.add("while (true) {");
				        _localctx.list.addAll(((LoopContext)_localctx).ss.list);
				        _localctx.list.add("}");
				        _localctx.used.addAll(((LoopContext)_localctx).ss.used);
				    
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

	public static class For_stmtContext extends ParserRuleContext {
		public ArrayList<String> list;
		public HashSet<String> used;
		public Token ID;
		public ExpressionContext l;
		public ExpressionContext r;
		public StatementsContext ss;
		public TerminalNode FOR() { return getToken(SlylangParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public TerminalNode IN() { return getToken(SlylangParser.IN, 0); }
		public TerminalNode UNTIL() { return getToken(SlylangParser.UNTIL, 0); }
		public TerminalNode LCB() { return getToken(SlylangParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(SlylangParser.RCB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_stmtContext(ParserRuleContext parent, int invokingState, ArrayList<String> list, HashSet<String> used) {
			super(parent, invokingState);
			this.list = list;
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt(ArrayList<String> list,HashSet<String> used) throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState(), list, used);
		enterRule(_localctx, 30, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FOR);
			setState(195);
			((For_stmtContext)_localctx).ID = match(ID);
			setState(196);
			match(IN);
			setState(197);
			((For_stmtContext)_localctx).l = expression(0);
			setState(198);
			match(UNTIL);
			setState(199);
			((For_stmtContext)_localctx).r = expression(0);
			setState(200);
			match(LCB);
			setState(201);
			((For_stmtContext)_localctx).ss = statements(0);
			setState(202);
			match(RCB);

			        _localctx.list.add(String.format("for (int _%s = %s; _%s < %s; _%s++) {", (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null), ((For_stmtContext)_localctx).l.cpp, (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null), ((For_stmtContext)_localctx).r.cpp, (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null)));
			        _localctx.list.addAll(((For_stmtContext)_localctx).ss.list);
			        _localctx.list.add("}");
			        _localctx.used.addAll(((For_stmtContext)_localctx).ss.used);
			    
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

	public static class AssignmentContext extends ParserRuleContext {
		public HashSet<String> used;
		public String cpp;
		public ArgumentSContext xs;
		public ExpressionSContext ys;
		public TerminalNode ASSIGN() { return getToken(SlylangParser.ASSIGN, 0); }
		public ArgumentSContext argumentS() {
			return getRuleContext(ArgumentSContext.class,0);
		}
		public ExpressionSContext expressionS() {
			return getRuleContext(ExpressionSContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignmentContext(ParserRuleContext parent, int invokingState, HashSet<String> used) {
			super(parent, invokingState);
			this.used = used;
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment(HashSet<String> used) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), used);
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((AssignmentContext)_localctx).xs = argumentS();
			setState(206);
			match(ASSIGN);
			setState(207);
			((AssignmentContext)_localctx).ys = expressionS(0);

			        ArrayList<String> lines = new ArrayList<String>();
			        for (int i = 0; i < ((AssignmentContext)_localctx).xs.list.size(); i++) {
			            String tmpName = String.format("__tmp_%s", ((AssignmentContext)_localctx).xs.list.get(i));
			            _localctx.used.add("_" + ((AssignmentContext)_localctx).xs.list.get(i));
			            _localctx.used.add(tmpName);
			            lines.add(String.format("%s = %s;", tmpName, ((AssignmentContext)_localctx).ys.list.get(i)));
			        }
			        for (String name : ((AssignmentContext)_localctx).xs.list) {
			            lines.add(String.format("_%s = __tmp_%s;", name, name));
			        }

			        ((AssignmentContext)_localctx).cpp =  String.join("\n", lines);
			    
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

	public static class ExpressionSContext extends ParserRuleContext {
		public ArrayList<String> list;
		public ExpressionSContext xs;
		public ExpressionContext x;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SlylangParser.COMMA, 0); }
		public ExpressionSContext expressionS() {
			return getRuleContext(ExpressionSContext.class,0);
		}
		public ExpressionSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterExpressionS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitExpressionS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitExpressionS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSContext expressionS() throws RecognitionException {
		return expressionS(0);
	}

	private ExpressionSContext expressionS(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionSContext _localctx = new ExpressionSContext(_ctx, _parentState);
		ExpressionSContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressionS, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			((ExpressionSContext)_localctx).x = expression(0);
			 ((ExpressionSContext)_localctx).list =  new ArrayList<String>(); _localctx.list.add(((ExpressionSContext)_localctx).x.cpp); 
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionSContext(_parentctx, _parentState);
					_localctx.xs = _prevctx;
					_localctx.xs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionS);
					setState(214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(215);
					match(COMMA);
					setState(216);
					((ExpressionSContext)_localctx).x = expression(0);
					 ((ExpressionSContext)_localctx).list =  ((ExpressionSContext)_localctx).xs.list; _localctx.list.add(((ExpressionSContext)_localctx).x.cpp); 
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public String cpp;
		public ExpressionContext l;
		public Token INT;
		public Token ID;
		public ExpressionSContext xs;
		public ExpressionContext x;
		public ExpressionContext e;
		public ExpressionContext r;
		public TerminalNode INT() { return getToken(SlylangParser.INT, 0); }
		public TerminalNode ID() { return getToken(SlylangParser.ID, 0); }
		public TerminalNode LP() { return getToken(SlylangParser.LP, 0); }
		public TerminalNode RP() { return getToken(SlylangParser.RP, 0); }
		public ExpressionSContext expressionS() {
			return getRuleContext(ExpressionSContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SlylangParser.NOT, 0); }
		public TerminalNode MULTIPLY() { return getToken(SlylangParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(SlylangParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SlylangParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SlylangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SlylangParser.MINUS, 0); }
		public TerminalNode EQ() { return getToken(SlylangParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(SlylangParser.NOT_EQ, 0); }
		public TerminalNode LT() { return getToken(SlylangParser.LT, 0); }
		public TerminalNode GT() { return getToken(SlylangParser.GT, 0); }
		public TerminalNode AND() { return getToken(SlylangParser.AND, 0); }
		public TerminalNode XOR() { return getToken(SlylangParser.XOR, 0); }
		public TerminalNode OR() { return getToken(SlylangParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlylangListener ) ((SlylangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlylangVisitor ) return ((SlylangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(225);
				((ExpressionContext)_localctx).INT = match(INT);
				 ((ExpressionContext)_localctx).cpp =  (((ExpressionContext)_localctx).INT!=null?((ExpressionContext)_localctx).INT.getText():null); 
				}
				break;
			case 2:
				{
				setState(227);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).cpp =  "_" + (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null); 
				}
				break;
			case 3:
				{
				setState(229);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(230);
				match(LP);
				setState(231);
				((ExpressionContext)_localctx).xs = expressionS(0);
				setState(232);
				match(RP);
				 ((ExpressionContext)_localctx).cpp =  String.format("%s(%s)", (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), String.join(", ", ((ExpressionContext)_localctx).xs.list)); 
				}
				break;
			case 4:
				{
				setState(235);
				match(LP);
				setState(236);
				((ExpressionContext)_localctx).x = expression(0);
				setState(237);
				match(RP);
				 ((ExpressionContext)_localctx).cpp =  String.format("(%s)", ((ExpressionContext)_localctx).x.cpp); 
				}
				break;
			case 5:
				{
				setState(240);
				match(NOT);
				setState(241);
				((ExpressionContext)_localctx).e = expression(13);
				 ((ExpressionContext)_localctx).cpp =  String.format("!%s", ((ExpressionContext)_localctx).e.cpp); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						match(MULTIPLY);
						setState(248);
						((ExpressionContext)_localctx).r = expression(13);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s * %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(252);
						match(DIVIDE);
						setState(253);
						((ExpressionContext)_localctx).r = expression(12);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s / %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(257);
						match(MOD);
						setState(258);
						((ExpressionContext)_localctx).r = expression(11);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s %% %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(262);
						match(PLUS);
						setState(263);
						((ExpressionContext)_localctx).r = expression(10);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s + %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(267);
						match(MINUS);
						setState(268);
						((ExpressionContext)_localctx).r = expression(9);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s - %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(272);
						match(EQ);
						setState(273);
						((ExpressionContext)_localctx).r = expression(8);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s == %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(277);
						match(NOT_EQ);
						setState(278);
						((ExpressionContext)_localctx).r = expression(7);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s != %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						match(LT);
						setState(283);
						((ExpressionContext)_localctx).r = expression(6);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s < %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(287);
						match(GT);
						setState(288);
						((ExpressionContext)_localctx).r = expression(5);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s > %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						match(AND);
						setState(293);
						((ExpressionContext)_localctx).r = expression(4);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s && %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						match(XOR);
						setState(298);
						((ExpressionContext)_localctx).r = expression(3);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s ^ %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(302);
						match(OR);
						setState(303);
						((ExpressionContext)_localctx).r = expression(2);
						 ((ExpressionContext)_localctx).cpp =  String.format("%s || %s", ((ExpressionContext)_localctx).l.cpp, ((ExpressionContext)_localctx).r.cpp); 
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 1:
			return functionDefinitions_sempred((FunctionDefinitionsContext)_localctx, predIndex);
		case 6:
			return arguments__sempred((Arguments_Context)_localctx, predIndex);
		case 7:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 13:
			return elifs__sempred((Elifs_Context)_localctx, predIndex);
		case 17:
			return expressionS_sempred((ExpressionSContext)_localctx, predIndex);
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionDefinitions_sempred(FunctionDefinitionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arguments__sempred(Arguments_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elifs__sempred(Elifs_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionS_sempred(ExpressionSContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\5\7T\n"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00b1\n\17\f\17\16\17\u00b4\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00de\n\23\f\23\16\23\u00e1\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0135\n\24\f\24\16\24\u0138\13\24\3\24\2\b\4\16\20\34$&\25\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u014a\2(\3\2\2\2\4,\3\2\2\2\6"+
		"8\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20e\3\2\2\2\22"+
		"\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u0091\3\2\2\2\32\u00a3"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00c2\3\2\2\2 \u00c4\3\2\2\2\"\u00cf\3\2"+
		"\2\2$\u00d4\3\2\2\2&\u00f6\3\2\2\2()\5\4\3\2)*\7\2\2\3*+\b\2\1\2+\3\3"+
		"\2\2\2,-\b\3\1\2-.\b\3\1\2.\65\3\2\2\2/\60\f\4\2\2\60\61\5\6\4\2\61\62"+
		"\b\3\1\2\62\64\3\2\2\2\63/\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\7\"\2\29:\5\b\5\2:;\7 \2\2;<\5\20"+
		"\t\2<=\7!\2\2=>\b\4\1\2>\7\3\2\2\2?@\7\34\2\2@A\5\f\7\2AB\7\35\2\2BC\b"+
		"\5\1\2CF\3\2\2\2DF\b\5\1\2E?\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7\16\2\2H"+
		"I\5&\24\2IJ\b\6\1\2J\13\3\2\2\2KM\7\"\2\2LN\7\33\2\2ML\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OX\b\7\1\2PQ\5\16\b\2QS\7\"\2\2RT\7\33\2\2SR\3\2\2\2ST\3\2"+
		"\2\2TU\3\2\2\2UV\b\7\1\2VX\3\2\2\2WK\3\2\2\2WP\3\2\2\2X\r\3\2\2\2YZ\b"+
		"\b\1\2Z[\b\b\1\2[b\3\2\2\2\\]\f\3\2\2]^\7\"\2\2^_\7\33\2\2_a\b\b\1\2`"+
		"\\\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2ef\b\t\1"+
		"\2fg\b\t\1\2gn\3\2\2\2hi\f\3\2\2ij\5\22\n\2jk\b\t\1\2km\3\2\2\2lh\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2pn\3\2\2\2qr\5\"\22\2rs"+
		"\b\n\1\2s\u0088\3\2\2\2tu\5\n\6\2uv\b\n\1\2v\u0088\3\2\2\2wx\5&\24\2x"+
		"y\b\n\1\2y\u0088\3\2\2\2z\u0088\5\30\r\2{\u0088\5\36\20\2|\u0088\5 \21"+
		"\2}~\5\24\13\2~\177\b\n\1\2\177\u0088\3\2\2\2\u0080\u0081\5\26\f\2\u0081"+
		"\u0082\b\n\1\2\u0082\u0088\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0088\b\n"+
		"\1\2\u0085\u0086\7\13\2\2\u0086\u0088\b\n\1\2\u0087q\3\2\2\2\u0087t\3"+
		"\2\2\2\u0087w\3\2\2\2\u0087z\3\2\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087"+
		"}\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\23\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7\"\2\2\u008b\u008c"+
		"\b\13\1\2\u008c\25\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\5&\24\2\u008f"+
		"\u0090\b\f\1\2\u0090\27\3\2\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5&\24"+
		"\2\u0093\u0094\7 \2\2\u0094\u0095\5\20\t\2\u0095\u0096\7!\2\2\u0096\u0097"+
		"\5\32\16\2\u0097\u0098\b\r\1\2\u0098\31\3\2\2\2\u0099\u009a\5\34\17\2"+
		"\u009a\u009b\b\16\1\2\u009b\u00a4\3\2\2\2\u009c\u009d\5\34\17\2\u009d"+
		"\u009e\7\5\2\2\u009e\u009f\7 \2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7!"+
		"\2\2\u00a1\u00a2\b\16\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\b\17\1\2\u00a6\u00a7\b\17"+
		"\1\2\u00a7\u00b2\3\2\2\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\7\4\2\2\u00aa"+
		"\u00ab\5&\24\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7!"+
		"\2\2\u00ae\u00af\b\17\1\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8"+
		"\7 \2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7!\2\2\u00ba\u00bb\b\20\1\2\u00bb"+
		"\u00c3\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7 \2\2\u00be\u00bf\5\20"+
		"\t\2\u00bf\u00c0\7!\2\2\u00c0\u00c1\b\20\1\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00b5\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\7\2"+
		"\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9"+
		"\7\t\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5\20\t\2\u00cc"+
		"\u00cd\7!\2\2\u00cd\u00ce\b\21\1\2\u00ce!\3\2\2\2\u00cf\u00d0\5\f\7\2"+
		"\u00d0\u00d1\7\32\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\b\22\1\2\u00d3#"+
		"\3\2\2\2\u00d4\u00d5\b\23\1\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\b\23\1\2"+
		"\u00d7\u00df\3\2\2\2\u00d8\u00d9\f\3\2\2\u00d9\u00da\7\33\2\2\u00da\u00db"+
		"\5&\24\2\u00db\u00dc\b\23\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2"+
		"\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0%\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b\24\1\2\u00e3\u00e4\7#\2\2\u00e4"+
		"\u00f7\b\24\1\2\u00e5\u00e6\7\"\2\2\u00e6\u00f7\b\24\1\2\u00e7\u00e8\7"+
		"\"\2\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7\35\2\2\u00eb"+
		"\u00ec\b\24\1\2\u00ec\u00f7\3\2\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00ef\5"+
		"&\24\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1\b\24\1\2\u00f1\u00f7\3\2\2\2\u00f2"+
		"\u00f3\7\22\2\2\u00f3\u00f4\5&\24\17\u00f4\u00f5\b\24\1\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f6"+
		"\u00ed\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u0136\3\2\2\2\u00f8\u00f9\f\16"+
		"\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\5&\24\17\u00fb\u00fc\b\24\1\2\u00fc"+
		"\u0135\3\2\2\2\u00fd\u00fe\f\r\2\2\u00fe\u00ff\7\30\2\2\u00ff\u0100\5"+
		"&\24\16\u0100\u0101\b\24\1\2\u0101\u0135\3\2\2\2\u0102\u0103\f\f\2\2\u0103"+
		"\u0104\7\31\2\2\u0104\u0105\5&\24\r\u0105\u0106\b\24\1\2\u0106\u0135\3"+
		"\2\2\2\u0107\u0108\f\13\2\2\u0108\u0109\7\25\2\2\u0109\u010a\5&\24\f\u010a"+
		"\u010b\b\24\1\2\u010b\u0135\3\2\2\2\u010c\u010d\f\n\2\2\u010d\u010e\7"+
		"\26\2\2\u010e\u010f\5&\24\13\u010f\u0110\b\24\1\2\u0110\u0135\3\2\2\2"+
		"\u0111\u0112\f\t\2\2\u0112\u0113\7\24\2\2\u0113\u0114\5&\24\n\u0114\u0115"+
		"\b\24\1\2\u0115\u0135\3\2\2\2\u0116\u0117\f\b\2\2\u0117\u0118\7\23\2\2"+
		"\u0118\u0119\5&\24\t\u0119\u011a\b\24\1\2\u011a\u0135\3\2\2\2\u011b\u011c"+
		"\f\7\2\2\u011c\u011d\7\36\2\2\u011d\u011e\5&\24\b\u011e\u011f\b\24\1\2"+
		"\u011f\u0135\3\2\2\2\u0120\u0121\f\6\2\2\u0121\u0122\7\37\2\2\u0122\u0123"+
		"\5&\24\7\u0123\u0124\b\24\1\2\u0124\u0135\3\2\2\2\u0125\u0126\f\5\2\2"+
		"\u0126\u0127\7\17\2\2\u0127\u0128\5&\24\6\u0128\u0129\b\24\1\2\u0129\u0135"+
		"\3\2\2\2\u012a\u012b\f\4\2\2\u012b\u012c\7\21\2\2\u012c\u012d\5&\24\5"+
		"\u012d\u012e\b\24\1\2\u012e\u0135\3\2\2\2\u012f\u0130\f\3\2\2\u0130\u0131"+
		"\7\20\2\2\u0131\u0132\5&\24\4\u0132\u0133\b\24\1\2\u0133\u0135\3\2\2\2"+
		"\u0134\u00f8\3\2\2\2\u0134\u00fd\3\2\2\2\u0134\u0102\3\2\2\2\u0134\u0107"+
		"\3\2\2\2\u0134\u010c\3\2\2\2\u0134\u0111\3\2\2\2\u0134\u0116\3\2\2\2\u0134"+
		"\u011b\3\2\2\2\u0134\u0120\3\2\2\2\u0134\u0125\3\2\2\2\u0134\u012a\3\2"+
		"\2\2\u0134\u012f\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\'\3\2\2\2\u0138\u0136\3\2\2\2\21\65EMSWbn\u0087\u00a3"+
		"\u00b2\u00c2\u00df\u00f6\u0134\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}