package Musterklausur;

/**
 * Created by proj on 7/6/16.
 */
public class Bruch implements Comparable<Bruch> {
    int zaehler,nenner;

    // a)
    public Bruch(int zaehler, int nenner) { this.zaehler = zaehler; this.nenner = nenner; }
    public Bruch(int wert) { this(wert, 1); }
    public Bruch() { this(0); }

    public String toString() { return zaehler + "/" + nenner; }

    // b
    public int compareTo(Bruch b) {
        return (int)(((double)zaehler / nenner) - ((double)b.zaehler / b.nenner));
    }
}
