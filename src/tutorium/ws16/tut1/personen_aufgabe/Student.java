package ws16.tut1.personen_aufgabe;

public class Student extends Person implements Vorlesungen {
	
	String vorlesung;
	
	public Student(String vorname, String name, int alter) {
		super(vorname, name, alter);
	
	}



	@Override
	public void gebePersonenDatenAus() {
		
		System.out.println(vorname + " " + name + " " + alter);
		
	}

	@Override
	public String getAktuelleVorlesung() {
		return vorlesung;
	}

}
