package eigene_uebung;

import java.util.Iterator;



/**
 * Hinweis aus der Doku zu Iterator<E>:
 *
 * <p>This interface is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * Prüfen Sie selbst, inwieweit der Iterator "missbraucht" werden darf/kann/soll/...
 */



public class FileIterator implements Iterator<String>{

    public FileIterator(String filename) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
