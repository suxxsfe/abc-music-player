package abc;
import java.util.List;
import java.util.ArrayList;

public class AbcMusicChord implements AbcMusic{
    private List<AbcMusicNote> notes = new ArrayList<>();
    
	public AbcMusicChord(List<AbcMusicNote> notes){
        this.notes = notes;
	}
    
    public int getLength(){
        return notes.get(0).getLength();
    }
}

