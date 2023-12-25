package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicVoice implements AbcMusic{
    private String name;
    private List<AbcMusicSection> sections = new ArrayList<>();
    
	public AbcMusicVoice(List<AbcMusicSection> sections, String name){
        this.sections = sections;
        this.name = name;
	}
    
    public int getLength(){
        return 0;
    }
}
