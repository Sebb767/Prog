package Uebung10;

/**
 * Created by sebb on 12/16/15.
 */
public class Raum {
    final int studenten;
    final String name;

    private Student[] insassen;

    //private boolean belegt = false; // obsolet durch A3
    private Vorlesung v;

    public Raum(String name, int studenten) {
        this.studenten = studenten;
        this.name = name;
        insassen = new Student[studenten];
    }

    public static void main(String[] args) {
        // bla bla bla, kreiere Rau, bla bla bla
    }

    public boolean betrete(Student s)
    {
        for (int i = 0; i < insassen.length; i++) {
            if(insassen[i] == null)
            {
                insassen[i] = s;
                return true;
            }
        }
        return false;
    }

    public void verlasse(Student s)
    {
        for (int i = 0; i < insassen.length; i++) {
            if(insassen[i].equals(s))
                insassen[i] = null;
        }
    }

    public boolean isBelegt() {
        return v == null;
    }

    public Vorlesung belegung() {
        return v;
    }

    public void setBelegt(Vorlesung v) {
        this.v = v;
    }
}
