package abc;

public class AbcMusicNote implements AbcMusic{
    private int pitch, tick;
    
	public AbcMusicNote(int pitch, int tick){
        this.pitch = pitch;
        this.tick = tick;
	}
    
    public int getLength(){
        return tick;
    }
}

