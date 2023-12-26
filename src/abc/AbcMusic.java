package abc;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Collections;

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
        
//        Trees.inspect(tree, parser);
        
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
    
    public int getLength();
    
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer>length, int startTick);
    
}

class AbcBuilder implements AbcListener{
    
    private static final int FACTOR = 128*3*2;
    private static final Map<Integer, Integer> TUPLETS_LENGTH = new HashMap<Integer, Integer>(){{
        put(2, 3);
        put(3, 2);
        put(4, 3);
    }};
    
    private int tickPerNote, tickPerMinute, tickPerBar;
    private String title, composer, index;
    private int meterA, meterB, lA, lB, qA, qB, qSpeed;// rational: A/B
    
    private int noteLength;
    private Map<String, Integer> accidental = new HashMap<>();
    
    private int elementsNum, segmentTicks;
    private int end1, end2;
    private List<Integer> repeatEnds = new ArrayList<>();
    private List<Integer> repeatStarts = new ArrayList<>();
    
    private Stack<AbcMusic> stack = new Stack<>();
    
    private static int getAccidentalValue(String acci){
        if(acci.charAt(0) == '^'){
            return acci.length();
        }
        if(acci.charAt(0) == '_'){
            return -acci.length();
        }
        return 0;
    }
    
    public AbcMusic getAbcMusic(){
        return stack.pop();
    }
    
    private void pushStack(AbcMusic element){
        stack.push(element);
        elementsNum++;
        segmentTicks += element.getLength();
    }
    
    private AbcMusic popStack(){
        AbcMusic element = popStack();
        elementsNum--;
        segmentTicks -= element.getLength();
        return element;
    }
    
    @Override
    public void enterRoot(AbcParser.RootContext ctx){}
    @Override
    public void exitRoot(AbcParser.RootContext ctx){
        List<AbcMusic> voices = new ArrayList<>();
        
        while(!stack.empty()){
            voices.add(popStack());
        }
        Collections.reverse(voices);
        
        pushStack(new AbcMusicMain(voices, title, index));
    }
    @Override
    public void enterHead(AbcParser.HeadContext ctx){
        composer = "Unknown";
    }
    @Override
    public void exitHead(AbcParser.HeadContext ctx){
        if(meterA == 0){
            meterA = meterB = 4;
        }
        if(lA == 0){
            if((double)meterA/meterB < 0.75){
                lA = 1;
                lB = 16;
            }
            else{
                lA = 1;
                lB = 8;
            }
        }
        if(qA == 0){
            qA = lA;
            qB = lB;
            qSpeed = 100;
        }
  
        tickPerNote   = lB*meterA*qB*FACTOR;
        tickPerMinute = lB*meterB*qA*FACTOR*qSpeed;
        tickPerBar    = lA*meterA*qB*FACTOR;
//        notePerMinute = meterB*qA/meterB/qB*qSpeed;
    }
    @Override
    public void enterX(AbcParser.XContext ctx){
        index = ctx.NUMBER().getText();
    }
    @Override
    public void exitX(AbcParser.XContext ctx){}
    @Override
    public void enterT(AbcParser.TContext ctx){
        title = ctx.getText().substring(2, ctx.getText().length());
    }
    @Override
    public void exitT(AbcParser.TContext ctx){}
    @Override
    public void enterC(AbcParser.CContext ctx){
        composer = ctx.getText().substring(2, ctx.getText().length());
    }
    @Override
    public void exitC(AbcParser.CContext ctx){}
    @Override
    public void enterL(AbcParser.LContext ctx){
        lA = Integer.valueOf(ctx.NUMBER().get(0).getText());
        lB = Integer.valueOf(ctx.NUMBER().get(1).getText());
    }
    @Override
    public void exitL(AbcParser.LContext ctx){}
    @Override
    public void enterM(AbcParser.MContext ctx){
        meterA = Integer.valueOf(ctx.NUMBER().get(0).getText());
        meterB = Integer.valueOf(ctx.NUMBER().get(1).getText());
    }
    @Override
    public void exitM(AbcParser.MContext ctx){}
    @Override
    public void enterQ(AbcParser.QContext ctx){
        qA = Integer.valueOf(ctx.NUMBER().get(0).getText());
        qB = Integer.valueOf(ctx.NUMBER().get(1).getText());
        qSpeed = Integer.valueOf(ctx.NUMBER().get(2).getText());
    }
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
    public void enterBody(AbcParser.BodyContext ctx){}
    @Override
    public void exitBody(AbcParser.BodyContext ctx){}
    @Override
    public void enterVoice(AbcParser.VoiceContext ctx){}
    @Override
    public void exitVoice(AbcParser.VoiceContext ctx){
        int sectionsNum = ctx.section().size();
        List<AbcMusic> sections = new ArrayList<>();
        
        for(int i = 1; i< sectionsNum; i++){
            sections.add(popStack());
        }
        Collections.reverse(sections);
        
        pushStack(new AbcMusicVoice(sections, "voice name"));
    }
    @Override
    public void enterSection(AbcParser.SectionContext ctx){
        elementsNum = 0;
        end1 = end2 = -1;
        repeatEnds.clear();
        repeatStarts.clear();
    }
    @Override
    public void exitSection(AbcParser.SectionContext ctx){
        List<AbcMusic> notes = new ArrayList<>();
        
        for(int i = 1; i < elementsNum; i++){
            notes.add(popStack());
        }
        Collections.reverse(notes);
        
        pushStack(new AbcMusicSection(notes, new ArrayList<>(repeatEnds),
                                       new ArrayList<>(repeatStarts), end1, end2));
    }
    @Override
    public void enterSegment(AbcParser.SegmentContext ctx){
        accidental.clear();
        segmentTicks = 0;
        if(ctx.BAR() != null){
            String bar = ctx.BAR().getText();
            if(bar.indexOf("|:") != -1){
                repeatStarts.add(elementsNum);
            }
            else if(bar.indexOf(":|") != -1){
                repeatEnds.add(elementsNum-1);
            }
            if(bar.indexOf("[1") != -1){
                end1 = elementsNum;
            }
            else if(bar.indexOf("[2") != -1){
                end2 = elementsNum;
            }
        }
    }
    @Override
    public void exitSegment(AbcParser.SegmentContext ctx){
        if(segmentTicks < tickPerBar){
            pushStack(new AbcMusicRest(tickPerBar-segmentTicks));
        }
        else if(segmentTicks > tickPerBar){
            System.out.println("fuck you too long segment");
        }
    }
    @Override
    public void enterElement(AbcParser.ElementContext ctx){}
    @Override
    public void exitElement(AbcParser.ElementContext ctx){}
    
