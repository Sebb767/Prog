package de.fhws.tutorium.ss17.tut8;

/**
 * Created by Sebastian Kaim on 6/21/17.
 */
public class ThreadExample implements Runnable {
    private int nr;
    public static int counter = 0;

    public ThreadExample(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 250; i++) {
            System.out.printf("%d: %d\n", nr, counter++);
        }
    }

    public static void main(String[] args) {
        Thread[] ts = new Thread[4];
        for (int i = 0; i < 4; i++) {
            ts[i] = new Thread(new ThreadExample(i + 1));
        }

        for (int i = 0; i < 4; i++) {
            ts[i].start();
        }
    }
}
