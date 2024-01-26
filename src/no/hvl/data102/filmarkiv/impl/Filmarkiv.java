package no.hvl.data102.filmarkiv.impl;

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
		for(int i = 0; i < this.arkivFilm.length; i++) {
			if(this.arkivFilm[i].filmnr == filmnr) {
				Film film = this.arkivFilm[i];
			this.arkivFilm[i] = this.arkivFilm[antall -1];
		this.arkivFilm[i] = film;
			this.arkivFilm[antall-1]=null;
				antall--;
			return true;
			}
		}
		
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		Film[] arkivFilm2 = new Film[this.arkivFilm.length * 2];
		for(int i = 0; i < this.arkivFilm.length; i++) {
			if(this.arkivFilm[i].getTittel().contentEquals(delstreng)) {
				for(int j = 0; j < arkivFilm2.length; j++) {
					arkivFilm2 = new Film[j];
				}
				return arkivFilm2;
			}
		}
		return null;
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] arkivFilm2 = new Film[this.arkivFilm.length * 2];
		for(int i = 0; i < this.arkivFilm.length; i++) {
			if(this.arkivFilm[i].getProdusent().contentEquals(delstreng)) {
				for(int j = 0; j < arkivFilm2.length; j++) {
					arkivFilm2 = new Film[j];
					antall++;
				}
				return arkivFilm2;
			}
		}
		return null;
	}
	@Override
	public int antall(Sjanger sjanger) {
		int antall = 0;
		for(int i = 0; i < this.arkivFilm.length; i++) {
			if(this.arkivFilm[i].getSjanger().equals(sjanger) && antall > 0) {
				for(Sjanger sjanger1: Sjanger.values()) {
					
				}
				return antall;
			} else {
				antall++;
			}
		}
		return 0;
	}
	@Override
	public int antall() {
		return this.arkivFilm.length;
	}
}
