package tut3.example;

/**
 * Created by proj on 11/23/16.
 */
public class QueueEmptyException extends Exception {
    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }

}
