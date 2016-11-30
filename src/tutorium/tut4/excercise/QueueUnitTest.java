package tut4.excercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tut3.example.Queue;
import tut3.example.QueueEmptyException;

public class QueueUnitTest {
    protected Queue<String> q;

    @Before
    public void prepareEmptyQueue()
    {
        q = new Queue<>();
    }

    @Test
    public void testQueueOutputOrder() throws QueueEmptyException
    {
        q.enqueue("test");
        q.enqueue("test2");

        assertEquals(q.dequeue(), "test");
        assertEquals(q.dequeue(), "test2");
    }

    @Test
    public void testQueueEmpty()
    {
        assertTrue(q.empty());
    }
}

