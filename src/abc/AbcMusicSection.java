package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicSection implements AbcMusic{
    private List<AbcMusic> notes = new ArrayList<>();
    private List<Integer> repeatEnds = new ArrayList<>();
    private List<Integer> repeatStarts = new ArrayList<>();
    private int end1, end2;
    
	public AbcMusicSection(List<AbcMusic> notes, List<Integer> ends, List<Integer> starts, int end1, int end2){
        this.notes = notes;
        this.repeatEnds = ends;
        this.repeatStarts = starts;
        this.end1 = end1;
        this.end2 = end2;
	}
    
    public int getLength(){
        return 0;
    }
}
