package eigene_uebung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;


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
    protected String filename, line;
    protected BufferedReader br;
    boolean read = false;

    public FileIterator(String filename) {
        try
        {
            this.filename = filename;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        }
        catch (IOException ex)
        {

        }
    }

    @Override
    public boolean hasNext() {
        try
        {
            if(!read)
            {
                line = br.readLine();
                read = true;
            }

            return line != null;
        }
        catch (IOException e) { read = true; line = null; return false; }
    }

    @Override
    public String next()
    {
        if(!this.hasNext())
            throw new NoSuchElementException();

        read = false;
        return line;
    }

    @Override
    public void remove() {

    }
}
