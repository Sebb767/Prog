package tut6.ref;

import java.net.Socket;

/**
 * Created by proj on 12/19/16.
 */
public class ThreadedHandler implements Handler {

    private class ThreadWorker extends Thread {
        Socket s;
        WorkerFactory w;

        public ThreadWorker(Socket s, WorkerFactory w) {
            this.s = s;
            this.w = w;
        }

        @Override
        public void run() {
            w.createWorker().handle(s);
        }
    }

    @Override
    public void handleConnection(Socket s, WorkerFactory w) {
        ThreadWorker tw = new ThreadWorker(s, w);
        tw.start();

    }
}

