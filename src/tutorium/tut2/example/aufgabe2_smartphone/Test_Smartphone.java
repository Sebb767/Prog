package aufgabe2_smartphone;

public class Test_Smartphone {

	public static void main(String[] args) {

		Smartphoneverwaltung s = new Smartphoneverwaltung();

		s.addSmartphone(new Smartphone("nexus", 399.99));
		s.addSmartphone(new Smartphone("pixel", 299.99));
		s.addSmartphone(new Smartphone("htc", 499.99));
		s.addSmartphone(new Smartphone("lg", 199.99));
		s.addSmartphone(new Smartphone("oneplus", 99.99));

		Smartphone[] x = s.getAllSmartphone();

		for (Smartphone k : x) {
			if (k.getPreis() < 300) {
				System.out.println(k.toString());
			}
		}
	}
}
