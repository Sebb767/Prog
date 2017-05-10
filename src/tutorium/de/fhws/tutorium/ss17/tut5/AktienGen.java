package de.fhws.tutorium.ss17.tut5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by proj on 5/10/17.
 */
public class AktienGen {
    public static void main(String[] args) throws IOException {
        String[] sektor = { "Technik", "Biologie", "Finanzen", "Nahrung", "Autoindustrie", "Software" };

        FileWriter fw = new FileWriter("/tmp/aktien.csv");

        for (int i = 0; i < 200; i++) {
            fw.write(String.format(
                    "%s;%s;%.2f\n",
                    UUID.randomUUID().toString().substring(0,4),
                    sektor[(int)(Math.random() * sektor.length)],
                    Math.random() * 100
                    ));
        }

        fw.close();
    }
}
