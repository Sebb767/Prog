package tut3.excercise;

import java.util.ArrayList;

/**
 * Created by proj on 11/17/16.
 */
public class Queue<T> {
    protected ArrayList<T> content;

    public Queue()
    {
        content = new ArrayList<>();
    }

    public void enqueue(T in)
    {
        content.add(in);
    }

    public T dequeue() throws QueueEmptyException
    {
        if(empty())
            throw new QueueEmptyException("Die Liste ist leer :(");

        T el = content.get(0);
        content.remove(0);

        return el;
    }

    public boolean empty()
    {
        return content.size() == 0;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();

        q.enqueue("Hello");
        q.enqueue("World");



        try
        {
            String s;
            s = q.dequeue();
            assert(s.equals("Hello"));

            s = q.dequeue();
            assert(s.equals("World"));

            q.dequeue(); // exception

            System.out.println("Irgendetwas ist schief gelaufen :/");
        }
        catch (QueueEmptyException ex)
        {
            System.out.printf("Exception mit der Fehlermeldung: %s\n\n", ex.getMessage());
            ex.printStackTrace();
        }
    }
}
