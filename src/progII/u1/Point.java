package exercise01;


// Die nachfolgende Klasse soll einen Punkt in einem zweidimensionalen
// Koordinatensystem repraesentieren.

public class Point {
	
	// Konstruktor mit Uebergabe der x und y - Koordinate
	Point(double x, double y)
	{
		// hier fehlt die Implementierung des Konstruktors
	}
	
	// Auslesen der x-Koordinate
	double getX()
	{
		// der folgende Rueckgabewert ist fehlerhaft
		return 0; 
	}
	
	// Auslesen der y-Koordinate
	double getY()
	{
		// der folgende Rueckgabewert ist fehlerhaft
		return 0; 
	}
	
	// Abstand zu einem anderen Punkt
	double distance(Point other)
	{
		// hier fehlt die Implementierung
		// der Rueckgabewert ist natuerlich fehlerhaft
		return 0;
	}
	
	// Erzeugung eines neuen Punktes, der zum Ausgangspunkt verschoben ist
	Point moved(double deltaX, double deltaY)
	{
		//hier fehlt die Implementierung
		// der Rueckgabewert ist ebenfalls fehlerhaft
		return new Point(0.0, 0.0);
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
			System.out.println ("Abstandsberechnung fehlerhaft.");

		if (Math.abs(p1.distance(p2) - p2.distance(p1)) > 0.1)
			System.out.println ("Abstandsberechnung fehlerhaft.");		

		System.out.println("Testende");
		
	}

}
