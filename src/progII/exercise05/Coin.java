package exercise05;

// Nachfolgende Klasse ist eine Hilfsklasse, die die vorhandenen
// Muenztypen repraesentiert. Dazu stellt sie ein oeffentliches
// Array zur Verfuegung, in dem nacheinander alle Typen enthalten
// sind.


public class Coin {
	
	// Muenzen haben einen Namen und einen Wert
	private String _name;
	private int _value;
	
	// Konstruktor fuer einen Muenztyp
	public Coin(String name, int value)
	{
		_name = name;
		_value = value;
	}
	
	// Getter fuer den Namen
	public String getName()
	{
		return _name;
	}
	
	// Getter fuer den Wert
	public int getValue()
	{
		return _value;
	}

	// Das oeffentliche Array mit allen vorhandenen Muenztypen
	// sortiert nach ihrem Wert
	public static Coin[] availableCoins = new Coin[] {
		new Coin("1-Cent", 1),
		new Coin("2-Cent", 2),
		new Coin("5-Cent", 5),
		new Coin("10-Cent", 10),
		new Coin("20-Cent", 20),
		new Coin("50-Cent", 50),
		new Coin("1-Euro", 100),
		new Coin("2-Euro", 200),
	};

}
