package ws16.tut1.personen_aufgabe;

public class Hausmeister extends Person implements Gehalt {
	
	double gehalt;

	public Hausmeister(String vorname, String name, int alter, double gehalt){
		super(vorname, name, alter);
		this.gehalt = gehalt;
	}
	
	@Override
	public void gebePersonenDatenAus() {
		
		System.out.println(vorname + " " + name + " " + alter);
		
	}

	@Override
	public double nettoGehalt() {
		return gehalt * 2/3;
	}

}
