package tut6.ref;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.pow;

/**
 * Created by proj on 12/19/16.
 */
public class WorkerImpl implements Worker {
    AtomicInteger i;

    public WorkerImpl(AtomicInteger i) {
        this.i = i;
    }

    @Override
    public void handle(Socket s) {
        try {
            String name;

            double pi = PiAnnaeherung(100000);

            Scanner sc = new Scanner(s.getInputStream());

            name = sc.nextLine();

            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());

            osw.write("Hello " + name + "!\nYou're Number " + i.getAndAdd(1) + " and Pi is " + pi + "!\n");
            osw.close();
        }
        catch (Exception x)
        {
            System.out.printf("Error with client: %s\n", x.getMessage());
        }


    }

    public static double PiAnnaeherung(int rechtecke)
    {
        if(rechtecke <1)
            return -1;
        else if(rechtecke == 1)
            return 1;

        double fl = 0, x = (1./rechtecke); // fläche

        for (int i = 1; i <= rechtecke; i++)
            fl += x * Math.sqrt(1 - pow(i*x, 2));

        return (4*fl);
    }
}
