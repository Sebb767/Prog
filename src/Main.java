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

        // Übung 4
        cmdp.add(() -> Uebung4.Fallgeschwindigkeit_a(), "u4a1a");
        cmdp.add(() -> Uebung4.Fallgeschwindigkeit_b(), "u4a1b");
        cmdp.add(() -> Uebung4.Reihe(), "u4a2");
        cmdp.add(() -> Uebung4._1x1(), "u4a3");
        cmdp.add(() -> Uebung4.isPrime(), "u4a4");

        // Übung 5
        cmdp.add(() -> Uebung5.Temperaturtabelle(), "u5a1");
        cmdp.add(() -> Uebung5.Querprodukt(), "u5a2");
        //cmdp.add(() -> _, "u5a3"); // schriftlich :(
        cmdp.add(() -> Uebung5.Potenz(), "u5a4");

        cmdp.parse(args);
    }
}
