package ws16.tut7.aufgabe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by proj on 1/4/17.
 */
public class AuftragsVerwaltungTest {
    AuftragsVerwaltung av;

    @Before
    public void prepare()
    {
        av = new AuftragsVerwaltung();
    }

    @After
    public void destroy()
    {
        av = null;
    }

    @Test
    public void testIfAuftragIsAddable() throws MyDuplicateElementException, MyNoSuchElementException {
        AuftragsVerwaltung av = new AuftragsVerwaltung();
        av.add(new Auftrag("a", 1));
        assertEquals(av.get("a").getStunden(), 1);
    }

    @Test
    public void testNoSuchElementException() throws MyDuplicateElementException {
        AuftragsVerwaltung av = new AuftragsVerwaltung();

        try {
            av.get("a");
            assertTrue(false);
        } catch (MyNoSuchElementException e) {
            assertTrue(true);
            // everything is ok
        }

        av.add(new Auftrag("a", 1));

        try {
            av.get("b");
            assertTrue(false);
        } catch (MyNoSuchElementException e) {
            assertTrue(true);
            // everything is ok
        }
    }

    @Test
    public void testDuplicateElementException() throws MyDuplicateElementException {
        AuftragsVerwaltung av = new AuftragsVerwaltung();

        av.add(new Auftrag("a", 1));

        av.add(new Auftrag("b", 1)); // should work

        try {
            av.add(new Auftrag("a", 2));
            assertTrue(false);
        } catch (MyDuplicateElementException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSortByHours() throws MyDuplicateElementException {
        AuftragsVerwaltung av = new AuftragsVerwaltung();

        av.add(new Auftrag("a", 2));
        av.add(new Auftrag("b", 4)); // should work
        av.add(new Auftrag("c", 1)); // should work


        Stack<Auftrag> st = av.nachArbeitsstunden();

        assertEquals(st.pop().getId(), "b");
        assertEquals(st.pop().getId(), "a");
        assertEquals(st.pop().getId(), "c");
    }

    @Test
    public void testGetFromFile() throws IOException
    {
        AuftragsVerwaltung av = new AuftragsVerwaltung();
        av.vonDateiEinlesen("/tmp/auftraege.txt");

        assertEquals(av.inhaltAlsListe().size(), 1000);
    }

    @Test
    public void testFileSerialization() throws IOException, MyDuplicateElementException, ClassNotFoundException {
        AuftragsVerwaltung av = new AuftragsVerwaltung(), avr;
        String file = "/tmp/serialization_test.bin";


        av.add(new Auftrag("a", 2));
        av.add(new Auftrag("b", 4)); // should work
        av.add(new Auftrag("c", 1)); // should work

        av.toFile(file);
        avr = AuftragsVerwaltung.fromFile(file);

        Stack<Auftrag> st = avr.nachArbeitsstunden(),
                ref = av.nachArbeitsstunden();
        assertEquals(st.pop().getId(), ref.pop().getId());
        assertEquals(st.pop().getId(), ref.pop().getId());
        assertEquals(st.pop().getId(), ref.pop().getId());
    }

    @Test
    public void testAktienSerialisiererReadFromFile() throws IOException, MyDuplicateElementException {
        AuftragsVerwaltung av = AktienSerialisierer.fromTxt("/tmp/auftraege.txt");
        assertTrue(av.inhaltAlsListe().size() >= 1000);
    }
}
