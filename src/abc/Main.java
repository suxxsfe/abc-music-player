package abc;

import abc.sound.SequenceAdder;
import abc.sound.SequencePlayer;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.InvalidMidiDataException;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.io.IOException;

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
                    +"V:abc\n"
            		+"C C C C | E3/4 D/4 E3/4 F/4 G2 |]\n";
        String abcVoice = "X:0\n"
                         +"T: Prelude No. 1\n"
                         +"C: J. S. Bach\n"
                         +"M:4/4\n"
                         +"L:1/16\n"
                         +"Q:1/4=100\n"
                         +"K:C\n"
                         +"V: upper\n"
                         +"z2 (2Gc (4eGce z2 (2Gc (4eGce | z2 (2Ad (4fAdf z2 (2Ad (4fAdf |\n"
                         +"V: middle\n"
                         +"z E7 z E7 | z D7 z D7 |\n"
                         +"V: lower\n"
                         +"C8 C8 | C8 C8 |\n"
                         +"V: upper\n"
                         +"z2 (2Gd (4fGdf z2 (2Gd (4fGdf | z2 (2Ae (4aAea z2 (2Ae (4aAea |]\n"
                         +"V: middle\n"
                         +"z D7 z D7 | z E7 z E7 |]\n"
                         +"V: lower\n"
                         +"B,8 B,8 | C8 C8 |]\n";
        String abcK = "X:1\n"
                     +"T:Speed the Plough\n"
                     +"M:4/4\n"
                     +"C:Trad.\n"
                     +"K:G\n"
                     +"|: G A B c | d e d B | c2 e c | c2 A2 |\n"
                     +"  G A B c | d e d B | c2 e c | A2 F2 :|\n"
                     +"|: g2 g f | g2 f2 | c2 e c | c2 A2 |\n"
                     +"  g2 g f | g2 f2 | c2 e c | A2 F2 :|\n";

        String abc2 = "C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 |]";
        
        File file = null;
        Queue<String> arguments = new LinkedList<String>(Arrays.asList(argv));
        try{
            while(!arguments.isEmpty()){
                String flag = arguments.remove();
                
                if(flag.equals("--file")){
                    file = new File(arguments.remove());
                    if(!file.isFile()){
                        throw new IllegalArgumentException("no such file: "+file);
                    }
                }
                else{
                    throw new IllegalArgumentException("unknown option: "+flag);
                }
            }
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            return;
        }
        if(file == null){
            System.err.println("expected an input file");
            return;
        }
        
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            StringBuilder builder = new StringBuilder();
            while(line != null){
                builder.append(line);
                builder.append("\n");
                line = reader.readLine();
            }
            String input = builder.toString();
            System.out.printf("your abc music: \n%s", input);
        
            AbcMusicMain sample = AbcMusic.parse(input);
            
            List<Character> notes = new ArrayList<>();
            List<Integer> octave = new ArrayList<>();
            List<Integer> accidental = new ArrayList<>();
            List<Integer> start = new ArrayList<>();
            List<Integer> length = new ArrayList<>();
            
            sample.addNotes(notes, octave, accidental, start, length, 0);
            
//            for(int i = 0; i < notes.size(); i++){
//                System.out.printf("%c trans: %d %d  %d %d\n",
//                        notes.get(i), octave.get(i), accidental.get(i), start.get(i), length.get(i));
//            }
//        
            SequencePlayer player = SequenceAdder.add(notes, octave, accidental, start, length,
                                         sample.getBeatsPerMinute(), sample.getTicksPerBeat());
            
            System.out.printf("speed: %d ticks/beat  %d beat/minute\n",
                            sample.getTicksPerBeat(), sample.getBeatsPerMinute());
            System.out.println(sample.getInfo());
//            System.out.println(player);
            player.play();
        }
        catch(MidiUnavailableException | InvalidMidiDataException | IOException e){
            e.printStackTrace();
        }
	}
}

