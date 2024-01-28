//Utgangspunkt i klassene frå førre oppgåve
//Implementer klassen Filmarkiv på ny måte
//Definer Filmarkiv2 med samme operasjonar & returtypar som Oppg 1
//Skal lagrast i lineært kjeda struktur/ikkje tabell
//Fleire metodar få ny implementasjon
//Metodane skal ha namn, parametertype og returtype som i interfacet.
//FilmarkivADT samme som i Oppg1.

//Denne klassen: Ikkje endrast frå oppg1.

package no.hvl.data102.filmarkiv.impl;
import java.util.*;
import org.w3c.dom.*;
//Fekk ikkje til å importere denne, men vi antar at eg klarte å implementere den.
import java.util.Arrays;
import no.hvl.data102.filmarkiv.adt.*;
import no.hvl.data102.filmarkiv.impl.*;
import no.hvl.data102.filmarkiv.klient.*;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2() {
		this.start = new LinearNode<Film>(10);
		this.antall = 0;
	}
	public Filmarkiv2(int antall) {
		this.start = new LinearNode<Film>(antall);
		this.antall=0;
	}

	@Override
	public Film finnFilm(int nr) {
		for(LinearNode<Film> n: asList(dom.getElementsByTagName(nr))) {
			if(n == nr) {
				return n;
			}
		return null;
		}
	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		if(antall >= this.start.(dom.getElementsByTagName())) {
			System.out.println("Ikkje noko plass til fleire filmar.");
		}
		else {
			this.start<>(antall) = nyFilm;
			antall++;
		}
	}
	@Override
	public boolean slettFilm(int filmnr) {
		for(int i = 0; i < antall; i++) {
			if(this.start.filmnr<>(antall) == filmnr) {
				this.arkivFilm<Film>(antall) = this.arkivFilm[antall -1];
				this.arkivFilm<Film>(antall - 1) = null;
				antall--;
				return true;
			}
		}
		
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		LinearNode<Film> linearnode = new LinearNode<Film>(this.start.(dom.getElementsByTagName()));
		int j = 0;
		for(int i = 0; i < this.antall; i++) {
			if(this.start.data.getTittel().contains(delstreng) {
					this.start.data[j] = this.start.data[i];
					j++;
			}
		}
		return Arrays.copyOf(start, j);
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		LinearNode<Film> linearnode = new LinearNode<Film>(this.start.(dom.getElementsByTagName()));
		int j = 0;
		for(int i = 0; i < this.antall; i++) {
			if(this.start<>(i).getProdusent().contains(delstreng)) {
				this.start.data<>(j) = this.start.data<>(i);
					j++;
			}
		}
		return Arrays.copyOf(start, j);
	}
	@Override
	public int antall(Sjanger sjanger) {
		int x = 0;
		for(int i = 0; i < this.antall; i++) {
			if(this.start<>(j).getSjanger() == sjanger) 
				x++;

		}
		return x;
	}
	@Override
	public int antall() {
		return this.antall;
	}
}