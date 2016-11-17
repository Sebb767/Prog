package tut3.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by proj on 11/17/16.
 */
public class e15a4 {
    public static void main(String[] args) {
        String path;

        Scanner s = new Scanner(System.in);

        InputStream is = null, bis = null;


        do {
            System.out.printf("Bitte gib einen Dateinamen ein: ");
            path = s.nextLine().trim();

            try
            {
                is = new FileInputStream(path);
                bis = new BufferedInputStream(
                        new FileInputStream(path)
                );
            }
            catch (IOException ex)
            {
                System.out.println("Fehler bei der Eingabe.");
                path = null;
            }

        }
        while (path == null);

        try
        {

            long duration_is = check_duration_until_end(is);
            long duration_bis = check_duration_until_end(bis);

            System.out.printf(
                    "Der nicht-gepufferte IS hat %d ns gebraucht, der BIS hat %d ns gebraucht",
                    duration_is,
                    duration_bis
            );
        }
        catch (IOException ex)
        {
            System.out.println("Fehler beim Testen.");
            ex.printStackTrace();
        }
    }

    public static long check_duration_until_end(InputStream is) throws IOException
    {
        long startTime = System.currentTimeMillis();
        int r = 0;

        while(r >= 0) r = is.read();

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
