package tut6.ref;

import java.net.Socket;

/**
 * Created by proj on 12/19/16.
 */
public class NotThreadedHandler implements Handler {
    @Override
    public void handleConnection(Socket s, WorkerFactory w) {
        w.createWorker().handle(s);
    }
}
