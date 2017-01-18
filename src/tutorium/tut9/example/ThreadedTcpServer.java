package tut9.example;

import tut6.ref.Handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by proj on 1/18/17.
 */
public class ThreadedTcpServer {
    public void listen() throws IOException {
        ServerSocket ss = new ServerSocket(1337);
        Socket s;

        while((s = ss.accept()) != null)
        {
            Handler h = new Handler(s);
            Thread t = new Thread(h);
            t.start();
        }
    }

    public class Handler implements Runnable
    {
        Socket s;

        public Handler (Socket myS)
        {
            s = myS;
        }

        @Override
        public void run() {
            try {
                s.getOutputStream().write(42);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
