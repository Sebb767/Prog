package exercise06;

// Eine Annahmestelle fuer Material muss das nachfolgende Interface
// GoodsSink (=Materialsenke) implementieren.

public interface GoodsSink {
	
// Einzige Funktionalitaet einer Materialsenke ist die Annahme
// von Material in beliebiger Menge. Dies soll durch die Methode
	void receive(int count);
// gewaehrleistet werden. Es wird angenommen, dass immer
// ausreichend Lagerplatz vorhanden ist, so dass das Entgegen-
// nehmen des Materials nicht scheitern kann.
	
}
