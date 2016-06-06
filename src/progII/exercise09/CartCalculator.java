package exercise09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by proj on 6/6/16.
 */
public class CartCalculator extends AbstractCartCalculator {

    @Override
    public double totalPrice(InputStream i) {
        double s = 0;
        DataInputStream d = new DataInputStream(i);

        while (i != null)
        {
            try {
                d.readInt(); // Artiekelnr; don't care
                s += d.readInt() * d.readDouble();
            }
            catch (IOException e) {
                break;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        CartCalculator c = new CartCalculator();
        c.test();
    }
}
