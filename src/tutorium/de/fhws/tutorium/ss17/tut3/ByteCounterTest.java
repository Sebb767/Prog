package de.fhws.tutorium.ss17.tut3;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static de.fhws.tutorium.ss17.tut3.ByteCounter.BigFile;
import static de.fhws.tutorium.ss17.tut3.ByteCounter.CountBytes;
import static de.fhws.tutorium.ss17.tut3.ByteCounter.File;
import static org.junit.Assert.*;

public class ByteCounterTest {
    @Test
    public void testReadWithBufferedStream() throws IOException
    {
        InputStream is = new BufferedInputStream(new FileInputStream(File));

        int count = CountBytes(is);

        System.out.println("Count = " + count);

        assertEquals(84, count);
    }

    @Test
    public void testReadWithUnbufferedStream() throws IOException
    {
        InputStream is = new FileInputStream(File);

        int count = CountBytes(is);

        System.out.println("Count = " + count);

        assertEquals(84, count);
    }

    @Test
    public void testLongReadWithBufferedStream() throws IOException
    {
        InputStream is = new BufferedInputStream(new FileInputStream(BigFile));

        int count = CountBytes(is);

        System.out.println("Count = " + count);

        assertEquals(819972, count);
    }

    @Test
    public void testLongReadWithUnbufferedStream() throws IOException
    {
        InputStream is = new FileInputStream(BigFile);

        int count = CountBytes(is);

        System.out.println("Count = " + count);

        assertEquals(819972, count);
    }
}
