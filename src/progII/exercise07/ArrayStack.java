package exercise07;

/**
 * Created by sebb on 5/23/16.
 */
public class ArrayStack<T> implements Queue<T> {
    private Object[] data;
    private int ptr = 0;

    public ArrayStack(int max) {
        data = new Object[max];
    }

    @Override
    public void enqueue(T element) throws IllegalAccessException {
        if(ptr == data.length)
            throw new IllegalAccessException();

        data[ptr++] = element;
    }

    @Override
    public T dequeue() {
        if(ptr <= 0)
            return null;

        @SuppressWarnings("unchecked")
        final T e = (T)data[--ptr];
        return e;
    }

    @Override
    public T front() {
        if(ptr <= 0)
            return null;

        @SuppressWarnings("unchecked")
        final T e = (T)data[ptr-1];
        return e;
    }

    @Override
    public boolean empty() {
        return ptr == 0;
    }
}
