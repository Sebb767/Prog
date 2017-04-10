package ws16.tut7.example.Dateileser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dateileser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dateiname eingeben");
		String temp = sc.nextLine();
		System.out.println("Gesuchten Char eingeben");
		char c = sc.nextLine().charAt(0);

		DateiLesenThread thread = new DateiLesenThread(temp, c);
		thread.start();

		while (thread.end == false) {
			System.out.println("Neuen char eingeben falls ben�tigt oder 1 falls sie das Zeichen nicht �ndern wollen");
			temp = sc.nextLine();
			if(temp.equals("stop"))break;
			c = temp.charAt(0);
			thread.setGesuchterChar(c);
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("Datei fertig eingelsen.");
		System.out.println("Gefundene Zeichen: " + thread.count);

	}

}
