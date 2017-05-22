package de.fhws.tutorium.ss17.tut2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntArrayQueueTest {
    protected IntArrayQueue iaq;

    @Before
    public void prepareQueue()
    {
        iaq = new IntArrayQueue(200);
    }

    @Test
    public void testIfNewQueueIsEmpty()
    {
        assertTrue(iaq.empty());
    }

    @Test
    public void testOrderOfQueue() throws QueueEmptyException
    {
        iaq.enqueue(1);
        iaq.enqueue(2);

        assertFalse(iaq.empty());
        assertEquals(1, iaq.dequeue());

        assertFalse(iaq.empty());
        assertEquals(2, iaq.dequeue());

        assertTrue(iaq.empty());
    }

    @Test(expected = QueueEmptyException.class)
    public void testQueueException() throws QueueEmptyException
    {
        assertTrue(iaq.empty());

        iaq.dequeue();
    }
}
