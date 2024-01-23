package no.hvl.data102.filmarkiv.impl;
public class Filmarkiv implements no.hvl.data102.filmarkiv.adt.FilmarkivADT {
	String[] arkivFilm;
	public Filmarkiv(int talFilmar) {
		String[] arkivFilm = new String[talFilmar];
	}
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
