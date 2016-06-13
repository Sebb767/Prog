package exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by proj on 6/13/16.
 */
public class EchoFinder implements EchoFinderInterface {
    @Override
    public String getPair(BufferedReader b) {
        try
        {
            String l = b.readLine(), m;
            while (!l.equals(m = b.readLine())) l = m;
            return m;

        }
        catch (IOException e)
        {
            return null;
        }
    }

    @Override
    public BufferedReader getSystemInAsBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) {
        EchoFinder e = new EchoFinder();
        System.out.println(e.getPair(e.getSystemInAsBufferedReader()));
    }
}
