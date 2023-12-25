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
        return notes.get(0).getLength()*notes.size()/timeOfNotesNum;
    }
}

