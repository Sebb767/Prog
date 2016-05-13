package exercise06;

/**
 * Created by sebb on 5/14/16.
 */
public class Vendor extends Partner implements GoodsSource {
    public Vendor(String name, String city) {
        super(name, city);
    }

    @Override
    public boolean deliver(int count) {
        return true;
    }
}
