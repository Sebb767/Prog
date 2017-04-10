package ws16.tut6.ref;

import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by proj on 12/20/16.
 */
public class PooledWorker implements Handler {

    private ThreadWorker workers[] = new ThreadWorker[4];
    private ArrayList<Contract> cts = new ArrayList<>();

    public PooledWorker() {
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new ThreadWorker();
            workers[i].start();
        }
    }

    private class Contract {
        public Socket s;
        public WorkerFactory w;

        public Contract(Socket s, WorkerFactory w) {
            this.s = s;
            this.w = w;
        }
    }

    private class ThreadWorker extends Thread {
        @Override
        public void run() {
            try {
                while(true) {
                    Contract c = handle();

                    if(c != null)
                        c.w.createWorker().handle(c.s);
                    else
                        Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private Contract handle() throws InterruptedException {
            synchronized (cts)
            {
                if(!cts.isEmpty())
                    return cts.remove(0);
            }
            return null;
        }
    }

    @Override
    public synchronized void handleConnection(Socket s, WorkerFactory w) {
        synchronized (cts)
        {
            cts.add(new Contract(s, w));
        }
    }
}