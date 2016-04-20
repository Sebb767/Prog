package cc.objectsanddatastructures.proc.shapes;

public class ShapeCalculator {
    public static double calculateArea(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.a * s.a;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return c.r * c.r * Math.PI;
        } else if (shape instanceof Square) {
            Rectangle r = (Rectangle) shape;
            return r.a * r.b;
        }
        throw new NoSuchShapeException("Given object is no known shape.");
    }

    public static double calculatePerimeter(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.a * 4;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return 2 * c.r * Math.PI;
        } else if (shape instanceof Square) {
            Rectangle r = (Rectangle) shape;
            return r.a * 2 + r.b * 2;
        }
        throw new NoSuchShapeException("Given object is no known shape.");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 5;
        double area = calculateArea(c);
        System.out.println(area);
    }
}
