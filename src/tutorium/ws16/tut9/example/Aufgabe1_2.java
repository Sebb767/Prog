package ws16.tut9.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Aufgabe1_2 {

	public static void main(String[] args) {
		Aufgabe1_2 x = new Aufgabe1_2();
		x.splitStudiengaenge("MatrNr.txt");
	}

	public void splitStudiengaenge(String dateiname) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(dateiname));
			BufferedWriter bw = new BufferedWriter(new FileWriter("WInfNr.txt"));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter("InfNr.txt"));
			BufferedWriter bw3 = new BufferedWriter(new FileWriter("ECNr.txt"));

			String temp;

			while ((temp = br.readLine()) != null) {
				boolean b = false;
				int i = Integer.parseInt(temp);

				if (i > 4999999 && i < 5100000) {
					bw.write(temp);
					bw.newLine();
					b = true;
				}

				if (i > 5099999 && i < 5200000) {
					bw2.write(temp);
					bw2.newLine();
					b = true;
				}

				if (i > 6099999 && i < 6200000) {
					bw3.write(temp);
					bw3.newLine();
					b = true;
				}
				if (b == false) {
					throw new ArithmeticException("Matrikelnummer ung�ltig");
				}
			}

			br.close();
			bw.close();
			bw2.close();
			bw3.close();

		} catch (IOException e) {

		}

	}

}
