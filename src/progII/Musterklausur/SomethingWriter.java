package Musterklausur;

import org.junit.*;

import java.io.*;

import static org.junit.Assert.*;

/**
 * Created by proj on 7/7/16.
 */
public class SomethingWriter {
    final String file = "obj.test";
    public ObjectOutputStream oos;
    public ObjectInputStream ois;

    @Test
    public void testObjectSerialization() throws IOException, ClassNotFoundException
    {
        Bruch b = new Bruch(14, 17);
        oos.writeObject(b);
        oos.flush();


        Object n = ois.readObject();

        assertTrue(n instanceof Bruch);

        Bruch c = (Bruch)n;
        assertEquals(c, b);
    }

    @Before
    public void createStreams() throws IOException
    {
        PipedInputStream is = new PipedInputStream();
        OutputStream os = new PipedOutputStream(is);

        ois = new ObjectInputStream(is);
        oos = new ObjectOutputStream(os);

    }

    @After
    public void close() throws IOException
    {
        oos.close();
        ois.close();
    }
}
