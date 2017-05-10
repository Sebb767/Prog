package de.fhws.tutorium.ss17.tut5;

import de.fhws.tutorium.ss17.tut4.Person;
import de.fhws.tutorium.ss17.tut4.PersonReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by proj on 5/10/17.
 */
public class PersonenLeser {
    public static void main(String[] args) {
        try {
            Person p = new Person("Asd", "Hjkl", 32);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/p.dat"));
            oos.writeObject(p);
            oos.close();

            //
            //
            //

            List<Person> lp = new ArrayList<Person>();
            lp.add(p);

            lp.forEach(pp -> System.out.println(pp));
        }
        catch (IOException ex)
        {

        }
    }
}
