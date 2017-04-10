package ws16.tut7.aufgabe;

/**
 * Created by proj on 1/9/17.
 */
public class ParallelProcessorBuilder<T> {
    protected int threads = -1;
    protected T[] data;
    protected boolean print = false;
    protected Processor<T> proc;

    public static <X> ParallelProcessorBuilder<X> create()
    {
        return new ParallelProcessorBuilder<X>();
    }

    public ParallelProcessorBuilder<T> withThreads(int threads) throws InvalidDataException {
        if(threads < 1)
            throw new InvalidDataException();

        this.threads = threads;
        return this;
    }

    public ParallelProcessorBuilder<T> withData(T[] data) throws InvalidDataException {
        if(data == null)
            throw new InvalidDataException();

        this.data = data;
        return this;
    }

    public ParallelProcessorBuilder<T> withProcessor(Processor<T> proc) throws InvalidDataException {
        if(proc== null)
            throw new InvalidDataException();

        this.proc = proc;
        return this;
    }

    public ParallelProcessorBuilder<T> withPrint(boolean print) {
        this.print = print;
        return this;
    }

    public ParallelProcessor<T> build() throws InvalidDataException {
        if(data == null)
            throw new InvalidDataException("No data given.");

        if(threads < 1)
            throw new InvalidDataException("No thread count given!");

        if(!print && proc == null)
            throw new InvalidDataException("If no processor was given, print must be set to true!");

        return new ParallelProcessor<>(data, threads, print, proc);
    }

    public static class InvalidDataException extends Exception
    {
        public InvalidDataException()
        {
            super();
        }

        public InvalidDataException(String message)
        {
            super(message);
        }
    }
}
