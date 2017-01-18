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

        while(true)
        {
            s = ss.accept();
            Handler h = new Handler(s);
            h.start();
        }
    }

    public class Handler extends Thread
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
