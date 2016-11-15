package tut2.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Eine Beispielklasse für innere Klassen und Sortierung.
 */
public class Student implements Comparable<Student> {
    protected int matNr;
    protected int alter;

    public static ArrayList<Student> SortByNrViaInterface(ArrayList<Student> in)
    {
        // die Klasse implementiert die Methode compareTo und kann daher einfach sortiert werden.

        Collections.sort(in);

        return in;
    }

    public int compareTo(Student other)
    {
        if(other == null)
            return 1;

        return matNr - other.matNr;
    }


    /*
    Standardmethoden wie ctor, getter, setter etc.
    Hier ist nichts mehr interessantes.
     */

    public static void main(String[] args) {
        // ein paar zufällige Stundenten generieren
        ArrayList<Student> ls = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            ls.add(new Student((int)(Math.random() * 2000000 + 5000000), (int)(Math.random() * 20 + 18)));

        // irgendwie sortieren


        // und ausgeben
        for(Student s : ls)
            System.out.println(s);
    }

    // Standard Constructor
    public Student(int matNr, int alter) {
        this.matNr = matNr;
        this.alter = alter;
    }

    public String toString()
    {
        return "Der Student mit der Nr. " + matNr + " ist " + alter + " Jahre alt";
    }

    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
