/**
 * Created by sebb on 10/15/15.
 */
public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        Tausch t = new Tausch();

        CmdParser cmdp = new CmdParser();

        // Übung 1
        cmdp.add(() -> app.print(), "print", "p");
        cmdp.add(() -> app.math(), "math", "m");

        // Übung 2
        cmdp.add(() -> t.tausch(), "tausch", "t");
        cmdp.add(() -> app.radius(Math.E), "radius", "r");
        cmdp.add(() -> app.kugel(Math.E), "kugel", "k");
        cmdp.add(() -> app.IrgendeineGleichung(42, 11), "sonstwas", "i");
        cmdp.add(() -> app.Datumszeug(), "datum", "d");

        // Übung 3
        cmdp.add(() -> Uebung3.Sieben(), "u3a1", "7");
        cmdp.add(() -> Uebung3.Pizzarechner(), "u3a2", "P");
        cmdp.add(() -> Uebung3.zeichenanalyse(), "u3a3", "z");
        cmdp.add(() -> Uebung3.Wuerfel(), "u3a4", "w");

        cmdp.parse(args);
    }
}
