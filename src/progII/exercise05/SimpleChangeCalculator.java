package exercise05;

// Die nachfolgende Klasse beinhaltet einen sehr einfachen
// Algorithmus zur Ermittlung des Wechselgelds: Es wird
// der gesamte Betrag in 1-Cent-Muenzen ausgegeben.

public class SimpleChangeCalculator 
{
	
	// Mit Hilfe des Rueckgabewerts der nachfolgenden Methode
	// wird der Muenzausgabemechanismus des Automaten gesteuert.
	// An der Stelle 0 des Arrays steht, wie viele 1-Cent-Muenzen
	// ausgegeben werden sollen, an der Stelle 1, wie viele 2-Cent-
	// Muenzen usw. bis zu den 2-Euro-Muenzen an der Stelle 7.
	//
	// Der Softwarevertrag dieser Methode lautet, dass der Wert der
	// zurueckgegebenen Muenzen genau dem Wert entsprechen muss, der
	// als Parameter uebergeben wird. Im Gegenzug sichert der
	// Aufrufer zu, dass
	//   a) keine negativen Werte uebergeben werden
	//   b) der Cent-Parameter keinen Wert > 99 annimmt

	public int[] getChange(int euros, int cent)
	{
		return new int[] {
			euros * 100 + cent, // alles in 1-Cent-Muenzen
			0,					// keine 2-Cent-Muenzen
			0,					// keine 5-Cent-Muenzen
			0,					// keine 10-Cent-Muenzen
			0,					// keine 20-Cent-Muenzen
			0,					// keine 50-Cent-Muenzen
			0,					// keine 1-Euro-Muenzen
			0					// keine 2-Euro-Muenzen
		};
				
	}//endmethod getChange
	
}// endclass SimpleChangeCalculator
