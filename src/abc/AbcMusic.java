package abc;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public static final String MAIN_VOICE_NAME = "";
    
    public static AbcMusicMain parse(String input){
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
    
    public String toString();
    
}

class VoiceStatus{
    private final String name;
    
    private int elementsNum;
    private int end1, end2;
    private List<Integer> repeatEnds = new ArrayList<>();
    private List<Integer> repeatStarts = new ArrayList<>();
    private Stack<AbcMusic> stack = new Stack<>();
    
    public VoiceStatus(String name){
        this.name = name;
        end1 = end2 = -1;
    }
    
    public String getName(){
        return name;
    }
    
    public void pushStack(AbcMusic element){
        stack.push(element);
        elementsNum++;
    }
    
    public AbcMusic popStack(){
        AbcMusic element = stack.pop();
        elementsNum--;
        return element;
    }
    
    public int getElementsNumInSection(){
        return elementsNum;
    }
    
    public void clearSectionInfo(){
        elementsNum = 0;
        end1 = end2 = -1;
        repeatStarts.clear();
        repeatEnds.clear();
    }
    
    public void setEnd1(int end1){
        this.end1 = end1;
    }
    
    public void setEnd2(int end2){
        this.end2 = end2;
    }
    
    public void addStart(int start){
        repeatStarts.add(start);
    }
    
    public void addEnd(int end){
        repeatEnds.add(end);
    }
    
    public AbcMusicVoice getMusic(){
        List<AbcMusic> sections = new ArrayList<>();
        
        if(!(stack.peek() instanceof AbcMusicSection)){
            makeSection();
        }
        while(!stack.empty()){
            sections.add(stack.pop());
        }
        Collections.reverse(sections);
        
        return new AbcMusicVoice(sections, name);
    }
    
    public void makeSection(){
        List<AbcMusic> notes = new ArrayList<>();
        
        int num  = elementsNum;
        for(int i = 0; i < num; i++){
            notes.add(popStack());
        }
        Collections.reverse(notes);
        
        pushStack(new AbcMusicSection(notes, new ArrayList<>(repeatEnds),
                                       new ArrayList<>(repeatStarts), end1, end2));
        
    }
}

class AbcBuilder implements AbcListener{
    
    private static final int FACTOR = 128*3*2;
    private static final Map<Integer, Integer> TUPLETS_LENGTH = new HashMap<Integer, Integer>(){{
        put(2, 3);
        put(3, 2);
        put(4, 3);
    }};
    private static final Map<String, List<Integer> > KEY_SIGNATURE_TRANS = new HashMap<String, List<Integer> >(){{
        put("C",  Arrays.asList(0,  0,   0, 0,  0,  0,  0));
        put("G",  Arrays.asList(0,  0,   0, 0,  0,  1,  0));
        put("D",  Arrays.asList(0,  0,   1, 0,  0,  1,  0));
        put("A",  Arrays.asList(0,  0,   1, 0,  0,  1,  1));
        put("E",  Arrays.asList(0,  0,   1, 1,  0,  1,  1));
        put("B",  Arrays.asList(1,  0,   1, 1,  0,  1,  1));
        put("F#", Arrays.asList(1,  0,   1, 1,  1,  1,  1));
        put("F",  Arrays.asList(0,  -1,  0, 0,  0,  0,  0));
        put("Bb", Arrays.asList(0,  -1,  0, 0,  -1, 0,  0));
        put("Eb", Arrays.asList(-1, -1,  0, 0,  -1, 0,  0));
        put("Ab", Arrays.asList(-1, -1,  0, -1, -1, 0,  0));
        put("Db", Arrays.asList(-1, -1,  0, -1, -1, 0,  -1));
        put("Gb", Arrays.asList(-1, -1, -1, -1, -1, 0,  -1));
        put("Cb", Arrays.asList(-1, -1, -1, -1, -1, -1, -1));
    }};
    
    private int tickPerNote, tickPerMinute, tickPerBar;
    private String title, composer, index;
    private int meterA, meterB, lA, lB, qA, qB, qSpeed;// rational: A/B
    
    private int noteLength;
    private String lastString;
    private int segmentTicks;
    private Map<String, Integer> accidental = new HashMap<>();
    
    private Map<String, VoiceStatus> voicesStatus = new HashMap<>();
    private VoiceStatus status = null;
    private String currentVoice;
    private List<Integer> keySignatureTrans = null;
    private String currentKey;
    
    private AbcMusicMain parseResult;
    
    private static int getAccidentalValue(String acci){
        if(acci.charAt(0) == '^'){
            return acci.length();
        }
        if(acci.charAt(0) == '_'){
            return -acci.length();
        }
        return 0;
    }
    
    private static boolean isNoteChar(char c){
        return c >= 'A' && c <= 'G';
    }
    
