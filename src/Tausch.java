/**
 * Created by sebb on 10/21/15.
 */
public class Tausch { // Übung 2; Aufgabe 1

    public void tausch() {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println("Vorher: " + x + ", " + y);
        //Tausch

        int z = x;
        x = y;
        y = z;

        //Nach dem Tausch
        System.out.println("Nachher: " + x + ", " + y);
    }
}
