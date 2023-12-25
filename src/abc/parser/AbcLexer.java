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
    T__9=10, T__10=11, T__11=12, DIV=13, NOTECHAR=14, NUMBER=15, DIGIT=16, 
    LETTER=17, CHAR=18, SECTIONBAR=19, BAR=20, REST=21, TUPLETLENGTH=22, 
    ACCIDENTAL=23, OCTAVE=24, SPACES=25, NEWLINE=26;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "DIV", "NOTECHAR", "NUMBER", "DIGIT", "LETTER", 
    "CHAR", "SECTIONBAR", "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", "OCTAVE", 
    "SPACES", "NEWLINE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'='", "'V:'", 
    "'K:C'", "'['", "']'", "'('", "'/'", null, null, null, null, null, null, 
    null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, "DIV", "NOTECHAR", "NUMBER", "DIGIT", "LETTER", "CHAR", "SECTIONBAR", 
    "BAR", "REST", "TUPLETLENGTH", "ACCIDENTAL", "OCTAVE", "SPACES", "NEWLINE"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u009e\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3"+
      "\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
      "\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
      "\6\20^\n\20\r\20\16\20_\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
      "\24\3\24\3\24\3\24\5\24n\n\24\3\25\3\25\3\25\3\25\3\25\5\25u\n\25"+
      "\3\25\3\25\3\25\3\25\5\25{\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
      "\3\30\3\30\3\30\5\30\u0087\n\30\3\31\6\31\u008a\n\31\r\31\16\31\u008b"+
      "\3\31\6\31\u008f\n\31\r\31\16\31\u0090\5\31\u0093\n\31\3\32\6\32\u0096"+
      "\n\32\r\32\16\32\u0097\3\33\5\33\u009b\n\33\3\33\3\33\2\2\34\3\3\5"+
      "\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
      "\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b\4\2C"+
      "Ici\3\2\62;\4\2C\\c|\4\2/\60^^\4\2??aa\3\2\"\"\u00ac\2\3\3\2\2\2\2"+
      "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
      "\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
      "\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
      "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
      "\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2"+
      "\2\7=\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21K\3"+
      "\2\2\2\23N\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2"+
      "\35Z\3\2\2\2\37]\3\2\2\2!a\3\2\2\2#c\3\2\2\2%e\3\2\2\2\'m\3\2\2\2"+
      ")t\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0086\3\2\2\2\61\u0092\3\2\2\2\63"+
      "\u0095\3\2\2\2\65\u009a\3\2\2\2\678\7Z\2\289\7<\2\29\4\3\2\2\2:;\7"+
      "V\2\2;<\7<\2\2<\6\3\2\2\2=>\7E\2\2>?\7<\2\2?\b\3\2\2\2@A\7N\2\2AB"+
      "\7<\2\2B\n\3\2\2\2CD\7O\2\2DE\7<\2\2E\f\3\2\2\2FG\7S\2\2GH\7<\2\2"+
      "H\16\3\2\2\2IJ\7?\2\2J\20\3\2\2\2KL\7X\2\2LM\7<\2\2M\22\3\2\2\2NO"+
      "\7M\2\2OP\7<\2\2PQ\7E\2\2Q\24\3\2\2\2RS\7]\2\2S\26\3\2\2\2TU\7_\2"+
      "\2U\30\3\2\2\2VW\7*\2\2W\32\3\2\2\2XY\7\61\2\2Y\34\3\2\2\2Z[\t\2\2"+
      "\2[\36\3\2\2\2\\^\5!\21\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
      "` \3\2\2\2ab\t\3\2\2b\"\3\2\2\2cd\t\4\2\2d$\3\2\2\2ef\t\5\2\2f&\3"+
      "\2\2\2gh\7~\2\2hn\7~\2\2ij\7]\2\2jn\7~\2\2kl\7~\2\2ln\7_\2\2mg\3\2"+
      "\2\2mi\3\2\2\2mk\3\2\2\2n(\3\2\2\2ou\7~\2\2pq\7<\2\2qu\7~\2\2rs\7"+
      "~\2\2su\7<\2\2to\3\2\2\2tp\3\2\2\2tr\3\2\2\2uz\3\2\2\2vw\7]\2\2w{"+
      "\7\63\2\2xy\7]\2\2y{\7\64\2\2zv\3\2\2\2zx\3\2\2\2z{\3\2\2\2{*\3\2"+
      "\2\2|}\7|\2\2},\3\2\2\2~\177\4\64\66\2\177.\3\2\2\2\u0080\u0087\7"+
      "`\2\2\u0081\u0082\7`\2\2\u0082\u0087\7`\2\2\u0083\u0087\t\6\2\2\u0084"+
      "\u0085\7a\2\2\u0085\u0087\7a\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3"+
      "\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0087\60\3\2\2\2\u0088"+
      "\u008a\7.\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
      "\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008f\7)\2"+
      "\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
      "\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008e"+
      "\3\2\2\2\u0093\62\3\2\2\2\u0094\u0096\t\7\2\2\u0095\u0094\3\2\2\2"+
      "\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
      "\64\3\2\2\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
      "\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f\2\2\u009d\66\3\2\2\2\r"+
      "\2_mtz\u0086\u008b\u0090\u0092\u0097\u009a\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}