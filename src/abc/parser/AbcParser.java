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
    T__9=10, T__10=11, T__11=12, T__12=13, SECTIONBAR=14, BAR=15, REST=16, 
    TUPLETLENGTH=17, ACCIDENTAL=18, OCTAVE=19, NUMBER=20, INDEX=21, SPACES=22, 
    NEWLINE=23, NOTECHAR=24;
  public static final int
    RULE_root = 0, RULE_head = 1, RULE_x = 2, RULE_t = 3, RULE_c = 4, RULE_l = 5, 
    RULE_m = 6, RULE_q = 7, RULE_v = 8, RULE_k = 9, RULE_body = 10, RULE_voice = 11, 
    RULE_section = 12, RULE_element = 13, RULE_rest = 14, RULE_note = 15, 
    RULE_chord = 16, RULE_tuplet = 17, RULE_length = 18, RULE_segment = 19;
  public static final String[] ruleNames = {
    "root", "head", "x", "t", "c", "l", "m", "q", "v", "k", "body", "voice", 
    "section", "element", "rest", "note", "chord", "tuplet", "length", "segment"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'/'", "'M:'", "'Q:'", "'='", 
    "'V:'", "'K:C'", "'['", "']'", "'('", null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", 
    "OCTAVE", "NUMBER", "INDEX", "SPACES", "NEWLINE", "NOTECHAR"
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
    public SegmentContext segment() {
      return getRuleContext(SegmentContext.class,0);
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
      setState(40);
      segment();
      setState(41);
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      x();
      setState(44);
      t();
      setState(45);
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
    public TerminalNode INDEX() { return getToken(AbcParser.INDEX, 0); }
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
      setState(47);
      match(T__0);
      setState(48);
      match(INDEX);
      setState(49);
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
      setState(51);
      match(T__1);
      setState(52);
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
      setState(54);
      match(T__2);
      setState(55);
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
      setState(57);
      match(T__3);
      setState(58);
      match(NUMBER);
      setState(59);
      match(T__4);
      setState(60);
      match(NUMBER);
      setState(61);
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
      setState(63);
      match(T__5);
      setState(64);
      match(NUMBER);
      setState(65);
      match(T__4);
      setState(66);
      match(NUMBER);
      setState(67);
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
      setState(69);
      match(T__6);
      setState(70);
      match(NUMBER);
      setState(71);
      match(T__4);
      setState(72);
      match(NUMBER);
      setState(73);
      match(T__7);
      setState(74);
      match(NUMBER);
      setState(75);
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
      setState(77);
      match(T__8);
      setState(78);
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
      setState(80);
      match(T__9);
      setState(81);
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
    public List<TerminalNode> NEWLINE() { return getTokens(AbcParser.NEWLINE); }
    public TerminalNode NEWLINE(int i) {
      return getToken(AbcParser.NEWLINE, i);
    }
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
      setState(86); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(83);
        voice();
        setState(84);
        match(NEWLINE);
        }
        }
        setState(88); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTECHAR );
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
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<SectionContext> section() {
      return getRuleContexts(SectionContext.class);
    }
    public SectionContext section(int i) {
      return getRuleContext(SectionContext.class,i);
    }
    public List<TerminalNode> SECTIONBAR() { return getTokens(AbcParser.SECTIONBAR); }
    public TerminalNode SECTIONBAR(int i) {
      return getToken(AbcParser.SECTIONBAR, i);
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
      enterOuterAlt(_localctx, 1);
      {
      setState(93); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(90);
        section();
        setState(91);
        match(SECTIONBAR);
        }
        }
        setState(95); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTECHAR );
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

  public static class SectionContext extends ParserRuleContext {
    public List<SegmentContext> segment() {
      return getRuleContexts(SegmentContext.class);
    }
    public SegmentContext segment(int i) {
      return getRuleContext(SegmentContext.class,i);
    }
    public List<TerminalNode> BAR() { return getTokens(AbcParser.BAR); }
    public TerminalNode BAR(int i) {
      return getToken(AbcParser.BAR, i);
    }
    public SectionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_section; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterSection(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitSection(this);
    }
  }

  public final SectionContext section() throws RecognitionException {
    SectionContext _localctx = new SectionContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_section);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      segment();
      setState(104);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==BAR) {
        {
        {
        setState(100);
        match(BAR);
        setState(101);
        segment();
        }
        }
        setState(106);
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
    enterRule(_localctx, 26, RULE_element);
    try {
      setState(111);
      switch (_input.LA(1)) {
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(107);
        rest();
        }
        break;
      case ACCIDENTAL:
      case NOTECHAR:
        enterOuterAlt(_localctx, 2);
        {
        setState(108);
        note();
        }
        break;
      case T__10:
        enterOuterAlt(_localctx, 3);
        {
        setState(109);
        chord();
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 4);
        {
        setState(110);
        tuplet();
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
      setState(113);
      match(REST);
      setState(115);
      _la = _input.LA(1);
      if (_la==T__4 || _la==NUMBER) {
        {
        setState(114);
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
      setState(118);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(117);
        match(ACCIDENTAL);
        }
      }

      setState(120);
      match(NOTECHAR);
      setState(122);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(121);
        match(OCTAVE);
        }
      }

      setState(125);
      _la = _input.LA(1);
      if (_la==T__4 || _la==NUMBER) {
        {
        setState(124);
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
      setState(127);
      match(T__10);
      setState(129); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(128);
        note();
        }
        }
        setState(131); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTECHAR );
      setState(133);
      match(T__11);
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
    public TerminalNode TUPLETLENGTH() { return getToken(AbcParser.TUPLETLENGTH, 0); }
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
      setState(135);
      match(T__12);
      setState(136);
      match(TUPLETLENGTH);
      setState(138); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(137);
        note();
        }
        }
        setState(140); 
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
      enterOuterAlt(_localctx, 1);
      {
      setState(143);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(142);
        match(NUMBER);
        }
      }

      setState(145);
      match(T__4);
      setState(147);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(146);
        match(NUMBER);
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

  public static class SegmentContext extends ParserRuleContext {
    public List<TerminalNode> NOTECHAR() { return getTokens(AbcParser.NOTECHAR); }
    public TerminalNode NOTECHAR(int i) {
      return getToken(AbcParser.NOTECHAR, i);
    }
    public List<TerminalNode> SPACES() { return getTokens(AbcParser.SPACES); }
    public TerminalNode SPACES(int i) {
      return getToken(AbcParser.SPACES, i);
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
    enterRule(_localctx, 38, RULE_segment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(149);
      match(NOTECHAR);
      setState(154);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACES) {
        {
        {
        setState(150);
        match(SPACES);
        setState(151);
        match(NOTECHAR);
        }
        }
        setState(156);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00a0\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3"+
      "\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
      "\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
      "\n\3\13\3\13\3\13\3\f\3\f\3\f\6\fY\n\f\r\f\16\fZ\3\r\3\r\3\r\6\r`"+
      "\n\r\r\r\16\ra\3\r\3\r\3\16\3\16\3\16\7\16i\n\16\f\16\16\16l\13\16"+
      "\3\17\3\17\3\17\3\17\5\17r\n\17\3\20\3\20\5\20v\n\20\3\21\5\21y\n"+
      "\21\3\21\3\21\5\21}\n\21\3\21\5\21\u0080\n\21\3\22\3\22\6\22\u0084"+
      "\n\22\r\22\16\22\u0085\3\22\3\22\3\23\3\23\3\23\6\23\u008d\n\23\r"+
      "\23\16\23\u008e\3\24\5\24\u0092\n\24\3\24\3\24\5\24\u0096\n\24\3\25"+
      "\3\25\3\25\7\25\u009b\n\25\f\25\16\25\u009e\13\25\3\25\2\2\26\2\4"+
      "\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u009a\2*\3\2\2\2\4-"+
      "\3\2\2\2\6\61\3\2\2\2\b\65\3\2\2\2\n8\3\2\2\2\f;\3\2\2\2\16A\3\2\2"+
      "\2\20G\3\2\2\2\22O\3\2\2\2\24R\3\2\2\2\26X\3\2\2\2\30_\3\2\2\2\32"+
      "e\3\2\2\2\34q\3\2\2\2\36s\3\2\2\2 x\3\2\2\2\"\u0081\3\2\2\2$\u0089"+
      "\3\2\2\2&\u0091\3\2\2\2(\u0097\3\2\2\2*+\5(\25\2+,\7\2\2\3,\3\3\2"+
      "\2\2-.\5\6\4\2./\5\b\5\2/\60\5\24\13\2\60\5\3\2\2\2\61\62\7\3\2\2"+
      "\62\63\7\27\2\2\63\64\7\31\2\2\64\7\3\2\2\2\65\66\7\4\2\2\66\67\7"+
      "\31\2\2\67\t\3\2\2\289\7\5\2\29:\7\31\2\2:\13\3\2\2\2;<\7\6\2\2<="+
      "\7\26\2\2=>\7\7\2\2>?\7\26\2\2?@\7\31\2\2@\r\3\2\2\2AB\7\b\2\2BC\7"+
      "\26\2\2CD\7\7\2\2DE\7\26\2\2EF\7\31\2\2F\17\3\2\2\2GH\7\t\2\2HI\7"+
      "\26\2\2IJ\7\7\2\2JK\7\26\2\2KL\7\n\2\2LM\7\26\2\2MN\7\31\2\2N\21\3"+
      "\2\2\2OP\7\13\2\2PQ\7\31\2\2Q\23\3\2\2\2RS\7\f\2\2ST\7\31\2\2T\25"+
      "\3\2\2\2UV\5\30\r\2VW\7\31\2\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2"+
      "\2\2Z[\3\2\2\2[\27\3\2\2\2\\]\5\32\16\2]^\7\20\2\2^`\3\2\2\2_\\\3"+
      "\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\31\2\2d\31\3\2"+
      "\2\2ej\5(\25\2fg\7\21\2\2gi\5(\25\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
      "jk\3\2\2\2k\33\3\2\2\2lj\3\2\2\2mr\5\36\20\2nr\5 \21\2or\5\"\22\2"+
      "pr\5$\23\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\35\3\2\2\2su\7"+
      "\22\2\2tv\5&\24\2ut\3\2\2\2uv\3\2\2\2v\37\3\2\2\2wy\7\24\2\2xw\3\2"+
      "\2\2xy\3\2\2\2yz\3\2\2\2z|\7\32\2\2{}\7\25\2\2|{\3\2\2\2|}\3\2\2\2"+
      "}\177\3\2\2\2~\u0080\5&\24\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
      "!\3\2\2\2\u0081\u0083\7\r\2\2\u0082\u0084\5 \21\2\u0083\u0082\3\2"+
      "\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
      "\u0087\3\2\2\2\u0087\u0088\7\16\2\2\u0088#\3\2\2\2\u0089\u008a\7\17"+
      "\2\2\u008a\u008c\7\23\2\2\u008b\u008d\5 \21\2\u008c\u008b\3\2\2\2"+
      "\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
      "%\3\2\2\2\u0090\u0092\7\26\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2"+
      "\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\7\2\2\u0094\u0096\7\26\2\2"+
      "\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\'\3\2\2\2\u0097\u009c"+
      "\7\32\2\2\u0098\u0099\7\30\2\2\u0099\u009b\7\32\2\2\u009a\u0098\3"+
      "\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2"+
      "\u009d)\3\2\2\2\u009e\u009c\3\2\2\2\17Zajqux|\177\u0085\u008e\u0091"+
      "\u0095\u009c";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}