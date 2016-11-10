package tut1.Aufgabe;

/**
 * Created by proj on 11/3/16.
 */
public class Rechnung {
    protected Pizza[] inhalt;

    public Rechnung(Pizza[] inhalt) {
        this.inhalt = inhalt;
    }

    public Pizza[] getContent()
    {
        return inhalt;
    }

    public double getTotal()
    {
        double sum = 0;

        for (int i = 0; i < inhalt.length; i++) {
            sum += inhalt[i].getPreis();
        }

        return sum;
    }



    public static void main(String[] args) {
        Rechnung[] rn = new Rechnung[3];

        rn[0] = new Rechnung(new Pizza[] {
                new PizzaNapolitana(),
                new PizzaNapolitana()
        });

        rn[1] = new Rechnung(new Pizza[]{
                new PizzaMargherita(28)
        });

        rn[2] = new Rechnung(new Pizza[] {
                new PizzaMargherita(32),
                new PizzaNapolitana(),
                new PizzaMargherita(40)
        });

        Buchhaltung b = new Buchhaltung();

        for (int i = 0; i < rn.length; i++) {
            System.out.printf("Rechung %d: %.2f€\n", i, rn[i].getTotal());

            b.RechnungHinzufuegen(rn[i]);
        }

        //return;

        /*
        for(Rechnung r: b.getInhalt())
        {
            System.out.printf(
                    "Rechnung - %.2f€\n%s\n",
                    r.getTotal(),
                    new String(new char[18]).replace("\0", "-") // String wiederholen)
            );

            for(Pizza p : r.inhalt)
                System.out.printf(
                        "%s - %.2f\n",
                        p.getClass().getName().replace("tut1.Aufgabe.Pizza", "Pizza "),
                        p.getPreis()
                );

            System.out.println();
        }
        //*/
    }
}
