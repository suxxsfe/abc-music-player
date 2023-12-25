package abc;

public class AbcMusicRest implements AbcMusic{
    private int tick;
    
    public AbcMusicRest(int tick){
        this.tick = tick;
    }
    
    public int getLength(){
        return tick;
    }
}

