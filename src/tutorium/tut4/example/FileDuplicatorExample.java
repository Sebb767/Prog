package tut4.example;

import java.io.*;

/**
 * Created by proj on 11/30/16.
 */
public class FileDuplicatorExample extends OutputStream{

    public OutputStream o1, o2;

    public FileDuplicatorExample(OutputStream o1, OutputStream o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void write(int b) throws IOException
    {
        o1.write(b);
        o2.write(b);
    }

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/tmp/asd");
            BufferedOutputStream bos = new BufferedOutputStream(fos);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
