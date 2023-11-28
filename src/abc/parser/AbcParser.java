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
    T__0=1, T__1=2, T__2=3, T__3=4, X=5, T=6, C=7, L=8, M=9, Q=10, V=11, 
    K=12, SECTIONBAR=13, BAR=14, REST=15, TUPLETLENGTH=16, ACCIDENTAL=17, 
    NOTECHAR=18, OCTAVE=19, STRING=20, NUMBER=21, INDEX=22, SPACES=23, NEWLINE=24;
  public static final int
    RULE_root = 0, RULE_head = 1, RULE_body = 2, RULE_voice = 3, RULE_section = 4, 
    RULE_segment = 5, RULE_element = 6, RULE_rest = 7, RULE_note = 8, RULE_chord = 9, 
    RULE_tuplet = 10, RULE_length = 11;
  public static final String[] ruleNames = {
    "root", "head", "body", "voice", "section", "segment", "element", "rest", 
    "note", "chord", "tuplet", "length"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'['", "']'", "'('", "'/'", null, null, null, null, null, null, 
    null, null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, "X", "T", "C", "L", "M", "Q", "V", "K", 
    "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", "NOTECHAR", 
    "OCTAVE", "STRING", "NUMBER", "INDEX", "SPACES", "NEWLINE"
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
      setState(24);
      segment();
      setState(25);
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
    public TerminalNode X() { return getToken(AbcParser.X, 0); }
    public TerminalNode T() { return getToken(AbcParser.T, 0); }
    public TerminalNode K() { return getToken(AbcParser.K, 0); }
    public List<TerminalNode> C() { return getTokens(AbcParser.C); }
    public TerminalNode C(int i) {
      return getToken(AbcParser.C, i);
    }
    public List<TerminalNode> L() { return getTokens(AbcParser.L); }
    public TerminalNode L(int i) {
      return getToken(AbcParser.L, i);
    }
    public List<TerminalNode> M() { return getTokens(AbcParser.M); }
    public TerminalNode M(int i) {
      return getToken(AbcParser.M, i);
    }
    public List<TerminalNode> Q() { return getTokens(AbcParser.Q); }
    public TerminalNode Q(int i) {
      return getToken(AbcParser.Q, i);
    }
    public List<TerminalNode> V() { return getTokens(AbcParser.V); }
    public TerminalNode V(int i) {
      return getToken(AbcParser.V, i);
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
      setState(27);
      match(X);
      setState(28);
      match(T);
      setState(32);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V))) != 0)) {
        {
        {
        setState(29);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(34);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(35);
      match(K);
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
    enterRule(_localctx, 4, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(40); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(37);
        voice();
        setState(38);
        match(NEWLINE);
        }
        }
        setState(42); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==V || _la==NOTECHAR );
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
    public TerminalNode V() { return getToken(AbcParser.V, 0); }
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
    enterRule(_localctx, 6, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      _la = _input.LA(1);
      if (_la==V) {
        {
        setState(44);
        match(V);
        }
      }

      setState(50); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(47);
        section();
        setState(48);
        match(SECTIONBAR);
        }
        }
        setState(52); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NOTECHAR );
      setState(54);
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
    enterRule(_localctx, 8, RULE_section);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(56);
      segment();
      setState(61);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==BAR) {
        {
        {
        setState(57);
        match(BAR);
        setState(58);
        segment();
        }
        }
        setState(63);
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
    enterRule(_localctx, 10, RULE_segment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(64);
      match(NOTECHAR);
      setState(69);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==SPACES) {
        {
        {
        setState(65);
        match(SPACES);
        setState(66);
        match(NOTECHAR);
        }
        }
        setState(71);
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
    enterRule(_localctx, 12, RULE_element);
    try {
      setState(76);
      switch (_input.LA(1)) {
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(72);
        rest();
        }
        break;
      case ACCIDENTAL:
      case NOTECHAR:
        enterOuterAlt(_localctx, 2);
        {
        setState(73);
        note();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 3);
        {
        setState(74);
        chord();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 4);
        {
        setState(75);
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
    enterRule(_localctx, 14, RULE_rest);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(78);
      match(REST);
      setState(80);
      _la = _input.LA(1);
      if (_la==T__3 || _la==NUMBER) {
        {
        setState(79);
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
    enterRule(_localctx, 16, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(82);
        match(ACCIDENTAL);
        }
      }

      setState(85);
      match(NOTECHAR);
      setState(87);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(86);
        match(OCTAVE);
        }
      }

      setState(90);
      _la = _input.LA(1);
      if (_la==T__3 || _la==NUMBER) {
        {
        setState(89);
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
    enterRule(_localctx, 18, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(92);
      match(T__0);
      setState(94); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(93);
        note();
        }
        }
        setState(96); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTECHAR );
      setState(98);
      match(T__1);
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
    enterRule(_localctx, 20, RULE_tuplet);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(100);
      match(T__2);
      setState(101);
      match(TUPLETLENGTH);
      setState(103); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(102);
        note();
        }
        }
        setState(105); 
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
    enterRule(_localctx, 22, RULE_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(107);
        match(NUMBER);
        }
      }

      setState(110);
      match(T__3);
      setState(112);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(111);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32u\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13"+
      "\3\3\3\3\3\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\5\5\60\n\5\3\5\3\5\3"+
      "\5\6\5\65\n\5\r\5\16\5\66\3\5\3\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13"+
      "\6\3\7\3\7\3\7\7\7F\n\7\f\7\16\7I\13\7\3\b\3\b\3\b\3\b\5\bO\n\b\3"+
      "\t\3\t\5\tS\n\t\3\n\5\nV\n\n\3\n\3\n\5\nZ\n\n\3\n\5\n]\n\n\3\13\3"+
      "\13\6\13a\n\13\r\13\16\13b\3\13\3\13\3\f\3\f\3\f\6\fj\n\f\r\f\16\f"+
      "k\3\r\5\ro\n\r\3\r\3\r\5\rs\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
      "\26\30\2\3\3\2\t\ry\2\32\3\2\2\2\4\35\3\2\2\2\6*\3\2\2\2\b/\3\2\2"+
      "\2\n:\3\2\2\2\fB\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22U\3\2\2\2\24^\3"+
      "\2\2\2\26f\3\2\2\2\30n\3\2\2\2\32\33\5\f\7\2\33\34\7\2\2\3\34\3\3"+
      "\2\2\2\35\36\7\7\2\2\36\"\7\b\2\2\37!\t\2\2\2 \37\3\2\2\2!$\3\2\2"+
      "\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\16\2\2&\5\3\2\2"+
      "\2\'(\5\b\5\2()\7\32\2\2)+\3\2\2\2*\'\3\2\2\2+,\3\2\2\2,*\3\2\2\2"+
      ",-\3\2\2\2-\7\3\2\2\2.\60\7\r\2\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2"+
      "\2\2\61\62\5\n\6\2\62\63\7\17\2\2\63\65\3\2\2\2\64\61\3\2\2\2\65\66"+
      "\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\32\2\29\t\3\2"+
      "\2\2:?\5\f\7\2;<\7\20\2\2<>\5\f\7\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
      "?@\3\2\2\2@\13\3\2\2\2A?\3\2\2\2BG\7\24\2\2CD\7\31\2\2DF\7\24\2\2"+
      "EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IG\3\2\2\2JO\5"+
      "\20\t\2KO\5\22\n\2LO\5\24\13\2MO\5\26\f\2NJ\3\2\2\2NK\3\2\2\2NL\3"+
      "\2\2\2NM\3\2\2\2O\17\3\2\2\2PR\7\21\2\2QS\5\30\r\2RQ\3\2\2\2RS\3\2"+
      "\2\2S\21\3\2\2\2TV\7\23\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\24\2"+
      "\2XZ\7\25\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\5\30\r\2\\[\3\2\2\2"+
      "\\]\3\2\2\2]\23\3\2\2\2^`\7\3\2\2_a\5\22\n\2`_\3\2\2\2ab\3\2\2\2b"+
      "`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\4\2\2e\25\3\2\2\2fg\7\5\2\2gi\7"+
      "\22\2\2hj\5\22\n\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\27\3\2"+
      "\2\2mo\7\27\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\6\2\2qs\7\27\2\2"+
      "rq\3\2\2\2rs\3\2\2\2s\31\3\2\2\2\21\",/\66?GNRUY\\bknr";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}