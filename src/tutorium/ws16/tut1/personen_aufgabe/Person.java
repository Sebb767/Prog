package ws16.tut1.personen_aufgabe;

public abstract class Person {
	
	protected String vorname;
	protected String name;
	protected int alter;
	
	public Person(String vorname, String name, int alter){
		this.vorname = vorname;
		this.name = name;
		this.alter = alter;
	}
	
	public abstract void gebePersonenDatenAus();
	
	
	public static void main(String[] args){
		
		Hausmeister h1 = new Hausmeister("Pete", "Fischer", 32, 3233.66);
		
		h1.gebePersonenDatenAus();
		System.out.println("Nettogehalt: " + h1.nettoGehalt());
		
		
	}
	

}
