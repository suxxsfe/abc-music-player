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
    T__9=10, ACCIDENTAL=11, REST=12, DIV=13, NOTECHAR=14, TUPLETSIGN=15, 
    NUMBER=16, DIGIT=17, LETTER=18, CHAR=19, BAR=20, OCTAVE=21, SPACES=22, 
    NEWLINE=23;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "ACCIDENTAL", "REST", "DIV", "NOTECHAR", "TUPLETSIGN", "NUMBER", 
    "DIGIT", "LETTER", "CHAR", "BAR", "OCTAVE", "SPACES", "NEWLINE"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u009f\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
      "\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
      "\3\f\3\f\3\f\3\f\3\f\5\fU\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
      "\3\20\3\20\3\20\3\20\5\20c\n\20\3\21\6\21f\n\21\r\21\16\21g\3\22\3"+
      "\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25u\n\25\3\25\3"+
      "\25\3\25\3\25\5\25{\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0083"+
      "\n\25\5\25\u0085\n\25\3\25\5\25\u0088\n\25\3\26\6\26\u008b\n\26\r"+
      "\26\16\26\u008c\3\26\6\26\u0090\n\26\r\26\16\26\u0091\5\26\u0094\n"+
      "\26\3\27\6\27\u0097\n\27\r\27\16\27\u0098\3\30\5\30\u009c\n\30\3\30"+
      "\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
      "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\4\2C"+
      "Ici\3\2\62;\4\2C\\c|\4\2/\60^^\3\2\"\"\u00b2\2\3\3\2\2\2\2\5\3\2\2"+
      "\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
      "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
      "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
      "\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
      "\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\t:\3\2\2\2\13=\3\2\2\2\r@\3\2\2"+
      "\2\17C\3\2\2\2\21F\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27T\3\2\2\2\31"+
      "V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37b\3\2\2\2!e\3\2\2\2#i\3\2\2\2"+
      "%k\3\2\2\2\'m\3\2\2\2)\u0084\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2"+
      "/\u009b\3\2\2\2\61\62\7Z\2\2\62\63\7<\2\2\63\4\3\2\2\2\64\65\7V\2"+
      "\2\65\66\7<\2\2\66\6\3\2\2\2\678\7E\2\289\7<\2\29\b\3\2\2\2:;\7N\2"+
      "\2;<\7<\2\2<\n\3\2\2\2=>\7O\2\2>?\7<\2\2?\f\3\2\2\2@A\7S\2\2AB\7<"+
      "\2\2B\16\3\2\2\2CD\7X\2\2DE\7<\2\2E\20\3\2\2\2FG\7M\2\2GH\7<\2\2H"+
      "\22\3\2\2\2IJ\7]\2\2J\24\3\2\2\2KL\7_\2\2L\26\3\2\2\2MU\7`\2\2NO\7"+
      "`\2\2OU\7`\2\2PU\7a\2\2QR\7a\2\2RU\7a\2\2SU\7?\2\2TM\3\2\2\2TN\3\2"+
      "\2\2TP\3\2\2\2TQ\3\2\2\2TS\3\2\2\2U\30\3\2\2\2VW\7|\2\2W\32\3\2\2"+
      "\2XY\7\61\2\2Y\34\3\2\2\2Z[\t\2\2\2[\36\3\2\2\2\\]\7*\2\2]c\7\64\2"+
      "\2^_\7*\2\2_c\7\65\2\2`a\7*\2\2ac\7\66\2\2b\\\3\2\2\2b^\3\2\2\2b`"+
      "\3\2\2\2c \3\2\2\2df\5#\22\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2"+
      "\2h\"\3\2\2\2ij\t\3\2\2j$\3\2\2\2kl\t\4\2\2l&\3\2\2\2mn\t\5\2\2n("+
      "\3\2\2\2ou\7~\2\2pq\7<\2\2qu\7~\2\2rs\7~\2\2su\7<\2\2to\3\2\2\2tp"+
      "\3\2\2\2tr\3\2\2\2uz\3\2\2\2vw\7]\2\2w{\7\63\2\2xy\7]\2\2y{\7\64\2"+
      "\2zv\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0085\3\2\2\2|}\7~\2\2}\u0083\7"+
      "~\2\2~\177\7]\2\2\177\u0083\7~\2\2\u0080\u0081\7~\2\2\u0081\u0083"+
      "\7_\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085"+
      "\3\2\2\2\u0084t\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
      "\u0088\5/\30\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088*\3\2"+
      "\2\2\u0089\u008b\7.\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
      "\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0090"+
      "\7)\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2"+
      "\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093"+
      "\u008f\3\2\2\2\u0094,\3\2\2\2\u0095\u0097\t\6\2\2\u0096\u0095\3\2"+
      "\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
      ".\3\2\2\2\u009a\u009c\7\17\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2"+
      "\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\f\2\2\u009e\60\3\2\2\2\20\2"+
      "Tbgtz\u0082\u0084\u0087\u008c\u0091\u0093\u0098\u009b\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}