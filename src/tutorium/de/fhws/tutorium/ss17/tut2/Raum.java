package de.fhws.tutorium.ss17.tut2;

/**
 * Created by proj on 4/19/17.
 */
public class Raum {
    protected int anzahlStudenten;

    public Raum(int anzahlStudenten) throws Exception{
        setAnzahlStudenten(anzahlStudenten);
    }

    public int getAnzahlStudenten() {
        return anzahlStudenten;
    }

    public void setAnzahlStudenten(int anzahlStudenten) throws Exception {
        if(anzahlStudenten < 0)
            throw new Exception("Die Anzahl der Stundenten muss >= 0 sein!");

        this.anzahlStudenten = anzahlStudenten;
    }
}
