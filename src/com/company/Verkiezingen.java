package com.company;

//vraag 3
public class Verkiezingen
{
	private int[] stemmen;

	// vraag (a)
	public Verkiezingen( int aantalKandidaten ) {
		this.stemmen = new int[aantalKandidaten];
	}

	// vraag (b)
	public void stemOp( int kandidaatnr ) {
		try {
			kandidaatnr--;
			this.stemmen[kandidaatnr] += 1;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Kandidaat "+(kandidaatnr + 1 )+" bestaat niet");
		}
	}

	// vraag (b)
	public void print() {
		for (int i = 0; i < stemmen.length; i++) {
			System.out.println("Kandidaat nr "+(i+1)+" heeft "+stemmen[i]+" stemmen");
		}
	}

	public int getWinnaar() {
		int hoogst = 0;
		int persoon = 0;
		for (int i = 0; i < stemmen.length; i++) {
			if(stemmen[i] > hoogst){
				hoogst = stemmen[i];
				persoon = i+1;
			}
		}
		return persoon;
	}
}
