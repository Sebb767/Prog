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

        for (int k = 0; k < 100; k++) {
            System.out.printf("f(%d) = %.2f\n",k, exp(-1, k) * (Math.pow(x, 2 * k + 1) / Uebung6.fakultaet(2 * k + 1)));
            summe += exp(-1, k) * (Math.pow(x, 2 * k + 1) / Uebung6.fakultaet(2 * k + 1));
        }

        return summe;
    }

    // Aufgabe 3/4
    public static void Messreihe(boolean extended)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Anzahl der einzulesenden Werte: ");

        int c = s.nextInt(), i; // anzahl

        if(c < 1)
        {
            System.out.println("Fehler: Zu wenige Werte.");
            return;
        }

        double[] n = new double[c]; // noten
        double v = Double.MAX_VALUE, b = Double.MIN_VALUE, m = 0, u = 0; // v, b, mittel, stdabweichung

        for (i = 0; i < c; i++) {
            System.out.print((i + 1) + ". Wert: ");
            n[i] = s.nextDouble();

            v = n[i] < v ? n[i] : v;
            b = n[i] > b ? n[i] : b;
            m += n[i];
        }

        m /= c;

        System.out.printf("Kleinster Wert: %.2f\nGrößter Wert: %.2f\nArithmetischer Mittelwer: %.2f\n", v, b, m);

        if(extended) // A4
        {
            for (int k = 0; k < c; k++) u += exp(n[k] - m,2);
            System.out.printf("Standardabweichung: %.2f\n", Math.sqrt(u/n.length));
        }
    }
}