    @Override
    public void enterRest(AbcParser.RestContext ctx){}
    @Override
    public void exitRest(AbcParser.RestContext ctx){
        pushStack(new AbcMusicRest(ctx.length() != null ? noteLength : tickPerNote));
    }
    @Override
    public void enterNote(AbcParser.NoteContext ctx){}
    @Override
    public void exitNote(AbcParser.NoteContext ctx){
        char note = ctx.NOTECHAR().getText().charAt(0);
        int octave = (note >= 'a' && note <= 'g') ? 1 : 0;
        String noteString = ctx.NOTECHAR().getText();
        
        if(ctx.OCTAVE() != null){
            octave += ctx.OCTAVE().getText().length()
                      *(ctx.OCTAVE().getText().charAt(0) == '\'' ? 1 : -1);
            noteString += ctx.OCTAVE().getText();
        }
        if(ctx.ACCIDENTAL() != null){
            accidental.put(noteString, getAccidentalValue(ctx.ACCIDENTAL().getText()));
        }
        
        pushStack(new AbcMusicNote(
            Character.toUpperCase(note),
            accidental.containsKey(noteString) ? accidental.get(noteString) : 0,
            octave,
            ctx.length() != null ? noteLength : tickPerNote
        ));
    }
    @Override
    public void enterChord(AbcParser.ChordContext ctx){}
    @Override
    public void exitChord(AbcParser.ChordContext ctx){
        int notesNum = ctx.note().size();
        List<AbcMusic> notes = new ArrayList<>();
        
        for(int i = 0; i < notesNum; i++){
            notes.add(popStack());
        }
        
        Collections.reverse(notes);
        pushStack(new AbcMusicChord(notes));
    }
    @Override
    public void enterTuplet(AbcParser.TupletContext ctx){}
    @Override
    public void exitTuplet(AbcParser.TupletContext ctx){
        int notesNum = Integer.valueOf(ctx.TUPLETLENGTH().getText());
        List<AbcMusic> notes = new ArrayList<>();//tuplet may contains chords
        
        for(int i = 0; i < notesNum; i++){
            notes.add(popStack());
        }
        Collections.reverse(notes);
        int timeOfNotesNum = 0;
        if(TUPLETS_LENGTH.containsKey(notesNum)){
            timeOfNotesNum = TUPLETS_LENGTH.get(notesNum);
        }
        else{
            System.out.println("fuck you tuplet type not supported");
        }
        
        pushStack(new AbcMusicTuplet(notes, timeOfNotesNum));
    }
    @Override
    public void enterLength(AbcParser.LengthContext ctx){}
    @Override
    public void exitLength(AbcParser.LengthContext ctx){
        int a = 1, b = 1;
        String len = ctx.getText();
        int div = len.indexOf("/");
        if(div != -1){
            if(div != len.length()){
                b = Integer.valueOf(len.substring(div+1, len.length()));
            }
            if(div != 0){
                a = Integer.valueOf(len.substring(0, div));
            }
        }
        else{
            a = Integer.valueOf(len);
        }
        noteLength = a*tickPerNote/b;
    }
    
    @Override
    public void visitTerminal(TerminalNode terminal){}
    @Override
    public void visitErrorNode(ErrorNode node){}
    @Override
    public void enterEveryRule(ParserRuleContext ctx){}
    @Override
    public void exitEveryRule(ParserRuleContext ctx){}
}

