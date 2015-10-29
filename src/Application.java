import java.time.*;

public class Application { // Übung 1+2

    public Application()
    {

    }

    // Übung 1; Aufgabe 1
    public void print()
    {
        System.out.println("Willkommen zu ProgrammierenI!");
    }

    // Übung 1; Aufgabe 2
    public void math()
    {
        int result =  3 * (9 + 3) + 4 * 8;
        System.out.println("3 * (9 + 3) + 4 * 8 = " + result);
    }

    // Übung 2 ; Aufgabe 2
    public void radius(double radius)
    {
        System.out.println("Radius: " + radius);
        System.out.println("Fläche: " + (Math.PI * radius * radius));
        System.out.println("Umfang: " + (2 * Math.PI * radius));
    }

    // Übung 2 ; Aufgabe 2
    public void kugel(double radius)
    {
        System.out.println("Radius: " + radius);
        System.out.println("Volumen: " + ((4. / 3.) * Math.PI * Math.pow(radius, 3)));
    }

    // Übung 2 ; Aufgabe 3
    public void IrgendeineGleichung(double p, double q)
    {
        double sqroot = Math.sqrt(Math.pow(p/2, 2) - q);
        System.out.println("x¹ = " + ((-p/2)+sqroot));
        System.out.println("x² = " + ((-p/2)-sqroot));
    }

    // Übung 2 ; Aufgabe 4
    public void Datumszeug()
    {
        LocalTime stunden = LocalTime.now(),
                minuten = LocalTime.now(),
                sekunden  = LocalTime.now(); // ?

        // a)
        long since_midnight = LocalTime.now().toSecondOfDay();
        System.out.println("Seit Mitternacht sind " + since_midnight + " Sekunden vergangen.");

        // b)
        long remaining = (3600 * 24) - since_midnight;
        System.out.println("Es verbleiben heute noch " + remaining + " Sekunden.");

        // c)
        System.out.println("Es sind " + ((double)since_midnight/(3600. * 24)) * 100 +
                "% des Tages vorbei. Zeit, was besseres als das hier zu machen.");
    }
}
