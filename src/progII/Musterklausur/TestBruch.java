package Musterklausur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by proj on 7/6/16.
 */
// c)
public class TestBruch {
    public void testBruchSort()
    {
        List<Bruch> l = new ArrayList<Bruch>();

        l.add(new Bruch(1, 4));
        l.add(new Bruch(2, 3));
        l.add(new Bruch(1, 8));
        l.add(new Bruch(4, 17));
        l.add(new Bruch(-4, 5));
        Collections.sort(l);
        for (Bruch b : l) System.out.println(b.toString());
    }

    public static void main(String[] args) {
        TestBruch a = new TestBruch();
        a.testBruchSort();
    }
}
