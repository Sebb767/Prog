package de.fhws.tutorium.ss17.tut7;

import java.util.*;

/**
 * Created by Sebastian Kaim on 6/14/17.
 */
public class Roulette implements Iterable<Integer> {
    private final class RouletteIterator implements Iterator<Integer> {
        private boolean isDone = false;

        @Override
        public boolean hasNext() {
            System.out.println("hasNext aufgerufen");
            return !isDone;
        }

        @Override
        public Integer next() {
            if(!hasNext())
                throw new NoSuchElementException();

            int rnd = (int)(Math.random() * 42 + 1);

            if(rnd == 42)
                isDone = true;

            System.out.println("next aufgerufen");
            return rnd;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        System.out.println("iterator aufgerufen");
        return new RouletteIterator();
    }

    public static void main(String[] args) {
        Roulette r = new Roulette();
        List<Integer> st = new ArrayList<Integer>();

        for(int i : r)
        {
            if(!st.contains(i))
                st.add(i);
        }

        Collections.sort(st);

        for(int i : st)
        {
            System.out.println(i);
        }
    }
}
