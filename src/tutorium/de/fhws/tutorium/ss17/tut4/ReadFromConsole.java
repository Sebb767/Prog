package de.fhws.tutorium.ss17.tut4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("/tmp/datei.txt");
            String line;

            while(true)
            {
                line = br.readLine();
                if(line == null || line.equals("q")) break;

                fw.write(line + "\n");
                fw.flush();
            }

            fw.close();
            br.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
