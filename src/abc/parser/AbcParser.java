// Generated from src/abc/parser/Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, ACCIDENTAL=11, REST=12, DIV=13, NOTECHAR=14, TUPLETSIGN=15, 
    NUMBER=16, DIGIT=17, LETTER=18, CHAR=19, BAR=20, OCTAVE=21, SPACES=22, 
    NEWLINE=23;
  public static final int
    RULE_root = 0, RULE_head = 1, RULE_x = 2, RULE_t = 3, RULE_c = 4, RULE_l = 5, 
    RULE_m = 6, RULE_q = 7, RULE_v = 8, RULE_k = 9, RULE_body = 10, RULE_voice = 11, 
    RULE_element = 12, RULE_segment = 13, RULE_rest = 14, RULE_note = 15, 
    RULE_chord = 16, RULE_tuplet = 17, RULE_length = 18;
  public static final String[] ruleNames = {
    "root", "head", "x", "t", "c", "l", "m", "q", "v", "k", "body", "voice", 
    "element", "segment", "rest", "note", "chord", "tuplet", "length"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'['", "']'", null, "'z'", "'/'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "ACCIDENTAL", 
    "REST", "DIV", "NOTECHAR", "TUPLETSIGN", "NUMBER", "DIGIT", "LETTER", 
    "CHAR", "BAR", "OCTAVE", "SPACES", "NEWLINE"
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
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeadContext head() {
      return getRuleContext(HeadContext.class,0);
    }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(38);
      head();
      setState(39);
      body();
      setState(40);
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

  public static class HeadContext extends ParserRuleContext {
    public XContext x() {
      return getRuleContext(XContext.class,0);
    }
    public TContext t() {
      return getRuleContext(TContext.class,0);
    }
    public KContext k() {
      return getRuleContext(KContext.class,0);
    }
    public List<CContext> c() {
      return getRuleContexts(CContext.class);
    }
    public CContext c(int i) {
      return getRuleContext(CContext.class,i);
    }
    public List<LContext> l() {
      return getRuleContexts(LContext.class);
    }
    public LContext l(int i) {
      return getRuleContext(LContext.class,i);
    }
    public List<MContext> m() {
      return getRuleContexts(MContext.class);
    }
    public MContext m(int i) {
      return getRuleContext(MContext.class,i);
    }
    public List<QContext> q() {
      return getRuleContexts(QContext.class);
    }
    public QContext q(int i) {
      return getRuleContext(QContext.class,i);
    }
    public List<VContext> v() {
      return getRuleContexts(VContext.class);
    }
    public VContext v(int i) {
      return getRuleContext(VContext.class,i);
    }
    public HeadContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_head; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHead(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHead(this);
    }
  }

  public final HeadContext head() throws RecognitionException {
    HeadContext _localctx = new HeadContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_head);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42);
      x();
      setState(43);
      t();
      setState(51);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
        {
        setState(49);
        switch (_input.LA(1)) {
        case T__2:
          {
          setState(44);
          c();
          }
          break;
        case T__3:
          {
          setState(45);
          l();
          }
          break;
        case T__4:
          {
          setState(46);
          m();
          }
          break;
        case T__5:
          {
          setState(47);
          q();
          }
          break;
        case T__6:
          {
          setState(48);
          v();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(53);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(54);
      k();
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

  public static class XContext extends ParserRuleContext {
    public TerminalNode NUMBER() { return getToken(AbcParser.NUMBER, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public XContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_x; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterX(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitX(this);
    }
  }

  public final XContext x() throws RecognitionException {
    XContext _localctx = new XContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_x);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(56);
      match(T__0);
      setState(57);
      match(NUMBER);
      setState(58);
      match(NEWLINE);
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

  public static class TContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<TerminalNode> LETTER() { return getTokens(AbcParser.LETTER); }
    public TerminalNode LETTER(int i) {
      return getToken(AbcParser.LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public List<TerminalNode> CHAR() { return getTokens(AbcParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(AbcParser.CHAR, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public TContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_t; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterT(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitT(this);
    }
  }

  public final TContext t() throws RecognitionException {
    TContext _localctx = new TContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_t);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      match(T__1);
      setState(62); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(61);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(64); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0) );
      setState(66);
      match(NEWLINE);
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

  public static class CContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<TerminalNode> LETTER() { return getTokens(AbcParser.LETTER); }
    public TerminalNode LETTER(int i) {
      return getToken(AbcParser.LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public List<TerminalNode> CHAR() { return getTokens(AbcParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(AbcParser.CHAR, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public CContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_c; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterC(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitC(this);
    }
  }

  public final CContext c() throws RecognitionException {
    CContext _localctx = new CContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_c);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
      match(T__2);
      setState(70); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(69);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(72); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0) );
      setState(74);
      match(NEWLINE);
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

  public static class LContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public LContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_l; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterL(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitL(this);
    }
  }

  public final LContext l() throws RecognitionException {
    LContext _localctx = new LContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_l);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(76);
      match(T__3);
      setState(77);
      match(NUMBER);
      setState(78);
      match(DIV);
      setState(79);
      match(NUMBER);
      setState(80);
      match(NEWLINE);
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

  public static class MContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public MContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_m; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterM(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitM(this);
    }
  }

  public final MContext m() throws RecognitionException {
    MContext _localctx = new MContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_m);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(82);
      match(T__4);
      setState(83);
      match(NUMBER);
      setState(84);
      match(DIV);
      setState(85);
      match(NUMBER);
      setState(86);
      match(NEWLINE);
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

  public static class QContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public QContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_q; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterQ(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitQ(this);
    }
  }

  public final QContext q() throws RecognitionException {
    QContext _localctx = new QContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_q);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(88);
      match(T__5);
      setState(89);
      match(NUMBER);
      setState(90);
      match(DIV);
      setState(91);
      match(NUMBER);
      setState(92);
      match(ACCIDENTAL);
      setState(93);
      match(NUMBER);
      setState(94);
      match(NEWLINE);
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

  public static class VContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<TerminalNode> LETTER() { return getTokens(AbcParser.LETTER); }
    public TerminalNode LETTER(int i) {
      return getToken(AbcParser.LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public List<TerminalNode> CHAR() { return getTokens(AbcParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(AbcParser.CHAR, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public VContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_v; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterV(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitV(this);
    }
  }

  public final VContext v() throws RecognitionException {
    VContext _localctx = new VContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_v);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(96);
      match(T__6);
      setState(98); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(97);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(100); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0) );
      setState(102);
      match(NEWLINE);
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

  public static class KContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<TerminalNode> LETTER() { return getTokens(AbcParser.LETTER); }
    public TerminalNode LETTER(int i) {
      return getToken(AbcParser.LETTER, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public List<TerminalNode> CHAR() { return getTokens(AbcParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(AbcParser.CHAR, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public KContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_k; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterK(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitK(this);
    }
  }

  public final KContext k() throws RecognitionException {
    KContext _localctx = new KContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_k);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(104);
      match(T__7);
      setState(106); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(105);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(108); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTECHAR) | (1L << NUMBER) | (1L << LETTER) | (1L << CHAR) | (1L << SPACES))) != 0) );
      setState(110);
      match(NEWLINE);
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

  public static class BodyContext extends ParserRuleContext {
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      voice();
      setState(116);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ACCIDENTAL) | (1L << REST) | (1L << NOTECHAR) | (1L << TUPLETSIGN) | (1L << BAR) | (1L << SPACES))) != 0)) {
        {
        {
        setState(113);
        voice();
        }
        }
        setState(118);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(120);
      _la = _input.LA(1);
      if (_la==NEWLINE) {
        {
        setState(119);
        match(NEWLINE);
        }
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

  public static class VoiceContext extends ParserRuleContext {
    public VContext v() {
      return getRuleContext(VContext.class,0);
    }
    public List<SegmentContext> segment() {
      return getRuleContexts(SegmentContext.class);
    }
    public SegmentContext segment(int i) {
      return getRuleContext(SegmentContext.class,i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_voice);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(123);
      _la = _input.LA(1);
      if (_la==T__6) {
        {
        setState(122);
        v();
        }
      }

      setState(126); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(125);
          segment();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(128); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class ElementContext extends ParserRuleContext {
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_element);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(130);
        match(SPACES);
        }
      }

      setState(137);
      switch (_input.LA(1)) {
      case REST:
        {
        setState(133);
        rest();
        }
        break;
      case ACCIDENTAL:
      case NOTECHAR:
        {
        setState(134);
        note();
        }
        break;
      case T__8:
        {
        setState(135);
        chord();
        }
        break;
      case TUPLETSIGN:
        {
        setState(136);
        tuplet();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(139);
      match(SPACES);
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

  public static class SegmentContext extends ParserRuleContext {
    public List<TerminalNode> BAR() { return getTokens(AbcParser.BAR); }
    public TerminalNode BAR(int i) {
      return getToken(AbcParser.BAR, i);
    }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public SegmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_segment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterSegment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitSegment(this);
    }
  }

  public final SegmentContext segment() throws RecognitionException {
    SegmentContext _localctx = new SegmentContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_segment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(142);
      _la = _input.LA(1);
      if (_la==BAR) {
        {
        setState(141);
        match(BAR);
        }
      }

      setState(145); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(144);
        element();
        }
        }
        setState(147); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << ACCIDENTAL) | (1L << REST) | (1L << NOTECHAR) | (1L << TUPLETSIGN) | (1L << SPACES))) != 0) );
      setState(149);
      match(BAR);
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

  public static class RestContext extends ParserRuleContext {
    public TerminalNode REST() { return getToken(AbcParser.REST, 0); }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(151);
      match(REST);
      setState(153);
      _la = _input.LA(1);
      if (_la==DIV || _la==NUMBER) {
        {
        setState(152);
        length();
        }
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

  public static class NoteContext extends ParserRuleContext {
    public TerminalNode NOTECHAR() { return getToken(AbcParser.NOTECHAR, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public TerminalNode OCTAVE() { return getToken(AbcParser.OCTAVE, 0); }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(156);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(155);
        match(ACCIDENTAL);
        }
      }

      setState(158);
      match(NOTECHAR);
      setState(160);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(159);
        match(OCTAVE);
        }
      }

      setState(163);
      _la = _input.LA(1);
      if (_la==DIV || _la==NUMBER) {
        {
        setState(162);
        length();
        }
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

  public static class ChordContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(165);
      match(T__8);
      setState(167); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(166);
        note();
        }
        }
        setState(169); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTECHAR );
      setState(171);
      match(T__9);
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

  public static class TupletContext extends ParserRuleContext {
    public TerminalNode TUPLETSIGN() { return getToken(AbcParser.TUPLETSIGN, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_tuplet);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(173);
      match(TUPLETSIGN);
      setState(175); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(174);
        note();
        }
        }
        setState(177); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTECHAR );
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

  public static class LengthContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(AbcParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(AbcParser.NUMBER, i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_length);
    int _la;
    try {
      setState(187);
      switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(179);
        match(NUMBER);
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(181);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(180);
          match(NUMBER);
          }
        }

        setState(183);
        match(DIV);
        setState(185);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(184);
          match(NUMBER);
          }
        }

        }
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00c0\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
      "\3\3\3\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
      "\5\6\5A\n\5\r\5\16\5B\3\5\3\5\3\6\3\6\6\6I\n\6\r\6\16\6J\3\6\3\6\3"+
      "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
      "\3\t\3\t\3\t\3\n\3\n\6\ne\n\n\r\n\16\nf\3\n\3\n\3\13\3\13\6\13m\n"+
      "\13\r\13\16\13n\3\13\3\13\3\f\3\f\7\fu\n\f\f\f\16\fx\13\f\3\f\5\f"+
      "{\n\f\3\r\5\r~\n\r\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\16\5\16\u0086"+
      "\n\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\16\3\16\3\17\5\17\u0091"+
      "\n\17\3\17\6\17\u0094\n\17\r\17\16\17\u0095\3\17\3\17\3\20\3\20\5"+
      "\20\u009c\n\20\3\21\5\21\u009f\n\21\3\21\3\21\5\21\u00a3\n\21\3\21"+
      "\5\21\u00a6\n\21\3\22\3\22\6\22\u00aa\n\22\r\22\16\22\u00ab\3\22\3"+
      "\22\3\23\3\23\6\23\u00b2\n\23\r\23\16\23\u00b3\3\24\3\24\5\24\u00b8"+
      "\n\24\3\24\3\24\5\24\u00bc\n\24\5\24\u00be\n\24\3\24\2\2\25\2\4\6"+
      "\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\6\2\20\20\22\22\24\25\30"+
      "\30\u00c8\2(\3\2\2\2\4,\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\nF\3\2\2\2\f"+
      "N\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22b\3\2\2\2\24j\3\2\2\2\26r\3\2"+
      "\2\2\30}\3\2\2\2\32\u0085\3\2\2\2\34\u0090\3\2\2\2\36\u0099\3\2\2"+
      "\2 \u009e\3\2\2\2\"\u00a7\3\2\2\2$\u00af\3\2\2\2&\u00bd\3\2\2\2()"+
      "\5\4\3\2)*\5\26\f\2*+\7\2\2\3+\3\3\2\2\2,-\5\6\4\2-\65\5\b\5\2.\64"+
      "\5\n\6\2/\64\5\f\7\2\60\64\5\16\b\2\61\64\5\20\t\2\62\64\5\22\n\2"+
      "\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2"+
      "\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2"+
      "\289\5\24\13\29\5\3\2\2\2:;\7\3\2\2;<\7\22\2\2<=\7\31\2\2=\7\3\2\2"+
      "\2>@\7\4\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3"+
      "\2\2\2DE\7\31\2\2E\t\3\2\2\2FH\7\5\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2"+
      "\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\31\2\2M\13\3\2\2\2NO\7\6\2\2"+
      "OP\7\22\2\2PQ\7\17\2\2QR\7\22\2\2RS\7\31\2\2S\r\3\2\2\2TU\7\7\2\2"+
      "UV\7\22\2\2VW\7\17\2\2WX\7\22\2\2XY\7\31\2\2Y\17\3\2\2\2Z[\7\b\2\2"+
      "[\\\7\22\2\2\\]\7\17\2\2]^\7\22\2\2^_\7\r\2\2_`\7\22\2\2`a\7\31\2"+
      "\2a\21\3\2\2\2bd\7\t\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2f"+
      "g\3\2\2\2gh\3\2\2\2hi\7\31\2\2i\23\3\2\2\2jl\7\n\2\2km\t\2\2\2lk\3"+
      "\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\31\2\2q\25\3\2"+
      "\2\2rv\5\30\r\2su\5\30\r\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
      "wz\3\2\2\2xv\3\2\2\2y{\7\31\2\2zy\3\2\2\2z{\3\2\2\2{\27\3\2\2\2|~"+
      "\5\22\n\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\5\34\17\2\u0080"+
      "\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
      "\2\2\2\u0083\31\3\2\2\2\u0084\u0086\7\30\2\2\u0085\u0084\3\2\2\2\u0085"+
      "\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u008c\5\36\20\2\u0088\u008c"+
      "\5 \21\2\u0089\u008c\5\"\22\2\u008a\u008c\5$\23\2\u008b\u0087\3\2"+
      "\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
      "\u008d\3\2\2\2\u008d\u008e\7\30\2\2\u008e\33\3\2\2\2\u008f\u0091\7"+
      "\26\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2"+
      "\2\u0092\u0094\5\32\16\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
      "\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
      "\7\26\2\2\u0098\35\3\2\2\2\u0099\u009b\7\16\2\2\u009a\u009c\5&\24"+
      "\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\37\3\2\2\2\u009d"+
      "\u009f\7\r\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
      "\3\2\2\2\u00a0\u00a2\7\20\2\2\u00a1\u00a3\7\27\2\2\u00a2\u00a1\3\2"+
      "\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5&\24\2\u00a5"+
      "\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6!\3\2\2\2\u00a7\u00a9\7\13"+
      "\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
      "\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
      "\7\f\2\2\u00ae#\3\2\2\2\u00af\u00b1\7\21\2\2\u00b0\u00b2\5 \21\2\u00b1"+
      "\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
      "\3\2\2\2\u00b4%\3\2\2\2\u00b5\u00be\7\22\2\2\u00b6\u00b8\7\22\2\2"+
      "\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
      "\u00bb\7\17\2\2\u00ba\u00bc\7\22\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
      "\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7\3\2\2"+
      "\2\u00be\'\3\2\2\2\31\63\65BJfnvz}\u0082\u0085\u008b\u0090\u0095\u009b"+
      "\u009e\u00a2\u00a5\u00ab\u00b3\u00b7\u00bb\u00bd";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}