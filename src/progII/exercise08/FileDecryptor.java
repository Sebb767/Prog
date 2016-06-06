package exercise08;

import java.io.*;

// Mit Hilfe dieser Klassen sollen verschluesselte Dateien
// auf der Konsole ausgegeben werden. Dazu ist die Datei zu
// oeffnen, mit einem Decryptor-Decorator zu versehen und
// einzulesen. Jedes eingelesene und entschluesselte Zeichen
// soll unmittelbar auf der Konsole ausgegeben werden. 

public class FileDecryptor {

	// Diese Methode muss nach den Vorgaben implementiert werden.
	public static void decryptFile(String filename)
	{
		for (int i = 100; i < 101; i++) {
			try {
				FileInputStream fis = new FileInputStream(filename);
				DecryptInputStream dis = new DecryptInputStream(fis, i);

				int read = dis.read();

				while(read != -1)
				{
                    System.out.print((char)(read));
					read = dis.read();
				}

				System.out.println();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}

	}
	
	// Diese main-Methode zeigt die Verwednung der zu 
	// implementierenden Methode. An der Ausgabe koennen Sie 
	// erkennen, ob Ihre Implementierung funktioniert.
	public static void main(String[] args)
	{
		decryptFile("/home/proj/Projekte/fh/Prog/src/progII/exercise08/data.crypt");
	}
	
}
