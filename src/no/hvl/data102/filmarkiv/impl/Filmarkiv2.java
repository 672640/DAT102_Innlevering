//Utgangspunkt i klassene frå førre oppgåve
//Implementer klassen Filmarkiv på ny måte
//Definer Filmarkiv2 med samme operasjonar & returtypar som Oppg 1
//Skal lagrast i lineært kjeda struktur/ikkje tabell
//Fleire metodar få ny implementasjon
//Metodane skal ha namn, parametertype og returtype som i interfacet.
//FilmarkivADT samme som i Oppg1.

//Denne klassen: Ikkje endrast frå oppg1.

package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;
	
	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
}
