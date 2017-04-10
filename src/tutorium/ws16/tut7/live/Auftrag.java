package ws16.tut7.live;

import tut7.aufgabe.Stackable;
import ws16.tut7.aufgabe.Stackable;

/**
 * Created by proj on 1/11/17.
 */
public class Auftrag implements Stackable {
    String kennung;
    int arbeitsstunden;

    public Auftrag(String kennung, int arbeitsstunden) {
        this.kennung = kennung;
        this.arbeitsstunden = arbeitsstunden;
    }

    public String getKennung() {
        return kennung;
    }

    public void setKennung(String kennung) {
        this.kennung = kennung;
    }

    public int getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setArbeitsstunden(int arbeitsstunden) {
        this.arbeitsstunden = arbeitsstunden;
    }
}
