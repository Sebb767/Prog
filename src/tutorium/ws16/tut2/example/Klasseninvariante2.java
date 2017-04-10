package ws16.tut2.example;

/**
 * Created by proj on 11/15/16.
 */
public class Klasseninvariante2 extends Klasseninvariante1 {
    public Klasseninvariante2(String name) {
        this.init(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
