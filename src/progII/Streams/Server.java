package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sebb on 5/4/16.
 */
public class Server {
    protected int port;

    public Server(int port) {
        this.port = port;
    }

    public void listen()
    {
        while(true)
        {
            try
            {
                ServerSocket ss = new ServerSocket(port);
                while (true)
                {
                    Socket cl = ss.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(cl.getInputStream()));

                    while(br.ready())
                    {
                        System.out.printf("recv: %s", br.readLine());
                    }
                }
            }
            catch (IOException ex)
            {
                System.out.printf("fail: Received IOExeception with message '%s'! Restoring ...", ex.getMessage());
            }
        }
    }
}
