package com.company;

import java.util.Objects;

//vraag 4
public class Munteenheid
{
	private String valuta;

	public Munteenheid( String valuta ) {
		this.valuta = valuta;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Munteenheid a = (Munteenheid) o;
		return Objects.equals(valuta, a.valuta);
	}
}
