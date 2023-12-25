package abc;

public class AbcMusicSection{
    private List<AbcMusic> notes = new ArrayList<>();
    private List<Int> repeatEnds = new ArrayList<>();
    private List<Int> repeatStarts = new ArrayList<>();
    private int end1, end2;
    
	public AbcMusicSection(List<AbcMusic> notes, List<Int> ends, List<Int> starts, int end1 = -1, int end2 = -1){
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
