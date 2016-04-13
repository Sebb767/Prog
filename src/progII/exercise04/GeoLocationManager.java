package exercise04;

// Dies ist das Interface zum GPS-Modul. Die Implementierung des
// NaviConInterface kann ueber dieses Interface Positionsdaten
// vom GPS-Modul abrufen.


public interface GeoLocationManager 
{
	// ************************************************************************
	// Mit dieser Methode kann die aktuelle Position aus dem GPS-Modul
	// ausgelesen und zurueckgegeben werden. Hinweis: Der Ursprung des 
	// Koordinatensystems des GPS-Moduls weicht von dem der Navi-Software
	// ab. Es ist eine Umrechnung notwendig (vgl. Uebungsblatt)
	
	// Vorbedingung: Die Implementierung ist bereits instanziiert.
	// (wird durch die Navi-Software sichergestellt, vgl. Uebungsblatt)
	public Point currentLocation() throws IllegalAccessException, InstantiationException;
	// Nachbedingung: 
	//    IllegalAccessException, falls kurzzeitig gestoert (vgl. Uebungsblatt)
	//    InstantiationException, falls Reset notwendig ist (vgl. Uebungsblatt)
	// ************************************************************************


}
