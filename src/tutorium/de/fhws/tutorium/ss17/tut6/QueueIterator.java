package de.fhws.tutorium.ss17.tut6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Sebastian Kaim on 5/29/17.
 */
public class QueueIterator<T> implements Iterator<T> {
    private final ArrayList<T> content;
    private int offset = 0;

    public QueueIterator(ArrayList<T> conent) {
        this.content = conent;
    }

    @Override
    public boolean hasNext() {
        return offset >= content.size();
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();

        return content.get(offset++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
