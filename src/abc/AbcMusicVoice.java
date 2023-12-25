package abc;

import java.util.List;
import java.util.ArrayList;

public class AbcMusicVoice implements AbcMusic{
    private String name;
    private List<AbcMusic> sections = new ArrayList<>();
    
	public AbcMusicVoice(List<AbcMusic> sections, String name){
        this.sections = sections;
        this.name = name;
	}
    
    @Override
    public int getLength(){
        return 0;
    }
}
