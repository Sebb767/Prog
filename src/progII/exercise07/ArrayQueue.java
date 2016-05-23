package exercise07;

/**
 * Created by sebb on 5/23/16.
 */
public class ArrayQueue<T> implements Queue<T> {
    private Object[] data;
    private int iptr = 0, optr = 0, max, dist = 0;

    public ArrayQueue(int max) {
        data = new Object[max];
        this.max = max;
    }

    @Override
    public void enqueue(T element) throws IllegalAccessException {
        if(dist >= max)
            throw new IllegalAccessException();

        data[iptr++] = element;
        iptr %= max;
        dist++;
    }

    @Override
    public T dequeue() {
        if(empty())
            return null;

        @SuppressWarnings("unchecked")
        final T e = (T)data[optr++];
        optr %= max;
        dist--;
        return e;
    }

    @Override
    public T front() {
        if(empty())
            return null;

        @SuppressWarnings("unchecked")
        final T e = (T)data[optr];
        return e;
    }

    @Override
    public boolean empty() {
        return dist == 0;
    }
}
