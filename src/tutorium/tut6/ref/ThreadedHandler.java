package tut6.ref;

import java.net.Socket;

/**
 * Created by proj on 12/19/16.
 */
public class ThreadedHandler extends Thread implements Handler {
    protected Socket s;
    protected WorkerFactory wf;

    @Override
    public void handleConnection(Socket s, WorkerFactory w) {
        this.s = s;
        this.wf = w;
        this.start();
    }

    @Override
    public void run() {
        wf.createWorker().handle(s);
    }
}
