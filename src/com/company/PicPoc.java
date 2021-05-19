package com.company;

//vraag 2
public class PicPoc
{
	private Plaatje img;

	public void uploadPlaatje( Plaatje i ) { img = i; }

	public Plaatje downloadPlaatje() {
//		je maakte geen nieuw object aan waardoor het adres van het oude plaatje werd mee gegeven. Dit zorgt ervoor dat je de huidige aanpast en de gedownloade.
		Plaatje img = new Plaatje(this.img.pixel1, this.img.pixel2);
		img.toon(); // dit plaatje wordt gedownload.
		return img;
	}

	public void toon() { img.toon(); }
}
