package de.fhws.tutorium.ss17.tut11;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Sebastian Kaim on 7/5/17.
 */
public class ArrayIterator<T> implements Iterator<T>, Test1, Test2 {
    protected T[] content;
    protected int offset = 0;

    public ArrayIterator(T[] content) {
        this.content = content;
    }

    @Override
    public boolean hasNext() {
        return content.length > offset;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();

        return content[offset++];
    }

    public static void main(String[] args) {
        String[] test = { "Hallo", "Welt" };

        ArrayIterator<String> as = new ArrayIterator<>(test);
        while (as.hasNext())
        {
            System.out.println(as.next());
        }
    }

    @Override
    public void test() {
        System.out.println("3");
    }
}
