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
    NUMBER=16, DIGIT=17, LETTER=18, CHAR=19, SECTIONBAR=20, BAR=21, OCTAVE=22, 
    SPACES=23, NEWLINE=24;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "ACCIDENTAL", "REST", "DIV", "NOTECHAR", "TUPLETSIGN", "NUMBER", 
    "DIGIT", "LETTER", "CHAR", "SECTIONBAR", "BAR", "OCTAVE", "SPACES", 
    "NEWLINE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:C'", 
    "'['", "']'", null, "'z'", "'/'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, "ACCIDENTAL", 
    "REST", "DIV", "NOTECHAR", "TUPLETSIGN", "NUMBER", "DIGIT", "LETTER", 
    "CHAR", "SECTIONBAR", "BAR", "OCTAVE", "SPACES", "NEWLINE"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u009d\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
      "\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
      "\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fX\n\f\3\r\3\r\3\16\3\16\3\17"+
      "\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20f\n\20\3\21\6\21i\n\21\r\21"+
      "\16\21j\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
      "\5\25y\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0080\n\26\3\26\3\26\3\26"+
      "\3\26\5\26\u0086\n\26\3\27\6\27\u0089\n\27\r\27\16\27\u008a\3\27\6"+
      "\27\u008e\n\27\r\27\16\27\u008f\5\27\u0092\n\27\3\30\6\30\u0095\n"+
      "\30\r\30\16\30\u0096\3\31\5\31\u009a\n\31\3\31\3\31\2\2\32\3\3\5\4"+
      "\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
      "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\4\2CIci\3\2\62;\4\2"+
      "C\\c|\4\2/\60^^\3\2\"\"\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
      "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
      "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
      "\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
      "\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63"+
      "\3\2\2\2\5\66\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2"+
      "\17E\3\2\2\2\21H\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27W\3\2\2\2\31Y\3"+
      "\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37e\3\2\2\2!h\3\2\2\2#l\3\2\2\2%n\3"+
      "\2\2\2\'p\3\2\2\2)x\3\2\2\2+\177\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2"+
      "\2\2\61\u0099\3\2\2\2\63\64\7Z\2\2\64\65\7<\2\2\65\4\3\2\2\2\66\67"+
      "\7V\2\2\678\7<\2\28\6\3\2\2\29:\7E\2\2:;\7<\2\2;\b\3\2\2\2<=\7N\2"+
      "\2=>\7<\2\2>\n\3\2\2\2?@\7O\2\2@A\7<\2\2A\f\3\2\2\2BC\7S\2\2CD\7<"+
      "\2\2D\16\3\2\2\2EF\7X\2\2FG\7<\2\2G\20\3\2\2\2HI\7M\2\2IJ\7<\2\2J"+
      "K\7E\2\2K\22\3\2\2\2LM\7]\2\2M\24\3\2\2\2NO\7_\2\2O\26\3\2\2\2PX\7"+
      "`\2\2QR\7`\2\2RX\7`\2\2SX\7a\2\2TU\7a\2\2UX\7a\2\2VX\7?\2\2WP\3\2"+
      "\2\2WQ\3\2\2\2WS\3\2\2\2WT\3\2\2\2WV\3\2\2\2X\30\3\2\2\2YZ\7|\2\2"+
      "Z\32\3\2\2\2[\\\7\61\2\2\\\34\3\2\2\2]^\t\2\2\2^\36\3\2\2\2_`\7*\2"+
      "\2`f\7\64\2\2ab\7*\2\2bf\7\65\2\2cd\7*\2\2df\7\66\2\2e_\3\2\2\2ea"+
      "\3\2\2\2ec\3\2\2\2f \3\2\2\2gi\5#\22\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
      "\2jk\3\2\2\2k\"\3\2\2\2lm\t\3\2\2m$\3\2\2\2no\t\4\2\2o&\3\2\2\2pq"+
      "\t\5\2\2q(\3\2\2\2rs\7~\2\2sy\7~\2\2tu\7]\2\2uy\7~\2\2vw\7~\2\2wy"+
      "\7_\2\2xr\3\2\2\2xt\3\2\2\2xv\3\2\2\2y*\3\2\2\2z\u0080\7~\2\2{|\7"+
      "<\2\2|\u0080\7~\2\2}~\7~\2\2~\u0080\7<\2\2\177z\3\2\2\2\177{\3\2\2"+
      "\2\177}\3\2\2\2\u0080\u0085\3\2\2\2\u0081\u0082\7]\2\2\u0082\u0086"+
      "\7\63\2\2\u0083\u0084\7]\2\2\u0084\u0086\7\64\2\2\u0085\u0081\3\2"+
      "\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086,\3\2\2\2\u0087"+
      "\u0089\7.\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
      "\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0092\3\2\2\2\u008c\u008e\7)\2"+
      "\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
      "\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u008d"+
      "\3\2\2\2\u0092.\3\2\2\2\u0093\u0095\t\6\2\2\u0094\u0093\3\2\2\2\u0095"+
      "\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\60\3"+
      "\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2"+
      "\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c\62\3\2\2\2\16\2W"+
      "ejx\177\u0085\u008a\u008f\u0091\u0096\u0099\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}