package tut7.aufgabe;

/**
 * Created by proj on 1/4/17.
 */
public class Auftrag implements Stackable {
    protected String id;
    protected int stunden;

    public Auftrag(String id, int stunden) {
        this.id = id;
        this.stunden = stunden;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }
}
