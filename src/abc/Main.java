package abc;

import abc.sound.SequenceAdder;
import abc.sound.SequencePlayer;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.InvalidMidiDataException;

import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String argv[]){
        String mario = "X:2\n"
                       +"T:Piece No.2\n"
                       +"M:4/4\n"
                       +"L:1/4\n"
                       +"Q:1/4=200\n"
                       +"K:C\n"
                       +"[^F/2e/2] [=F/2e/2] z/2 [F/2e/2] z/2 [F/2c/2] [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/2 |]\n";
        String abc = "X:1\n"
            		+"T:Pi124 -No.1\n"
            		+"M:4/4\n"
            		+"L:1/4\n"
            		+"Q:1/4=140\n"
            		+"K:C\n"
            		+"C C C C | E3/4 D/4 E3/4 F/4 G2 |]\n";
        String abcVoice = "X:2\n"
                         +"T:Piece No.2\n"
                         +"M:4/4\n"
                         +"L:1/4\n"
                         +"Q:1/4=200\n"
                         +"K:C\n"
                         +"[^F/2e/2] [=F/2e/2] z/2 [F/2e/2] z/2 [F/2c/2] [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/2 |]\n"
                         +"V:normal\n"
                         +"[^F/2e/2] [=F/2e/2] z/2 [F/2e/2] z/2 [F/2c/2] [Fe] | [GBg] z G z | c3/2 G/2 z E | E/2 A B _B/2 A | (3Geg a f/2 g/2 | z/2 e c/2 d/2 B3/2 |]\n"
                         +"V:upper\n"
                         +"G''4 | G''4 | G''4 | G''4 | G''4 |]\n";

        String abc2 = "C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 |]";
        
        AbcMusicMain sample = AbcMusic.parse(abcVoice);
        
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
        
        try{
            SequencePlayer player = SequenceAdder.add(notes, octave, accidental, start, length,
                                         sample.getBeatsPerMinute(), sample.getTicksPerBeat());
            
            System.out.printf("speed: %d ticks/beat  %d beat/minute\n",
                            sample.getTicksPerBeat(), sample.getBeatsPerMinute());
//            System.out.println(player);
            player.play();
        }
        catch(MidiUnavailableException | InvalidMidiDataException e){
            e.printStackTrace();
        }
	}
}

