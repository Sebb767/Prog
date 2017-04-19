package de.fhws.tutorium.ss17.tut2;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RaumTest {

    protected Raum testraum;

    @Before
    public void setupRaum()
    {
        testraum = new Raum(0);
    }

    @Test
    public void testRaumSetAnzahlGroesserNull()
    {
        testraum.setAnzahlStudenten(2);

        assertEquals(testraum.getAnzahlStudenten(), 2);
    }

    @Test
    public void testRaumSetAnzahlGleichNull()
    {
        testraum.setAnzahlStudenten(0);

        assertEquals(testraum.getAnzahlStudenten(), 0);
    }

    @Test
    public void testRaumSetAnzahlKleinerNull()
    {
        try
        {
            testraum.setAnzahlStudenten(-2);
            assertFalse(true);
        }
        catch (IllegalArgumentException ex)
        {
            assertTrue(true);
        }
    }
}
