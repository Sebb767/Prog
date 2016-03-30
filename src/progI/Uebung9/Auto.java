package Uebung9;

/**
 * Created by sebb on 12/9/15.
 * Aufgabe 1 & 2
 */
public class Auto {
    private String marke, modell, farbe;
    private int hubraum = 1600, ps;

    public Auto(String marke, String modell, String farbe, int ps, int hubraum)
    {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.ps = ps;
        setHubraum(hubraum);
    }

    public int getHubraum()
    {
        return hubraum;
    }

    public void setHubraum(int ccm)
    {
        if(ccm > 0)
            this.hubraum = ccm;
    }

    public String toString() {
        return String.format("%s %s (%s) w/ %d PS (%d ccm)", marke, modell, farbe, ps, hubraum);
    }
}
