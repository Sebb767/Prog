package exercise08;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by intellij on 5/30/16.
 */
public class DecryptInputStream extends InputStream {
    private InputStream is;
    private /* super secret */ int key;

    public DecryptInputStream(InputStream is, int key) {
        if(key < 0 || key > 255) throw new IllegalArgumentException();

        this.is = is;
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int res = is.read();
        return res < 0 ? res : res ^ key;
    }

    @Override
    public void close() throws IOException {
        is.close();
        super.close();
    }
}
