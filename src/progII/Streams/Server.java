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
                System.out.printf("info: Listening on port %d.\n", port);
                while (true)
                {
                    Socket cl = ss.accept();
                    System.out.printf("info: client connected.\n");
                    InputStreamReader is = new InputStreamReader(cl.getInputStream());
                    BufferedReader br = new BufferedReader(is);

                    while(cl.isConnected() && is.ready())
                    {
                        System.out.printf("recv: %s\n", br.readLine());
                    }

                    System.out.printf("info: client disconnected.\n");
                }
            }
            catch (IOException ex)
            {
                System.out.printf("fail: Received IOExeception with message '%s'! Restoring ...\n", ex.getMessage());
            }
        }
    }

    public static void main(String[] args)
    {
        Server srv = new Server(2030);
        srv.listen();
    }
}
