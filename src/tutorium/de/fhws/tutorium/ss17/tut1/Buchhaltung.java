package de.fhws.tutorium.ss17.tut1;

import java.util.ArrayList;

public class Buchhaltung {
    protected ArrayList<Rechnung> inhalt;

    public Buchhaltung() {
        inhalt = new ArrayList<>();
    }

    public void RechnungHinzufuegen(Rechnung r)
    {
        inhalt.add(r);
    }

    public ArrayList<Rechnung> getInhalt()
    {
        return inhalt;
    }

    public double getTotal()
    {
        return inhalt.stream().map(p -> p.getTotal()).reduce((double)0, Double::sum);

        /*double sum = 0;

        for (Rechnung r : inhalt)
            sum += r.getTotal();

        return sum;*/
    }
}
