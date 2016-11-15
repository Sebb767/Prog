package exercise12;

// Diese Klasse repraesentiert den Geburtstag einer Person.
// Die dazu notwendigen Attribute sind bereits private vereinbart.
// Zum Auslesen sind entsprechende Getter-Methoden vorhanden.

public class Birthday implements Comparable<Birthday> {

	// private Attribute
		private String name;
		private int day;
		private int month;
		private int year;
	
	// Konstruktor
		public Birthday(String name, int day, int month, int year) {
			this.name = name;
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
	// Getter-Methoden
		public String getName() {
			return name;
		}
		
		public int getDay() {
			return day;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
		
	// Textuelle Darstellung eines Geburtstags 
		public String toString() {
			return name + " hat am " + day + "." + month + "." + year + " Geburtstag.";
		}
		
	// Diese Methode ueberprueft, ob zwei Personen am gleichen Tag Geburtstag haben.
	// Das Jahr bleibt unberuecksichtigt, d.h. die Personen koennen unterschiedliches
	// Alter haben.
		boolean sameDay(Birthday other) {
			return ((this.day == other.day) && (this.month == other.month));
		}

	// Um alphabetische Listen der Geburtstagskinder erstellen zu koennen, ist
	// diese Ordnungsrelation notwendig, die auf den Namen abhebt. 
		@Override
		public int compareTo(Birthday other) {
			return this.name.compareTo(other.name);
		}
		
}
