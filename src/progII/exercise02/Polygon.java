package exercise02;

// Ein Polygon (Vieleck) ist eine gemetrische Figur, die man erhaelt, indem man
// mindestens drei Eckpunkte in fester Reihenfolge durch Strecken miteinander 
// verbindet, sodass eine zusammenhaengende Flaeche umschlossen wird.
// Beispiele: Dreieck, Viereck etc.

// Das nachfolgende Interface beschreibt den Abstrakten Datentyp Polygon.

public interface Polygon {

	
	// ************************************************************************
	// Alle Eckpunkte (engl. vertex) des Polygons sollen in der festen Reihen-
	// folge als ein Feld von Punkten zurueckgegeben werden.
	
	// Vorbedingung: Konstruktor des Polygons wurde aufgerufen, alle Ecken 
	// (min. 3) und ihre Reihenfolge sind bekannt.
	public Point[] allVertexes();
	// Nachbedingung: Der Umfang und die Flache bleiben unveraendert.
	// Alle Eckpunkte des Polygon bleiben unveraendert.
	// ************************************************************************
	

	// ************************************************************************
	// Der Umfang (engl. perimeter) des Polygons, d.h. die Summe der 
	// Streckenlaengen zwischen den Eckpunkten, soll zurueckgegben werden.
	
	// Vorbedingung: Konstruktor des Polygons wurde aufgerufen, alle Ecken 
	// (min. 3) und ihre Reihenfolge sind bekannt.
	public double perimeter();
	// Nachbedingung: Der Umfang und die Flaeche bleiben unveraendert.
	// Alle Eckpunkte des Polygon bleiben unveraendert.
	// ************************************************************************

	
	// ************************************************************************
	// Die Flaeche (engl. area) des Polygons soll zurueckgegben werden.
	
	// Vorbedingung: Konstruktor des Polygons wurde aufgerufen, alle Ecken 
	// (min. 3) und ihre Reihenfolge sind bekannt.
	public double area();
	// Nachbedingung: Der Umfang und die Flaeche bleiben unveraendert.
	// Alle Eckpunkte des Polygon bleiben unveraendert.
	// ************************************************************************


	// ************************************************************************
	// Das Polygon soll in der Ebene verschoben werden um dx in x-Richtung
	// und dy in y-Richtung
	
	// Vorbedingung: Konstruktor des Polygons wurde aufgerufen, alle Ecken 
	// (min. 3) und ihre Reihenfolge sind bekannt.
	public void move(double dx, double dy);
	// Nachbedingung: Der Umfang und die Flaeche bleiben unveraendert.
	// Alle Eckpunkte des Polygon sind um (dx;dy) verschoben. 
	// Die Reihenfolge der Eckpunkte bleibt unveraendert.
	// ************************************************************************

	
}
