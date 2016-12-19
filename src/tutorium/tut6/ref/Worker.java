package tut6.ref;

import java.net.Socket;

/**
 * Created by proj on 12/19/16.
 */
public interface Worker {
    void handle(Socket s);
}
