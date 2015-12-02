import java.util.Scanner;

/**
 * Created by sebb on 11/4/15.
 */
public class Uebung4 {

    // Aufgabe 1a
    public static void Fallgeschwindigkeit_a()
    {
        Fallgeschwindigkeit(1);
    }

    // Aufgabe 1b
    public static void Fallgeschwindigkeit_b()
    {
        Fallgeschwindigkeit(5);
    }

    // Aufgabe 1a+b
    private static void Fallgeschwindigkeit(int intervall)
    {
        System.out.print("Bitte geben Sie die Fallzeit in Sekunden ein: ");
        int max = (new Scanner(System.in)).nextInt();
        for(int i = 0; i <= max; i++)
        {
            if(intervall == 1 || i % intervall == 1)
                System.out.printf("Zeit: %d Sekunden: Zurückgelegte Strecke: %5.2f m\n", i, (4.905 * i * i));
        }
    }

    // Aufgabe 2
    public static void Reihe()
    {
        double now = 0;

        // (1/k^2) < 10^-5
        // => k > sqrt(10^5)
        // => k > 316.227766
        // => k > 317
        for (int i = 1;i <= 317; i++) {
            now += 1./(i*i);
            System.out.println(i + " --> " + 6*now);
        }
        System.out.println("Abgebrochen wegen zu kleiner Veränderung.");
    }

    // Aufgabe 3
    public static void _1x1()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %d\n", i, j, i * j);
            }
        }
    }

    // Aufgabe 4
    public static void isPrime()
    {
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int n = (new Scanner(System.in)).nextInt();

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) { // teilbar
                System.out.printf("Untersuchte Zahl ist keine Primzahl.\n");
                return;
            }
        }

        System.out.printf("Untersuchte Zahl ist eine Primzahl.\n");
    }
}
