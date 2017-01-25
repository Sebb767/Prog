package tut10.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by proj on 1/25/17.
 */
public class SomeInterfaceUsingClass {

    public void AddRandomNumber(Collection<Integer> collection)
    {
        collection.add((int)(Math.random() * 42) +1);
        Integer[] i = { 1, 2, 3};

        ArrayList<Integer> al = new ArrayList<>();
        for (int x: i) {
            al.add(x);
        }

        al.addAll(Arrays.asList(i));

        al.remove(new Integer(2));
    }
}
