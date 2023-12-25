package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicMain implements AbcMusic{
    private final String title, index;
    private List<AbcMusic> voices;
    
	public AbcMusicMain(List<AbcMusic> voices, String title, String index){
        this.voices = voices;
        this.title = title;
        this.index = index;
	}
    
    @Override
    public int getLength(){
        return 0;
    }
}
