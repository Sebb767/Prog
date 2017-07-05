package de.fhws.tutorium.ss17.tut11;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Sebastian Kaim on 7/5/17.
 */
public class Roulette implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private boolean hasNext = true;

            @Override
            public boolean hasNext() {
                return hasNext;
            }

            @Override
            public Integer next() {
                if(!hasNext)
                    throw new NoSuchElementException();

                int nr = (int)(Math.random() * 37);

                if(nr == 36)
                    hasNext = false;

                return nr;
            }
        };
    }

    public static void main(String[] args) {
        Roulette r = new Roulette();
        for (Integer i : r) {
            System.out.println(i);
        }
    }
}
