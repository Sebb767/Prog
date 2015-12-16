package Uebung10;

/**
 * Created by sebb on 12/16/15.
 */
public class Auto extends Uebung9.Auto {

    protected static int anzahl = 0;

    public Auto(String marke, String modell, String farbe, int ps, int hubraum) {
        super(marke, modell, farbe, ps, hubraum);

        anzahl++;
    }

    public int bruttoUmsatz(int preis)
    {
        return anzahl*preis;
    }
}
