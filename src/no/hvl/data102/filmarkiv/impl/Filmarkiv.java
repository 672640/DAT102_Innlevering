package no.hvl.data102.filmarkiv.impl;

import java.util.Arrays;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	private Film[] arkivFilm;
	private int antall;
	
	public Filmarkiv() {
		this.arkivFilm=new Film[10];
		this.antall=0;
	}
	public Filmarkiv(int antall) {
		this.arkivFilm=new Film[antall];
		this.antall=0;
	}

	@Override
	public Film finnFilm(int nr) {
		for(int i = 0; i < arkivFilm.length; i++) {
			if(this.arkivFilm[i].filmnr==nr) 
				return this.arkivFilm[i];
		}
		return null;
	}
	@Override
	public void leggTilFilm(Film nyFilm) {
		if(antall >= this.arkivFilm.length) {
			System.out.println("Ikkje noko plass til fleire filmar.");
		}
		else {
			this.arkivFilm[antall] = nyFilm;
			antall++;
		}
	}
	@Override
	public boolean slettFilm(int filmnr) {
		for(int i = 0; i < antall; i++) {
			if(this.arkivFilm[i].filmnr == filmnr) {
				this.arkivFilm[i] = this.arkivFilm[antall -1];
				this.arkivFilm[antall-1]=null;
				antall--;
				return true;
			}
		}
		
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] arkivFilm2 = new Film[this.arkivFilm.length];
		int j=0;
		for(int i = 0; i < this.antall; i++) {
			if(this.arkivFilm[i].getTittel().contains(delstreng)) {
					arkivFilm2[j] = this.arkivFilm[i];
					j++;
			}
		}
		return Arrays.copyOf(arkivFilm2, j);
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] arkivFilm2 = new Film[this.arkivFilm.length];
		int j=0;
		for(int i = 0; i < this.antall; i++) {
			if(this.arkivFilm[i].getProdusent().contains(delstreng)) {
					arkivFilm2[j] = this.arkivFilm[i];
					j++;
			}
		}
		return Arrays.copyOf(arkivFilm2, j);
	}
	@Override
	public int antall(Sjanger sjanger) {
		int x = 0;
		for(int i = 0; i < this.antall; i++) {
			if(this.arkivFilm[i].getSjanger()==sjanger) 
				x++;

		}
		return x;
	}
	@Override
	public int antall() {
		return this.antall;
	}
}
