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
    public static int exp(int basis, int zaehler)
    {
        if(zaehler == 0)
            return 1;

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
    public static void Notenspiegel(boolean extended)
    {

    }
}
