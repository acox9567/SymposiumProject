//Alexander Cox
//Friday, February 15, 2019

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.FieldGenOrMethodGen;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.temporal.TemporalEvents;

public class Composition {

    private String key;
    private int tempo;
    private String title;
    private List<Pattern> patterns = new ArrayList<Pattern>();
    private String I, II, III, IV, V, VI, VII;
    private String[] notes = new String[15];

    public Composition(String key, int tempo, String title)
    {
        this.key = key;
        this.tempo = tempo;
        this.title = title;
        setChords();
        setNotes();
    }
    public Composition(int tempo, String title)
    {
        this.key = Generator.genKey();
        this.tempo = tempo;
        this.title = title;
        setChords();
        setNotes();
    }
    public Composition(String key, String title)
    {
        this.key = key;
        this.tempo = Generator.genTempo();
        this.title = title;
        setChords();
        setNotes();
    }
    public Composition(String title)
    {
        this.key = Generator.genKey();
        this.tempo = Generator.genTempo();
        this.title = title;
        setChords();
        setNotes();
    }

    public void addPattern(Pattern pattern)
    {
        patterns.add(pattern);
    }

    public void playBack()
    {
        Player player = new Player();

        for (int i = 0; i < patterns.size(); i++)
        {
            player.play(patterns.get(i));
        }
    }

    public void setChords()
    {
        if (this.key.equals("KCmaj"))
        {
            I = "C3maj7";
            II = "D3min7";
            III = "E3min7";
            IV = "F3maj7";
            V = "G3dom7";
            VI = "A3min7";
            VII = "B3dim";
        }
        if (this.key.equals("KAmin"))
        {
            I = "A3min7";
            II = "B3dim";
            III = "C4maj7";
            IV = "D4min7";
            V = "E4min7";
            VI = "F4maj7";
            VII = "G4dom7";
        }
        if (this.key.equals("KGmaj"))
        {
            I = "G3maj7";
            II = "A3min7";
            III = "B3min7";
            IV = "C4maj7";
            V = "D4dom7";
            VI = "E4min7";
            VII = "F#4dim";
        }
        if (this.key.equals("KEmin"))
        {
            I = "E3min7";
            II = "F#3dim";
            III = "G3maj7";
            IV = "A3min7";
            V = "B3min7";
            VI = "C4maj7";
            VII = "D4dom7";
        }
        if (this.key.equals("KDmaj"))
        {
            I = "D3maj7";
            II = "E3min7";
            III = "F#3min7";
            IV = "G3maj7";
            V = "A3dom7";
            VI = "B3min7";
            VII = "C#4dim";
        }
        if (this.key.equals("KBmin"))
        {
            I = "B3min7";
            II = "C#4dim";
            III = "D4maj7";
            IV = "E4min7";
            V = "F#4min7";
            VI = "G4maj7";
            VII = "A4dom7";
        }
        if (this.key.equals("KAmaj"))
        {
            I = "A3maj7";
            II = "B3min7";
            III = "C#4min7";
            IV = "D4maj7";
            V = "E4dom7";
            VI = "F#4min7";
            VII = "G#4dim";
        }
        if (this.key.equals("KF#min"))
        {
            I = "F#3min7";
            II = "G#3dim";
            III = "A3maj7";
            IV = "B3min7";
            V = "C#4min7";
            VI = "D4maj7";
            VII = "E4dom7";
        }
        if (this.key.equals("KEmaj"))
        {
            I = "E3maj7";
            II = "F#3min7";
            III = "G#3min7";
            IV = "A3maj7";
            V = "B3dom7";
            VI = "C#4min7";
            VII = "D#4dim";
        }
        if (this.key.equals("KC#min"))
        {
            I = "C#3min7";
            II = "D#3dim";
            III = "E3maj7";
            IV = "F#3min7";
            V = "G#3min7";
            VI = "A3maj7";
            VII = "B3dom7";
        }
        if (this.key.equals("KBmaj"))
        {
            I = "B3maj7";
            II = "C#4min7";
            III = "D#4min7";
            IV = "E4maj7";
            V = "F#4dom7";
            VI = "G#4min7";
            VII = "A#4dim";
        }
        if (this.key.equals("KG#min"))
        {
            I = "G#3min7";
            II = "A#3dim";
            III = "B3maj7";
            IV = "C#4min7";
            V = "D#4min7";
            VI = "E4maj7";
            VII = "F#4dom7";
        }
        if (this.key.equals("KF#maj"))
        {
            I = "F#3maj7";
            II = "G#3min7";
            III = "A#3min7";
            IV = "B3maj7";
            V = "C#4dom7";
            VI = "D#4min7";
            VII = "E#4dim";
        }
        if (this.key.equals("KD#min"))
        {
            I = "D#3min7";
            II = "E#3dim";
            III = "F#3maj7";
            IV = "G#3min7";
            V = "A#3min7";
            VI = "B3maj7";
            VII = "C#4dom7";
        }
        if (this.key.equals("KDbmaj"))
        {
            I = "Db3maj7";
            II = "Eb3min7";
            III = "F3min7";
            IV = "Gb3maj7";
            V = "Ab3dom7";
            VI = "Bb3min7";
            VII = "C4dim";
        }
        if (this.key.equals("KBbmin"))
        {
            I = "Bb3min7";
            II = "C4dim";
            III = "Db4maj7";
            IV = "Eb4min7";
            V = "F4min7";
            VI = "Gb4maj7";
            VII = "Ab4dom7";
        }
        if (this.key.equals("KAbmaj"))
        {
            I = "Ab3maj7";
            II = "Bb3min7";
            III = "C4min7";
            IV = "Db4maj7";
            V = "Eb4dom7";
            VI = "F4min7";
            VII = "G4dim";
        }
        if (this.key.equals("KFmin"))
        {
            I = "F3min7";
            II = "G3dim";
            III = "Ab3maj7";
            IV = "Bb3min7";
            V = "C4min7";
            VI = "Db4maj7";
            VII = "Eb4dom7";
        }
        if (this.key.equals("KEbmaj"))
        {
            I = "Eb3maj7";
            II = "F3min7";
            III = "G3min7";
            IV = "Ab3maj7";
            V = "Bb3dom7";
            VI = "C4min7";
            VII = "D4dim";
        }
        if (this.key.equals("KCmin"))
        {
            I = "C3min7";
            II = "D3dim";
            III = "Eb3maj7";
            IV = "F3min7";
            V = "G3min7";
            VI = "Ab3maj7";
            VII = "Bb3dom7";
        }
        if (this.key.equals("KBbmaj"))
        {
            I = "Bb3maj7";
            II = "C4min7";
            III = "D4min7";
            IV = "Eb4maj7";
            V = "F4dom7";
            VI = "G4min7";
            VII = "A4dim";
        }
        if (this.key.equals("KGmin"))
        {
            I = "G3min7";
            II = "A3dim";
            III = "Bb3maj7";
            IV = "C4min7";
            V = "D4min7";
            VI = "Eb4maj7";
            VII = "F4dom7";
        }
        if (this.key.equals("KFmaj"))
        {
            I = "F3maj7";
            II = "G3min7";
            III = "A3min7";
            IV = "B3bmaj7";
            V = "C4dom7";
            VI = "D4min7";
            VII = "E4dim";
        }
        if (this.key.equals("KDmin"))
        {
            I = "D3min7";
            II = "E3dim";
            III = "F3maj7";
            IV = "G3min7";
            V = "A3min7";
            VI = "Bb3maj7";
            VII = "C4dom7";
        }
    }

