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
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        for(int i = 0; i < sections.size(); i++){
            startTick = sections.get(i).addNotes(notes, octave, accidental,
                                                  start, length, startTick);
        }
        return startTick;
    }
    
    public AbcMusicVoice merge(AbcMusicVoice that){
        List<AbcMusic> newSections = new ArrayList<>(sections);
        
        newSections.addAll(that.sections);
        
        return new AbcMusicVoice(newSections, name);
    }
    
    public String getName(){
        return name;
    }
}
