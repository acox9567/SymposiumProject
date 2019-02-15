//Alexander Cox
//Friday, February 15, 2019

import java.util.ArrayList;
import java.util.List;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Composition {

    private String key;
    private int tempo;
    private String title;
    private List<Pattern> patterns = new ArrayList<Pattern>();

    public Composition(String key, int tempo, String title)
    {
        this.key = key;
        this.tempo = tempo;
        this.title = title;
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
}
