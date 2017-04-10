package ws16.tut7.example;

import java.net.Socket;

/**
 * Created by sebb on 12/21/16.
 */
public interface Middleware {
    public void process(Socket s, Processor p);
}
