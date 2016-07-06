package Musterklausur;

import java.util.Map;
import java.util.Set;

/**
 * Created by proj on 7/6/16.
 */

public class KfgTest {
    public static void main(String[] args) {
        try {

            Konfigurationsleser k = new Konfigurationsleser("/pfad/datei.txt");
            Set<Map.Entry<String, String>> s = k.dateiLesen().entrySet();

            for(Map.Entry < String, String > e:s)
            System.out.printf("%s: %s", e.getKey(), e.getValue());
        } catch (Exception ex) {

        }
    }
}
