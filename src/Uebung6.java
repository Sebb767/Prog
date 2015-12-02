/**
 * Created by sebb on 11/16/15.
 */
public class Uebung6 {

    // Aufgabe 1
    public static double PiAnnaeherung(int rechtecke)
    {
        if(rechtecke <1)
            return -1;
        else if(rechtecke == 1)
            return 1;

        double fl = 0, x = (1./rechtecke); // fläche

        for (int i = 1; i <= rechtecke; i++)
            fl += x * Math.sqrt(1 - pow(i*x, 2));

        return (4*fl);
    }

    // Aufgabe 2 a
    public static int round(double in)
    {
        int num = (int)in;
        return (in - num) < 0.5 ? num : ++num;
    }

    // Aufgabe 2 b
    public static double round(double in, int precision)
    {
        return ((long)pow(10, precision)) / pow(10, precision);
    }

    // Helfer zu 2b
    public static double pow(double base, int exp)
    {
        double res = 1;

        for (int i = 0; i < exp; i++)
            res *= base;

        return res;
    }

    // Aufgabe 3
    public static double fakultaet(int base)
    {
        double res = base;
        while(--base > 0)
            res *= base;

        return res;
    }

    // Aufgabe 4
    public static void Dreieck(int hoehe)
    {
        for (int i = hoehe < 0 ? Math.abs(hoehe) +1 : 0; hoehe < 0 ? --i > 0 : ++i <= hoehe ;) {
            System.out.println(
                new String(new char[Math.abs(hoehe)-i]).replace("\0", " ") +
                new String(new char[i*2]).replace("\0\0", "* ")
            );
        }
    }
}
