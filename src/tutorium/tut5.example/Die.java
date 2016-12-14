package tut5.example;

/**
 * Created by sebb on 12/14/16.
 */
public class Die {

    protected int val;


    public static void main(String[] args) {

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
