package ws16.tut7.example;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sebb on 12/21/16.
 */
public class TcpServer {
    protected int port;
    protected boolean run = true;
    protected Middleware mw;
    protected Processor p;

    public TcpServer(int port, Middleware mw, Processor p) {
        this.port = port;
        this.p = p;
        this.mw = mw;
    }

    public void run()
    {
        try
        {
            ServerSocket sc = new ServerSocket(port);

            while(this.run)
            {
                Socket s = sc.accept();
                mw.process(s, p);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TcpServer tcp = new TcpServer(2200, new ThreadedMiddleware(), new ProcesserImpl());
        tcp.run();
    }
}
