package exercise09;

// Fuer die Nutzung von Streams ist das Einbinden des Package
// java.io.* notwendig
import java.io.*;

// Die abstrakte Klasse AbstractCartCalculator beinhaltet zum
// einen die abstrakte Methodensignatur der in der Unterklasse zu
// implementierenden Methode, und zum anderen eine Testmethode,
// mit der die Loesung vorab ueberprueft werden kann.
public abstract class AbstractCartCalculator 
{
	
	// Dies ist die abstrakte Methode, die in der Unterklasse
	// implementiert werden muss. Mit Hilfe des als Parameter
	// uebergebenen InputStreams koennen die Positionsdaten
	// des Warenkorbs ausgelesen werden.
	abstract public double totalPrice(InputStream in);
	
	
	// Die nachfolgende Testmethode kann verwendet
	// werden, um die eigene Implementierung zu testen. Zu diesem
	// Zweck wird ein Testfall aufgebaut, der Implementierung
	// uebergeben, und das zurueckgegebene Ergebnis ueberprueft.
	// Ein korrektes Ergebnis in diesem Testfall garantiert nicht,
	// dass auch alle anderen Testfaelle korrekt geloest werden.
	public void test()
	{		
		// Zunaechst wird ein Tripel kodiert in einem ByteArray
		// abgelegt. Dazu wird ein ByteArrayOutputStream
		// verwendet, der mit einem DataOutputStream dekoriert
		// wird.
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		
		// Schreiben von nur einem Tripel
		try {
			dos.writeInt(4711); 		// Artikelnummer
			dos.writeInt(2); 		// Anzahl
			dos.writeDouble(4.99); 	// Stueckpreis
			dos.close();
		} catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return;
		}
		
		// Auslesen des generierten Byte-Arrays... 
		byte[] bytes = baos.toByteArray();
		
		// ...und Anlegen eines InputStreams, mit dem dieses
		// Byte-Array wieder ausgelesen werden kann.
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		
		// Aufruf der Implementierung mit dem vorbereiteten Stream
		double total = this.totalPrice(bais);
		
		// Pruefen, ob das Ergebnis der Erwartung entspricht.
		if (Math.abs(total - 2 * 4.99)>0.1)
			System.out.println("Fehlerhafte Rechnung!");
		else
			System.out.println("Richtiges Ergebnis!");	
	}
	

}
