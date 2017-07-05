package de.fhws.tutorium.ss17.tut11;

/**
 * Created by Sebastian Kaim on 7/5/17.
 */
public class YYThread {

    public void execute()
    {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
               PrintLoop("Yang");
            }
        });
        t.start();

        PrintLoop("Yin");
    }

    public void PrintLoop(String output)
    {
        while(true)
        {
            System.out.println(output);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        YYThread yyt = new YYThread();
        yyt.execute();
    }

}
