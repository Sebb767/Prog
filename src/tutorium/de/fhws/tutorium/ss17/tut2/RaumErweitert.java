package de.fhws.tutorium.ss17.tut2;

/**
 * Created by proj on 4/19/17.
 */
public class RaumErweitert extends Raum {
    protected String name;

    public RaumErweitert(int anzahlStudenten) throws Exception {
        super(anzahlStudenten);

        setRaumDaten(2, "I.3.19");
    }

    @Override
    public void setRaumDaten(int anzahl)
    {
        anzahlStudenten = anzahl;
        try {
            super.setRaumDaten(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRaumDaten(int anzahl, String name)
    {
        setRaumDaten(anzahl);
        this.name = name;
    }
}
