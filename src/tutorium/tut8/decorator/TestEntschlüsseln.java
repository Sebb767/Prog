package decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TestEntschlüsseln {

	public static void main(String[] args) {

		try {
			DecoratorEntschlüsselung de = new DecoratorEntschlüsselung(
					new BufferedReader(new FileReader("text.txt")),30);

			String temp;
			while ((temp = de.read()) != null) {
				System.out.println(temp);
			}

		} catch (Exception e) {
		}

	}

}
