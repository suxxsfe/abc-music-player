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
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:C'", 
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a0\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
      "\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
      "\3\f\3\f\3\f\3\f\3\f\3\f\5\fV\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
      "\3\20\3\20\3\20\3\20\3\20\5\20d\n\20\3\21\6\21g\n\21\r\21\16\21h\3"+
      "\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25v\n\25\3"+
      "\25\3\25\3\25\3\25\5\25|\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0084"+
      "\n\25\5\25\u0086\n\25\3\25\5\25\u0089\n\25\3\26\6\26\u008c\n\26\r"+
      "\26\16\26\u008d\3\26\6\26\u0091\n\26\r\26\16\26\u0092\5\26\u0095\n"+
      "\26\3\27\6\27\u0098\n\27\r\27\16\27\u0099\3\30\5\30\u009d\n\30\3\30"+
      "\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
      "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\4\2C"+
      "Ici\3\2\62;\4\2C\\c|\4\2/\60^^\3\2\"\"\u00b3\2\3\3\2\2\2\2\5\3\2\2"+
      "\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
      "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
      "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
      "\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
      "\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\t:\3\2\2\2\13=\3\2\2\2\r@\3\2\2"+
      "\2\17C\3\2\2\2\21F\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27U\3\2\2\2\31"+
      "W\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#j\3\2\2\2"+
      "%l\3\2\2\2\'n\3\2\2\2)\u0085\3\2\2\2+\u0094\3\2\2\2-\u0097\3\2\2\2"+
      "/\u009c\3\2\2\2\61\62\7Z\2\2\62\63\7<\2\2\63\4\3\2\2\2\64\65\7V\2"+
      "\2\65\66\7<\2\2\66\6\3\2\2\2\678\7E\2\289\7<\2\29\b\3\2\2\2:;\7N\2"+
      "\2;<\7<\2\2<\n\3\2\2\2=>\7O\2\2>?\7<\2\2?\f\3\2\2\2@A\7S\2\2AB\7<"+
      "\2\2B\16\3\2\2\2CD\7X\2\2DE\7<\2\2E\20\3\2\2\2FG\7M\2\2GH\7<\2\2H"+
      "I\7E\2\2I\22\3\2\2\2JK\7]\2\2K\24\3\2\2\2LM\7_\2\2M\26\3\2\2\2NV\7"+
      "`\2\2OP\7`\2\2PV\7`\2\2QV\7a\2\2RS\7a\2\2SV\7a\2\2TV\7?\2\2UN\3\2"+
      "\2\2UO\3\2\2\2UQ\3\2\2\2UR\3\2\2\2UT\3\2\2\2V\30\3\2\2\2WX\7|\2\2"+
      "X\32\3\2\2\2YZ\7\61\2\2Z\34\3\2\2\2[\\\t\2\2\2\\\36\3\2\2\2]^\7*\2"+
      "\2^d\7\64\2\2_`\7*\2\2`d\7\65\2\2ab\7*\2\2bd\7\66\2\2c]\3\2\2\2c_"+
      "\3\2\2\2ca\3\2\2\2d \3\2\2\2eg\5#\22\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2"+
      "\2hi\3\2\2\2i\"\3\2\2\2jk\t\3\2\2k$\3\2\2\2lm\t\4\2\2m&\3\2\2\2no"+
      "\t\5\2\2o(\3\2\2\2pv\7~\2\2qr\7<\2\2rv\7~\2\2st\7~\2\2tv\7<\2\2up"+
      "\3\2\2\2uq\3\2\2\2us\3\2\2\2v{\3\2\2\2wx\7]\2\2x|\7\63\2\2yz\7]\2"+
      "\2z|\7\64\2\2{w\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0086\3\2\2\2}~\7~\2"+
      "\2~\u0084\7~\2\2\177\u0080\7]\2\2\u0080\u0084\7~\2\2\u0081\u0082\7"+
      "~\2\2\u0082\u0084\7_\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083\u0081"+
      "\3\2\2\2\u0084\u0086\3\2\2\2\u0085u\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
      "\u0088\3\2\2\2\u0087\u0089\5/\30\2\u0088\u0087\3\2\2\2\u0088\u0089"+
      "\3\2\2\2\u0089*\3\2\2\2\u008a\u008c\7.\2\2\u008b\u008a\3\2\2\2\u008c"+
      "\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095"+
      "\3\2\2\2\u008f\u0091\7)\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2"+
      "\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
      "\u008b\3\2\2\2\u0094\u0090\3\2\2\2\u0095,\3\2\2\2\u0096\u0098\t\6"+
      "\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
      "\u009a\3\2\2\2\u009a.\3\2\2\2\u009b\u009d\7\17\2\2\u009c\u009b\3\2"+
      "\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\f\2\2\u009f"+
      "\60\3\2\2\2\20\2Uchu{\u0083\u0085\u0088\u008d\u0092\u0094\u0099\u009c"+
      "\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}