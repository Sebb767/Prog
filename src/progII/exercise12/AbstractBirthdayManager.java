package exercise12;

import java.util.*;

// Diese abstrakte Klasse beschreibt, welche Funktionalitaet
// eine konkrete Geburtstagsverwaltung besitzen muss.

public abstract class AbstractBirthdayManager {

	// In diesem assoziativen Array sollen alle verwalteten Geburtstage
	// abgelegt werden. Der Zugriffsschluessel ist der Name des
	// Geburtstagskinds.
	protected Map<String, Birthday> map = new HashMap<String, Birthday>();

	// Mit dieser Methode wird ein Geburtstag in die Verwaltung aufgenommen.
	// Der im Birthday-Objekt verwendete Name ist eindeutig, d.h. Sie koennen
	// sich darauf verlassen, dass der gleiche Name nicht zweimal eingefuegt wird
	// (es sei denn, der alte Wert soll ueberschrieben werden)
	abstract void addBirthday(Birthday b);
	
	// Mit dieser Methode wird ein Geburtstagsobjekt aus der Verwaltung ausgelesen.
	// Zugriffsschluessel ist der (eindeutige) Name des Geburtstagskinds.
	// Ist der Name nicht in der Verwaltung enthalten, soll null zurueckgeliefert 
	// werden.
	abstract Birthday getBirthday(String name);
	
	// Diese Methode ermittelt alle Personen, die am gleichen Tag wie die 
	// uebergebene Person Geburtstag haben. Das Jahr bleibt dabei unberuecksichtigt.
	// Zurueckgegeben wird ein Array der Namen der Geburtstagskinder 
	// (inkl. der angefragten Person, sofern sie in der verwaltung bekannt ist)
	abstract String[] getNamesOfPeopleWithPartyOnSameDayAs(String name);
	
	// Alle Geburtstage aus der Verwaltung werden sortiert nach ihrer
	// Abfolge im Kalenderjahr zurueckgegeben 
	// Geburttagskinder, die am gleichen Tag Geburtstag haben, werden
	// nach aufsteigendem Alter geliefert (d.h. der Aelteste zuerst)
	abstract Birthday[] allBirthdaysSortedByDay();
	
}
