package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicRest implements AbcMusic{
    private int tick;
    
    public AbcMusicRest(int tick){
        this.tick = tick;
    }
    
    @Override
    public int getLength(){
        return tick;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        return startTick+getLength();
    }
    
    @Override
    public String toString(){
        return "rest length("+tick+")";
    }
}

