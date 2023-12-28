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
    
    @Override
    public int getLength(){
        return 0;
    }
    
    private int findStart(int end){
        int start = 0;
        
        for(int i = 0; i < repeatStarts.size(); i++){
            if(repeatStarts.get(i) >= end){
                break;
            }
            start = repeatStarts.get(i);
        }
        
        return start;
    }
    
    private int repeat(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, 
                        int startIndex, int endIndex, int startTick){
        for(int i = startIndex; i <= endIndex; i++){
            if(i == end1){
                i = Math.min(end2-1, endIndex);
                continue;
            }
            startTick = this.notes.get(i).addNotes(notes, octave, accidental,
                                                    start, length, startTick);
        }
        
        return startTick;
    }
    
    @Override
    public int addNotes(List<Character> notes, List<Integer> octave, List<Integer> accidental,
                        List<Integer> start, List<Integer> length, int startTick){
        for(int i = 0; i < this.notes.size(); i++){
            startTick = this.notes.get(i).addNotes(notes, octave, accidental,
                                                   start, length, startTick);
            if(repeatEnds.contains(i)){
                int startIndex = findStart(i);
                startTick = repeat(notes, octave, accidental, start,
                                   length, startIndex, i, startTick);
                i = Math.max(end2-1, i);
            }
        }
        
        return startTick;
    }
    
    @Override
    public String toString(){
        String res = "";
        
        for(AbcMusic note: notes){
            res += note.toString()+" ";
        }
        res += "\n(";
        res += "starts: "+repeatStarts.toString();
        res += " ends: "+repeatEnds.toString();
        res += " end1: "+end1;
        res += " end2: "+end2;
        res += ")\n";
        
        return res;
    }
}
