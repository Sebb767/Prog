package Mau;

/**
 * Created by sebb on 5/4/16.
 */
public class Karte implements Comparable<Karte> {
    private Kartenwert karte;
    private Farbe farbe;

    public Karte(Kartenwert karte, Farbe farbe) {
        this.karte = karte;
        this.farbe = farbe;
    }

    @Override
    public int compareTo(Karte o) {
        if(o == null)
            return 1;

        if(karte != o.karte)
            return (int)Math.signum(karte.ordinal() - o.karte.ordinal());

        return (int)Math.signum(farbe.ordinal() - o.farbe.ordinal());
    }

    public Kartenwert getKarte() {
        return karte;
    }

    public Farbe getFarbe() {
        return farbe;
    }
}
