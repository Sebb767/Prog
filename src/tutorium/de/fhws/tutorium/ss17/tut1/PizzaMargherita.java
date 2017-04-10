package de.fhws.tutorium.ss17.tut1;

public class PizzaMargherita extends Pizza {
    protected int groeße;

    public PizzaMargherita(int groeße) {
        this.groeße = groeße;
    }

    @Override
    public double getPreis() {
        return groeße - 22;
    }
}
