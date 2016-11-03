package tut1;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * Created by proj on 11/3/16.
 */
public class Buchhaltung {
    protected ArrayList<Rechnung> inhalt;

    public Buchhaltung() {
        inhalt = new ArrayList<>();
    }

    public void RechnungHinzufuegen(Rechnung r)
    {
        inhalt.add(r);
    }

    public ArrayList<Rechnung> getInhalt() {
        return inhalt;
    }

    public double getTotal()
    {
        return inhalt.stream().map(p -> p.getTotal()).reduce((double)0, Double::sum);


    }
}
