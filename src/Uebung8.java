import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sebb on 12/2/15.
 */
public class Uebung8 {

    // Aufgabe 1
    public static void Lottoziehung()
    {
        int[] z = new int[6];

        for(int i = 0; i < 6; i++)
        {
            z[i] = (int)(Math.random() * 49) +1;

            for(int k = 0; k < i; k++) if(z[i] == z[k]) i--;
        }

        for (int offset = 0; offset < 5; offset++)
        {
            int minIndex = offset, sv;
            for (int i = offset; i < 6; i++) if(z[i] < z[minIndex])  minIndex = i;

            sv = z[minIndex];
            z[minIndex] = z[offset];
            z[offset] = sv;
        } //*/

        System.out.print("Die Lottozahlen sind");
        for (int f:z) System.out.printf(" %d", f);
        System.out.println();
    }

    // Aufgabe 2
    public static String spielen(String w)
    {
        String r = "";
        for(char c:w.toCharArray()) switch(c) {
            case 'a':
                r += "aba";
                break;
            case 'i':
                r += "ibi";
                break;
            case 'e':
                r += "ebe";
                break;
            case 'o':
                r += "obo";
                break;
            case 'u':
                r += "ubu";
                break;
            default:
                r += c;
        }
        return r;
    }

    // Aufgabe 3
    public static void main(String[] args)
    {
        if(args.length < 2)
        {
            System.out.println("Usage: java Uebung8.class Zahl1 Zahl2");
            return;
        }

        int i1 = Integer.parseInt(args[0]), i2 = Integer.parseInt(args[1]);
        System.out.printf("%d * %d = %d\n", i1, i2, i1 * i2);
    }

    // Aufgabe 4
    public static void Galgenmaenchen()
    {
        String w = ggm.wordlist[(int) (Math.random() * ggm.wordlist.length)].toUpperCase();

        ArrayList<Character> word =  new ArrayList<>(),
                found = new ArrayList<>();
        for(char c : w.toCharArray())  word.add(c);

        try {
            for (int i = 1; i < 16; i++) {
                String out = "";
                for (char c : word) out += found.contains(c) ? " " + c  : " _";

                if (out.indexOf('_') < 0) {
                    System.out.printf("Geschafft! Versuche: %d; Wort: %s", i - 1, w);
                    return;
                }

                System.out.printf("%2d. Versuch:%s (bitte Zeichen eingeben)", i, out);
                found.add((new Scanner(System.in)).next().toUpperCase().toCharArray()[0]);
            }

            throw new Exception();
        }
        catch(Exception e) {
            System.out.printf("Verloren :( Wort: %s", w);
        }

    }
}
