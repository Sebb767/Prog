package exercise06;

/**
 * Created by sebb on 5/14/16.
 */
public class Customer extends Partner implements GoodsSink {
    protected int delivered = 0;

    public Customer(String name, String city) {
        super(name, city);
    }

    @Override
    public void receive(int count) {
        delivered += count;
    }

    @Override
    public String toString() {
        return "Kunde: " + super.toString();
    }

    public void sendInvoice() {
        System.out.printf("%s\ngeliefert: %d\n\n", this.toString(), delivered);
        delivered = 0;
    }
}
