package tut7.aufgabe;

import java.util.function.Predicate;

/**
 * Created by proj on 1/7/17.
 */
public class ParallelProcessor<T>  {
    protected T[] input;
    protected boolean print;
    protected int threads;
    protected Processor<T> proc;
    protected Thread[] threadcache;

    protected class ProcInst extends Thread {
        int offset;

        public ProcInst(int offset) {
            this.offset = offset;
        }

        @Override
        public void run() {
            for(int i = offset; i < input.length; i += threads)
            {
                if(proc != null)
                    input[i] = proc.process(input[i]);

                if(print)
                    System.out.printf("%d: %s\n", i, input[i].toString());
            }
        }
    }

    public ParallelProcessor(T[] input, int threads, boolean print, Processor<T> proc) {
        this.input = input;
        this.print = print;
        this.threads = threads;
        this.proc = proc;

        assert (threads >= 1);
        assert (proc != null || print);
        assert (input != null);

        threadcache = new Thread[threads];
        for (int i = 0; i < threads; i++)
            threadcache[i] = new ProcInst(i);

    }

    public void processInput()
    {
        for(Thread pi : threadcache)
            pi.start();
        for(Thread pi : threadcache)
            try {
                pi.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public T[] getInput() {
        return input;
    }

    public void setInput(T[] input) {
        this.input = input;
    }
}
