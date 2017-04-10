package ws16.tut2.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Eine Beispielklasse für innere Klassen und Sortierung.
 */
public class Student implements Comparable<Student> {
    protected int matNr;
    protected int alter;


    /*

    Sortierung via Interface Comparable<T>

     */

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

    Sortierung via statischer innerer Klasse

     */

    private static class StaticInnerSortingClass implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1 == null)
                return o2 == null ? 0 : -1;

            return o1.getAlter() - o2.getAlter();
        }
    }

    public static ArrayList<Student> SortByAgeViaStaticInnerClass(ArrayList<Student> in)
    {
        StaticInnerSortingClass s = new StaticInnerSortingClass();

        in.sort(s);

        return in;
    }

    /*

    Sortierung via innerer Klasse

     */

     private class InnerSortingClass implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1 == null)
                return o2 == null ? 0 : -1;

            return o1.getAlter() - o2.getAlter();
        }
    }

    // Note that this Method may not be static!
    public ArrayList<Student> SortByAgeViaInnerClass(ArrayList<Student> in)
    {
        InnerSortingClass s = new InnerSortingClass();

        in.sort(s);

        return in;
    }

    /*

    Sortierung via lokaler Klasse

     */

    public static ArrayList<Student> SortByAgeViaLocalClass(ArrayList<Student> in)
    {
        class LocalSortingClass implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1 == null)
                    return o2 == null ? 0 : -1;

                return o1.getAlter() - o2.getAlter();
            }
        }

        LocalSortingClass s = new LocalSortingClass();

        in.sort(s);

        return in;
    }

    /*

    Sortierung via anonymer Klasse

     */

    public static ArrayList<Student> SortByAgeViaAnonymousClass(ArrayList<Student> in)
    {
        Comparator<Student> s = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1 == null)
                    return o2 == null ? 0 : -1;

                return o1.getAlter() - o2.getAlter();
            }
        };

        in.sort(s);

        return in;
    }

    /*

    Sortierung via Lambda (nicht Klausurrelevant)

     */
    public static ArrayList<Student> SortByAgeViaLambda(ArrayList<Student> in)
    {

        in.sort((o1, o2) -> {
            if(o1 == null)
                return o2 == null ? 0 : -1;

            return o1.getAlter() - o2.getAlter();
        });

        return in;
    }

    /*

    Java 8 Kurzschreibweise: Method Reference (nicht Klausurrelevant)

     */
    public static ArrayList<Student> SortByAgeViaMethodReference(ArrayList<Student> in)
    {
        Collections.sort(in, Comparator.comparing(Student::getAlter));

        return in;
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
        ls.get(0).SortByAgeViaInnerClass(ls);

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
