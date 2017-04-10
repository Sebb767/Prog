package ws16.tut3.excercise;

/**
 * Created by proj on 11/17/16.
 */
public class QueueEmptyException extends Exception {
    public QueueEmptyException() {
    }

    public QueueEmptyException(String message) {
        super(message);
    }

    public QueueEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueEmptyException(Throwable cause) {
        super(cause);
    }

    public QueueEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
