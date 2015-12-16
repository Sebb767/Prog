package Uebung10;

/**
 * Created by sebb on 12/16/15.
 */
public class Raum {
    final int studenten;
    final String name;

    //private boolean belegt = false; // obsolet durch A3
    private Vorlesung v;

    public Raum(String name, int studenten) {
        this.studenten = studenten;
        this.name = name;
    }

    public static void main(String[] args) {

    }

    public boolean isBelegt() {
        return v == null;
    }

    public Vorlesung belegung() {
        return v;
    }

    public void setBelegt(Vorlesung v) {
        this.v = v;
    }
}
