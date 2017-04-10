package ws16.tut7.aufgabe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by proj on 1/18/17.
 */
public class AktienSerialisierer {
    public static AuftragsVerwaltung fromTxt(String filename) throws IOException, MyDuplicateElementException {
        BufferedReader br = new BufferedReader(new FileReader(filename));

        AuftragsVerwaltung av = new AuftragsVerwaltung();

        String line = br.readLine();
        while(line != null)
        {
            String[] data = line.trim().split(";");
            assert(data.length == 2);
            Auftrag auftrag = new Auftrag(data[0], Integer.parseInt(data[1]));
            av.add(auftrag);

            line = br.readLine();
        }

        return av;
    }
}
