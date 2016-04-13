package exercise02;

/**
 * Created by sebb on 3/30/16.
 */
public class Triangle implements Polygon
{
    private Point[] vertices;

    public Triangle(Point p1, Point p2, Point p3) {

        vertices = new Point[] { p1, p2, p3 };
    }

    @Override
    public Point[] allVertexes() {
        return vertices;
    }

    @Override
    public double perimeter() {
        double sum = 0;
        for (int i = 0; i < vertices.length; i++) {
            sum += vertices[i].distance(vertices[(i+1)%3]);
        }
        return sum;
    }

    @Override
    public double area() {
        double product = 1;
        double s = this.perimeter()/2;
        for (int i = 0; i < vertices.length; i++) {
            product *= s-vertices[i].distance(vertices[(i+1)%3]);
        }
        return Math.sqrt(s*product);
    }

    @Override
    public void move(double dx, double dy) {
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = vertices[i].moved(dx, dy);
        }
    }

    private void printPoints()
    {
        for (int i = 0; i < vertices.length; i++)
        { 
            System.out.printf("Point%d: (%.2f;%.2f)\n", i, vertices[i].getX(), vertices[i].getY());
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(new Point(1, 2), new Point(3, 4), new Point(1,3));
        t.printPoints();
        System.out.printf("Umfang: %f\nFläche %f\nBewege um (2|4) ...\n", t.perimeter(), t.area());
        t.move(2,4);
        t.printPoints();
    }
}
