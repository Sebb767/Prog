package Musterklausur;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by proj on 7/6/16.
 */
public class Konfigurationsleser {
    protected String name;

    public Konfigurationsleser(String dateiname) {
        name = dateiname;
    }

    public Map dateiLesen() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        Map<String, String> m = new HashMap<String, String>();

        try {
            while (true) {
                String line = r.readLine();
                if (line == null) break;

                int t = line.indexOf("=");
                if (t < 0) continue;

                m.put(line.substring(0, t), line.substring(t + 1));
            }
        } catch (Exception e) {
            // ende
        }

        r.close();
        return m;
    }
}

