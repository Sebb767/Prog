package ws16.tut8.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TestEntschl�sseln {

	public static void main(String[] args) {

		try {
			DecoratorEntschl�sselung de = new DecoratorEntschl�sselung(
					new BufferedReader(new FileReader("text.txt")),30);

			String temp;
			while ((temp = de.read()) != null) {
				System.out.println(temp);
			}

		} catch (Exception e) {
		}

	}

}
