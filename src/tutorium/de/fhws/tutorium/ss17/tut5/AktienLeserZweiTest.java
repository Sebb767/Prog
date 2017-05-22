package de.fhws.tutorium.ss17.tut5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sebastian Kaim on 5/22/17.
 */
public class AktienLeserZweiTest {
    @Test
    public void testCustomLineSplit()
    {
        String line = "asd;Tech;12.55";
        AktienLeserZwei alz = new AktienLeserZwei();
        Aktie ak = alz.fromLine(line);

        assertEquals("asd", ak.getSymbol());
        assertEquals("Tech", ak.getSektor());
        assertEquals(12.55, ak.getPreis(), 0.001);
    }
}
