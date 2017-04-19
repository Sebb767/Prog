package de.fhws.tutorium.ss17.tut2;

/**
 * Created by proj on 4/19/17.
 */
public class IntArrayQueue {
    protected int[] data;
    protected int elements = 0, offset = 0;

    public IntArrayQueue(int length) {
        this.data = new int[length];
    }

    public boolean empty()
    {
        return elements == 0;
    }

    public void enqueue(int data)
    {
        if(elements >= this.data.length)
        {
            // ¯\_(ツ)_/¯
        }

        this.data[offset + (elements++)] = data;
    }

    public int dequeue() throws QueueEmptyException
    {
        if(empty())
            throw new QueueEmptyException("Die Liste ist leer :(");

        --elements;
        return this.data[offset++];
    }
}
