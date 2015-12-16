package Uebung10;

/**
 * Created by sebb on 12/16/15.
 */
public class Raum {
    final int studenten;
    final String name;

    private boolean belegt = false;

    public Raum(String name, int studenten) {
        this.studenten = studenten;
        this.name = name;
    }

    public static void main(String[] args) {

    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }
}
