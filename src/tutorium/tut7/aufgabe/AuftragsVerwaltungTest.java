package tut7.aufgabe;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by proj on 1/4/17.
 */
public class AuftragsVerwaltungTest {

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
}
