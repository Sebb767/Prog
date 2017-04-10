package ws16.tut1.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by proj on 11/9/16.
 */
public class Stack<E> {
    protected ArrayList<E> list;


    public Stack(int initialCapacity) {
        list = new ArrayList<>(initialCapacity);
    }

    public Stack() {
        list = new ArrayList<>();
    }

    public Stack(Collection<? extends E> c) {
        list = new ArrayList<>(c);
    }

    public void push(E el)
    {
        list.add(el);
    }

    public E pop()
    {
        E top;

        assert(list.size() > 0);

        top = list.get(list.size() - 1);

        list.remove(list.size() - 1);

        return top;
    }

}
