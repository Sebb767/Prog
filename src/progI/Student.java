/**
 * Created by sebb on 12/10/15.
 * Vorlesung am 10.12.2015
 */
public class Student {
    public String matrikelnummer, vorname, nachname, os, studiengang;
    public int $$, semester;
    public String[] pcs;

    public Student(String matrikelnummer, String vorname, String nachname, String os, String studiengang, int $$, int semester, String... pcs) {
        this.matrikelnummer = matrikelnummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.os = os;
        this.studiengang = studiengang;
        this.$$ = $$;
        this.semester = semester;
        this.pcs = pcs;
    }

    public void addPC(String modell) {
        String[] npc = new String[pcs.length+1];
        int i = 0;
        for (; i < pcs.length; i++) npc[i] = pcs[i];
        npc[i] = modell;
        pcs = npc;
    }

    //
    // getter + setter
    //

    public String[] getPcs() {
        return pcs;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public int get$$() {
        return $$;
    }

    public void set$$(int $$) {
        this.$$ = $$;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }


}
