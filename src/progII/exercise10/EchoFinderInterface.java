package exercise10;

import java.io.*;

// Das nachfolgende Interface beschreibt eine oeffentliche Schnittstelle,
// mit deren Hilfe ein Character-Stream zeilenweise gelesen und auf
// unmittelbar aufeinanderfolgende gleiche Zeilen ueberprueft werden kann.

public interface EchoFinderInterface
{	
    // Die nachfolgende Methode liest den uebergebenen Stream zeilenweise.
	// Besitzen zwei aufeinanderfolgende Zeilen den gleichen Inhalt,
	// wird das Lesen abgebrochen und die letzte Zeile zurueckgegeben.
	// Wird das Ende des Streams erreicht, ohne zwei aufeinanderfolgende Zeilen
	// mit gleichem Inhalt gefunden zu haben, wird null zurueckgegeben.
	public abstract String getPair(BufferedReader bufRead);

	// Eine moegliche Quelle fuer zeilenweise Eingaben ist der
	// Standardeingabestrom (System.in). Die nachfolgende Methode
	// gibt diesen Strom als gepufferten Character-Stream zurueck.
	public abstract BufferedReader getSystemInAsBufferedReader();
}
