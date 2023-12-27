package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicNote implements AbcMusic{
    private char note;
    private int octave, accidental, tick;
    
	public AbcMusicNote(char note, int octave, int accidental, int tick){
        this.note = note;
        this.octave = octave;
        this.accidental = accidental;
        this.tick = tick;
	}
    
    @Override
    public int getLength(){
        return tick;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        notes.add(note);
        octave.add(this.octave);
        accidental.add(this.accidental);
        start.add(startTick);
        length.add(tick);
        
        return startTick+getLength();
    }
    
    @Override
    public String toString(){
        return ""+note+" trans("+octave+","+accidental+") length("+tick+")";
    }
}

