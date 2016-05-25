package Threads;

public class PrimzahlThread {
    int zahlZumTesten;

    public PrimzahlThread(int zahlZumTesten) {
        this.zahlZumTesten = zahlZumTesten;
    }

    public boolean testeObPrimzahl() {
        if (zahlZumTesten < 2) return false;
        for (int divisor = 2; divisor < zahlZumTesten; divisor++)
            if (zahlZumTesten % divisor == 0) return false;
        return true;
    }
}