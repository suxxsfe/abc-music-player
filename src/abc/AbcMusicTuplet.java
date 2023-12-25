package abc;
import java.util.List;
import java.util.ArrayList;

public class AbcMusicTuplet implements AbcMusic{
    private List<AbcMusic> notes = new ArrayList<>();
    private int tick;
    
	public AbcMusicTuplet(List<AbcMusic> notes){
        this.notes = notes;
	}
    
    public int getLength(){
        return tick;
    }
}

