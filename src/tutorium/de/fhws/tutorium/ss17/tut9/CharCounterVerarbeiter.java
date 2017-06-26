package de.fhws.tutorium.ss17.tut9;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Sebastian Kaim on 6/26/17.
 */
public class CharCounterVerarbeiter implements IZeilenVerarbeiter {
    protected final char searched = 'e';
    protected final AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void VerarbeiteZeile(String zeile) {
        int offset = 0;

        while((offset = zeile.indexOf(searched, offset)) != -1)
        {
            counter.incrementAndGet();
        }
    }

    public int GetValue()
    {
        return counter.get();
    }

    public static void main(String[] args) throws IOException {
        final String file = "/tmp/random.txt";

        CharCounterVerarbeiter ccv = new CharCounterVerarbeiter();
        ZeilenLeser zl = new ZeilenLeser(ccv, file);
        zl.Execute();

        System.out.println("Zeichen gefunden: " + ccv.GetValue());
    }
}
