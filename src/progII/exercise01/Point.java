package exercise01;


// Die nachfolgende Klasse soll einen Punkt in einem zweidimensionalen
// Koordinatensystem repraesentieren.

public class Point {

	// A1
	private double x,y;
	
	// Konstruktor mit Uebergabe der x und y - Koordinate
	Point(double x, double y)
	{
		// A1
		this.x = x;
		this.y = y;
	}
	
	// Auslesen der x-Koordinate
	double getX()
	{
		return x; // A2
	}
	
	// Auslesen der y-Koordinate
	double getY()
	{
		return y; // A2
	}
	
	// Abstand zu einem anderen Punkt
	double distance(Point other)
	{
		return Math.sqrt(
					Math.pow(this.x-other.x, 2) +
					Math.pow(this.y-other.y, 2)
		);
	}
	
	// Erzeugung eines neuen Punktes, der zum Ausgangspunkt verschoben ist
	Point moved(double deltaX, double deltaY)
	{
		//hier fehlt die Implementierung
		// der Rueckgabewert ist ebenfalls fehlerhaft
		return new Point(this.x+deltaX, this.y+deltaY);
	}

	
	// **********************************************************
	// In der nachfolgenden Main-Methode werden einige Tests
	// ausgefuehrt, die bei korrekter Loesung keinen Fehler 
	// liefern sollten.
	
	public static void main(String[] args)
	{
		Point p1 = new Point(2, 3);
		
		System.out.println("Start der Tests...");
		
		if (Math.abs(p1.getX() - 2) > 0.1 )
			System.out.println ("x-Koordinate P1 fehlerhaft.");
		
		if (Math.abs(p1.getY() - 3) > 0.1 )
			System.out.println ("y-Koordinate P1 fehlerhaft.");
		
		Point p2 = p1.moved(-1, 2);
				
		if (Math.abs(p2.getX() - 1) > 0.1 )
			System.out.println ("x-Koordinate P2 fehlerhaft.");
				
		if (Math.abs(p2.getY() - 5) > 0.1 )
			System.out.println ("y-Koordinate P2 fehlerhaft.");

		double d = p1.distance(p2);
		
		if (Math.abs(d- Math.sqrt(5)) > 0.1)
			System.out.println ("Abstandsberechnung fehlerhaft (1).");

		if (Math.abs(p1.distance(p2) - p2.distance(p1)) > 0.1)
			System.out.println ("Abstandsberechnung fehlerhaft (2).");

		System.out.println("Testende");
		
	}

}
