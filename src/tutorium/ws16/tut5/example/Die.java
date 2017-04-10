package ws16.tut5.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sebb on 12/14/16.
 */
public class Die {

    protected int val;

    private static class DieSorter implements Comparator<Die>
    {
        @Override
        public int compare(Die o1, Die o2) {
            return (new Integer(o1.getVal())).compareTo(o2.getVal());
        }
    }


    public static void main(String[] args) {
        Die[] mydice = new Die[3];
        for (int i = 0; i < 3; i++) {
            mydice[i] = Die.RandomDie();
        }

        Arrays.sort(mydice, new DieSorter());

        for(Die d : mydice)
            System.out.printf("Würfel mit dem Wert %d.\n", d.getVal());
    }

    // std Zeug

    public static Die RandomDie()
    {
        return new Die((int)(Math.random() * 6) + 1);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Die(int val) {
        assert(val <= 6);
        assert(val >= 1);
        this.val = val;
    }


}
