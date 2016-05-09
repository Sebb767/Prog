package exercise06;

// Instanzen dieser Klasse repraesentieren Materialbuchungssaetze. 
// Sie beschreiben im Detail, wieviel Material von wo nach wohin
// bewegt werden soll.

public class MovementRecord 
{
	GoodsSource source;  // Abgebende Stelle
	GoodsSink sink;      // Empfangende Stelle
	int count;           // Anzahl
	boolean done;        // Kennzeichen, ob Buchung durchgefuehrt
	
	// Konstruktor
	public MovementRecord(GoodsSource source, GoodsSink sink, int count)
	{
		this.source = source;
		this.sink = sink;
		this.count = count;
		this.done = false;
	}
	
	// Beschreibender String fuer den Buchungssatz
	public String toString()
	{
		return source.toString() + " > " + sink.toString() + " " +
				"Anzahl: " + count + " " +
				(done ? "ausgefuehrt" : "nicht ausgefuehrt");
	}
	
	// Zentraler Algorithmus fuer die Verbuchung
	public boolean book()
	{
		// Bereits gebuchte Saetze werden nicht noch einmal gebucht.
		if (done) return false;  
		
		// Nur wenn die abgebende Stelle lieferfaehig ist...
		if (!source.deliver(count))
			done = false;
		else
		{
		   // ...wird auch der Zugang bei der empfangenden Stelle gebucht.
		   sink.receive(count);
		   done = true;
		}
		
		// Ausgabe der Buchung auf der Konsole
		System.out.println(this.toString());
		return done;
	}
	
	
	public static void main(String[] args)
	{
		

		Vendor v1 = new Vendor("Lukas", "Hamburg");
		Vendor v2 = new Vendor("Landgraf", "Berlin");
		
		Customer c1 = new Customer("Kaiser", "Frankfurt");
		Customer c2 = new Customer("Kiefer", "Stuttgart");
		
		Stock s = new Stock();
		
		new MovementRecord(v1, s, 100).book();
		new MovementRecord(s, c1, 80).book();
		new MovementRecord(s, c2, 10).book();
		new MovementRecord(s, c1, 10).book();
		new MovementRecord(s, c1, 20).book();
		new MovementRecord(v2, s, 50).book();
		new MovementRecord(s, c1, 20).book();
		
		c1.sendInvoice();
		c2.sendInvoice();

	}
	
}
