package exercise11;

import java.util.Iterator;

/**
 * Created by proj on 6/20/16.
 */
public class Die extends AbstractDie {
    @Override
    public Iterator<Integer> iterator() {
        return new DieIterator();
    }

    public static void main(String[] args) {
        test(new Die());
    }
}