    public void setNotes() //Range of tenor sax
    {
        if (this.key.equals("KCmaj") || this.key.equals("KAmin"))
        {
            notes[0] = "B4";
            notes[1] = "C5";
            notes[1] = "D5";
            notes[2] = "E5";
            notes[3] = "F5";
            notes[4] = "G5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C6";
            notes[8] = "D6";
            notes[9] = "E6";
            notes[10] = "F6";
            notes[11] = "G6";
            notes[12] = "A6";
            notes[13] = "B6";
            notes[14] = "C7";
        }
        if (this.key.equals("KGmaj") || this.key.equals("KEmin"))
        {
            notes[0] = "B4";
            notes[1] = "C5";
            notes[1] = "D5";
            notes[2] = "E5";
            notes[3] = "F#5";
            notes[4] = "G5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C6";
            notes[8] = "D6";
            notes[9] = "E6";
            notes[10] = "F#6";
            notes[11] = "G6";
            notes[12] = "A6";
            notes[13] = "B6";
            notes[14] = "C7";
        }
        if (this.key.equals("KDmaj") || this.key.equals("KBmin"))
        {
            notes[0] = "B4";
            notes[1] = "C#5";
            notes[1] = "D5";
            notes[2] = "E5";
            notes[3] = "F#5";
            notes[4] = "G5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C#6";
            notes[8] = "D6";
            notes[9] = "E6";
            notes[10] = "F#6";
            notes[11] = "G6";
            notes[12] = "A6";
            notes[13] = "B6";
            notes[14] = "C#7";
        }
        if (this.key.equals("KAmaj") || this.key.equals("KF#min"))
        {
            notes[0] = "B4";
            notes[1] = "C#5";
            notes[1] = "D5";
            notes[2] = "E5";
            notes[3] = "F#5";
            notes[4] = "G#5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C#6";
            notes[8] = "D6";
            notes[9] = "E6";
            notes[10] = "F#6";
            notes[11] = "G#6";
            notes[12] = "A6";
            notes[13] = "B6";
            notes[14] = "C#7";
        }
        if (this.key.equals("KEmaj") || this.key.equals("KC#min"))
        {
            notes[0] = "B4";
            notes[1] = "C#5";
            notes[1] = "D#5";
            notes[2] = "E5";
            notes[3] = "F#5";
            notes[4] = "G#5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C#6";
            notes[8] = "D#6";
            notes[9] = "E6";
            notes[10] = "F#6";
            notes[11] = "G#6";
            notes[12] = "A6";
            notes[13] = "B6";
            notes[14] = "C#7";
        }
        if (this.key.equals("KBmaj") || this.key.equals("KG#min"))
        {
            notes[0] = "B4";
            notes[1] = "C#5";
            notes[1] = "D#5";
            notes[2] = "E5";
            notes[3] = "F#5";
            notes[4] = "G#5";
            notes[5] = "A#5";
            notes[6] = "B5";
            notes[7] = "C#6";
            notes[8] = "D#6";
            notes[9] = "E6";
            notes[10] = "F#6";
            notes[11] = "G#6";
            notes[12] = "A#6";
            notes[13] = "B6";
            notes[14] = "C#7";
        }
        if (this.key.equals("KF#maj") || this.key.equals("KD#min"))
        {
            notes[0] = "B4";
            notes[1] = "C#5";
            notes[1] = "D#5";
            notes[2] = "E#5";
            notes[3] = "F#5";
            notes[4] = "G#5";
            notes[5] = "A#5";
            notes[6] = "B5";
            notes[7] = "C#6";
            notes[8] = "D#6";
            notes[9] = "E#6";
            notes[10] = "F#6";
            notes[11] = "G#6";
            notes[12] = "A#6";
            notes[13] = "B6";
            notes[14] = "C#7";
        }
        if (this.key.equals("KDbmaj") || this.key.equals("KBbmin"))
        {
            notes[0] = "Bb4";
            notes[1] = "C5";
            notes[1] = "Db5";
            notes[2] = "Eb5";
            notes[3] = "F5";
            notes[4] = "Gb5";
            notes[5] = "Ab5";
            notes[6] = "Bb5";
            notes[7] = "C6";
            notes[8] = "Db6";
            notes[9] = "Eb6";
            notes[10] = "F6";
            notes[11] = "Gb6";
            notes[12] = "Ab6";
            notes[13] = "Bb6";
            notes[14] = "C7";
        }
        if (this.key.equals("KAbmaj") || this.key.equals("KFmin"))
        {
            notes[0] = "Bb4";
            notes[1] = "C5";
            notes[1] = "Db5";
            notes[2] = "Eb5";
            notes[3] = "F5";
            notes[4] = "G5";
            notes[5] = "Ab5";
            notes[6] = "Bb5";
            notes[7] = "C6";
            notes[8] = "Db6";
            notes[9] = "Eb6";
            notes[10] = "F6";
            notes[11] = "G6";
            notes[12] = "Ab6";
            notes[13] = "Bb6";
            notes[14] = "C7";
        }
        if (this.key.equals("KEbmaj") || this.key.equals("KCmin"))
        {
            notes[0] = "Bb4";
            notes[1] = "C5";
            notes[1] = "D5";
            notes[2] = "Eb5";
            notes[3] = "F5";
            notes[4] = "G5";
            notes[5] = "Ab5";
            notes[6] = "Bb5";
            notes[7] = "C6";
            notes[8] = "D6";
            notes[9] = "Eb6";
            notes[10] = "F6";
            notes[11] = "G6";
            notes[12] = "Ab6";
            notes[13] = "Bb6";
            notes[14] = "C7";
        }
        if (this.key.equals("KBbmaj") || this.key.equals("KGmin"))
        {
            notes[0] = "Bb4";
            notes[1] = "C5";
            notes[1] = "D5";
            notes[2] = "Eb5";
            notes[3] = "F5";
            notes[4] = "G5";
            notes[5] = "A5";
            notes[6] = "Bb5";
            notes[7] = "C6";
            notes[8] = "D6";
            notes[9] = "Eb6";
            notes[10] = "F6";
            notes[11] = "G6";
            notes[12] = "A6";
            notes[13] = "Bb6";
            notes[14] = "C7";
        }
        if (this.key.equals("KFmaj") || this.key.equals("KDmin"))
        {
            notes[0] = "Bb4";
            notes[1] = "C5";
            notes[1] = "D5";
            notes[2] = "E5";
            notes[3] = "F5";
            notes[4] = "G5";
            notes[5] = "A5";
            notes[6] = "B5";
            notes[7] = "C6";
            notes[8] = "D6";
            notes[9] = "E6";
            notes[10] = "F6";
            notes[11] = "G6";
            notes[12] = "A6";
            notes[13] = "Bb6";
            notes[14] = "C7";
        }
    }

    public String getKey()
    {
        return this.key;
    }

    public int getTempo()
    {
        return this.tempo;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String[] getNotes()
    {
        return this.notes;
    }

    public String getNotes(int x)
    {
        return this.notes[x];
    }

    public String getI()
    {
        return I;
    }

    public String getII()
    {
        return II;
    }

    public String getIII()
    {
        return III;
    }

    public String getIV()
    {
        return IV;
    }

    public String getV()
    {
        return V;
    }

    public String getVI()
    {
        return VI;
    }

    public String getVII()
    {
        return VII;
    }
}
