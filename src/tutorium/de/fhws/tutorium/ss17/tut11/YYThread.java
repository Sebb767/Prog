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
                while(true)
                {
                    System.out.println("Yang");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();



        while(true)
        {
            System.out.println("Yin");
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
