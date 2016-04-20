package exercise05;

// Ihre Aufgabe ist es, in der nachfolgenden Klasse die geerbte
// Methode getChange zu ueberschreiben. Natuerlich muss der
// Softwarevertrag der Oberklasse eingehalten werden. Ihre
// Spezialisierung soll aber darueber hinaus sicherstellen,
// dass die Anzahl der ausgegeben Muenzen minimal ist.

public class EnhancedChangeCalculator extends SimpleChangeCalculator {

    // Hier fehlt Ihre Implementierung


    @Override
    public int[] getChange(int euros, int cent) {
        while (cent > 100) {
            euros++;
            cent -= 100;
        }

        return new int[]{
                euros / 2,
                euros % 2,
                cent / 50, // 50ct
                (cent % 50) / 20, // 20ct
                ((cent % 50) % 20) / 10, // 10ct
                (cent % 10) / 5, // 5ct
                (cent % 5) / 2, // 2ct
                cent % 2 // 1ct
        };
    }

    // Die nachfolgende main-Methode kann genutzt werden, um das
    // Ergebnis zu ueberpruefen.
    public static void main(String[] args) {

        int j = 0;
        EnhancedChangeCalculator calc = new EnhancedChangeCalculator();

        System.out.println("\nZuerst ein simpler Fall: Es sollen 1 Euro und 70 Cent Wechselgeld zurückgegeben werden:");
        int[] result = calc.getChange(1, 70);

        System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
        j = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++) {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }//endfor
        System.out.println("Anzahl der Münzen: " + j);

        System.out.println("\nJetzt ein bißchen schwieriger: Es sollen 3 Euro und 88 Cent Wechselgeld zurückgegeben werden:");
        result = calc.getChange(3, 88);

        System.out.println("\nDer Automat gibt folgende Muenzen zurueck:");
        j = 0;
        for (int i = 0; i < Coin.availableCoins.length; i++) {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }//endfor
        System.out.println("Anzahl der Münzen: " + j);
    }//endmethod main

}//endclass EnhancedChangeCalculator
