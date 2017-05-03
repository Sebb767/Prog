package de.fhws.tutorium.ss17.tut4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PersonReader {
    protected String path;

    public PersonReader(String path) {
        this.path = path;
    }

    public Person[] readPersons() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        Person[] val = new Person[countLines()];

        String line;
        int offset = 0;
        while((line = br.readLine()) != null)
        {
            String[] dt = line.split(";", 3);
            val[offset++] = new Person(dt[0], dt[1], Integer.parseInt(dt[2]));
        }

        br.close();

        return val;
    }

    protected int countLines() throws IOException
    {
        int ctr = 0;

        BufferedReader br = new BufferedReader(new FileReader(path));
        while(br.readLine() != null) ctr++;

        br.close();

        return ctr;
    }

    public static void main(String[] args) {
        try {

            PersonReader pr = new PersonReader("/tmp/Personen.csv");
            Person[] p = pr.readPersons();

            Arrays.stream(p).forEach(x -> System.out.println(x.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
