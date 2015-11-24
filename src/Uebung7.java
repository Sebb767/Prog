import java.util.Scanner;

/**
 * Created by sebb on 11/23/15.
 */
public class Uebung7 {

    public static void main(String[] args)
    {
       /*
       // A1

       int basis;
        int exponent;

        Scanner s = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Basis ein: ");
        basis = s.nextInt();

        System.out.print("Bitte geben Sie de Exponent ein: ");
        s.reset();
        exponent = s.nextInt();

        System.out.println(exp(basis, exponent)); //*/

       /*
        // A2

        double x;

        Scanner s = new Scanner(System.in);

        System.out.print("Bitte geben Sie x ein: ");
        x = s.nextDouble();

        System.out.println(sin(x)); //*/
    }

    // Aufgabe 1
    public static double exp(double basis, int zaehler)
    {
        if(zaehler == 0)
            return 1;

        if(zaehler < 0)
            return 1./exp(basis, -zaehler);

        return exp(basis, zaehler -1) * basis;
    }

    // Aufgabe 2
    public static double sin(double x) // WITCHIG: 5 Elemente abschreiben
    {
        double summe = 0;

        for (int k = 0; k < 100; k++)
            summe += exp(-1, k) * ( Math.pow(x, 2 * k + 1) / Uebung6.fakultaet(2 * k +1) );

        return summe;
    }

    // Aufgabe 3/4
    public static void Messreihe(boolean extended)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Anzahl der einzulesenden Werte: ");

        int c = s.nextInt(); // anzahl

        if(c < 1)
        {
            System.out.println("Fehler: Zu wenige Werte.");
            return;
        }

        double[] n = new double[c]; // noten
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, m = 0; // min, max, mittel

        for (int i = 0; i < c; i++) {
            System.out.print((i + 1) + ". Wert: ");
            n[i] = s.nextDouble();

            min = n[i] < min ? n[i] : min;
            max = n[i] > max ? n[i] : max;
            m += n[i];
        }

        System.out.printf("Kleinster Wert: %.2f\nGrößter Wert: %.2f\nArithmetischer Mittelwer: %.2f\n", min, max, m/c);

        if(extended) // A4
        {

        }
    }
}
