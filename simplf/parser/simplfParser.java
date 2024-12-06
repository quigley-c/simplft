// Generated from simplf.g4 by ANTLR 4.13.2

    package simplf.parser;
    import simplf.Stmt;
    import simplf.Stmt.*;

    import simplf.Expr;
    import simplf.Expr.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class simplfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_PAREN=1, RIGHT_PAREN=2, LEFT_BRACE=3, RIGHT_BRACE=4, COMMA=5, DOT=6, 
		MINUS=7, PLUS=8, SEMICOLON=9, COLON=10, STAR=11, SLASH=12, BANG=13, BANG_EQUAL=14, 
		EQUAL=15, EQUAL_EQUAL=16, GREATER=17, GREATER_EQUAL=18, LESS=19, LESS_EQUAL=20, 
		AND=21, CLASS=22, ELSE=23, FALSE=24, FOR=25, FUN=26, IF=27, NIL=28, OR=29, 
		PRINT=30, SUPER=31, THIS=32, TRUE=33, VAR=34, WHILE=35, CHAR=36, FLOAT=37, 
		STRING=38, IDENTIFIER=39, STRINGLIT=40, NUMBER=41, COMMENT=42, WHITESPACE=43;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_funDecl = 2, RULE_params = 3, 
		RULE_param = 4, RULE_varDecl = 5, RULE_statement = 6, RULE_block = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_forStatement = 10, 
		RULE_exprStatement = 11, RULE_printStatement = 12, RULE_arguments = 13, 
		RULE_expression = 14, RULE_literal = 15, RULE_type = 16, RULE_id = 17, 
		RULE_or = 18, RULE_and = 19, RULE_equal = 20, RULE_bang_equal = 21, RULE_equal_equal = 22, 
		RULE_greater = 23, RULE_greater_equal = 24, RULE_less = 25, RULE_less_equal = 26, 
		RULE_plus = 27, RULE_minus = 28, RULE_slash = 29, RULE_star = 30, RULE_bang = 31, 
		RULE_rparen = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "funDecl", "params", "param", "varDecl", "statement", 
			"block", "ifStatement", "whileStatement", "forStatement", "exprStatement", 
			"printStatement", "arguments", "expression", "literal", "type", "id", 
			"or", "and", "equal", "bang_equal", "equal_equal", "greater", "greater_equal", 
			"less", "less_equal", "plus", "minus", "slash", "star", "bang", "rparen"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'.'", "'-'", "'+'", "';'", 
			"':'", "'*'", "'/'", "'!'", "'!='", "'='", "'=='", "'>'", "'>='", "'<'", 
			"'<='", "'and'", "'class'", "'else'", "'false'", "'for'", "'fun'", "'if'", 
			"'nil'", "'or'", "'print'", "'super'", "'this'", "'true'", "'var'", "'while'", 
			"'char'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", 
			"DOT", "MINUS", "PLUS", "SEMICOLON", "COLON", "STAR", "SLASH", "BANG", 
			"BANG_EQUAL", "EQUAL", "EQUAL_EQUAL", "GREATER", "GREATER_EQUAL", "LESS", 
			"LESS_EQUAL", "AND", "CLASS", "ELSE", "FALSE", "FOR", "FUN", "IF", "NIL", 
			"OR", "PRINT", "SUPER", "THIS", "TRUE", "VAR", "WHILE", "CHAR", "FLOAT", 
			"STRING", "IDENTIFIER", "STRINGLIT", "NUMBER", "COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "simplf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simplfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Stmt> val = new ArrayList<>();;
		public DeclarationContext declaration;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3910014083210L) != 0)) {
				{
				{
				setState(66);
				((ProgramContext)_localctx).declaration = declaration();
				_localctx.val.add(((ProgramContext)_localctx).declaration.val);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Stmt val;
		public FunDeclContext funDecl;
		public VarDeclContext varDecl;
		public StatementContext statement;
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((DeclarationContext)_localctx).funDecl = funDecl();
				((DeclarationContext)_localctx).val =  ((DeclarationContext)_localctx).funDecl.val;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((DeclarationContext)_localctx).varDecl = varDecl();
				((DeclarationContext)_localctx).val =  ((DeclarationContext)_localctx).varDecl.val;
				}
				break;
			case LEFT_PAREN:
			case LEFT_BRACE:
			case MINUS:
			case BANG:
			case FALSE:
			case FOR:
			case IF:
			case NIL:
			case PRINT:
			case TRUE:
			case WHILE:
			case IDENTIFIER:
			case STRINGLIT:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				((DeclarationContext)_localctx).statement = statement();
				((DeclarationContext)_localctx).val =  ((DeclarationContext)_localctx).statement.val;
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
	public static class FunDeclContext extends ParserRuleContext {
		public Stmt val;
		public IdContext id;
		public TypeContext type;
		public BlockContext block;
		public ParamsContext params;
		public TerminalNode FUN() { return getToken(simplfParser.FUN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(simplfParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public TerminalNode COLON() { return getToken(simplfParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDecl);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(FUN);
				setState(86);
				((FunDeclContext)_localctx).id = id();
				setState(87);
				match(LEFT_PAREN);
				setState(88);
				match(RIGHT_PAREN);
				setState(89);
				match(COLON);
				setState(90);
				((FunDeclContext)_localctx).type = type();
				setState(91);
				((FunDeclContext)_localctx).block = block();
				((FunDeclContext)_localctx).val =  new Stmt.Function(((FunDeclContext)_localctx).id.val, new ArrayList<>(), ((FunDeclContext)_localctx).block.val, ((FunDeclContext)_localctx).type.r, new ArrayList<>());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(FUN);
				setState(95);
				((FunDeclContext)_localctx).id = id();
				setState(96);
				match(LEFT_PAREN);
				setState(97);
				((FunDeclContext)_localctx).params = params();
				setState(98);
				match(RIGHT_PAREN);
				setState(99);
				match(COLON);
				setState(100);
				((FunDeclContext)_localctx).type = type();
				setState(101);
				((FunDeclContext)_localctx).block = block();
				((FunDeclContext)_localctx).val =  new Stmt.Function(((FunDeclContext)_localctx).id.val, ((FunDeclContext)_localctx).params.names, ((FunDeclContext)_localctx).block.val, ((FunDeclContext)_localctx).type.r, ((FunDeclContext)_localctx).params.types);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<simplf.Token> names = new ArrayList<>();
		public List<simplf.DataType> types = new ArrayList<>();
		public ParamContext param1;
		public ParamContext parami;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(simplfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simplfParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((ParamsContext)_localctx).param1 = param();
			_localctx.names.add(((ParamsContext)_localctx).param1.p); _localctx.types.add(((ParamsContext)_localctx).param1.ty);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				((ParamsContext)_localctx).parami = param();
				_localctx.names.add(((ParamsContext)_localctx).parami.p); _localctx.types.add(((ParamsContext)_localctx).parami.ty);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public simplf.Token p;
		public simplf.DataType ty;
		public IdContext id;
		public TypeContext type;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(simplfParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((ParamContext)_localctx).id = id();
			setState(118);
			match(COLON);
			setState(119);
			((ParamContext)_localctx).type = type();
			 ((ParamContext)_localctx).p =  ((ParamContext)_localctx).id.val; ((ParamContext)_localctx).ty =  ((ParamContext)_localctx).type.r; 
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
	public static class VarDeclContext extends ParserRuleContext {
		public Stmt val;
		public IdContext id;
		public TypeContext type;
		public ExpressionContext expression;
		public TerminalNode VAR() { return getToken(simplfParser.VAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(simplfParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(simplfParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(simplfParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VAR);
				setState(123);
				((VarDeclContext)_localctx).id = id();
				setState(124);
				match(COLON);
				setState(125);
				((VarDeclContext)_localctx).type = type();
				setState(126);
				match(SEMICOLON);
				((VarDeclContext)_localctx).val =  new Stmt.Var(((VarDeclContext)_localctx).id.val, null, ((VarDeclContext)_localctx).type.r);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(VAR);
				setState(130);
				((VarDeclContext)_localctx).id = id();
				setState(131);
				match(COLON);
				setState(132);
				((VarDeclContext)_localctx).type = type();
				setState(133);
				match(EQUAL);
				setState(134);
				((VarDeclContext)_localctx).expression = expression(0);
				setState(135);
				match(SEMICOLON);
				((VarDeclContext)_localctx).val =  new Stmt.Var(((VarDeclContext)_localctx).id.val, ((VarDeclContext)_localctx).expression.val, ((VarDeclContext)_localctx).type.r);
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
	public static class StatementContext extends ParserRuleContext {
		public Stmt val;
		public ExprStatementContext exprStatement;
		public IfStatementContext ifStatement;
		public PrintStatementContext printStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public BlockContext block;
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
			case MINUS:
			case BANG:
			case FALSE:
			case NIL:
			case TRUE:
			case IDENTIFIER:
			case STRINGLIT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((StatementContext)_localctx).exprStatement = exprStatement();
				((StatementContext)_localctx).val =  ((StatementContext)_localctx).exprStatement.val;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((StatementContext)_localctx).ifStatement = ifStatement();
				((StatementContext)_localctx).val =  ((StatementContext)_localctx).ifStatement.val;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((StatementContext)_localctx).printStatement = printStatement();
				((StatementContext)_localctx).val =  ((StatementContext)_localctx).printStatement.val;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((StatementContext)_localctx).whileStatement = whileStatement();
				((StatementContext)_localctx).val =  ((StatementContext)_localctx).whileStatement.val;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				((StatementContext)_localctx).forStatement = forStatement();
				((StatementContext)_localctx).val =  ((StatementContext)_localctx).forStatement.val;
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				((StatementContext)_localctx).block = block();
				((StatementContext)_localctx).val =  new Stmt.Block(((StatementContext)_localctx).block.val);
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
	public static class BlockContext extends ParserRuleContext {
		public List<Stmt> val;
		public ProgramContext program;
		public TerminalNode LEFT_BRACE() { return getToken(simplfParser.LEFT_BRACE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(simplfParser.RIGHT_BRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LEFT_BRACE);
			setState(161);
			((BlockContext)_localctx).program = program();
			setState(162);
			match(RIGHT_BRACE);
			((BlockContext)_localctx).val =  ((BlockContext)_localctx).program.val;
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
	public static class IfStatementContext extends ParserRuleContext {
		public Stmt val;
		public ExpressionContext expression;
		public StatementContext statement;
		public StatementContext s1;
		public StatementContext s2;
		public TerminalNode IF() { return getToken(simplfParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(simplfParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(simplfParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(IF);
				setState(166);
				match(LEFT_PAREN);
				setState(167);
				((IfStatementContext)_localctx).expression = expression(0);
				setState(168);
				match(RIGHT_PAREN);
				setState(169);
				((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).val =  new Stmt.If(((IfStatementContext)_localctx).expression.val, ((IfStatementContext)_localctx).statement.val, null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IF);
				setState(173);
				match(LEFT_PAREN);
				setState(174);
				((IfStatementContext)_localctx).expression = expression(0);
				setState(175);
				match(RIGHT_PAREN);
				setState(176);
				((IfStatementContext)_localctx).s1 = statement();
				setState(177);
				match(ELSE);
				setState(178);
				((IfStatementContext)_localctx).s2 = statement();
				((IfStatementContext)_localctx).val =  new Stmt.If(((IfStatementContext)_localctx).expression.val, ((IfStatementContext)_localctx).s1.val, ((IfStatementContext)_localctx).s2.val);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public Stmt val;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode WHILE() { return getToken(simplfParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(simplfParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHILE);
			setState(184);
			match(LEFT_PAREN);
			setState(185);
			((WhileStatementContext)_localctx).expression = expression(0);
			setState(186);
			match(RIGHT_PAREN);
			setState(187);
			((WhileStatementContext)_localctx).statement = statement();

			    ((WhileStatementContext)_localctx).val =  new Stmt.While(((WhileStatementContext)_localctx).expression.val, ((WhileStatementContext)_localctx).statement.val);

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
	public static class ForStatementContext extends ParserRuleContext {
		public Stmt val;
		public ExpressionContext init;
		public ExpressionContext cond;
		public ExpressionContext update;
		public StatementContext statement;
		public TerminalNode FOR() { return getToken(simplfParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(simplfParser.LEFT_PAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(simplfParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(simplfParser.SEMICOLON, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FOR);
			setState(191);
			match(LEFT_PAREN);
			setState(192);
			((ForStatementContext)_localctx).init = expression(0);
			setState(193);
			match(SEMICOLON);
			setState(194);
			((ForStatementContext)_localctx).cond = expression(0);
			setState(195);
			match(SEMICOLON);
			setState(196);
			((ForStatementContext)_localctx).update = expression(0);
			setState(197);
			match(RIGHT_PAREN);
			setState(198);
			((ForStatementContext)_localctx).statement = statement();

			    ((ForStatementContext)_localctx).val =  new Stmt.For(((ForStatementContext)_localctx).init.val, ((ForStatementContext)_localctx).cond.val, ((ForStatementContext)_localctx).update.val, ((ForStatementContext)_localctx).statement.val);

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
	public static class ExprStatementContext extends ParserRuleContext {
		public Stmt val;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(simplfParser.SEMICOLON, 0); }
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((ExprStatementContext)_localctx).expression = expression(0);
			setState(202);
			match(SEMICOLON);
			((ExprStatementContext)_localctx).val =  new Stmt.Expression(((ExprStatementContext)_localctx).expression.val);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public Stmt val;
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(simplfParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(simplfParser.SEMICOLON, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(PRINT);
			setState(206);
			((PrintStatementContext)_localctx).expression = expression(0);
			setState(207);
			match(SEMICOLON);
			((PrintStatementContext)_localctx).val =  new Stmt.Print(((PrintStatementContext)_localctx).expression.val);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expr> val = new ArrayList<>();;
		public ExpressionContext arg1;
		public ExpressionContext argi;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(simplfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(simplfParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((ArgumentsContext)_localctx).arg1 = expression(0);
			_localctx.val.add(((ArgumentsContext)_localctx).arg1.val);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212);
				match(COMMA);
				setState(213);
				((ArgumentsContext)_localctx).argi = expression(0);
				_localctx.val.add(((ArgumentsContext)_localctx).argi.val);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr val;
		public simplf.Token op;
		public List<Expr> args;
		public ExpressionContext e1;
		public LiteralContext literal;
		public IdContext id;
		public MinusContext minus;
		public BangContext bang;
		public ExpressionContext expression;
		public SlashContext slash;
		public StarContext star;
		public ExpressionContext e2;
		public PlusContext plus;
		public GreaterContext greater;
		public Greater_equalContext greater_equal;
		public LessContext less;
		public Less_equalContext less_equal;
		public Equal_equalContext equal_equal;
		public Bang_equalContext bang_equal;
		public AndContext and;
		public OrContext or;
		public RparenContext rparen;
		public ArgumentsContext arguments;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public BangContext bang() {
			return getRuleContext(BangContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(simplfParser.EQUAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(simplfParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public Greater_equalContext greater_equal() {
			return getRuleContext(Greater_equalContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public Less_equalContext less_equal() {
			return getRuleContext(Less_equalContext.class,0);
		}
		public Equal_equalContext equal_equal() {
			return getRuleContext(Equal_equalContext.class,0);
		}
		public Bang_equalContext bang_equal() {
			return getRuleContext(Bang_equalContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public RparenContext rparen() {
			return getRuleContext(RparenContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(222);
				((ExpressionContext)_localctx).literal = literal();
				((ExpressionContext)_localctx).val =  new Expr.Literal(((ExpressionContext)_localctx).literal.val);
				}
				break;
			case 2:
				{
				setState(225);
				((ExpressionContext)_localctx).id = id();
				 ((ExpressionContext)_localctx).val =  new Expr.Variable(((ExpressionContext)_localctx).id.val); 
				}
				break;
			case 3:
				{
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(228);
					((ExpressionContext)_localctx).minus = minus();
					((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).minus.val;
					}
					break;
				case BANG:
					{
					setState(231);
					((ExpressionContext)_localctx).bang = bang();
					((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).bang.val;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236);
				((ExpressionContext)_localctx).expression = expression(9);

				                                    ((ExpressionContext)_localctx).val =  new Expr.Unary(_localctx.op, ((ExpressionContext)_localctx).expression.val);
				                                
				}
				break;
			case 4:
				{
				setState(239);
				((ExpressionContext)_localctx).id = id();
				setState(240);
				match(EQUAL);
				setState(241);
				((ExpressionContext)_localctx).expression = expression(2);
				((ExpressionContext)_localctx).val =  new Expr.Assign(((ExpressionContext)_localctx).id.val, ((ExpressionContext)_localctx).expression.val);
				}
				break;
			case 5:
				{
				setState(244);
				match(LEFT_PAREN);
				setState(245);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(246);
				match(RIGHT_PAREN);
				((ExpressionContext)_localctx).val =  new Expr.Grouping(((ExpressionContext)_localctx).expression.val);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SLASH:
							{
							setState(252);
							((ExpressionContext)_localctx).slash = slash();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).slash.val;
							}
							break;
						case STAR:
							{
							setState(255);
							((ExpressionContext)_localctx).star = star();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).star.val;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(260);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);

						                                              ((ExpressionContext)_localctx).val =  new Expr.Binary(((ExpressionContext)_localctx).e1.val, _localctx.op, ((ExpressionContext)_localctx).e2.val);
						                                          
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(270);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(264);
							((ExpressionContext)_localctx).plus = plus();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).plus.val;
							}
							break;
						case MINUS:
							{
							setState(267);
							((ExpressionContext)_localctx).minus = minus();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).minus.val;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(272);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);

						                                              ((ExpressionContext)_localctx).val =  new Expr.Binary(((ExpressionContext)_localctx).e1.val, _localctx.op, ((ExpressionContext)_localctx).e2.val);
						                                          
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(288);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GREATER:
							{
							setState(276);
							((ExpressionContext)_localctx).greater = greater();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).greater.val;
							}
							break;
						case GREATER_EQUAL:
							{
							setState(279);
							((ExpressionContext)_localctx).greater_equal = greater_equal();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).greater_equal.val;
							}
							break;
						case LESS:
							{
							setState(282);
							((ExpressionContext)_localctx).less = less();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).less.val;
							}
							break;
						case LESS_EQUAL:
							{
							setState(285);
							((ExpressionContext)_localctx).less_equal = less_equal();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).less_equal.val;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(290);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);

						                                              ((ExpressionContext)_localctx).val =  new Expr.Binary(((ExpressionContext)_localctx).e1.val, _localctx.op, ((ExpressionContext)_localctx).e2.val);
						                                          
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL_EQUAL:
							{
							setState(294);
							((ExpressionContext)_localctx).equal_equal = equal_equal();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).equal_equal.val;
							}
							break;
						case BANG_EQUAL:
							{
							setState(297);
							((ExpressionContext)_localctx).bang_equal = bang_equal();
							((ExpressionContext)_localctx).op =  ((ExpressionContext)_localctx).bang_equal.val;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(302);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);

						                                              ((ExpressionContext)_localctx).val =  new Expr.Binary(((ExpressionContext)_localctx).e1.val, _localctx.op, ((ExpressionContext)_localctx).e2.val);
						                                          
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(306);
						((ExpressionContext)_localctx).and = and();
						setState(307);
						((ExpressionContext)_localctx).expression = expression(5);
						((ExpressionContext)_localctx).val =  new Expr.Logical(((ExpressionContext)_localctx).e1.val, ((ExpressionContext)_localctx).and.val, ((ExpressionContext)_localctx).e2.val);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						((ExpressionContext)_localctx).or = or();
						setState(312);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);
						((ExpressionContext)_localctx).val =  new Expr.Logical(((ExpressionContext)_localctx).e1.val, ((ExpressionContext)_localctx).or.val, ((ExpressionContext)_localctx).e2.val);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(316);
						match(LEFT_PAREN);
						setState(317);
						((ExpressionContext)_localctx).rparen = rparen();
						 ((ExpressionContext)_localctx).val =  new Expr.Call(((ExpressionContext)_localctx).e1.val, ((ExpressionContext)_localctx).rparen.val, new ArrayList<>()); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(321);
						match(LEFT_PAREN);
						setState(322);
						((ExpressionContext)_localctx).arguments = arguments();
						setState(323);
						((ExpressionContext)_localctx).rparen = rparen();
						 ((ExpressionContext)_localctx).val =  new Expr.Call(((ExpressionContext)_localctx).e1.val, ((ExpressionContext)_localctx).rparen.val, ((ExpressionContext)_localctx).arguments.val); 
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Object val;
		public Token STRINGLIT;
		public Token NUMBER;
		public TerminalNode STRINGLIT() { return getToken(simplfParser.STRINGLIT, 0); }
		public TerminalNode NUMBER() { return getToken(simplfParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(simplfParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(simplfParser.FALSE, 0); }
		public TerminalNode NIL() { return getToken(simplfParser.NIL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((LiteralContext)_localctx).STRINGLIT = match(STRINGLIT);
				((LiteralContext)_localctx).val =  (((LiteralContext)_localctx).STRINGLIT!=null?((LiteralContext)_localctx).STRINGLIT.getText():null).substring(1,(((LiteralContext)_localctx).STRINGLIT!=null?((LiteralContext)_localctx).STRINGLIT.getText():null).length()-1);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				((LiteralContext)_localctx).NUMBER = match(NUMBER);
				((LiteralContext)_localctx).val =  (Double) Double.parseDouble((((LiteralContext)_localctx).NUMBER!=null?((LiteralContext)_localctx).NUMBER.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(TRUE);
				((LiteralContext)_localctx).val =  true;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(FALSE);
				((LiteralContext)_localctx).val =  false;
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(NIL);
				((LiteralContext)_localctx).val =  null;
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
	public static class TypeContext extends ParserRuleContext {
		public simplf.DataType r;
		public TerminalNode CHAR() { return getToken(simplfParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(simplfParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(simplfParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(CHAR);
				((TypeContext)_localctx).r =  simplf.DataType.CHAR;
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(FLOAT);
				((TypeContext)_localctx).r =  simplf.DataType.FLOAT;
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(STRING);
				((TypeContext)_localctx).r =  simplf.DataType.STRING;
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
	public static class IdContext extends ParserRuleContext {
		public simplf.Token val;
		public Token ident;
		public TerminalNode IDENTIFIER() { return getToken(simplfParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((IdContext)_localctx).ident = match(IDENTIFIER);
			((IdContext)_localctx).val =  new simplf.Token(simplf.TokenType.IDENTIFIER, (((IdContext)_localctx).ident!=null?((IdContext)_localctx).ident.getText():null), (((IdContext)_localctx).ident!=null?((IdContext)_localctx).ident.getText():null), (((IdContext)_localctx).ident!=null?((IdContext)_localctx).ident.getLine():0), (((IdContext)_localctx).ident!=null?((IdContext)_localctx).ident.getCharPositionInLine():0));
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
	public static class OrContext extends ParserRuleContext {
		public simplf.Token val;
		public Token OR;
		public TerminalNode OR() { return getToken(simplfParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((OrContext)_localctx).OR = match(OR);
			((OrContext)_localctx).val =  new simplf.Token(simplf.TokenType.OR, (((OrContext)_localctx).OR!=null?((OrContext)_localctx).OR.getText():null), null, (((OrContext)_localctx).OR!=null?((OrContext)_localctx).OR.getLine():0), (((OrContext)_localctx).OR!=null?((OrContext)_localctx).OR.getCharPositionInLine():0));
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
	public static class AndContext extends ParserRuleContext {
		public simplf.Token val;
		public Token AND;
		public TerminalNode AND() { return getToken(simplfParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((AndContext)_localctx).AND = match(AND);
			((AndContext)_localctx).val =  new simplf.Token(simplf.TokenType.AND, (((AndContext)_localctx).AND!=null?((AndContext)_localctx).AND.getText():null), null, (((AndContext)_localctx).AND!=null?((AndContext)_localctx).AND.getLine():0), (((AndContext)_localctx).AND!=null?((AndContext)_localctx).AND.getCharPositionInLine():0));
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
	public static class EqualContext extends ParserRuleContext {
		public simplf.Token val;
		public Token EQUAL;
		public TerminalNode EQUAL() { return getToken(simplfParser.EQUAL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			((EqualContext)_localctx).EQUAL = match(EQUAL);
			((EqualContext)_localctx).val =  new simplf.Token(simplf.TokenType.EQUAL, (((EqualContext)_localctx).EQUAL!=null?((EqualContext)_localctx).EQUAL.getText():null), null, (((EqualContext)_localctx).EQUAL!=null?((EqualContext)_localctx).EQUAL.getLine():0), (((EqualContext)_localctx).EQUAL!=null?((EqualContext)_localctx).EQUAL.getCharPositionInLine():0));
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
	public static class Bang_equalContext extends ParserRuleContext {
		public simplf.Token val;
		public Token BANG_EQUAL;
		public TerminalNode BANG_EQUAL() { return getToken(simplfParser.BANG_EQUAL, 0); }
		public Bang_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bang_equal; }
	}

	public final Bang_equalContext bang_equal() throws RecognitionException {
		Bang_equalContext _localctx = new Bang_equalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bang_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((Bang_equalContext)_localctx).BANG_EQUAL = match(BANG_EQUAL);
			((Bang_equalContext)_localctx).val =  new simplf.Token(simplf.TokenType.BANG_EQUAL, (((Bang_equalContext)_localctx).BANG_EQUAL!=null?((Bang_equalContext)_localctx).BANG_EQUAL.getText():null), null, (((Bang_equalContext)_localctx).BANG_EQUAL!=null?((Bang_equalContext)_localctx).BANG_EQUAL.getLine():0), (((Bang_equalContext)_localctx).BANG_EQUAL!=null?((Bang_equalContext)_localctx).BANG_EQUAL.getCharPositionInLine():0));
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
	public static class Equal_equalContext extends ParserRuleContext {
		public simplf.Token val;
		public Token EQUAL_EQUAL;
		public TerminalNode EQUAL_EQUAL() { return getToken(simplfParser.EQUAL_EQUAL, 0); }
		public Equal_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_equal; }
	}

	public final Equal_equalContext equal_equal() throws RecognitionException {
		Equal_equalContext _localctx = new Equal_equalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equal_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((Equal_equalContext)_localctx).EQUAL_EQUAL = match(EQUAL_EQUAL);
			((Equal_equalContext)_localctx).val =  new simplf.Token(simplf.TokenType.EQUAL_EQUAL, (((Equal_equalContext)_localctx).EQUAL_EQUAL!=null?((Equal_equalContext)_localctx).EQUAL_EQUAL.getText():null), null, (((Equal_equalContext)_localctx).EQUAL_EQUAL!=null?((Equal_equalContext)_localctx).EQUAL_EQUAL.getLine():0), (((Equal_equalContext)_localctx).EQUAL_EQUAL!=null?((Equal_equalContext)_localctx).EQUAL_EQUAL.getCharPositionInLine():0));
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
	public static class GreaterContext extends ParserRuleContext {
		public simplf.Token val;
		public Token GREATER;
		public TerminalNode GREATER() { return getToken(simplfParser.GREATER, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((GreaterContext)_localctx).GREATER = match(GREATER);
			((GreaterContext)_localctx).val =  new simplf.Token(simplf.TokenType.GREATER, (((GreaterContext)_localctx).GREATER!=null?((GreaterContext)_localctx).GREATER.getText():null), null, (((GreaterContext)_localctx).GREATER!=null?((GreaterContext)_localctx).GREATER.getLine():0), (((GreaterContext)_localctx).GREATER!=null?((GreaterContext)_localctx).GREATER.getCharPositionInLine():0));
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
	public static class Greater_equalContext extends ParserRuleContext {
		public simplf.Token val;
		public Token GREATER_EQUAL;
		public TerminalNode GREATER_EQUAL() { return getToken(simplfParser.GREATER_EQUAL, 0); }
		public Greater_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_equal; }
	}

	public final Greater_equalContext greater_equal() throws RecognitionException {
		Greater_equalContext _localctx = new Greater_equalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((Greater_equalContext)_localctx).GREATER_EQUAL = match(GREATER_EQUAL);
			((Greater_equalContext)_localctx).val =  new simplf.Token(simplf.TokenType.GREATER_EQUAL, (((Greater_equalContext)_localctx).GREATER_EQUAL!=null?((Greater_equalContext)_localctx).GREATER_EQUAL.getText():null), null, (((Greater_equalContext)_localctx).GREATER_EQUAL!=null?((Greater_equalContext)_localctx).GREATER_EQUAL.getLine():0), (((Greater_equalContext)_localctx).GREATER_EQUAL!=null?((Greater_equalContext)_localctx).GREATER_EQUAL.getCharPositionInLine():0));
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
	public static class LessContext extends ParserRuleContext {
		public simplf.Token val;
		public Token LESS;
		public TerminalNode LESS() { return getToken(simplfParser.LESS, 0); }
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((LessContext)_localctx).LESS = match(LESS);
			((LessContext)_localctx).val =  new simplf.Token(simplf.TokenType.LESS, (((LessContext)_localctx).LESS!=null?((LessContext)_localctx).LESS.getText():null), null, (((LessContext)_localctx).LESS!=null?((LessContext)_localctx).LESS.getLine():0), (((LessContext)_localctx).LESS!=null?((LessContext)_localctx).LESS.getCharPositionInLine():0));
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
	public static class Less_equalContext extends ParserRuleContext {
		public simplf.Token val;
		public Token LESS_EQUAL;
		public TerminalNode LESS_EQUAL() { return getToken(simplfParser.LESS_EQUAL, 0); }
		public Less_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_equal; }
	}

	public final Less_equalContext less_equal() throws RecognitionException {
		Less_equalContext _localctx = new Less_equalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_less_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((Less_equalContext)_localctx).LESS_EQUAL = match(LESS_EQUAL);
			((Less_equalContext)_localctx).val =  new simplf.Token(simplf.TokenType.LESS_EQUAL, (((Less_equalContext)_localctx).LESS_EQUAL!=null?((Less_equalContext)_localctx).LESS_EQUAL.getText():null), null, (((Less_equalContext)_localctx).LESS_EQUAL!=null?((Less_equalContext)_localctx).LESS_EQUAL.getLine():0), (((Less_equalContext)_localctx).LESS_EQUAL!=null?((Less_equalContext)_localctx).LESS_EQUAL.getCharPositionInLine():0));
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
	public static class PlusContext extends ParserRuleContext {
		public simplf.Token val;
		public Token PLUS;
		public TerminalNode PLUS() { return getToken(simplfParser.PLUS, 0); }
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((PlusContext)_localctx).PLUS = match(PLUS);
			((PlusContext)_localctx).val =  new simplf.Token(simplf.TokenType.PLUS, (((PlusContext)_localctx).PLUS!=null?((PlusContext)_localctx).PLUS.getText():null), null, (((PlusContext)_localctx).PLUS!=null?((PlusContext)_localctx).PLUS.getLine():0), (((PlusContext)_localctx).PLUS!=null?((PlusContext)_localctx).PLUS.getCharPositionInLine():0));
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
	public static class MinusContext extends ParserRuleContext {
		public simplf.Token val;
		public Token MINUS;
		public TerminalNode MINUS() { return getToken(simplfParser.MINUS, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((MinusContext)_localctx).MINUS = match(MINUS);
			((MinusContext)_localctx).val =  new simplf.Token(simplf.TokenType.MINUS, (((MinusContext)_localctx).MINUS!=null?((MinusContext)_localctx).MINUS.getText():null), null, (((MinusContext)_localctx).MINUS!=null?((MinusContext)_localctx).MINUS.getLine():0), (((MinusContext)_localctx).MINUS!=null?((MinusContext)_localctx).MINUS.getCharPositionInLine():0));
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
	public static class SlashContext extends ParserRuleContext {
		public simplf.Token val;
		public Token SLASH;
		public TerminalNode SLASH() { return getToken(simplfParser.SLASH, 0); }
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_slash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			((SlashContext)_localctx).SLASH = match(SLASH);
			((SlashContext)_localctx).val =  new simplf.Token(simplf.TokenType.SLASH, (((SlashContext)_localctx).SLASH!=null?((SlashContext)_localctx).SLASH.getText():null), null, (((SlashContext)_localctx).SLASH!=null?((SlashContext)_localctx).SLASH.getLine():0), (((SlashContext)_localctx).SLASH!=null?((SlashContext)_localctx).SLASH.getCharPositionInLine():0));
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
	public static class StarContext extends ParserRuleContext {
		public simplf.Token val;
		public Token STAR;
		public TerminalNode STAR() { return getToken(simplfParser.STAR, 0); }
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((StarContext)_localctx).STAR = match(STAR);
			((StarContext)_localctx).val =  new simplf.Token(simplf.TokenType.STAR, (((StarContext)_localctx).STAR!=null?((StarContext)_localctx).STAR.getText():null), null, (((StarContext)_localctx).STAR!=null?((StarContext)_localctx).STAR.getLine():0), (((StarContext)_localctx).STAR!=null?((StarContext)_localctx).STAR.getCharPositionInLine():0));
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
	public static class BangContext extends ParserRuleContext {
		public simplf.Token val;
		public Token BANG;
		public TerminalNode BANG() { return getToken(simplfParser.BANG, 0); }
		public BangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bang; }
	}

	public final BangContext bang() throws RecognitionException {
		BangContext _localctx = new BangContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bang);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((BangContext)_localctx).BANG = match(BANG);
			((BangContext)_localctx).val =  new simplf.Token(simplf.TokenType.BANG, (((BangContext)_localctx).BANG!=null?((BangContext)_localctx).BANG.getText():null), null, (((BangContext)_localctx).BANG!=null?((BangContext)_localctx).BANG.getLine():0), (((BangContext)_localctx).BANG!=null?((BangContext)_localctx).BANG.getCharPositionInLine():0));
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
	public static class RparenContext extends ParserRuleContext {
		public simplf.Token val;
		public Token RIGHT_PAREN;
		public TerminalNode RIGHT_PAREN() { return getToken(simplfParser.RIGHT_PAREN, 0); }
		public RparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rparen; }
	}

	public final RparenContext rparen() throws RecognitionException {
		RparenContext _localctx = new RparenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((RparenContext)_localctx).RIGHT_PAREN = match(RIGHT_PAREN);
			((RparenContext)_localctx).val =  new simplf.Token(simplf.TokenType.RIGHT_PAREN, (((RparenContext)_localctx).RIGHT_PAREN!=null?((RparenContext)_localctx).RIGHT_PAREN.getText():null), null, (((RparenContext)_localctx).RIGHT_PAREN!=null?((RparenContext)_localctx).RIGHT_PAREN.getLine():0), (((RparenContext)_localctx).RIGHT_PAREN!=null?((RparenContext)_localctx).RIGHT_PAREN.getCharPositionInLine():0));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0190\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002i\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003q\b\u0003\n\u0003\f\u0003t\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u008b\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009f\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d9\b\r\n\r\f\r\u00dc"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00eb\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0103\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u012d\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0147\b\u000e\n"+
		"\u000e\f\u000e\u014a\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0156\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015e\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0000\u0001\u001c!\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@\u0000\u0000\u0194\u0000G\u0001\u0000\u0000\u0000"+
		"\u0002S\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006j"+
		"\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000"+
		"\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000"+
		"\u0000\u0010\u00b5\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000"+
		"\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016\u00c9\u0001\u0000\u0000"+
		"\u0000\u0018\u00cd\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000"+
		"\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e\u0155\u0001\u0000\u0000"+
		"\u0000 \u015d\u0001\u0000\u0000\u0000\"\u015f\u0001\u0000\u0000\u0000"+
		"$\u0162\u0001\u0000\u0000\u0000&\u0165\u0001\u0000\u0000\u0000(\u0168"+
		"\u0001\u0000\u0000\u0000*\u016b\u0001\u0000\u0000\u0000,\u016e\u0001\u0000"+
		"\u0000\u0000.\u0171\u0001\u0000\u0000\u00000\u0174\u0001\u0000\u0000\u0000"+
		"2\u0177\u0001\u0000\u0000\u00004\u017a\u0001\u0000\u0000\u00006\u017d"+
		"\u0001\u0000\u0000\u00008\u0180\u0001\u0000\u0000\u0000:\u0183\u0001\u0000"+
		"\u0000\u0000<\u0186\u0001\u0000\u0000\u0000>\u0189\u0001\u0000\u0000\u0000"+
		"@\u018c\u0001\u0000\u0000\u0000BC\u0003\u0002\u0001\u0000CD\u0006\u0000"+
		"\uffff\uffff\u0000DF\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0001\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0003"+
		"\u0004\u0002\u0000KL\u0006\u0001\uffff\uffff\u0000LT\u0001\u0000\u0000"+
		"\u0000MN\u0003\n\u0005\u0000NO\u0006\u0001\uffff\uffff\u0000OT\u0001\u0000"+
		"\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0006\u0001\uffff\uffff\u0000RT\u0001"+
		"\u0000\u0000\u0000SJ\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000"+
		"SP\u0001\u0000\u0000\u0000T\u0003\u0001\u0000\u0000\u0000UV\u0005\u001a"+
		"\u0000\u0000VW\u0003\"\u0011\u0000WX\u0005\u0001\u0000\u0000XY\u0005\u0002"+
		"\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0003 \u0010\u0000[\\\u0003\u000e"+
		"\u0007\u0000\\]\u0006\u0002\uffff\uffff\u0000]i\u0001\u0000\u0000\u0000"+
		"^_\u0005\u001a\u0000\u0000_`\u0003\"\u0011\u0000`a\u0005\u0001\u0000\u0000"+
		"ab\u0003\u0006\u0003\u0000bc\u0005\u0002\u0000\u0000cd\u0005\n\u0000\u0000"+
		"de\u0003 \u0010\u0000ef\u0003\u000e\u0007\u0000fg\u0006\u0002\uffff\uffff"+
		"\u0000gi\u0001\u0000\u0000\u0000hU\u0001\u0000\u0000\u0000h^\u0001\u0000"+
		"\u0000\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0003\b\u0004\u0000kr\u0006"+
		"\u0003\uffff\uffff\u0000lm\u0005\u0005\u0000\u0000mn\u0003\b\u0004\u0000"+
		"no\u0006\u0003\uffff\uffff\u0000oq\u0001\u0000\u0000\u0000pl\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s\u0007\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0003\"\u0011\u0000vw\u0005\n\u0000\u0000wx\u0003 \u0010\u0000"+
		"xy\u0006\u0004\uffff\uffff\u0000y\t\u0001\u0000\u0000\u0000z{\u0005\""+
		"\u0000\u0000{|\u0003\"\u0011\u0000|}\u0005\n\u0000\u0000}~\u0003 \u0010"+
		"\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0006\u0005\uffff\uffff"+
		"\u0000\u0080\u008b\u0001\u0000\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000"+
		"\u0082\u0083\u0003\"\u0011\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084"+
		"\u0085\u0003 \u0010\u0000\u0085\u0086\u0005\u000f\u0000\u0000\u0086\u0087"+
		"\u0003\u001c\u000e\u0000\u0087\u0088\u0005\t\u0000\u0000\u0088\u0089\u0006"+
		"\u0005\uffff\uffff\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008az\u0001"+
		"\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008b\u000b\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d\u008e\u0006"+
		"\u0006\uffff\uffff\u0000\u008e\u009f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0003\u0010\b\u0000\u0090\u0091\u0006\u0006\uffff\uffff\u0000\u0091\u009f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0094\u0006"+
		"\u0006\uffff\uffff\u0000\u0094\u009f\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0003\u0012\t\u0000\u0096\u0097\u0006\u0006\uffff\uffff\u0000\u0097\u009f"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0014\n\u0000\u0099\u009a\u0006"+
		"\u0006\uffff\uffff\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003\u000e\u0007\u0000\u009c\u009d\u0006\u0006\uffff\uffff\u0000\u009d"+
		"\u009f\u0001\u0000\u0000\u0000\u009e\u008c\u0001\u0000\u0000\u0000\u009e"+
		"\u008f\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000\u0000\u009e"+
		"\u0095\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e"+
		"\u009b\u0001\u0000\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0003\u0000\u0000\u00a1\u00a2\u0003\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0004\u0000\u0000\u00a3\u00a4\u0006\u0007\uffff\uffff\u0000\u00a4"+
		"\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0001\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8"+
		"\u00a9\u0005\u0002\u0000\u0000\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u00ab"+
		"\u0006\b\uffff\uffff\u0000\u00ab\u00b6\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u001b\u0000\u0000\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u00af"+
		"\u0003\u001c\u000e\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b1"+
		"\u0003\f\u0006\u0000\u00b1\u00b2\u0005\u0017\u0000\u0000\u00b2\u00b3\u0003"+
		"\f\u0006\u0000\u00b3\u00b4\u0006\b\uffff\uffff\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00a5\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"#\u0000\u0000\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00ba\u0003\u001c"+
		"\u000e\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000\u00bb\u00bc\u0003\f\u0006"+
		"\u0000\u00bc\u00bd\u0006\t\uffff\uffff\u0000\u00bd\u0013\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c0\u0005\u0001\u0000"+
		"\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c2\u0005\t\u0000\u0000"+
		"\u00c2\u00c3\u0003\u001c\u000e\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4"+
		"\u00c5\u0003\u001c\u000e\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6"+
		"\u00c7\u0003\f\u0006\u0000\u00c7\u00c8\u0006\n\uffff\uffff\u0000\u00c8"+
		"\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca"+
		"\u00cb\u0005\t\u0000\u0000\u00cb\u00cc\u0006\u000b\uffff\uffff\u0000\u00cc"+
		"\u0017\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce"+
		"\u00cf\u0003\u001c\u000e\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1"+
		"\u0006\f\uffff\uffff\u0000\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003\u001c\u000e\u0000\u00d3\u00da\u0006\r\uffff\uffff\u0000\u00d4\u00d5"+
		"\u0005\u0005\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6\u00d7"+
		"\u0006\r\uffff\uffff\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u001b"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0006\u000e\uffff\uffff\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df"+
		"\u00e0\u0006\u000e\uffff\uffff\u0000\u00e0\u00fa\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0003\"\u0011\u0000\u00e2\u00e3\u0006\u000e\uffff\uffff\u0000"+
		"\u00e3\u00fa\u0001\u0000\u0000\u0000\u00e4\u00e5\u00038\u001c\u0000\u00e5"+
		"\u00e6\u0006\u000e\uffff\uffff\u0000\u00e6\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0003>\u001f\u0000\u00e8\u00e9\u0006\u000e\uffff\uffff\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0003\u001c\u000e\t\u00ed\u00ee\u0006\u000e\uffff\uffff\u0000"+
		"\u00ee\u00fa\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\"\u0011\u0000\u00f0"+
		"\u00f1\u0005\u000f\u0000\u0000\u00f1\u00f2\u0003\u001c\u000e\u0002\u00f2"+
		"\u00f3\u0006\u000e\uffff\uffff\u0000\u00f3\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0001\u0000\u0000\u00f5\u00f6\u0003\u001c\u000e\u0000"+
		"\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u00f8\u0006\u000e\uffff\uffff"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00dd\u0001\u0000\u0000"+
		"\u0000\u00f9\u00e1\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fa\u0148\u0001\u0000\u0000\u0000\u00fb\u0102\n\b\u0000\u0000"+
		"\u00fc\u00fd\u0003:\u001d\u0000\u00fd\u00fe\u0006\u000e\uffff\uffff\u0000"+
		"\u00fe\u0103\u0001\u0000\u0000\u0000\u00ff\u0100\u0003<\u001e\u0000\u0100"+
		"\u0101\u0006\u000e\uffff\uffff\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u001c\u000e\t\u0105"+
		"\u0106\u0006\u000e\uffff\uffff\u0000\u0106\u0147\u0001\u0000\u0000\u0000"+
		"\u0107\u010e\n\u0007\u0000\u0000\u0108\u0109\u00036\u001b\u0000\u0109"+
		"\u010a\u0006\u000e\uffff\uffff\u0000\u010a\u010f\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u00038\u001c\u0000\u010c\u010d\u0006\u000e\uffff\uffff\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000"+
		"\u010e\u010b\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0003\u001c\u000e\b\u0111\u0112\u0006\u000e\uffff\uffff\u0000"+
		"\u0112\u0147\u0001\u0000\u0000\u0000\u0113\u0120\n\u0006\u0000\u0000\u0114"+
		"\u0115\u0003.\u0017\u0000\u0115\u0116\u0006\u000e\uffff\uffff\u0000\u0116"+
		"\u0121\u0001\u0000\u0000\u0000\u0117\u0118\u00030\u0018\u0000\u0118\u0119"+
		"\u0006\u000e\uffff\uffff\u0000\u0119\u0121\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u00032\u0019\u0000\u011b\u011c\u0006\u000e\uffff\uffff\u0000\u011c"+
		"\u0121\u0001\u0000\u0000\u0000\u011d\u011e\u00034\u001a\u0000\u011e\u011f"+
		"\u0006\u000e\uffff\uffff\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u0114\u0001\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120"+
		"\u011a\u0001\u0000\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u001c\u000e\u0007\u0123"+
		"\u0124\u0006\u000e\uffff\uffff\u0000\u0124\u0147\u0001\u0000\u0000\u0000"+
		"\u0125\u012c\n\u0005\u0000\u0000\u0126\u0127\u0003,\u0016\u0000\u0127"+
		"\u0128\u0006\u000e\uffff\uffff\u0000\u0128\u012d\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0003*\u0015\u0000\u012a\u012b\u0006\u000e\uffff\uffff\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0126\u0001\u0000\u0000\u0000"+
		"\u012c\u0129\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0003\u001c\u000e\u0006\u012f\u0130\u0006\u000e\uffff\uffff"+
		"\u0000\u0130\u0147\u0001\u0000\u0000\u0000\u0131\u0132\n\u0004\u0000\u0000"+
		"\u0132\u0133\u0003&\u0013\u0000\u0133\u0134\u0003\u001c\u000e\u0005\u0134"+
		"\u0135\u0006\u000e\uffff\uffff\u0000\u0135\u0147\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\n\u0003\u0000\u0000\u0137\u0138\u0003$\u0012\u0000\u0138"+
		"\u0139\u0003\u001c\u000e\u0004\u0139\u013a\u0006\u000e\uffff\uffff\u0000"+
		"\u013a\u0147\u0001\u0000\u0000\u0000\u013b\u013c\n\u000b\u0000\u0000\u013c"+
		"\u013d\u0005\u0001\u0000\u0000\u013d\u013e\u0003@ \u0000\u013e\u013f\u0006"+
		"\u000e\uffff\uffff\u0000\u013f\u0147\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\n\n\u0000\u0000\u0141\u0142\u0005\u0001\u0000\u0000\u0142\u0143\u0003"+
		"\u001a\r\u0000\u0143\u0144\u0003@ \u0000\u0144\u0145\u0006\u000e\uffff"+
		"\uffff\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u00fb\u0001\u0000"+
		"\u0000\u0000\u0146\u0107\u0001\u0000\u0000\u0000\u0146\u0113\u0001\u0000"+
		"\u0000\u0000\u0146\u0125\u0001\u0000\u0000\u0000\u0146\u0131\u0001\u0000"+
		"\u0000\u0000\u0146\u0136\u0001\u0000\u0000\u0000\u0146\u013b\u0001\u0000"+
		"\u0000\u0000\u0146\u0140\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u001d\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005(\u0000\u0000\u014c\u0156\u0006\u000f\uffff"+
		"\uffff\u0000\u014d\u014e\u0005)\u0000\u0000\u014e\u0156\u0006\u000f\uffff"+
		"\uffff\u0000\u014f\u0150\u0005!\u0000\u0000\u0150\u0156\u0006\u000f\uffff"+
		"\uffff\u0000\u0151\u0152\u0005\u0018\u0000\u0000\u0152\u0156\u0006\u000f"+
		"\uffff\uffff\u0000\u0153\u0154\u0005\u001c\u0000\u0000\u0154\u0156\u0006"+
		"\u000f\uffff\uffff\u0000\u0155\u014b\u0001\u0000\u0000\u0000\u0155\u014d"+
		"\u0001\u0000\u0000\u0000\u0155\u014f\u0001\u0000\u0000\u0000\u0155\u0151"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u001f"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005$\u0000\u0000\u0158\u015e\u0006"+
		"\u0010\uffff\uffff\u0000\u0159\u015a\u0005%\u0000\u0000\u015a\u015e\u0006"+
		"\u0010\uffff\uffff\u0000\u015b\u015c\u0005&\u0000\u0000\u015c\u015e\u0006"+
		"\u0010\uffff\uffff\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u0159"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e!\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005\'\u0000\u0000\u0160\u0161\u0006\u0011"+
		"\uffff\uffff\u0000\u0161#\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001d"+
		"\u0000\u0000\u0163\u0164\u0006\u0012\uffff\uffff\u0000\u0164%\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\u0015\u0000\u0000\u0166\u0167\u0006\u0013"+
		"\uffff\uffff\u0000\u0167\'\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u000f"+
		"\u0000\u0000\u0169\u016a\u0006\u0014\uffff\uffff\u0000\u016a)\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0005\u000e\u0000\u0000\u016c\u016d\u0006\u0015"+
		"\uffff\uffff\u0000\u016d+\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0010"+
		"\u0000\u0000\u016f\u0170\u0006\u0016\uffff\uffff\u0000\u0170-\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005\u0011\u0000\u0000\u0172\u0173\u0006\u0017"+
		"\uffff\uffff\u0000\u0173/\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0012"+
		"\u0000\u0000\u0175\u0176\u0006\u0018\uffff\uffff\u0000\u01761\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0005\u0013\u0000\u0000\u0178\u0179\u0006\u0019"+
		"\uffff\uffff\u0000\u01793\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0014"+
		"\u0000\u0000\u017b\u017c\u0006\u001a\uffff\uffff\u0000\u017c5\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005\b\u0000\u0000\u017e\u017f\u0006\u001b\uffff"+
		"\uffff\u0000\u017f7\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0007\u0000"+
		"\u0000\u0181\u0182\u0006\u001c\uffff\uffff\u0000\u01829\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\f\u0000\u0000\u0184\u0185\u0006\u001d\uffff\uffff"+
		"\u0000\u0185;\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u000b\u0000\u0000"+
		"\u0187\u0188\u0006\u001e\uffff\uffff\u0000\u0188=\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005\r\u0000\u0000\u018a\u018b\u0006\u001f\uffff\uffff\u0000"+
		"\u018b?\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0002\u0000\u0000\u018d"+
		"\u018e\u0006 \uffff\uffff\u0000\u018eA\u0001\u0000\u0000\u0000\u0012G"+
		"Shr\u008a\u009e\u00b5\u00da\u00ea\u00f9\u0102\u010e\u0120\u012c\u0146"+
		"\u0148\u0155\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}