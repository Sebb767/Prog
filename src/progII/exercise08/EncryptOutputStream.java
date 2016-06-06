package exercise08;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by intellij on 5/30/16.
 */
public class EncryptOutputStream extends OutputStream {
    private OutputStream os;
    private /* super secret */ int key;

    public EncryptOutputStream(OutputStream os, int key) {
        if(key < 0 || key > 255) throw new IllegalArgumentException();

        this.os = os;
        this.key = key;
    }

    @Override
    public void write(int b) throws IOException {
        os.write(b ^ key);
    }

    @Override
    public void close() throws IOException {
        os.close();
        super.close();
    }
}
