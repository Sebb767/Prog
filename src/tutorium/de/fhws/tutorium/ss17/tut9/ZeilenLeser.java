package de.fhws.tutorium.ss17.tut9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian Kaim on 6/26/17.
 */
public class ZeilenLeser {
    protected IZeilenVerarbeiter verarbeiter;
    protected String file;

    public ZeilenLeser(IZeilenVerarbeiter verarbeiter, String file) {
        this.verarbeiter = verarbeiter;
        this.file = file;
    }

    public void Execute() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Thread> threads = new ArrayList<>();

        String line;
        while((line = br.readLine()) != null)
        {
            Thread t = new Thread(
                    new Worker(line)
            );
            t.start();
            threads.add(t);
        }

        // wait for all threads to end
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    protected class Worker implements Runnable
    {
        final String zeile;

        public Worker(String zeile) {
            this.zeile = zeile;
        }

        @Override
        public void run() {
            verarbeiter.VerarbeiteZeile(zeile);
        }
    }
}
