package exercise06;

// Eine Abgabestelle fuer Material muss das nachfolgende Interface
// GoodsSource (=Materialquelle) implementieren.

public interface GoodsSource {
	
// Da nicht sichergestellt ist, dass das angeforderte Material in
// jedem Fall geliefert werden kann, ist der Rueckgabewert der Methode
	boolean deliver(int count);
// ein BOOLEAN:		true  -> Auslieferung hat stattgefunden
//					false -> Keine Auslieferung
	
}
