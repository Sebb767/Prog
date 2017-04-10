package ws16.tut10.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by proj on 1/25/17.
 */
public class Baum<E extends Comparable<E>> {
    public Element<E> root;

    private class Element<E extends Comparable<E>> {
        public E data;
        private Element<E> left, right;

        public Element(E data) {
            this.data = data;
        }

        public void add(E el)
        {
            if(el.compareTo(data) < 0)
            {
                if(left == null)
                    left = new Element<>(el);
                else
                    left.add(el);
            }
            else
            {
                if(right == null)
                    right = new Element<>(el);
                else
                    right.add(el);
            }
        }

        public void print()
        {
            if(left!= null) left.print();
            System.out.println(data.toString());
            if(right != null) right.print();
        }
    }

    public void add(E el)
    {
        if(root == null)
            root = new Element<>(el);
        else
            root.add(el);
    }

    public void print()
    {
        if(root != null)
            root.print();
    }

    @Test
    public void testIfListIsEmpty()
    {
        ArrayList<Integer> xx = new ArrayList<>();
        assertTrue(xx.isEmpty());
    }

    @Test
    public void testMultiplication()
    {
        int a = 2, b = 3;
        int r = a * b;
        assertEquals(r, 6);
    }
}
