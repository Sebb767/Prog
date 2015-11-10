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

    // 
}
