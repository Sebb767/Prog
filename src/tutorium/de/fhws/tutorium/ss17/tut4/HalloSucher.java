package de.fhws.tutorium.ss17.tut4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalloSucher {
    public static final String Search = "Hallo";

    public static void main(String[] args) {
        String datei = "/tmp/datei.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(datei));

            String line;

            while((line = br.readLine()) != null) {
                if(line.contains(Search))
                {
                    System.out.println("Hallo, Welt!");
                    break;
                }
            }

            br.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
