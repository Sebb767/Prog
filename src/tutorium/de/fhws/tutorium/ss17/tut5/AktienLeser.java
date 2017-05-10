package de.fhws.tutorium.ss17.tut5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by proj on 5/10/17.
 */
public class AktienLeser {
    public final String file = "/tmp/aktien.csv";
    public ArrayList<String> sektoren = new ArrayList<>();
    public ArrayList<Aktie> aktien = new ArrayList<>();

    public AktienLeser() {

    }

    public Aktie ausZeile(String zeile)
    {
        String[] dt = zeile.split(";", 3);
        return new Aktie(dt[0], dt[1], Double.parseDouble(dt[2]));
    }

    public void Lese(String datei)
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(datei));

            String line;
            while((line = br.readLine()) != null)
            {
                Aktie ak = ausZeile(line);
                aktien.add(ak);
                if(!sektoren.contains(ak.getSektor()))
                    sektoren.add(ak.getSektor());
            }

            br.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void ausgeben()
    {
        HashMap<String, List<Aktie>> sla = new HashMap<>();

        sektoren.forEach(s -> sla.put(s, new ArrayList<>()));
        aktien.forEach(a -> sla.get(a.getSektor()).add(a));
        sektoren.forEach(s -> {
            sla.get(s).stream()
                    .mapToDouble(Aktie::getPreis)
                    .average()
                    .ifPresent(avg -> System.out.printf("Sektor %s: %.2f\n", s, avg));
        });
    }

    public static void main(String[] args) {
        AktienLeser al = new AktienLeser();
        al.Lese(al.file);
        al.ausgeben();
    }
}
