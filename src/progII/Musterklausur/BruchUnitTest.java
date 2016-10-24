package Musterklausur;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by proj on 7/6/16.
 */

public class BruchUnitTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testSingleConstructor()
    {
        Bruch b = new Bruch(2);
        assertEquals(b.nenner, 1);
        assertEquals(b.zaehler, 2);
    }

    @Test
    public void testStdCtor()
    {
        Bruch b = new Bruch(1);
        assertEquals(b.nenner, 1);
        assertEquals(b.zaehler, 1);
    }

    @Test
    public void testToString()
    {
        Bruch b = new Bruch(3, 2);
        assertEquals("toString returned a wrong value!", "3/2", b.toString());
    }

    @Test
    public void testToZero()
    {
        thrown.expect(ArithmeticException.class);
        Bruch b = new Bruch(32, 0);
    }
}
