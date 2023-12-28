// Generated from src/abc/parser/Abc.g4 by ANTLR 4.5.1

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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, SPACES=11, NEWLINE=12, BAR=13, OCTAVE=14, ACCIDENTAL=15, REST=16, 
    DIV=17, NOTECHAR=18, TUPLETSIGN=19, DIGIT=20, ANY=21, COMMENT=22;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "SPACES", "NEWLINE", "BAR", "OCTAVE", "ACCIDENTAL", "REST", 
    "DIV", "NOTECHAR", "TUPLETSIGN", "DIGIT", "ANY", "COMMENT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00a1\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
      "\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fM\n\f\r\f"+
      "\16\fN\3\r\5\rR\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16[\n\16\3"+
      "\16\3\16\3\16\3\16\5\16a\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16i"+
      "\n\16\5\16k\n\16\3\16\5\16n\n\16\3\17\6\17q\n\17\r\17\16\17r\3\17"+
      "\6\17v\n\17\r\17\16\17w\5\17z\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
      "\20\5\20\u0083\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
      "\24\3\24\3\24\5\24\u0091\n\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u0099"+
      "\n\27\f\27\16\27\u009c\13\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7"+
      "\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
      "!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2\"\"\4\2CIci\3\2\62;\4\2\f"+
      "\f\17\17\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
      "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
      "\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
      "\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+"+
      "\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t8\3\2\2"+
      "\2\13;\3\2\2\2\r>\3\2\2\2\17A\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25I"+
      "\3\2\2\2\27L\3\2\2\2\31Q\3\2\2\2\33j\3\2\2\2\35y\3\2\2\2\37\u0082"+
      "\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u0090\3\2"+
      "\2\2)\u0092\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\60\7Z\2\2\60\61"+
      "\7<\2\2\61\4\3\2\2\2\62\63\7V\2\2\63\64\7<\2\2\64\6\3\2\2\2\65\66"+
      "\7E\2\2\66\67\7<\2\2\67\b\3\2\2\289\7N\2\29:\7<\2\2:\n\3\2\2\2;<\7"+
      "O\2\2<=\7<\2\2=\f\3\2\2\2>?\7S\2\2?@\7<\2\2@\16\3\2\2\2AB\7X\2\2B"+
      "C\7<\2\2C\20\3\2\2\2DE\7M\2\2EF\7<\2\2F\22\3\2\2\2GH\7]\2\2H\24\3"+
      "\2\2\2IJ\7_\2\2J\26\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2"+
      "\2NO\3\2\2\2O\30\3\2\2\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
      "ST\7\f\2\2T\32\3\2\2\2U[\7~\2\2VW\7<\2\2W[\7~\2\2XY\7~\2\2Y[\7<\2"+
      "\2ZU\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[`\3\2\2\2\\]\7]\2\2]a\7\63\2\2^_"+
      "\7]\2\2_a\7\64\2\2`\\\3\2\2\2`^\3\2\2\2`a\3\2\2\2ak\3\2\2\2bc\7~\2"+
      "\2ci\7~\2\2de\7]\2\2ei\7~\2\2fg\7~\2\2gi\7_\2\2hb\3\2\2\2hd\3\2\2"+
      "\2hf\3\2\2\2ik\3\2\2\2jZ\3\2\2\2jh\3\2\2\2km\3\2\2\2ln\5\31\r\2ml"+
      "\3\2\2\2mn\3\2\2\2n\34\3\2\2\2oq\7.\2\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
      "\2\2rs\3\2\2\2sz\3\2\2\2tv\7)\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx"+
      "\3\2\2\2xz\3\2\2\2yp\3\2\2\2yu\3\2\2\2z\36\3\2\2\2{\u0083\7`\2\2|"+
      "}\7`\2\2}\u0083\7`\2\2~\u0083\7a\2\2\177\u0080\7a\2\2\u0080\u0083"+
      "\7a\2\2\u0081\u0083\7?\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082~\3"+
      "\2\2\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083 \3\2\2\2\u0084"+
      "\u0085\7|\2\2\u0085\"\3\2\2\2\u0086\u0087\7\61\2\2\u0087$\3\2\2\2"+
      "\u0088\u0089\t\3\2\2\u0089&\3\2\2\2\u008a\u008b\7*\2\2\u008b\u0091"+
      "\7\64\2\2\u008c\u008d\7*\2\2\u008d\u0091\7\65\2\2\u008e\u008f\7*\2"+
      "\2\u008f\u0091\7\66\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
      "\u008e\3\2\2\2\u0091(\3\2\2\2\u0092\u0093\t\4\2\2\u0093*\3\2\2\2\u0094"+
      "\u0095\n\5\2\2\u0095,\3\2\2\2\u0096\u009a\7\'\2\2\u0097\u0099\n\5"+
      "\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
      "\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
      "\5\31\r\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\27\2\2\u00a0.\3\2\2\2"+
      "\20\2NQZ`hjmrwy\u0082\u0090\u009a\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}