package exercise07;

// Das nachfolgende Interface beschreibt die oeffentliche 
// Schnittstelle eine FIFO-Queue (First In, First Out).

public interface Queue<T> 
{
	//************************************************************************
	// Neue Elemente werden mittels
	void enqueue(T element) throws IllegalAccessException;	
	// in die Warteschlange hinten eingereiht. Sollte kein Platz mehr 
	// vorhanden sein, wird eine IllegalAccessException geworfen.
	//************************************************************************
	
	//************************************************************************
	// Das vorderste Element der Warteschlange kann mit Hilfe von
	T dequeue();
	// aus der Schlange entfernt werden. Rueckgabewert ist dieses Element.
	// Sollte die Schlange leer sein, wird null zurueckgegeben.
	//************************************************************************

	//************************************************************************
	// Moechte man nur mal nachsehen, was als naechstes kaeme, kann dies mit
	T front();
	// errreicht werden. Im Gegensatz zu dequeue bleibt die Schlange 
	// unveraendert. Bei einer leeren Schlange wird ebenfalls null geliefert.
	//************************************************************************
	
	//************************************************************************
	// Ein einfacher Test, ob die Schlange leer ist, wird durch
	boolean empty();
	// realisiert. Bei einer leeren Schlange wird true zurueckgegeben,
	// sonst false.
	//************************************************************************
}
