import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        Composition AutumnLeaves = new Composition("Autumn Leaves", "Gminor");

        Pattern pattern = new Pattern("T[Presto]");
        pattern.add("V0 I[Piano]         Rw              | C5min7w | F4dom7w          | Bb4maj7w | Eb5maj7w         | A5min7w | D5dom7w          | G4min7w | G4min7w");
        pattern.add("V1 I[Trumpet]       Rq G5q A5q Bb5q | Eb6w    - Eb6q F5q G5q A5q | D6h D6h  - D6q Eb5q F5q G5q | C6w     - C6q D5q E5q F#5q | Bb5w    | Bb5w");

        Player player = new Player();
        player.play(pattern);

    }


    public static void main(String[] args) {

        launch(args);
    }
}
