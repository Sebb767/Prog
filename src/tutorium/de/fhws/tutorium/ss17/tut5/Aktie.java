package de.fhws.tutorium.ss17.tut5;

/**
 * Created by proj on 5/10/17.
 */
public class Aktie implements Comparable<Aktie> {
    protected String symbol, sektor;
    protected double preis;

    @Override
    public String toString() {
        return "Aktie " + symbol +
                "(sektor='" + sektor + '\'' +
                ", preis=" + preis +
                ')';
    }

    public Aktie(String symbol, String sektor, double preis) {
        this.symbol = symbol;
        this.sektor = sektor;
        this.preis = preis;
    }

    @Override
    public int compareTo(Aktie o) {
        return o == null ? 1 : sektor.compareTo(o.getSektor());
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
