import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by sebb on 10/28/15.
 */
public class Uebung3 {

    public static void main(String[] Args)
    {
        Sieben();
        Pizzarechner();
        zeichenanalyse();
        Wuerfel();
    }

    // Aufgabe 1
    public static void Sieben()
    {
        System.out.print("Eine Zahl eingeben: ");
        try {
            System.out.println("Die Eingabe ist "+((new Scanner(System.in)).nextInt()%7==0?"":"nicht ")+"durch 7 teilbar.");
        }
        catch (Exception e) {} // idc
    }

    // Aufgabe 2
    public static void Pizzarechner()
    {
        try
        {
            double p[] = new double[4];
            for(int i : new int[]{0,1,2,3})
            {
                System.out.print((i%2==0 ? "Durchmesser" : "Preis") + ": ");
                p[i] = (new Scanner(System.in)).nextDouble();
            }
            System.out.println("Pizza " + (((((2*Math.PI*p[0]*p[0])/p[1])-((2*Math.PI*p[2]*p[2])/p[3])) + "").indexOf("-") + 2) + " ist besser.");
        }
        catch (Exception e) {} // idc
    }

    // Aufgabe 3
    public static void zeichenanalyse ()
        {
            System.out.print("Ein Zeichen eingeben: ");
        try {
            char eingabe = (char)System.in.read();

            String ausgabe = "\n";

            if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(eingabe) != -1)
               ausgabe += "Großbuchstabe\n";

            if("0123456789abcdefABCDEF".indexOf(eingabe) != -1)
                ausgabe += "Hexdezimale Ziffer\n";

            if(eingabe == '0' || eingabe == '1')
                ausgabe += ("binäre Ziffer\n");

            if("012345678".indexOf(eingabe) != -1)
                ausgabe += ("oktale Ziffer\n");

            System.out.println(ausgabe.length() == 1 ? "\nUnbekannt" : ausgabe);
        }
        catch (Exception e) {} // idc
    }

    // Aufgabe 4
    public static void Wuerfel()
    {
        int wurf = (int)Math.floor(Math.random() * 6.);

        String[] ausgabe = new String[] {
                "Eins",
                "Zwei",
                "Drei",
                "Vier",
                "Fünf",
                "Sechs"
        };

        System.out.println(ausgabe[wurf] + " gewürfelt.");
    }

}
