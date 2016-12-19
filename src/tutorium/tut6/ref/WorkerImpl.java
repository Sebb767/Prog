package tut6.ref;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

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
            Scanner sc = new Scanner(s.getInputStream());

            name = sc.nextLine();

            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());

            osw.write("Hello " + name + "!\nYou're Number " + i.getAndAdd(1) + "!\n");
            osw.close();
        }
        catch (Exception x)
        {
            System.out.printf("Error with client: %s\n", x.getMessage());
        }


    }
}
