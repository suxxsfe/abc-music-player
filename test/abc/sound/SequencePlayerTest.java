package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.InvalidMidiDataException;

public class SequencePlayerTest {

    @Test
    public void testPiece1(){
        try{
            SequencePlayer player = new SequencePlayer(140, 12);
            int tick = 0;
            
            player.addNote(new Pitch('C').toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('C').toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('C').toMidiNote(), tick, 9);
            tick+=9;
            player.addNote(new Pitch('D').toMidiNote(), tick, 3);
            tick+=3;
            player.addNote(new Pitch('E').toMidiNote(), tick, 12);
            tick+=12;
            
            player.addNote(new Pitch('E').toMidiNote(), tick, 9);
            tick+=9;
            player.addNote(new Pitch('D').toMidiNote(), tick, 3);
            tick+=3;
            player.addNote(new Pitch('E').toMidiNote(), tick, 9);
            tick+=9;
            player.addNote(new Pitch('F').toMidiNote(), tick, 3);
            tick+=3;
            player.addNote(new Pitch('G').toMidiNote(), tick, 24);
            tick+=24;
            
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('G').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('G').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('G').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('E').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('E').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('E').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('C').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('C').toMidiNote(), tick, 4);
            tick+=4;
            player.addNote(new Pitch('C').toMidiNote(), tick, 4);
            tick+=4;
            
            player.addNote(new Pitch('G').toMidiNote(), tick, 9);
            tick+=9;
            player.addNote(new Pitch('F').toMidiNote(), tick, 3);
            tick+=3;
            player.addNote(new Pitch('E').toMidiNote(), tick, 9);
            tick+=9;
            player.addNote(new Pitch('D').toMidiNote(), tick, 3);
            tick+=3;
            player.addNote(new Pitch('C').toMidiNote(), tick, 24);
            tick+=24;
            
            System.out.println(player);
            
            //player.play();
        }
        catch(MidiUnavailableException | InvalidMidiDataException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testPiece2(){
        try{
            SequencePlayer player = new SequencePlayer(200, 12);
            int tick = 0;
            
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), tick, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('F').toMidiNote(), tick, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            tick+=6;
            player.addNote(new Pitch('F').toMidiNote(), tick, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            tick+=6;
            player.addNote(new Pitch('F').toMidiNote(), tick, 6);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('F').toMidiNote(), tick, 12);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 12);
            tick+=12;
            
            player.addNote(new Pitch('G').toMidiNote(), tick, 12);
            player.addNote(new Pitch('B').toMidiNote(), tick, 12);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), tick, 12);
            tick+=12;
            tick+=12;
            player.addNote(new Pitch('G').toMidiNote(), tick, 12);
            tick+=12;
            tick+=12;
            
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 18);
            tick+=18;
            player.addNote(new Pitch('G').toMidiNote(), tick, 6);
            tick+=6;
            tick+=12;
            player.addNote(new Pitch('E').toMidiNote(), tick, 12);
            tick+=12;
            
            player.addNote(new Pitch('E').toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('A').toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('B').toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('A').toMidiNote(), tick, 12);
            tick+=12;
            
            
            player.addNote(new Pitch('G').toMidiNote(), tick, 8);
            tick+=8;
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 8);
            tick+=8;
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), tick, 8);
            tick+=8;
            player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            
            tick+=6;
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), tick, 12);
            tick+=12;
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), tick, 6);
            tick+=6;
            player.addNote(new Pitch('B').toMidiNote(), tick, 9);
            tick+=9;
            tick+=9;
            
            System.out.println(player);
            
//            player.play();
        }
        catch(MidiUnavailableException | InvalidMidiDataException e){
            e.printStackTrace();
        }
    }

}
