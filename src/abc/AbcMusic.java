package abc;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.AbcListener;

public interface AbcMusic{
    
    public static AbcMusic parse(String input){
        System.out.println("start parsing");
        
        AbcParser parser = makeParser(input);
        ParseTree tree = parser.root();
        
        Trees.inspect(tree, parser);
        
        ParseTreeWalker walker = new ParseTreeWalker();
        AbcBuilder builder = new AbcBuilder();
        walker.walk(builder, tree);
        return builder.getAbcMusic();
    }
    
    static AbcParser makeParser(String input){
        CharStream stream = new ANTLRInputStream(input);
        AbcLexer lexer = new AbcLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        AbcParser parser = new AbcParser(tokens);
        parser.reportErrorsAsExceptions();
        
        return parser;
    }
    
}

class AbcBuilder implements AbcListener{
    
    public AbcMusic getAbcMusic(){
        
        return new AbcMusicRest(0);
    }
    
    @Override
    public void enterRoot(AbcParser.RootContext ctx){}
    @Override
    public void exitRoot(AbcParser.RootContext ctx){}
    @Override
    public void enterHead(AbcParser.HeadContext ctx){}
    @Override
    public void exitHead(AbcParser.HeadContext ctx){}
    @Override
    public void enterBody(AbcParser.BodyContext ctx){}
    @Override
    public void exitBody(AbcParser.BodyContext ctx){}
    @Override
    public void enterX(AbcParser.XContext ctx){}
    @Override
    public void exitX(AbcParser.XContext ctx){}
    @Override
    public void enterT(AbcParser.TContext ctx){}
    @Override
    public void exitT(AbcParser.TContext ctx){}
    @Override
    public void enterC(AbcParser.CContext ctx){}
    @Override
    public void exitC(AbcParser.CContext ctx){}
    @Override
    public void enterL(AbcParser.LContext ctx){}
    @Override
    public void exitL(AbcParser.LContext ctx){}
    @Override
    public void enterM(AbcParser.MContext ctx){}
    @Override
    public void exitM(AbcParser.MContext ctx){}
    @Override
    public void enterQ(AbcParser.QContext ctx){}
    @Override
    public void exitQ(AbcParser.QContext ctx){}
    @Override
    public void enterV(AbcParser.VContext ctx){}
    @Override
    public void exitV(AbcParser.VContext ctx){}
    @Override
    public void enterK(AbcParser.KContext ctx){}
    @Override
    public void exitK(AbcParser.KContext ctx){}
    @Override
    public void enterVoice(AbcParser.VoiceContext ctx){}
    @Override
    public void exitVoice(AbcParser.VoiceContext ctx){}
    @Override
    public void enterSection(AbcParser.SectionContext ctx){}
    @Override
    public void exitSection(AbcParser.SectionContext ctx){}
    @Override
    public void enterSegment(AbcParser.SegmentContext ctx){}
    @Override
    public void exitSegment(AbcParser.SegmentContext ctx){}
    @Override
    public void enterElement(AbcParser.ElementContext ctx){}
    @Override
    public void exitElement(AbcParser.ElementContext ctx){}
    @Override
    public void enterRest(AbcParser.RestContext ctx){}
    @Override
    public void exitRest(AbcParser.RestContext ctx){}
    @Override
    public void enterNote(AbcParser.NoteContext ctx){}
    @Override
    public void exitNote(AbcParser.NoteContext ctx){}
    @Override
    public void enterChord(AbcParser.ChordContext ctx){}
    @Override
    public void exitChord(AbcParser.ChordContext ctx){}
    @Override
    public void enterTuplet(AbcParser.TupletContext ctx){}
    @Override
    public void exitTuplet(AbcParser.TupletContext ctx){}
    @Override
    public void enterLength(AbcParser.LengthContext ctx){}
    @Override
    public void exitLength(AbcParser.LengthContext ctx){}
    
    @Override
    public void visitTerminal(TerminalNode terminal){}
    @Override
    public void visitErrorNode(ErrorNode node){}
    @Override
    public void enterEveryRule(ParserRuleContext ctx){}
    @Override
    public void exitEveryRule(ParserRuleContext ctx){}
}

