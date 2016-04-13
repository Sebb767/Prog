package exercise04;

// Die Klasse TestProgram dient dazu, das Verhalten der Implementierung der
// Klasse NaviCon zu testen. Dazu wird in der main-Methode das Navi-System
// und in der Methode currentLocation das GPS-Modul simuliert.


public class TestProgram implements GeoLocationManager {
	
	// Laeuft das GPS-Modul noch, oder ist ein Reset faellig?
	private boolean running = true;
	
	// Ganzzahlige Zufallszahl
	private static int randomNumber(int max)
	{
		return (int) (Math.random()*max + 1);
	}
	
	// Simulation des GPS-Moduls
	public Point currentLocation() throws IllegalAccessException, InstantiationException
	{
		// Wir wuerfeln...
		switch (randomNumber(6))
		{
		case 1: // ... bei 1 haben wir kurzzeitige Probleme
			throw new IllegalAccessException();
		case 2: // ... bei 2 brauchen wir ein Reset
			running = false;
		default:
			if (!running) // ... falls wir Reset brauchen -> Exception
				throw new InstantiationException();
			// ... alles gut: wir geben eine zufaellige Position zurueck
			return new Point(Math.random()*100, Math.random()*100);			
		}
	}
		
	
	// Simulation der Navi-Software
	public static void main(String[] args)
	{
		// Instanziierung unserer Implementierung
		NaviCon navi = new NaviCon();

		// Wir starten die Abfragen natuerlich, ohne vorher eine
		// Referenz gesetzt zu haben ;-)
		System.out.println("Starting NaviCon without Initialization.");
		
		// Insgesamt 100 Anfragen...
		for (int i=0; i<100; i++)
		{
			Point p = null;
			try {
				System.out.println("Requesting Position " + i);
				// Abfrage der Position
				p = navi.getCurrentPosition();
				System.out.println("Received Position " + p.toString());
			} catch (NullPointerException e) {
				// Bei NullPointerException: Ok, jetzt initialisieren wir halt
				System.out.println("*** NullPointerException with Message: " + e.getMessage());
				System.out.println("  Now initializing NaviCon");
				navi.setGeoLocationManager(new TestProgram());
			} catch (InstantiationException  e) {
				// Bei InstantiationException: Reset gefordert, machen wir...
				System.out.println("*** InstantiationException");
				System.out.println("  Now renewing NaviCon");
				navi.setGeoLocationManager(new TestProgram());
			} catch (Throwable  e) {
				// Andere Exception sollte es eigentlich nicht geben
				System.out.println("*** Unknown Exception");
				System.out.println("  " + e.toString());
			}
		}
	}
	
}
