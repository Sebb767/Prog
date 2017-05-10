package de.fhws.tutorium.ss17.tut4;

import java.io.Serializable;

public class Person implements Serializable {
    protected String name, nachname;
    protected int alter;

    public Person(String name, String nachname, int alter) {
        this.name = name;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return name + " " + nachname + " (" + alter + " Jahre)";
    }
}
