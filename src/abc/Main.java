package abc;

import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String argv[]){
        String abc = "X:1\n"
            		+"T:Pi124 -No.1\n"
            		+"M:4/4\n"
            		+"L:1/4\n"
            		+"Q:1/4=140\n"
            		+"K:C\n"
            		+"C C C C | E3/4 D/4 E3/4 F/4 G2 |]\n";
        String abc2 = "C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 |]";
        
        AbcMusic sample = AbcMusic.parse(abc);
        
        List<Character> notes = new ArrayList<>();
        List<Integer> octave = new ArrayList<>();
        List<Integer> accidental = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        List<Integer> length = new ArrayList<>();
        
        sample.addNotes(notes, octave, accidental, start, length, 0);
        
        for(int i = 0; i < notes.size(); i++){
            System.out.printf("%c trans: %d %d  %d %d\n",
                    notes.get(i), octave.get(i), accidental.get(i), start.get(i), length.get(i));
        }
	}
}

