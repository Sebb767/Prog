import java.util.Scanner;

/**
 * Created by sebb on 11/10/15.
 */
public class Uebung5 {

    // Aufgabe 1
    public static void Temperaturtabelle()
    {
        System.out.println("Farenheit\tCelsius");

        for (int i = 0; i <= 300; i++)
            System.out.printf("%d°F\t%3.2f°C\n", i, (5./9) * (i-32));
    }

    // Aufgabe 2
    public static void Querprodukt()
    {
        int in = -1,
            querprodukt = 1;

        do {
            try
            {
                System.out.print("Geben Sie bitte eine Zahl ein: ");

                // recreating clears the buffer :)
                in = (new Scanner(System.in)).nextInt();

                if(in < 0 || in > 1000000)
                    throw new Exception();

                break;
            }
            catch (Exception e)
            {
                System.out.println("FEHLER – Zahl ist ungueltig.");
            }

        } while (in < 0 || in > 1000000); // the clause is actually useless. But - while(true) is bad.

        if(in == 0)
		querprodukt = 0;
	else for(int rest = in; rest > 0; rest /= 10)
            		querprodukt *= rest%10;

        System.out.printf("Das Querprodukt der Zahl %d betraegt %d.\n", in, querprodukt);
    }

    // Aufgabe 4
    public static void Potenz()
    {
        System.out.print("Bitte geben Sie die Basis ein: ");
        double a = (new Scanner(System.in)).nextDouble(),
            ergebnis = 1;

        System.out.print("Bitte geben Sie den Exponent ein: ");
        int b = (new Scanner(System.in)).nextInt();

        for (int i = 0; i < b; i++)
            ergebnis *= a;

        if(b < 0)
            ergebnis = 1 / ergebnis;

        System.out.println("Das Ergebnis ist: "+ergebnis);
    }
}
