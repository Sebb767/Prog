package threads;

import java.io.BufferedReader;
import java.io.FileReader;

public class DateiLesenThread extends Thread {
	String dateiname;
	char gesuchterchar;
	int count;
	boolean end = false;

	public DateiLesenThread(String dateiname, char gesuchter) {
		this.dateiname = dateiname;
		this.gesuchterchar = gesuchter;
	}

	public void setGesuchterChar(char c) {
		this.gesuchterchar = c;
	}

	public void run() {
		BufferedReader br = null;
		String temp;
		try {
			br = new BufferedReader(new FileReader(dateiname));
			while ((temp = br.readLine()) != null) {
				char[] c = temp.toCharArray();
				for (int i = 0; i < c.length; i++) {
					if (c[i] == gesuchterchar) {
						count++;
					}
				}
				sleep(1000);
			}
			br.close();
		} catch (Exception e) {

		}
		end = true;
	}

}
