package de.fhws.tutorium.ss17.tut6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Sebastian Kaim on 6/7/17.
 */
public class QueueIteratorZwei<T> implements Iterator<T> {
    protected ArrayList<T> content;

    public QueueIteratorZwei(ArrayList<T> content) {
        this.content = content;
    }

    public boolean hasNext()
    {
        return content.size() > 0;
    }

    public T next()
    {
        if(!hasNext())
            throw new NoSuchElementException();

        return content.remove(0);
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
