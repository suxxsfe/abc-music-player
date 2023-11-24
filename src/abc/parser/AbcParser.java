// Generated from Abc.g4 by ANTLR 4.5.1

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
    NOTE=18, OCTAVE=19, STRING=20, NUMBER=21, INDEX=22, SPACES=23, TABS=24;
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
    null, "'K:'", null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, "X", "T", "C", "L", "M", "Q", "V", "K", 
    "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", "NOTE", "OCTAVE", 
    "STRING", "NUMBER", "INDEX", "SPACES", "TABS"
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
      setState(24);
      head();
      setState(25);
      body();
      setState(26);
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
      setState(28);
      match(X);
      setState(29);
      match(T);
      setState(33);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V))) != 0)) {
        {
        {
        setState(30);
        _la = _input.LA(1);
        if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V))) != 0)) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        }
        setState(35);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(36);
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
      setState(39); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(38);
        voice();
        }
        }
        setState(41); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << V) | (1L << REST) | (1L << ACCIDENTAL) | (1L << NOTE))) != 0) );
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
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(44);
      _la = _input.LA(1);
      if (_la==V) {
        {
        setState(43);
        match(V);
        }
      }

      setState(49); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(46);
          section();
          setState(47);
          match(SECTIONBAR);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(51); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
      setState(57); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(53);
        segment();
        setState(55);
        _la = _input.LA(1);
        if (_la==BAR) {
          {
          setState(54);
          match(BAR);
          }
        }

        }
        }
        setState(59); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << REST) | (1L << ACCIDENTAL) | (1L << NOTE))) != 0) );
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
    enterRule(_localctx, 10, RULE_segment);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(62); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(61);
          element();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(64); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
      setState(70);
      switch (_input.LA(1)) {
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(66);
        rest();
        }
        break;
      case ACCIDENTAL:
      case NOTE:
        enterOuterAlt(_localctx, 2);
        {
        setState(67);
        note();
        }
        break;
      case T__0:
        enterOuterAlt(_localctx, 3);
        {
        setState(68);
        chord();
        }
        break;
      case T__2:
        enterOuterAlt(_localctx, 4);
        {
        setState(69);
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
      setState(72);
      match(REST);
      setState(74);
      _la = _input.LA(1);
      if (_la==T__3 || _la==NUMBER) {
        {
        setState(73);
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
    public TerminalNode NOTE() { return getToken(AbcParser.NOTE, 0); }
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
      setState(77);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(76);
        match(ACCIDENTAL);
        }
      }

      setState(79);
      match(NOTE);
      setState(81);
      _la = _input.LA(1);
      if (_la==OCTAVE) {
        {
        setState(80);
        match(OCTAVE);
        }
      }

      setState(84);
      _la = _input.LA(1);
      if (_la==T__3 || _la==NUMBER) {
        {
        setState(83);
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
      setState(86);
      match(T__0);
      setState(88); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(87);
        note();
        }
        }
        setState(90); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==NOTE );
      setState(92);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(94);
      match(T__2);
      setState(95);
      match(TUPLETLENGTH);
      setState(97); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(96);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(99); 
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
      setState(102);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(101);
        match(NUMBER);
        }
      }

      setState(104);
      match(T__3);
      setState(106);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(105);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32o\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16"+
      "\3%\13\3\3\3\3\3\3\4\6\4*\n\4\r\4\16\4+\3\5\5\5/\n\5\3\5\3\5\3\5\6"+
      "\5\64\n\5\r\5\16\5\65\3\6\3\6\5\6:\n\6\6\6<\n\6\r\6\16\6=\3\7\6\7"+
      "A\n\7\r\7\16\7B\3\b\3\b\3\b\3\b\5\bI\n\b\3\t\3\t\5\tM\n\t\3\n\5\n"+
      "P\n\n\3\n\3\n\5\nT\n\n\3\n\5\nW\n\n\3\13\3\13\6\13[\n\13\r\13\16\13"+
      "\\\3\13\3\13\3\f\3\f\3\f\6\fd\n\f\r\f\16\fe\3\r\5\ri\n\r\3\r\3\r\5"+
      "\rm\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\t\rt\2\32"+
      "\3\2\2\2\4\36\3\2\2\2\6)\3\2\2\2\b.\3\2\2\2\n;\3\2\2\2\f@\3\2\2\2"+
      "\16H\3\2\2\2\20J\3\2\2\2\22O\3\2\2\2\24X\3\2\2\2\26`\3\2\2\2\30h\3"+
      "\2\2\2\32\33\5\4\3\2\33\34\5\6\4\2\34\35\7\2\2\3\35\3\3\2\2\2\36\37"+
      "\7\7\2\2\37#\7\b\2\2 \"\t\2\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3"+
      "\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\16\2\2\'\5\3\2\2\2(*\5\b\5\2)(\3\2"+
      "\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-/\7\r\2\2.-\3\2\2\2"+
      "./\3\2\2\2/\63\3\2\2\2\60\61\5\n\6\2\61\62\7\17\2\2\62\64\3\2\2\2"+
      "\63\60\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t\3\2"+
      "\2\2\679\5\f\7\28:\7\20\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;\67\3\2"+
      "\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\13\3\2\2\2?A\5\16\b\2@?\3\2\2"+
      "\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DI\5\20\t\2EI\5\22\n\2"+
      "FI\5\24\13\2GI\5\26\f\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\17"+
      "\3\2\2\2JL\7\21\2\2KM\5\30\r\2LK\3\2\2\2LM\3\2\2\2M\21\3\2\2\2NP\7"+
      "\23\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\24\2\2RT\7\25\2\2SR\3\2"+
      "\2\2ST\3\2\2\2TV\3\2\2\2UW\5\30\r\2VU\3\2\2\2VW\3\2\2\2W\23\3\2\2"+
      "\2XZ\7\3\2\2Y[\5\22\n\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
      "]^\3\2\2\2^_\7\4\2\2_\25\3\2\2\2`a\7\5\2\2ac\7\22\2\2bd\5\22\n\2c"+
      "b\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\27\3\2\2\2gi\7\27\2\2hg\3"+
      "\2\2\2hi\3\2\2\2ij\3\2\2\2jl\7\6\2\2km\7\27\2\2lk\3\2\2\2lm\3\2\2"+
      "\2m\31\3\2\2\2\22#+.\659=BHLOSV\\ehl";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}