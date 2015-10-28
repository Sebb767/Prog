import java.io.*;

/**
 * Created by sebb on 10/28/15.
 */
public class Uebung3 {

    public static void main()
    {

    }


    public static void zeichenanalyse()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char eingabe = br.read();

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


}
