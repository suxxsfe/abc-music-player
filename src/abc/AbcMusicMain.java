package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicMain implements AbcMusic{
    private final String title, index, composer;
    private final int tickPerNote, tickPerBar, tickPerMinute;
    private List<AbcMusic> voices;
    
	public AbcMusicMain(List<AbcMusic> voices, String title, String index, String composer,
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
        int ticks = 0;
        
        for(int i = 0; i < voices.size(); i++){
            ticks = Math.max(ticks, voices.get(i).getLength());
        }
        
        return 0;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        int ticks = 0;
        
        for(int i = 0; i < voices.size(); i++){
            ticks = Math.max(voices.get(i).addNotes(notes, octave, accidental,
                                                    start, length, startTick), ticks);
        }
        
        return startTick+ticks;
    }
    
    public int getTicksPerBeat(){
        return tickPerNote;
    }
    
    public int getBeatsPerMinute(){
        System.out.printf("%d %d\n",tickPerMinute, tickPerNote);
        return tickPerMinute/tickPerNote;
    }
    
}
