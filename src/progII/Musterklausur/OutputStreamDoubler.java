package Musterklausur;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by proj on 7/6/16.
 */
public class OutputStreamDoubler extends OutputStream{

    private OutputStream o1, o2;

    public OutputStreamDoubler(OutputStream o1, OutputStream o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void close() throws IOException {
        o1.close();
        o2.close();
        super.close();
    }

    @Override
    public void write(int b) throws IOException {
        // in write
        boolean error = false;
        try { o1.write(b); } catch (Exception e) { error = true; }
        try { o2.write(b); } catch (Exception e) { error = true; }
        if(error) throw new IOException();
    }

    public static void main(String[] args) {
        try
        {
            OutputStreamDoubler osd = new OutputStreamDoubler(new FileOutputStream("file1"), new FileOutputStream("file2"));
            osd.write("abc".getBytes());
            osd.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
