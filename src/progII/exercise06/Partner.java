package exercise06;

// Alle Geschaeftspartner unseres Unternehmens (Kunden, Lieferanten,
// Spediteure, Mitarbeiter etc.) muessen als Unterklasse der
// abstrakten Klasse Partner implementiert werden, um auf einen
// gemeinsamen Satz von Methoden zurueckgreifen zu koennen.

// Warum ist diese Klasse abstrakt, obwohl gar keine abstrakte 
// Methode darin vorkommt? Vielleicht wollte der Implementierer
// sicherstellen, dass es keine Instanzen von Partner gibt, 
// sondern nur Unterklassen instanziiert werden koennen...

public abstract class Partner {
	
	private String name;  // Name des Partners
	private String city;  // Geschaefts-/Wohnort des Partners
	
	// Konstruktor
	public Partner(String name, String city)
	{
		this.name = name;
		this.city = city;
	}

	// Beschreibender String fuer den Partner
	public String toString()
	{
		return name + " " + city;
	}
	
}
