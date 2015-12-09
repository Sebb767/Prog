package Uebung9;

/**
 * Created by sebb on 12/9/15.
 */
public class Main {

    // A2
    public static void main(String[] args) {
        Auto[] autos = new Auto[]{
                new Auto("VW", "Polo", "Weis", 85, 123),
                new Auto("BMW", "M4", "Schwarz", 460, 321),
                new Auto("Ford", "Christenfisch", "Rot", 1, 1)
        };

        int max = -1, idx = -1;
        for (int i = 0; i < autos.length; i++) if (autos[i].getHubraum() > max)
        {
            max = autos[i].getHubraum();
            idx = i;
        }
        System.out.println(autos[idx]);
    }
}
