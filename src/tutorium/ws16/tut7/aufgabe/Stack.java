package ws16.tut7.aufgabe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by proj on 12/28/16.
 */
public class Stack<T extends Stackable> implements Iterable<T> {

    protected ArrayList<T> content = new ArrayList<>();

    public Stack() { }
    public Stack(Collection<T> in) { content = new ArrayList<>(in); }

    public void push(T in)
    {
        content.add(in);
    }

    public T pop()
    {
        return content.remove(content.size() - 1);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ArrayList<T> c = content;

            @Override
            public boolean hasNext() {
                return c.size() > 0;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                return c.get(c.size() - 1);
            }
        };
    }
}
