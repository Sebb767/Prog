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

        for(int rest = in; rest > 0; rest /= 10)
            querprodukt *= rest%10;

        System.out.printf("Das Querprodukt der Zahl %d betraegt %d.\n", in, querprodukt);
    }
}
