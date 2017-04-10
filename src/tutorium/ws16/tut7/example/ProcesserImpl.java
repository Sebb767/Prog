package ws16.tut7.example;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by sebb on 12/21/16.
 */
public class ProcesserImpl implements Processor {
    @Override
    public void Process(Socket s) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());

            osw.write("Hello, World!");
            osw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
