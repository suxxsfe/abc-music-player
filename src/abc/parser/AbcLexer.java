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
    T__9=10, T__10=11, T__11=12, T__12=13, SECTIONBAR=14, BAR=15, REST=16, 
    TUPLETLENGTH=17, ACCIDENTAL=18, OCTAVE=19, NUMBER=20, INDEX=21, SPACES=22, 
    NEWLINE=23, NOTECHAR=24;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", 
    "ACCIDENTAL", "OCTAVE", "NUMBER", "INDEX", "SPACES", "NEWLINE", "NOTECHAR"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u009e\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
      "\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
      "\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
      "\17]\n\17\3\20\3\20\3\20\3\20\3\20\5\20d\n\20\3\20\3\20\3\20\3\20"+
      "\5\20j\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
      "v\n\23\3\24\6\24y\n\24\r\24\16\24z\3\24\6\24~\n\24\r\24\16\24\177"+
      "\5\24\u0082\n\24\3\25\3\25\7\25\u0086\n\25\f\25\16\25\u0089\13\25"+
      "\3\26\6\26\u008c\n\26\r\26\16\26\u008d\3\27\6\27\u0091\n\27\r\27\16"+
      "\27\u0092\3\30\5\30\u0096\n\30\3\30\3\30\3\31\6\31\u009b\n\31\r\31"+
      "\16\31\u009c\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
      "\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
      "\32\3\2\7\4\2??aa\3\2\63;\3\2\62;\3\2\"\"\4\2C\\c|\u00ae\2\3\3\2\2"+
      "\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
      "\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
      "\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
      "\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/"+
      "\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\79\3\2\2\2\t<\3\2"+
      "\2\2\13?\3\2\2\2\rA\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25"+
      "L\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35\\\3\2\2\2\37c\3\2"+
      "\2\2!k\3\2\2\2#m\3\2\2\2%u\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2"+
      "+\u008b\3\2\2\2-\u0090\3\2\2\2/\u0095\3\2\2\2\61\u009a\3\2\2\2\63"+
      "\64\7Z\2\2\64\65\7<\2\2\65\4\3\2\2\2\66\67\7V\2\2\678\7<\2\28\6\3"+
      "\2\2\29:\7E\2\2:;\7<\2\2;\b\3\2\2\2<=\7N\2\2=>\7<\2\2>\n\3\2\2\2?"+
      "@\7\61\2\2@\f\3\2\2\2AB\7O\2\2BC\7<\2\2C\16\3\2\2\2DE\7S\2\2EF\7<"+
      "\2\2F\20\3\2\2\2GH\7?\2\2H\22\3\2\2\2IJ\7X\2\2JK\7<\2\2K\24\3\2\2"+
      "\2LM\7M\2\2MN\7<\2\2NO\7E\2\2O\26\3\2\2\2PQ\7]\2\2Q\30\3\2\2\2RS\7"+
      "_\2\2S\32\3\2\2\2TU\7*\2\2U\34\3\2\2\2VW\7~\2\2W]\7~\2\2XY\7]\2\2"+
      "Y]\7~\2\2Z[\7~\2\2[]\7_\2\2\\V\3\2\2\2\\X\3\2\2\2\\Z\3\2\2\2]\36\3"+
      "\2\2\2^d\7~\2\2_`\7<\2\2`d\7~\2\2ab\7~\2\2bd\7<\2\2c^\3\2\2\2c_\3"+
      "\2\2\2ca\3\2\2\2di\3\2\2\2ef\7]\2\2fj\7\63\2\2gh\7]\2\2hj\7\64\2\2"+
      "ie\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3\2\2\2kl\7|\2\2l\"\3\2\2\2mn\4\64"+
      "\66\2n$\3\2\2\2ov\7`\2\2pq\7`\2\2qv\7`\2\2rv\t\2\2\2st\7a\2\2tv\7"+
      "a\2\2uo\3\2\2\2up\3\2\2\2ur\3\2\2\2us\3\2\2\2v&\3\2\2\2wy\7a\2\2x"+
      "w\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7)\2\2}|"+
      "\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3"+
      "\2\2\2\u0081x\3\2\2\2\u0081}\3\2\2\2\u0082(\3\2\2\2\u0083\u0087\t"+
      "\3\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
      "\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088*\3\2\2\2\u0089\u0087"+
      "\3\2\2\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2"+
      "\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e,\3\2\2\2\u008f\u0091"+
      "\t\5\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2"+
      "\2\u0092\u0093\3\2\2\2\u0093.\3\2\2\2\u0094\u0096\7\17\2\2\u0095\u0094"+
      "\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\f\2"+
      "\2\u0098\60\3\2\2\2\u0099\u009b\t\6\2\2\u009a\u0099\3\2\2\2\u009b"+
      "\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\62\3"+
      "\2\2\2\17\2\\ciuz\177\u0081\u0087\u008d\u0092\u0095\u009c\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}