import java.io.*;

/**
 * Created by sebb on 10/28/15.
 */
public class Uebung3 {

    public static void main()
    {
        Sieben();
        zeichenanalyse();
        Wuerfel();
    }

    // Aufgabe 1
    public static void Sieben()
    {
        try {
            System.out.println("Die Eingabe ist "+(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine())%7==0?"":"nicht ")+"durch 7 teilbar.");
        }
        catch (Exception e) {} // idc
    }


    // Aufgabe 3
    public static void zeichenanalyse()
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char eingabe = (char)br.read();

            String ausgabe = "\n";

            if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(eingabe) != -1)
               ausgabe += "Großbuchstabe\n";

            if("0123456789abcdefABCDEF".indexOf(eingabe) != -1)
                ausgabe += "Hexdezimale Ziffer\n";

            if(eingabe == '0' || eingabe == '1')
                ausgabe += ("binäre Ziffer\n");

            if("012345678".indexOf(eingabe) != -1)
                ausgabe += ("oktale Ziffer\n");

            if(ausgabe.length() == 1)
                System.out.println("\nUnbekannt");
            else
                System.out.print(ausgabe);
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
