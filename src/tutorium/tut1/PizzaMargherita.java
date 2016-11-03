package tut1;

/**
 * Created by proj on 11/3/16.
 */
public class PizzaMargherita extends Pizza {
    protected int groeße;

    public PizzaMargherita(int groeße) {
        this.groeße = groeße;
    }

    @Override
    public double getPreis() {
        return groeße - 22;
    }
}
