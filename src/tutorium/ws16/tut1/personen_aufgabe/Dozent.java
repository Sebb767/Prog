package ws16.tut1.personen_aufgabe;

public class Dozent extends Person implements Gehalt, Vorlesungen {
	
	double gehalt;
	String vorlesung;
	
	public Dozent(String vorname, String name, int alter, double gehalt) {
		super(vorname, name, alter);
		this.gehalt = gehalt;
	
	}

	@Override
	public void gebePersonenDatenAus() {
		
		System.out.println(vorname + " " + name + " " + alter);
		
	}

	@Override
	public String getAktuelleVorlesung() {

		return vorlesung;
	}


	@Override
	public double nettoGehalt() {
		return gehalt * 2/3;
	}

}
