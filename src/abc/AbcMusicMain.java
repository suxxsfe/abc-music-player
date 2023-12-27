package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicMain implements AbcMusic{
    private final String title, index, composer;
    private final int tickPerNote, tickPerBar, tickPerMinute;
    private List<AbcMusicVoice> voices;
    
	public AbcMusicMain(List<AbcMusicVoice> voices, String title, String index, String composer,
                        int tickPerNote, int tickPerBar, int tickPerMinute){
        this.voices = voices;
        this.title = title;
        this.index = index;
        this.composer = composer;
        
        this.tickPerNote = tickPerNote;
        this.tickPerBar = tickPerBar;
        this.tickPerMinute = tickPerMinute;
	}
    
    @Override
    public int getLength(){
//        int ticks = 0;
//        
//        for(int i = 0; i < voices.size(); i++){
//            ticks = Math.max(ticks, voices.get(i).getLength());
//        }
//        
        return 0;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        int ticks = 0;
        
        for(AbcMusicVoice i: voices){
            if(i.getName() != MAIN_VOICE_NAME){
                ticks = Math.max(i.addNotes(notes, octave, accidental,
                                            start, length, startTick), startTick);
            }
            else{
                startTick = i.addNotes(notes, octave, accidental, start, length, startTick);
            }
        }
        
        return startTick+ticks;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    public int getTicksPerBeat(){
        return tickPerNote;
    }
    
    public int getBeatsPerMinute(){
        return tickPerMinute/tickPerNote;
    }
    
}
