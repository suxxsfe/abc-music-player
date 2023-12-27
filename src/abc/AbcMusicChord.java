package abc;
import java.util.List;
import java.util.ArrayList;

public class AbcMusicChord implements AbcMusic{
    private List<AbcMusic> notes = new ArrayList<>();
    
	public AbcMusicChord(List<AbcMusic> notes){
        this.notes = notes;
	}
    
    @Override
    public int getLength(){
        return notes.get(0).getLength();
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        for(int i = 0; i < this.notes.size(); i++){
            this.notes.get(i).addNotes(notes, octave, accidental, start, length, startTick);
        }
        
        return startTick+getLength();
    }
    
    @Override
    public String toString(){
        String res = "chord("+notes.size()+"): [ ";
        
        for(AbcMusic note: notes){
            res += note.toString()+" ";
        }
        
        return res+" ]";
    }
}

