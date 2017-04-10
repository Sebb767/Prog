package ws16.tut2.example.aufgabe2_smartphone;

import java.util.ArrayList;

public class Smartphoneverwaltung {

	private ArrayList<Smartphone> list = new ArrayList<>();

	public void addSmartphone(Smartphone s) {
		list.add(s);
	}

	public Smartphone[] getAllSmartphone() {
		return list.toArray(new Smartphone[0]);
	}

}
