package de.fhws.tutorium.ss17.tut2;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RaumTest {

    protected Raum testraum;

    @Before
    public void setupRaum() throws Exception
    {
        testraum = new Raum(0);
    }

    @Test
    public void testRaumSetAnzahlGroesserNull() throws Exception
    {
        testraum.setRaumDaten(2);

        assertEquals(testraum.getAnzahlStudenten(), 2);
    }

    @Test
    public void testRaumSetAnzahlGleichNull()
    {
        try {
            testraum.setRaumDaten(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(testraum.getAnzahlStudenten(), 0);
    }

    @Test
    public void testRaumSetAnzahlKleinerNull()
    {
        try
        {
            testraum.setRaumDaten(-2);
            assertFalse(true);
        }
        catch (Exception ex)
        {
            assertTrue(true);
        }
    }
}
