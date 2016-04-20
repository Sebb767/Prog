package cc.objectsanddatastructures.oo.shapes;

public class ShapeCalculator
{
  public static void main(String[] args)
  {
    Circle c = new Circle(5);
    double area = c.calculateArea();
    System.out.println(area);
  }
}
