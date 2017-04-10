package ws16.tut7.example;

import java.net.Socket;

/**
 * Created by sebb on 12/21/16.
 */
public class ThreadedMiddleware implements Middleware {

    @Override
    public void process(Socket s, Processor p) {
        SomeThreadableClass stc = new SomeThreadableClass(s, p);
        Thread t = new Thread(stc);
        t.start();
    }

    public static class SomeThreadableClass implements Runnable {
        private Socket s;
        private Processor p;

        public SomeThreadableClass(Socket s, Processor p) {
            this.s = s;
            this.p = p;
        }

        @Override
        public void run() {
            p.Process(s);
        }
    }
}
