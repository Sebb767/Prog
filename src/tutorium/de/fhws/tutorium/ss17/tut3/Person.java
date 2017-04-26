package de.fhws.tutorium.ss17.tut3;

import java.io.*;

public class Person {
    protected String vorname, nachname;
    protected int alter;

    public static void main(String[] args) {
        String file = "/tmp/Personen.csv";
        Person[] pers = new Person[6];

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)
                    )
            );

            String line;
            int offset = 0;
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(";");

                pers[offset++] = new Person(data[0], data[1], Integer.parseInt(data[2]));
            }

            br.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        for (Person x:pers ) {
            System.out.println(x.toString());
        }
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (" + alter + " Jahre)";
    }

    //
    // getter, setter
    //

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

}
