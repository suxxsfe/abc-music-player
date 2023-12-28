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
    T__9=10, SPACES=11, NEWLINE=12, BAR=13, OCTAVE=14, ACCIDENTAL=15, REST=16, 
    DIV=17, NOTECHAR=18, TUPLETSIGN=19, DIGIT=20, ANY=21, COMMENT=22;
  public static final int
    RULE_root = 0, RULE_head = 1, RULE_x = 2, RULE_t = 3, RULE_c = 4, RULE_l = 5, 
    RULE_m = 6, RULE_q = 7, RULE_v = 8, RULE_k = 9, RULE_body = 10, RULE_voice = 11, 
    RULE_element = 12, RULE_segment = 13, RULE_rest = 14, RULE_note = 15, 
    RULE_chord = 16, RULE_tuplet = 17, RULE_length = 18, RULE_number = 19, 
    RULE_string = 20;
  public static final String[] ruleNames = {
    "root", "head", "x", "t", "c", "l", "m", "q", "v", "k", "body", "voice", 
    "element", "segment", "rest", "note", "chord", "tuplet", "length", "number", 
    "string"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'['", "']'", null, null, null, null, null, "'z'", "'/'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "SPACES", 
    "NEWLINE", "BAR", "OCTAVE", "ACCIDENTAL", "REST", "DIV", "NOTECHAR", 
    "TUPLETSIGN", "DIGIT", "ANY", "COMMENT"
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
      setState(42);
      head();
      setState(43);
      body();
      setState(44);
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
      setState(46);
      x();
      setState(47);
      t();
      setState(55);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
        {
        setState(53);
        switch (_input.LA(1)) {
        case T__2:
          {
          setState(48);
          c();
          }
          break;
        case T__3:
          {
          setState(49);
          l();
          }
          break;
        case T__4:
          {
          setState(50);
          m();
          }
          break;
        case T__5:
          {
          setState(51);
          q();
          }
          break;
        case T__6:
          {
          setState(52);
          v();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(57);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(58);
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
    public NumberContext number() {
      return getRuleContext(NumberContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      match(T__0);
      setState(62);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(61);
        match(SPACES);
        }
      }

      setState(64);
      number();
      setState(65);
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
    public StringContext string() {
      return getRuleContext(StringContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      match(T__1);
      setState(69);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        {
        setState(68);
        match(SPACES);
        }
        break;
      }
      setState(71);
      string();
      setState(72);
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
    public StringContext string() {
      return getRuleContext(StringContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(74);
      match(T__2);
      setState(76);
      switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
      case 1:
        {
        setState(75);
        match(SPACES);
        }
        break;
      }
      setState(78);
      string();
      setState(79);
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
    public List<NumberContext> number() {
      return getRuleContexts(NumberContext.class);
    }
    public NumberContext number(int i) {
      return getRuleContext(NumberContext.class,i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(T__3);
      setState(83);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(82);
        match(SPACES);
        }
      }

      setState(85);
      number();
      setState(86);
      match(DIV);
      setState(87);
      number();
      setState(88);
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
    public List<NumberContext> number() {
      return getRuleContexts(NumberContext.class);
    }
    public NumberContext number(int i) {
      return getRuleContext(NumberContext.class,i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(90);
      match(T__4);
      setState(92);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(91);
        match(SPACES);
        }
      }

      setState(94);
      number();
      setState(95);
      match(DIV);
      setState(96);
      number();
      setState(97);
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
    public List<NumberContext> number() {
      return getRuleContexts(NumberContext.class);
    }
    public NumberContext number(int i) {
      return getRuleContext(NumberContext.class,i);
    }
    public TerminalNode DIV() { return getToken(AbcParser.DIV, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      match(T__5);
      setState(101);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(100);
        match(SPACES);
        }
      }

      setState(103);
      number();
      setState(104);
      match(DIV);
      setState(105);
      number();
      setState(106);
      match(ACCIDENTAL);
      setState(107);
      number();
      setState(108);
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
    public StringContext string() {
      return getRuleContext(StringContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(110);
      match(T__6);
      setState(112);
      switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
      case 1:
        {
        setState(111);
        match(SPACES);
        }
        break;
      }
      setState(114);
      string();
      setState(115);
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
    public StringContext string() {
      return getRuleContext(StringContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode SPACES() { return getToken(AbcParser.SPACES, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(117);
      match(T__7);
      setState(119);
      switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
      case 1:
        {
        setState(118);
        match(SPACES);
        }
        break;
      }
      setState(121);
      string();
      setState(122);
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
      setState(124);
      voice();
      setState(128);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << SPACES) | (1L << BAR) | (1L << ACCIDENTAL) | (1L << REST) | (1L << NOTECHAR) | (1L << TUPLETSIGN))) != 0)) {
        {
        {
        setState(125);
        voice();
        }
        }
        setState(130);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(132);
      _la = _input.LA(1);
      if (_la==NEWLINE) {
        {
        setState(131);
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
      setState(135);
      _la = _input.LA(1);
      if (_la==T__6) {
        {
        setState(134);
        v();
        }
      }

      setState(138); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(137);
          segment();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(140); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
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
      setState(143);
      _la = _input.LA(1);
      if (_la==SPACES) {
        {
        setState(142);
        match(SPACES);
        }
      }

      setState(149);
      switch (_input.LA(1)) {
      case REST:
        {
        setState(145);
        rest();
        }
        break;
      case ACCIDENTAL:
      case NOTECHAR:
        {
        setState(146);
        note();
        }
        break;
      case T__8:
        {
        setState(147);
        chord();
        }
        break;
      case TUPLETSIGN:
        {
        setState(148);
        tuplet();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
      setState(152);
      switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
      case 1:
        {
        setState(151);
        match(SPACES);
        }
        break;
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
      setState(155);
      _la = _input.LA(1);
      if (_la==BAR) {
        {
        setState(154);
        match(BAR);
        }
      }

      setState(158); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(157);
        element();
        }
        }
        setState(160); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << SPACES) | (1L << ACCIDENTAL) | (1L << REST) | (1L << NOTECHAR) | (1L << TUPLETSIGN))) != 0) );
      setState(162);
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
      setState(164);
      match(REST);
      setState(166);
      _la = _input.LA(1);
      if (_la==DIV || _la==DIGIT) {
        {
        setState(165);
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
      setState(169);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(168);
        match(ACCIDENTAL);
        }
      }

      setState(171);
      match(NOTECHAR);
      setState(173);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(172);
        match(OCTAVE);
        }
      }

      setState(176);
      _la = _input.LA(1);
      if (_la==DIV || _la==DIGIT) {
        {
        setState(175);
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
      setState(178);
      match(T__8);
      setState(180); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(179);
        note();
        }
        }
        setState(182); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTECHAR );
      setState(184);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(186);
      match(TUPLETSIGN);
      setState(188); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(187);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(190); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

  public static class LengthContext extends ParserRuleContext {
    public List<NumberContext> number() {
      return getRuleContexts(NumberContext.class);
    }
    public NumberContext number(int i) {
      return getRuleContext(NumberContext.class,i);
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
      setState(200);
      switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(192);
        number();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(194);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(193);
          number();
          }
        }

        setState(196);
        match(DIV);
        setState(198);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(197);
          number();
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

  public static class NumberContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public NumberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNumber(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNumber(this);
    }
  }

  public final NumberContext number() throws RecognitionException {
    NumberContext _localctx = new NumberContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_number);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(203); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(202);
        match(DIGIT);
        }
        }
        setState(205); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class StringContext extends ParserRuleContext {
    public List<TerminalNode> ANY() { return getTokens(AbcParser.ANY); }
    public TerminalNode ANY(int i) {
      return getToken(AbcParser.ANY, i);
    }
    public List<TerminalNode> BAR() { return getTokens(AbcParser.BAR); }
    public TerminalNode BAR(int i) {
      return getToken(AbcParser.BAR, i);
    }
    public List<TerminalNode> OCTAVE() { return getTokens(AbcParser.OCTAVE); }
    public TerminalNode OCTAVE(int i) {
      return getToken(AbcParser.OCTAVE, i);
    }
    public List<TerminalNode> ACCIDENTAL() { return getTokens(AbcParser.ACCIDENTAL); }
    public TerminalNode ACCIDENTAL(int i) {
      return getToken(AbcParser.ACCIDENTAL, i);
    }
    public List<TerminalNode> REST() { return getTokens(AbcParser.REST); }
    public TerminalNode REST(int i) {
      return getToken(AbcParser.REST, i);
    }
    public List<TerminalNode> DIV() { return getTokens(AbcParser.DIV); }
    public TerminalNode DIV(int i) {
      return getToken(AbcParser.DIV, i);
    }
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public List<TerminalNode> TUPLETSIGN() { return getTokens(AbcParser.TUPLETSIGN); }
    public TerminalNode TUPLETSIGN(int i) {
      return getToken(AbcParser.TUPLETSIGN, i);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
    }
    public StringContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_string; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterString(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitString(this);
    }
  }

  public final StringContext string() throws RecognitionException {
    StringContext _localctx = new StringContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_string);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(208); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(207);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << BAR) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << DIV) | (1L << NOTECHAR) | (1L << TUPLETSIGN) | (1L << DIGIT) | (1L << ANY))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(210); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACES) | (1L << BAR) | (1L << OCTAVE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << DIV) | (1L << NOTECHAR) | (1L << TUPLETSIGN) | (1L << DIGIT) | (1L << ANY))) != 0) );
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00d7\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2"+
      "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\3\4\3"+
      "\4\5\4A\n\4\3\4\3\4\3\4\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\6\3\6\5\6O"+
      "\n\6\3\6\3\6\3\6\3\7\3\7\5\7V\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b"+
      "_\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\th\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
      "\3\t\3\n\3\n\5\ns\n\n\3\n\3\n\3\n\3\13\3\13\5\13z\n\13\3\13\3\13\3"+
      "\13\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084\13\f\3\f\5\f\u0087\n\f\3"+
      "\r\5\r\u008a\n\r\3\r\6\r\u008d\n\r\r\r\16\r\u008e\3\16\5\16\u0092"+
      "\n\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\16\5\16\u009b\n\16\3\17"+
      "\5\17\u009e\n\17\3\17\6\17\u00a1\n\17\r\17\16\17\u00a2\3\17\3\17\3"+
      "\20\3\20\5\20\u00a9\n\20\3\21\5\21\u00ac\n\21\3\21\3\21\5\21\u00b0"+
      "\n\21\3\21\5\21\u00b3\n\21\3\22\3\22\6\22\u00b7\n\22\r\22\16\22\u00b8"+
      "\3\22\3\22\3\23\3\23\6\23\u00bf\n\23\r\23\16\23\u00c0\3\24\3\24\5"+
      "\24\u00c5\n\24\3\24\3\24\5\24\u00c9\n\24\5\24\u00cb\n\24\3\25\6\25"+
      "\u00ce\n\25\r\25\16\25\u00cf\3\26\6\26\u00d3\n\26\r\26\16\26\u00d4"+
      "\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2"+
      "\r\r\17\27\u00e4\2,\3\2\2\2\4\60\3\2\2\2\6>\3\2\2\2\bE\3\2\2\2\nL"+
      "\3\2\2\2\fS\3\2\2\2\16\\\3\2\2\2\20e\3\2\2\2\22p\3\2\2\2\24w\3\2\2"+
      "\2\26~\3\2\2\2\30\u0089\3\2\2\2\32\u0091\3\2\2\2\34\u009d\3\2\2\2"+
      "\36\u00a6\3\2\2\2 \u00ab\3\2\2\2\"\u00b4\3\2\2\2$\u00bc\3\2\2\2&\u00ca"+
      "\3\2\2\2(\u00cd\3\2\2\2*\u00d2\3\2\2\2,-\5\4\3\2-.\5\26\f\2./\7\2"+
      "\2\3/\3\3\2\2\2\60\61\5\6\4\2\619\5\b\5\2\628\5\n\6\2\638\5\f\7\2"+
      "\648\5\16\b\2\658\5\20\t\2\668\5\22\n\2\67\62\3\2\2\2\67\63\3\2\2"+
      "\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\2"+
      "9:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\24\13\2=\5\3\2\2\2>@\7\3\2\2?A"+
      "\7\r\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5(\25\2CD\7\16\2\2D\7\3\2"+
      "\2\2EG\7\4\2\2FH\7\r\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\5*\26\2J"+
      "K\7\16\2\2K\t\3\2\2\2LN\7\5\2\2MO\7\r\2\2NM\3\2\2\2NO\3\2\2\2OP\3"+
      "\2\2\2PQ\5*\26\2QR\7\16\2\2R\13\3\2\2\2SU\7\6\2\2TV\7\r\2\2UT\3\2"+
      "\2\2UV\3\2\2\2VW\3\2\2\2WX\5(\25\2XY\7\23\2\2YZ\5(\25\2Z[\7\16\2\2"+
      "[\r\3\2\2\2\\^\7\7\2\2]_\7\r\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5"+
      "(\25\2ab\7\23\2\2bc\5(\25\2cd\7\16\2\2d\17\3\2\2\2eg\7\b\2\2fh\7\r"+
      "\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5(\25\2jk\7\23\2\2kl\5(\25\2"+
      "lm\7\21\2\2mn\5(\25\2no\7\16\2\2o\21\3\2\2\2pr\7\t\2\2qs\7\r\2\2r"+
      "q\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5*\26\2uv\7\16\2\2v\23\3\2\2\2wy\7"+
      "\n\2\2xz\7\r\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5*\26\2|}\7\16\2"+
      "\2}\25\3\2\2\2~\u0082\5\30\r\2\177\u0081\5\30\r\2\u0080\177\3\2\2"+
      "\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
      "\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\16\2\2\u0086\u0085"+
      "\3\2\2\2\u0086\u0087\3\2\2\2\u0087\27\3\2\2\2\u0088\u008a\5\22\n\2"+
      "\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
      "\u008d\5\34\17\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
      "\3\2\2\2\u008e\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090\u0092\7\r\2\2"+
      "\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\3\2\2\2\u0093"+
      "\u0098\5\36\20\2\u0094\u0098\5 \21\2\u0095\u0098\5\"\22\2\u0096\u0098"+
      "\5$\23\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2"+
      "\2\u0097\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\7\r\2\2\u009a"+
      "\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c\u009e\7"+
      "\17\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2"+
      "\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
      "\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
      "\7\17\2\2\u00a5\35\3\2\2\2\u00a6\u00a8\7\22\2\2\u00a7\u00a9\5&\24"+
      "\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\37\3\2\2\2\u00aa"+
      "\u00ac\7\21\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
      "\3\2\2\2\u00ad\u00af\7\24\2\2\u00ae\u00b0\7\20\2\2\u00af\u00ae\3\2"+
      "\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5&\24\2\u00b2"+
      "\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b6\7\13"+
      "\2\2\u00b5\u00b7\5 \21\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
      "\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
      "\7\f\2\2\u00bb#\3\2\2\2\u00bc\u00be\7\25\2\2\u00bd\u00bf\5 \21\2\u00be"+
      "\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
      "\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00cb\5(\25\2\u00c3\u00c5\5(\25\2\u00c4"+
      "\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
      "\7\23\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2"+
      "\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb"+
      "\'\3\2\2\2\u00cc\u00ce\7\26\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3"+
      "\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0)\3\2\2\2\u00d1"+
      "\u00d3\t\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2"+
      "\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5+\3\2\2\2 \679@GNU^gry\u0082\u0086"+
      "\u0089\u008e\u0091\u0097\u009a\u009d\u00a2\u00a8\u00ab\u00af\u00b2"+
      "\u00b8\u00c0\u00c4\u00c8\u00ca\u00cf\u00d4";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}