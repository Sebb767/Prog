package de.fhws.tutorium.ss17.tut6;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Sebastian Kaim on 6/7/17.
 */
public class StringByValueComparator implements Comparator<String> {
    protected Map<String, Integer> values;

    public StringByValueComparator(Map<String, Integer> values) {
        this.values = values;
    }

    @Override
    public int compare(String o1, String o2) {
        return values.get(o2) - values.get(o1);
    }
}
