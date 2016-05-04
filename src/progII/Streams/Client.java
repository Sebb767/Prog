package Streams;

import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by sebb on 5/4/16.
 */
public class Client {

    public void send(String data, String host, int port)
    {
        try
        {
            Socket s = new Socket(host, port);
            OutputStream os = s.getOutputStream();
            os.write(data.getBytes());
            os.flush();
            os.close();
            s.close();
        }
        catch (Exception e)
        {
            System.out.printf("Failed to send message with exception '%s'!", e.getMessage());
        }
    }

    public static void main(String[] args) {
        Client cl = new Client();
        cl.send("Hello, World!\n", "127.0.0.1", 2030);
    }
}
