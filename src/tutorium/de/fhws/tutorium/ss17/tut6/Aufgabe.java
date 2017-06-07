package de.fhws.tutorium.ss17.tut6;

import java.util.*;

/**
 * Created by Sebastian Kaim on 6/7/17.
 */
public class Aufgabe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inputs = new HashMap<>();

        while(true)
        {
            System.out.print("> ");
            String line = scanner.nextLine();

            if(line.equals("lst"))
            {
                // irgendwas ausgeben
                ArrayList<String> keys = new ArrayList<String>(inputs.keySet());
                Collections.sort(keys, new StringByValueComparator(inputs));

                for (String key : keys) {
                    System.out.printf("%s: %d, ", key, inputs.get(key));
                }

                break;
            }
            else
            {
                // speichern
                inputs.put(line, inputs.containsKey(line) ? inputs.get(line) + 1 : 1);
            }
        }
    }
}
