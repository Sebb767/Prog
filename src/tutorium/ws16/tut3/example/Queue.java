package ws16.tut3.example;

import java.util.ArrayList;

/**
 * Created by proj on 11/23/16.
 */
public class Queue<T> {

    protected ArrayList<T> lst;

    public Queue() {
        lst = new ArrayList<>();
    }

    public void enqueue(T in)
    {
        lst.add(in);
    }

    public T dequeue() throws QueueEmptyException
    {
        // do something
        if(empty())
            throw new QueueEmptyException("sinnvolle Nachricht :)");

        return lst.remove(0);
    }

    public boolean empty()
    {
        return lst.isEmpty();
    }

    public static void main(String[] args) {
        Queue<String> mq = new Queue<>();

        mq.enqueue("Asd 1");
        mq.enqueue("Asd 2");

        try {
            if(!mq.dequeue().equals("Asd 1"))
                System.out.printf("Der zurückgegebene String war falsch!");

            if(!mq.dequeue().equals("Asd 2"))
                System.out.printf("Der zurückgegebene String war falsch!");

            System.out.println("Jetzt sollte Exception sein:");
            mq.dequeue();
        }
        catch (QueueEmptyException ex)
        {
            ex.printStackTrace();
        }
    }
}
