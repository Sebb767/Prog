package Uebung10;

/**
 * Created by sebb on 12/16/15.
 */
public class Vorlesung {
    protected String name, dozent, studiengang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public Vorlesung(String studiengang, String name, String dozent) {

        this.studiengang = studiengang;
        this.name = name;
        this.dozent = dozent;
    }
}
