package aufgabe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Finder_SS14 {
	public BufferedReader getSystemInAsBufferedReader() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		return br;
	}

	public void findStringInFiles(String searchString, String[] filenames) {
		
		FileReader fr = null;
		BufferedReader br = null;
		String temp = null;
		int zeile = 1;
		
		for (int i = 0;i< filenames.length; i++){
			
			try{
				fr = new FileReader(filenames[i]);
				br = new BufferedReader(fr);
				
				
				while (( temp = br.readLine()) != null){
					if(temp.contains(searchString)){
						
						System.out.println(filenames[i] + "Zeile: " + zeile);
					}
					zeile++;
			
				}
				zeile = 1;
				br.close();
			}
			catch(IOException e){
				System.out.println("Datei nicht gefunden");
			}
		}
		
		
		
	}

	
	
	
	
	public static void main(String[] args) {
		Finder finder = new Finder();
		BufferedReader br = finder.getSystemInAsBufferedReader();
		String searchString = null;
		try {
			searchString = br.readLine();
			finder.findStringInFiles(searchString, args);
			br.close();
		} catch (IOException ex) {
			System.out.println("Einlesen fehlgeschlagen.");
		}
	}
}