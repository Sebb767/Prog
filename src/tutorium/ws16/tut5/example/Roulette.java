package ws16.tut5.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by sebb on 12/14/16.
 */
public class Roulette implements Iterable<Integer> {

    public static class RouletteIterator implements Iterator<Integer>
    {
        boolean hasEnded = false;

        public boolean hasNext()
        {
            return !hasEnded;
        }

        public Integer next()
        {
            if(!hasNext())
                throw new NoSuchElementException();

            int num = (int)(Math.random() * 42) + 1;

            if(num == 42)
                hasEnded = true;

            return num;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RouletteIterator();
    }

    public static void main(String[] args) {
        Roulette r = new Roulette();

        System.out.println("Versuch 1:");
        for(int i : r)
            System.out.println(i);

        System.out.println();
        System.out.println("Versuch 2:");
        for(int i : r)
            System.out.println(i);
    }
}
