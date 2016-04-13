package exercise04;

// Dies ist das Interface zur Navigationssoftware. Die Methoden werden
// von der Navi-Software aufgerufen und muessen von der Implementierung
// des NaviConInterface bereit gestellt werden. 

public interface NaviConInterface {

	// ************************************************************************
	// Vor dem Zugriff auf das GPS-Modul benoetigt die Implementierung
	// eine Referenz auf das Modul. Diese Referenz wird durch diese
	// Methode gesetzt. Vor dem ersten Setzen ist die Referenz undefiniert.
	
	// Hinweis fuer Interessierte: Auch wenn der Typ der Referenz ein Interface 
	// ist, kann auf die referenzierten Attribute und Methoden der 
	// Implementierung zugegriffen werden.
	
	// Vorbedingung: Die Implementierung ist bereits instanziiert.
	// (wird durch die Navi-Software sichergestellt, vgl. Arbeitsblatt)
	void setGeoLocationManager(GeoLocationManager geoManager);
	// Nachbedingung: Die Referenz ist gesetzt, spaetere Positionsabfragen 
	// erfolgen ueber diese Referenz
	// ************************************************************************
	

	// ************************************************************************
	// Die aktuelle Position soll vom GPS-Modul abgefragt und zurueckgeliefert
	// werden. Achtung: Die Koordinatensysteme von GPS-Modul und Navi-Software
	// haben nicht den gleichen Ursprung. Daher ist eine Verschiebung noetig
	// (vgl. Aufgabenblatt)

	// Vorbedingung: Die Referenz zum GPS-Modul wurde vorher gesetzt.
	Point getCurrentPosition() throws InstantiationException, NullPointerException;
	// Nachbedingung: 
	//    NullPointerException mit Text "NoGeoManager", falls nicht vorab gesetzt.
	//    InstantiationException, falls Reset notwendig ist (vgl. Arbeitsblatt)
	// ************************************************************************
}
