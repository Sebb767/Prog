package ws16.tut6.ref;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by proj on 12/19/16.
 */
public class TcpBenchmark {
    protected int count, port;
    protected BenchThread threads[];

    public TcpBenchmark(int port, int count, int threadCount) {
        this.count = count;
        this.port = port;

        threads = new BenchThread[threadCount];
        for (int i = 0; i < threadCount; i++)
            threads[i] = new BenchThread(count / threadCount, port);
    }

    public void run() throws InterruptedException {
        System.out.println("Starting benchmark.");
        long startTime = System.currentTimeMillis();

        for(Thread t : threads) t.start();
        for(Thread t : threads) t.join();

        long endTime = System.currentTimeMillis();
        System.out.printf("Finished %d requests in %d ms.", count, endTime - startTime);
    }

    public static void main(String[] args) {
        TcpBenchmark tb = new TcpBenchmark(3302, 20000, 4);
        try {
            tb.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected class BenchThread extends Thread {
        protected int count, port;

        public BenchThread(int count, int port) {
            this.count = count;
            this.port = port;
        }

        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                try
                {
                    Socket s = new Socket("127.0.0.1", port);
                    OutputStream os = s.getOutputStream();
                    os.write("a thread\n".getBytes());
                    os.flush();

                    InputStream is = s.getInputStream();
                    while(is.read() >= 0); // read to end

                    is.close();
                    os.close();
                    s.close();
                }
                catch (Exception e)
                {
                    System.out.printf("Failed to send message with exception '%s'!", e.getMessage());
                }
            }
        }
    }
}
