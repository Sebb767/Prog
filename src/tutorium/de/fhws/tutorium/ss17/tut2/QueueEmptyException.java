package de.fhws.tutorium.ss17.tut2;

/**
 * Created by proj on 4/19/17.
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
