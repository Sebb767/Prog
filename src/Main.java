import java.util.Scanner;

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

        // Übung 6
        cmdp.add(() -> System.out.println(
                Uebung6.PiAnnaeherung(getInt("Anzahl der Vierecke"))
        ), "u6a1");
        cmdp.add(() -> System.out.println(
                Uebung6.round(getDouble("Zu rundende Zahl"))
        ), "u6a2a");
        cmdp.add(() -> System.out.println(
                Uebung6.round(getDouble("Zu rundende Zahl"), getInt("Nachkommastellen"))
        ), "u6a2b");
        cmdp.add(() -> System.out.println(
                Uebung6.fakultaet(getInt("Basis für die Fakulatät"))
        ), "u6a3");
        cmdp.add(() -> Uebung6.Dreieck(getInt("Höhe für das Dreieck")), "u6a4");

        // Übung 7
        cmdp.add(() -> System.out.println(
                Uebung7.exp(getInt("Bitte geben Sie die Basis ein"), getInt("Bitte geben Sie den Exponenten ein"))
        ), "u7a1");
        cmdp.add(() -> System.out.println(
                Uebung7.sin(getDouble("Bitte geben Sie x ein"))
        ), "u7a2");
        cmdp.add(() -> Uebung7.Notenspiegel(false), "u7a3");
        cmdp.add(() -> Uebung7.Notenspiegel(true), "u7a4");

        cmdp.parse(args);
    }

    public static double getDouble(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        double in;
        do {
            try
            {
                System.out.print(prompt + ": ");
                in = sc.nextDouble();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Fehler - bitte einen gültigen double eingeben.");
            }
        } while(true);

        return in;
    }

    public static int getInt(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        int in;
        do {
            try
            {
                System.out.print(prompt + ": ");
                in = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Fehler - bitte einen gültigen double eingeben.");
            }
        } while(true);

        return in;
    }
}
