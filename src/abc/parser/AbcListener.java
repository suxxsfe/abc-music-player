// Generated from src/abc/parser/Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(AbcParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(AbcParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#head}.
   * @param ctx the parse tree
   */
  void enterHead(AbcParser.HeadContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#head}.
   * @param ctx the parse tree
   */
  void exitHead(AbcParser.HeadContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#x}.
   * @param ctx the parse tree
   */
  void enterX(AbcParser.XContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#x}.
   * @param ctx the parse tree
   */
  void exitX(AbcParser.XContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#t}.
   * @param ctx the parse tree
   */
  void enterT(AbcParser.TContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#t}.
   * @param ctx the parse tree
   */
  void exitT(AbcParser.TContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#c}.
   * @param ctx the parse tree
   */
  void enterC(AbcParser.CContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#c}.
   * @param ctx the parse tree
   */
  void exitC(AbcParser.CContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#l}.
   * @param ctx the parse tree
   */
  void enterL(AbcParser.LContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#l}.
   * @param ctx the parse tree
   */
  void exitL(AbcParser.LContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#m}.
   * @param ctx the parse tree
   */
  void enterM(AbcParser.MContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#m}.
   * @param ctx the parse tree
   */
  void exitM(AbcParser.MContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#q}.
   * @param ctx the parse tree
   */
  void enterQ(AbcParser.QContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#q}.
   * @param ctx the parse tree
   */
  void exitQ(AbcParser.QContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#v}.
   * @param ctx the parse tree
   */
  void enterV(AbcParser.VContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#v}.
   * @param ctx the parse tree
   */
  void exitV(AbcParser.VContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#k}.
   * @param ctx the parse tree
   */
  void enterK(AbcParser.KContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#k}.
   * @param ctx the parse tree
   */
  void exitK(AbcParser.KContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(AbcParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(AbcParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#section}.
   * @param ctx the parse tree
   */
  void enterSection(AbcParser.SectionContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#section}.
   * @param ctx the parse tree
   */
  void exitSection(AbcParser.SectionContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(AbcParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(AbcParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(AbcParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(AbcParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(AbcParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(AbcParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#segment}.
   * @param ctx the parse tree
   */
  void enterSegment(AbcParser.SegmentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#segment}.
   * @param ctx the parse tree
   */
  void exitSegment(AbcParser.SegmentContext ctx);
}