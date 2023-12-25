package abc;

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
}

