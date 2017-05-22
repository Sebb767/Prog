package de.fhws.tutorium.ss17.tut5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sebastian Kaim on 5/22/17.
 */
public class AktienLeserZwei {
    public final String file = "/tmp/aktien.csv";

    public ArrayList<Aktie> aktien = new ArrayList<>();

    public void readFromFile() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        while((line = br.readLine()) != null) {
            Aktie aktie = fromLine(line);
            aktien.add(aktie);
        }

        br.close();
    }

    protected Aktie fromLine(String line)
    {
        String[] data = new String[] { "", "", "" }; // line.split(";");
        char[] chars = line.toCharArray();
        int offset = 0;

        for(char c : chars)
        {
            if(c == ';')
                offset++;
            else
                data[offset] += c;
        }

        return new Aktie(data[0], data[1], Double.parseDouble(data[2]));
    }

    public void printSectorAverage()
    {
        Collections.sort(aktien);

        String lastSector = "";
        int count = 0;
        double sum = 0;

        for(Aktie a : aktien) {

            if (!a.getSektor().equals(lastSector)) {
                if(count != 0) {
                    System.out.printf("%s: %.2f\n", lastSector, sum / count);
                }

                count = 0;
                sum = 0;
                lastSector = a.getSektor();
            }

            sum += a.getPreis();
            count ++;
        }
        if(count != 0) {
            System.out.printf("%s: %.2f\n", lastSector, sum / count);
        }
    }

    public static void main(String[] args) {
        AktienLeserZwei alz = new AktienLeserZwei();

        try {
            alz.readFromFile();
            alz.printSectorAverage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
