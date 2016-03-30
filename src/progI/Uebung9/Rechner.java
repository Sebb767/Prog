package Uebung9;

/**
 * Created by sebb on 12/9/15.
 */
public class Rechner {

    public static void main(String[] args) {
        int v = args[args.length-1].equals("-") ? -1 : 1, r = Integer.valueOf(args[0]);
        for (int i = 1; i < args.length -1; i++) r += v*Integer.valueOf(args[i]);
        System.out.println(r);
    }

}
