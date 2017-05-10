package de.fhws.tutorium.ss17.tut5;

import de.fhws.tutorium.ss17.tut4.Person;

import java.io.*;

/**
 * Created by proj on 5/10/17.
 */
public class PersonenSchreiber {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/p.dat"));
            Person p = (Person)ois.readObject();

            System.out.println(p);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
