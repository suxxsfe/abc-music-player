package abc;
import java.util.List;
import java.util.ArrayList;

public class AbcMusicTuplet implements AbcMusic{
    private List<AbcMusic> notes = new ArrayList<>();
    private int timeOfNotesNum;
    
	public AbcMusicTuplet(List<AbcMusic> notes, int timeOfNotesNum){
        this.notes = notes;
        this.timeOfNotesNum = timeOfNotesNum;
	}
    
    @Override
    public int getLength(){
        return notes.get(0).getLength()*timeOfNotesNum;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        int tickPerNote = getLength()/this.notes.size();
        
        for(int i = 0; i < this.notes.size(); i++){
            this.notes.get(i).addNotes(notes, octave, accidental, start, length, startTick);
            length.set(length.size()-1, tickPerNote);
            startTick += tickPerNote;
        }
        
        return startTick;
    }
}