    private int getAccidental(String note, char noteChar, TerminalNode acci){
        if(acci != null){
            accidental.put(note, getAccidentalValue(acci.getText()));
        }
        
        if(accidental.containsKey(note)){
            return accidental.get(note);
        }
        if(!isNoteChar(noteChar)){
            return 0;
        }
        return keySignatureTrans.get((int)(noteChar-'A'));
    }
    
    private boolean isSectionBar(String bar){
        return bar.indexOf("||") != -1 || bar.indexOf("|[") != -1 || bar.indexOf("|]") != -1;
    }
    
    private boolean isEnd1Bar(String bar){
        return bar.indexOf("[1") != -1;
    }
    
    private boolean isEnd2Bar(String bar){
        return bar.indexOf("[2") != -1;
    }
    
    private boolean isRepeatStartBar(String bar){
        return bar.indexOf("|:") != -1;
    }
    
    private boolean isRepeatEndBar(String bar){
        return bar.indexOf(":|") != -1;
    }
    
    private void checkRepeat(String bar, int currentNum){
        if(isRepeatStartBar(bar)){
            status.addStart(currentNum);
        }
        else if(isRepeatEndBar(bar)){
            status.addEnd(currentNum-1);
        }
        if(isEnd1Bar(bar)){
            status.setEnd1(currentNum);
        }
        else if(isEnd2Bar(bar)){
            status.setEnd2(currentNum);
        }
    }
    
    public AbcMusicMain getAbcMusic(){
        return parseResult;
    }
    
    private void clearSegmentInfo(){
        accidental.clear();
        segmentTicks = 0;
    }
    
    private String getVoiceName(AbcParser.VContext ctx){
        return ctx != null ? ctx.getText().substring(2, ctx.getText().length()-1)
                           : AbcMusic.MAIN_VOICE_NAME;
    }
    
    private void pushStack(AbcMusic element){
        segmentTicks += element.getLength();
        status.pushStack(element);
    }
    
