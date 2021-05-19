package com.company;

//vraag 1
public class Beschermd
{
	// moet altijd groter of gelijk aan 10 zijn.
	private int getal = 12345;
	private static long fout;
	private static long goed;

	public void setGetal(int getal) {
		if(getal >= 10) {
			this.getal = getal;
			System.out.println("ok");
			goed++;
		}
		else{
			System.out.println("mag niet");
			fout++;
		}
	}

	public Beschermd(int getal){
		setGetal(getal);
	}

	@Override
	public String toString() {
		return "Beschermd: getal = "+ getal;
	}
	public static void printLogging(){
		System.out.println("# ok = "+goed+", # mag niet = "+fout);
	}
}
