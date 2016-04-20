package cc.objectsanddatastructures.oo.shapes;

public class Square implements Shape
{
  double a;
  
  public Square(double a)
  {
    this.a = a;
  }

  @Override
  public double calculateArea()
  {
    return a * a;
  }
}
