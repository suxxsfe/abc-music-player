// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, X=5, T=6, C=7, L=8, M=9, Q=10, V=11, 
    K=12, SECTIONBAR=13, BAR=14, REST=15, TUPLETLENGTH=16, ACCIDENTAL=17, 
    NOTE=18, OCTAVE=19, STRING=20, NUMBER=21, INDEX=22, SPACES=23, TABS=24;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "X", "T", "C", "L", "M", "Q", "V", "K", 
    "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", "NOTE", "OCTAVE", 
    "STRING", "NUMBER", "INDEX", "SPACES", "TABS"
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


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00b7\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
      "\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
      "\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
      "\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
      "\3\16\3\16\5\16p\n\16\3\17\3\17\3\17\3\17\3\17\5\17w\n\17\3\17\3\17"+
      "\3\17\3\17\5\17}\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
      "\3\22\5\22\u0089\n\22\3\23\3\23\3\24\6\24\u008e\n\24\r\24\16\24\u008f"+
      "\3\24\6\24\u0093\n\24\r\24\16\24\u0094\5\24\u0097\n\24\3\25\6\25\u009a"+
      "\n\25\r\25\16\25\u009b\3\26\3\26\7\26\u00a0\n\26\f\26\16\26\u00a3"+
      "\13\26\3\27\6\27\u00a6\n\27\r\27\16\27\u00a7\3\30\6\30\u00ab\n\30"+
      "\r\30\16\30\u00ac\3\30\3\30\3\31\6\31\u00b2\n\31\r\31\16\31\u00b3"+
      "\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
      "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
      "\3\2\t\4\2??aa\4\2CIci\5\2\"\".ac|\3\2\63;\3\2\62;\3\2\"\"\3\2\13"+
      "\13\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
      "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
      "\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
      "\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
      "\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2"+
      "\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r@\3\2\2\2\17E\3\2\2\2\21J\3"+
      "\2\2\2\23Q\3\2\2\2\25X\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2\33o\3\2\2\2"+
      "\35v\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2"+
      "\2\2\'\u0096\3\2\2\2)\u0099\3\2\2\2+\u009d\3\2\2\2-\u00a5\3\2\2\2"+
      "/\u00aa\3\2\2\2\61\u00b1\3\2\2\2\63\64\7]\2\2\64\4\3\2\2\2\65\66\7"+
      "_\2\2\66\6\3\2\2\2\678\7*\2\28\b\3\2\2\29:\7\61\2\2:\n\3\2\2\2;<\7"+
      "Z\2\2<=\7<\2\2=>\3\2\2\2>?\5-\27\2?\f\3\2\2\2@A\7V\2\2AB\7<\2\2BC"+
      "\3\2\2\2CD\5)\25\2D\16\3\2\2\2EF\7E\2\2FG\7<\2\2GH\3\2\2\2HI\5)\25"+
      "\2I\20\3\2\2\2JK\7N\2\2KL\7<\2\2LM\3\2\2\2MN\5+\26\2NO\7\61\2\2OP"+
      "\5+\26\2P\22\3\2\2\2QR\7O\2\2RS\7<\2\2ST\3\2\2\2TU\5+\26\2UV\7\61"+
      "\2\2VW\5+\26\2W\24\3\2\2\2XY\7S\2\2YZ\7<\2\2Z[\3\2\2\2[\\\5+\26\2"+
      "\\]\7\61\2\2]^\5+\26\2^_\7?\2\2_`\5+\26\2`\26\3\2\2\2ab\7X\2\2bc\7"+
      "<\2\2cd\3\2\2\2de\5)\25\2e\30\3\2\2\2fg\7M\2\2gh\7<\2\2h\32\3\2\2"+
      "\2ij\7~\2\2jp\7~\2\2kl\7]\2\2lp\7~\2\2mn\7~\2\2np\7_\2\2oi\3\2\2\2"+
      "ok\3\2\2\2om\3\2\2\2p\34\3\2\2\2qw\7~\2\2rs\7<\2\2sw\7~\2\2tu\7~\2"+
      "\2uw\7<\2\2vq\3\2\2\2vr\3\2\2\2vt\3\2\2\2w|\3\2\2\2xy\7]\2\2y}\7\63"+
      "\2\2z{\7]\2\2{}\7\64\2\2|x\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\36\3\2\2\2"+
      "~\177\7|\2\2\177 \3\2\2\2\u0080\u0081\4\64\66\2\u0081\"\3\2\2\2\u0082"+
      "\u0089\7`\2\2\u0083\u0084\7`\2\2\u0084\u0089\7`\2\2\u0085\u0089\t"+
      "\2\2\2\u0086\u0087\7a\2\2\u0087\u0089\7a\2\2\u0088\u0082\3\2\2\2\u0088"+
      "\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0089$\3\2"+
      "\2\2\u008a\u008b\t\3\2\2\u008b&\3\2\2\2\u008c\u008e\7a\2\2\u008d\u008c"+
      "\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2"+
      "\2\u0090\u0097\3\2\2\2\u0091\u0093\7)\2\2\u0092\u0091\3\2\2\2\u0093"+
      "\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
      "\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0092\3\2\2\2\u0097(\3\2\2\2\u0098"+
      "\u009a\t\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
      "\3\2\2\2\u009b\u009c\3\2\2\2\u009c*\3\2\2\2\u009d\u00a1\t\5\2\2\u009e"+
      "\u00a0\t\6\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
      "\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2,\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
      "\u00a6\t\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5"+
      "\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8.\3\2\2\2\u00a9\u00ab\t\7\2\2\u00aa"+
      "\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
      "\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\30\2\2\u00af\60\3\2\2\2"+
      "\u00b0\u00b2\t\b\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
      "\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
      "\b\31\2\2\u00b6\62\3\2\2\2\17\2ov|\u0088\u008f\u0094\u0096\u009b\u00a1"+
      "\u00a7\u00ac\u00b3\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}