    private AbcMusic popStack(){
        AbcMusic res = status.popStack();
        segmentTicks -= res.getLength();
        return res;
    }
    
    
    @Override public void exitRoot(AbcParser.RootContext ctx){
        List<AbcMusicVoice> voices = new ArrayList<>();
        
        if(voicesStatus.containsKey(AbcMusic.MAIN_VOICE_NAME)){
            voices.add(voicesStatus.get(AbcMusic.MAIN_VOICE_NAME).getMusic());
        }
        for(VoiceStatus vv: voicesStatus.values()){
            if(vv.getName() != AbcMusic.MAIN_VOICE_NAME){
                voices.add(vv.getMusic());
            }
        }
        
        System.out.printf("%s\n", voices.get(0).toString());
        
        parseResult = new AbcMusicMain(voices, title, index, composer,
                                tickPerNote, tickPerBar, tickPerMinute);
    }
    @Override public void enterVoice(AbcParser.VoiceContext ctx){
        currentVoice = getVoiceName(ctx.v());
        
        if(!voicesStatus.containsKey(currentVoice)){
            voicesStatus.put(currentVoice, new VoiceStatus(currentVoice));
        }
        status = voicesStatus.get(currentVoice);
    }
    @Override public void enterSegment(AbcParser.SegmentContext ctx){
        clearSegmentInfo();
        if(ctx.BAR().size() > 1){
            String bar = ctx.BAR().get(0).getText();
            int currentNum = status.getElementsNumInSection();
            checkRepeat(bar, currentNum);
        }
    }
    @Override public void exitSegment(AbcParser.SegmentContext ctx){
        if(segmentTicks < tickPerBar){
            pushStack(new AbcMusicRest(tickPerBar-segmentTicks));
        }
        else if(segmentTicks > tickPerBar){
            System.out.println("fuck you too long segment");
            System.out.println(ctx.getText());
        }
  
        String bar = ctx.BAR().get(ctx.BAR().size()-1).getText();
        int currentNum = status.getElementsNumInSection();
        if(isSectionBar(bar)){
            status.makeSection();
            status.clearSectionInfo();
        }
        checkRepeat(bar, currentNum);
    }
    
    
    @Override public void exitRest(AbcParser.RestContext ctx){
        pushStack(new AbcMusicRest(ctx.length() != null ? noteLength : tickPerNote));
    }
    @Override public void exitNote(AbcParser.NoteContext ctx){
        char note = ctx.NOTECHAR().getText().charAt(0);
        int octave = (note >= 'a' && note <= 'g') ? 1 : 0;
        String noteString = ctx.NOTECHAR().getText();
        
        if(ctx.OCTAVE() != null){
            octave += ctx.OCTAVE().getText().length()
                      *(ctx.OCTAVE().getText().charAt(0) == '\'' ? 1 : -1);
            noteString += ctx.OCTAVE().getText();
        }
        
        pushStack(new AbcMusicNote(
            Character.toUpperCase(note),
            octave,
            getAccidental(noteString, note, ctx.ACCIDENTAL()),
            ctx.length() != null ? noteLength : tickPerNote
        ));
        
    }
    @Override public void exitChord(AbcParser.ChordContext ctx){
        int notesNum = ctx.note().size();
        List<AbcMusic> notes = new ArrayList<>();
        
        for(int i = 0; i < notesNum; i++){
            notes.add(popStack());
        }
        
        Collections.reverse(notes);
        pushStack(new AbcMusicChord(notes));
    }
    @Override public void exitTuplet(AbcParser.TupletContext ctx){
        int notesNum = Integer.valueOf(ctx.TUPLETSIGN().getText()
                                        .substring(1, ctx.TUPLETSIGN().getText().length()));
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
    @Override public void exitLength(AbcParser.LengthContext ctx){
        int a = 1, b = 1;
        String len = ctx.getText();
        int div = len.indexOf("/");
        if(div != -1){
            if(div+1 < len.length()){
                b = Integer.valueOf(len.substring(div+1, len.length()));
            }
            if(div > 0){
                a = Integer.valueOf(len.substring(0, div));
            }
        }
        else{
            a = Integer.valueOf(len);
        }
        noteLength = a*tickPerNote/b;
    }
    @Override public void exitString(AbcParser.StringContext ctx){
        lastString = ctx.getText();
    }
    
    
    @Override public void enterHead(AbcParser.HeadContext ctx){
        composer = "Unknown";
    }
    @Override public void exitHead(AbcParser.HeadContext ctx){
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
  
        tickPerNote   = meterB*lA*qB*FACTOR;
        tickPerMinute = meterB*lB*qA*FACTOR*qSpeed;
        tickPerBar    = meterA*lB*qB*FACTOR;
    }
    @Override public void exitK(AbcParser.KContext ctx){
        currentKey = lastString;
        
        if(KEY_SIGNATURE_TRANS.containsKey(currentKey)){
            keySignatureTrans = KEY_SIGNATURE_TRANS.get(currentKey);
        }
        else{
            System.out.printf("unknow key signature %s\n", currentKey);
            keySignatureTrans = Arrays.asList(0, 0, 0, 0, 0, 0, 0);
        }
    }
    @Override public void exitX(AbcParser.XContext ctx){
        index = ctx.number().getText();
    }
    @Override public void exitT(AbcParser.TContext ctx){
        title = lastString;
    }
    @Override public void exitC(AbcParser.CContext ctx){
        composer = lastString;
    }
    @Override public void enterL(AbcParser.LContext ctx){
        lA = Integer.valueOf(ctx.number().get(0).getText());
        lB = Integer.valueOf(ctx.number().get(1).getText());
    }
    @Override public void enterM(AbcParser.MContext ctx){
        meterA = Integer.valueOf(ctx.number().get(0).getText());
        meterB = Integer.valueOf(ctx.number().get(1).getText());
    }
    @Override public void enterQ(AbcParser.QContext ctx){
        qA = Integer.valueOf(ctx.number().get(0).getText());
        qB = Integer.valueOf(ctx.number().get(1).getText());
        qSpeed = Integer.valueOf(ctx.number().get(2).getText());
    }
    
    @Override public void enterRoot(AbcParser.RootContext ctx){}
    @Override public void exitQ(AbcParser.QContext ctx){}
    @Override public void enterV(AbcParser.VContext ctx){}
    @Override public void exitV(AbcParser.VContext ctx){}
    @Override public void enterK(AbcParser.KContext ctx){}
    @Override public void exitVoice(AbcParser.VoiceContext ctx){}
    @Override public void enterLength(AbcParser.LengthContext ctx){}
    @Override public void enterTuplet(AbcParser.TupletContext ctx){}
    @Override public void enterString(AbcParser.StringContext ctx){}
    @Override public void enterChord(AbcParser.ChordContext ctx){}
    @Override public void enterElement(AbcParser.ElementContext ctx){}
    @Override public void exitElement(AbcParser.ElementContext ctx){}
    @Override public void enterRest(AbcParser.RestContext ctx){}
    @Override public void enterNote(AbcParser.NoteContext ctx){}
    @Override public void enterNumber(AbcParser.NumberContext ctx){}
    @Override public void exitNumber(AbcParser.NumberContext ctx){}
    @Override public void enterX(AbcParser.XContext ctx){}
    @Override public void enterT(AbcParser.TContext ctx){}
    @Override public void enterC(AbcParser.CContext ctx){}
    @Override public void exitL(AbcParser.LContext ctx){}
    @Override public void exitM(AbcParser.MContext ctx){}
    
    @Override public void enterBody(AbcParser.BodyContext ctx){}
    @Override public void exitBody(AbcParser.BodyContext ctx){}
    @Override public void visitTerminal(TerminalNode terminal){}
    @Override public void visitErrorNode(ErrorNode node){}
    @Override public void enterEveryRule(ParserRuleContext ctx){}
    @Override public void exitEveryRule(ParserRuleContext ctx){}
}

