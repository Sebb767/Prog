package de.fhws.tutorium.ss17.tut3;



import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteCounter {
    public final static int SearchedByte = 42;
    public final static String File = "/usr/lib/mono/4.5/xsp4.exe";
    public final static String BigFile = "/tmp/random.file";

    public static int CountBytes(InputStream is) throws IOException
    {
        int bt, count = 0;

        while((bt = is.read()) != -1) {
            if(bt == ByteCounter.SearchedByte)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(File));
            int count = CountBytes(is);
            System.out.println("Count = " + count);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
