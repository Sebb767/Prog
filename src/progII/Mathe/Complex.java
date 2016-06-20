package Mathe;

/**
 * Created by sebb on 5/7/16.
 */
public class Complex {
    double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this.real = real;
    }

    public double real() {
        return real;
    }

    public double imag() {
        return imag;
    }
}
