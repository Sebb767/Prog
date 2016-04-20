package cc.objectsanddatastructures.oo.shapes;

/**
 * Created by sebb on 4/20/16.
 */
public class Rectangle implements Shape {
    private double a,b;

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * a + 2 *b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
