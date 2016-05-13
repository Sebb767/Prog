package exercise06;

/**
 * Created by sebb on 5/14/16.
 */
public class Stock implements GoodsSink, GoodsSource {
    int stock = 0;

    @Override
    public void receive(int count) {
        stock += count;
    }

    @Override
    public boolean deliver(int count) {
        if(stock >= count)
        {
            stock -= count;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Im Lager: " + stock;
    }
}
