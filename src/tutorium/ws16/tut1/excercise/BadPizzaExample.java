package ws16.tut1.excercise;

/**
 * Beispiel einer vererbten Klasse, die das Substitutionsprinzip verletzt.
 */
public class BadPizzaExample extends Pizza {
    public BadPizzaExample() {
        this.preis = 6.99;
    }

    @Override
    public double getPreis() {
        /*

        Hier wird der Preis in Cent statt in Euro zurück gegeben.

         */
        return super.getPreis() * 100;
    }
}
