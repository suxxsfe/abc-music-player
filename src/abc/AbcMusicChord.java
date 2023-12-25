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
}

