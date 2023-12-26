package abc.sound;

import java.util.List;
import java.util.ArrayList;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.InvalidMidiDataException;

public class SequenceAdder{
	public static SequencePlayer add(List<Character> notes, List<Integer> octave,
                    List<Integer> accidental, List<Integer> start, List<Integer> length,
                    int beatsPerMinute, int ticksPerBeat)
            throws MidiUnavailableException, InvalidMidiDataException{
        SequencePlayer player = new SequencePlayer(beatsPerMinute, ticksPerBeat);
        
        for(int i = 0; i < notes.size(); i++){
            player.addNote(new Pitch(notes.get(i))
                               .transpose(Pitch.OCTAVE*octave.get(i)+accidental.get(i))
                               .toMidiNote(), start.get(i), length.get(i));
        }
        
        return player;
	}
}

