package tut3.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by proj on 11/23/16.
 */
public class StreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/tmp/random.file");

            // 0-255 wenn gelesen, -1 wenn am Ende der Datei
            int r = fis.read();
            int c42 = 0;
            while (r != -1)
            {
                if(r == 42)
                    c42++;

                r = fis.read();
            }

            System.out.printf("Die Anzahl der 42 in der Datei war %d.", c42);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
