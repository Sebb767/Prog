package ws16.tut2.example.aufgabe2_smartphone;

import java.util.ArrayList;

public class Smartphone {
	
	private String name;
	private double preis;
	private long seriennummer;
	private static long counter = 1;
	
	public Smartphone(String name, double preis) {
		this.name = name;
		this.preis = preis;
		this.seriennummer = counter;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public long getSeriennummer() {
		return seriennummer;
	}
	public void setSeriennummer(long seriennummer) {
		this.seriennummer = seriennummer;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Preis:" + preis + ", Seriennummer:" + seriennummer;
	}
}
