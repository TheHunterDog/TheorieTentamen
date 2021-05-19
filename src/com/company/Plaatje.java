package com.company;

//vraag 2
public class Plaatje
{
	public int pixel1;
	public int pixel2;

	public Plaatje( int pixel1, int pixel2 ) {
//		De compiler raakte in de war en veranderde niks.
		this.pixel1 = pixel1;
		this.pixel2 = pixel2;
	}

	public void toon() {
		System.out.println( "Plaatje: "  + pixel1 + ", " + pixel2 );
	}
}
