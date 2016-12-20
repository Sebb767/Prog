package tut6.ref;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by proj on 12/19/16.
 */
public class TCPServer {
    protected int port;
    protected Handler handler;
    protected WorkerFactory workerFactory;

    public TCPServer(int port, Handler handler, WorkerFactory workerFactory) {
        this.port = port;
        this.handler = handler;
        this.workerFactory = workerFactory;
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
                    try
                    {
                        Socket cl = ss.accept();
                        System.out.printf("info: client connected.\n");

                        handler.handleConnection(cl, workerFactory);
                    }
                    catch (Exception ex)
                    {
                        System.out.println("fail: Error handling client.");
                        ex.printStackTrace();
                    }
                }
            }
            catch (IOException ex)
            {
                System.out.printf("fail: Received IOExeception with message '%s'! Restoring ...\n", ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Handler h = new ThreadedHandler();
        //Handler h = new NotThreadedHandler();
        //Handler h = new PooledWorker();


        WorkerFactory w = new WorkerFactory() {
            private AtomicInteger counter = new AtomicInteger(1);

            @Override
            public Worker createWorker() {
                return new WorkerImpl(counter);
            }
        };

        TCPServer tcp = new TCPServer(3302, h, w);
        tcp.listen();
    }
}
