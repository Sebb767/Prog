import java.util.ArrayList;
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

        for (int o = 0; o < 5; o++)
        {
            int m = o, s;
            for (int i = o; i < 6; i++) if(z[i] < z[m])  m = i;

            s = z[m];
            z[m] = z[o];
            z[o] = s;
        } //*/

        System.out.print("Die Lottozahlen sind");
        for (int f:z) System.out.printf(" %d", f);
        System.out.println();
    }

    // Aufgabe 2
    public static String spielen(String w)
    {
        String r = "";
        for(char c:w.toCharArray()) switch(Character.toLowerCase(c)) {
            case 'a':  case 'i':
            case 'e':
            case 'o':
            case 'u':
                r += c+"b"+Character.toLowerCase(c);
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
        String w = ggm.wordlist[(int) (Math.random() * ggm.wordlist.length)].toUpperCase(), o = "";

        ArrayList<Character> v =  new ArrayList<>(),
                q = new ArrayList<>();
        for(char c : w.toCharArray())  v.add(c);

        try {
            for (int i = 1; i < 16; i++) {
                for (char c : v) o += q.contains(c) ? " " + c  : " _";

                if (o.indexOf('_') < 0) {
                    System.out.printf("Geschafft! Versuche: %d; Wort: %s", i - 1, w);
                    return;
                }

                System.out.printf("%2d. Versuch:%s (bitte Zeichen eingeben)", i, o);
                q.add((new Scanner(System.in)).next().toUpperCase().toCharArray()[0]);
            }

            throw new Exception();
        }
        catch(Exception e) {
            System.out.printf("Verloren :( Wort: %s", w);
        }

    }
}
