//Alexander Cox
//Monday, February 25, 2019

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jfugue.pattern.Pattern;
import sun.java2d.loops.GeneralRenderer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        Composition autumnLeaves = new Composition("Gmin", 180, "Autumn Leaves");

        Pattern A = new Pattern();
        A.setTempo(autumnLeaves.getTempo());
        A.add("V0 I[Piano]   Rw              | C5min7w | F4dom7w          | Bb4maj7w | Eb5maj7w         | A4min7w | D5dom7w          | G4min7w | G4min7w         | C5min7w | F5dom7w          | Bb4maj7w | Eb5maj7w         | A4min7w | D5dom7w          | G4min7w  | G4min7w");
        A.add("V1 I[Trumpet] Rq G5q A5q Bb5q | Eb6w    - Eb6q F5q G5q A5q | D6h D6h  - D6q Eb5q F5q G5q | C6w     - C6q D5q E5q F#5q | Bb5w    | Rq G5q A5q Bb5q | Eb6w    - Eb6q F5q G5q A5q | D6h D6h  - D6q Eb5q F5q G5q | C6w     - C6q A5q C6q Bb5q | G5w      | Rh F#5 G5");

        autumnLeaves.addPattern(A);

        Pattern B = new Pattern();
        B.setTempo(autumnLeaves.getTempo());
        A.add("V0 I[Piano]   A4min7w     | D5dom7w         | G4min7w | G4min7w           | C5min7w | F4dom7w          | Bb4maj7w | Eb5maj7w     | A4min7w           | D5dom7w  | G4min7h C5min7h | F5dom7h Bb4dom7 | Eb5maj7w  | A4min7b5h D5dom7h | G4min7w - G4min7w");
        A.add("V1 I[Trumpet] A5q D5q A5h - A5q A5q G5q A5q | Bb5w    - Bb5q Bb5q A5q Bbq | C6w     - C6q F5q F6q E6bq | D6w      - D6h C#6q D6q | Eb6q Eb6q C6q C6q | A5h. Eb6 | D6h D6h         - D6h G5h         | C6h. Bb5q | A5h Bb5q D5q      | G5w     - G5w");

        autumnLeaves.playBack();

        Composition untitled01 = new Composition("Untitled01");

        System.out.println(untitled01.getKey());

        untitled01.addPattern(Generator.genTheme(untitled01));

        System.out.println("Untitled01");

        untitled01.playBack();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
