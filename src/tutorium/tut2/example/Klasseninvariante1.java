package tut2.example;

/**
 * Created by proj on 11/15/16.
 */
public class Klasseninvariante1 extends KlasseninvarianteBase {
    public Klasseninvariante1()
    {
        // leerer ctor
    }

    public void init(String name)
    {
        // Klasseninvariante prüfen
        assert(name != null);
        assert(!name.isEmpty());

        id = 42;
    }
}
