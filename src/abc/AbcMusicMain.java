package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicMain implements AbcMusic{
    private final String title, index;
    private List<AbcMusic> voices;
    
	public AbcMusicMain(List<AbcMusic> voices, String title, String index){
        this.voices = voices;
        this.title = title;
        this.index = index;
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
}
