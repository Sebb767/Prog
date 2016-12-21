package tut7.example;

import java.net.Socket;

/**
 * Created by sebb on 12/21/16.
 */
public interface Processor {
    public void Process(Socket s);
}
