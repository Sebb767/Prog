package exercise11;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by proj on 6/20/16.
 */
public class DieIterator implements Iterator<Integer> {
    Random rng = new Random();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return Math.abs(rng.nextInt() % 6) +1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
