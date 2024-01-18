package no.hvl.data102.filmarkiv.impl;

import java.lang.System.Logger.Level;

public class Film {
	protected int filmnr;
	private String produsent;
	private String tittel;
	private int aar;
//Sjangrane går her
//private Sjanger sjanger = Sjanger;
	private String filmselskapnamn;
	
	public Film() {
		Film film1 = new Film();
	}
	
	public Film(int filmnr, String produsent, String tittel, int aar, String filmselskapnamn) {
		//Film film2 = new Film(this.filmnr = filmnr, this.produsent = produsent, this.tittel = tittel, this.aar = aar, this.filmselskapnamn = filmselskapnamn);
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.aar = aar;
		this.filmselskapnamn = filmselskapnamn;
	}
//Filmnr
	public int getFilmnr() {
		return this.filmnr;
	}
	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}
//Produsent
	public String getProdusent() {
		return this.produsent;
	}
	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}
//Tittel
	public String getTittel() {
		return this.tittel;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
//År
	public int getAar() {
		return this.aar;
	}
	public void setAar(int aar) {
		this.aar = aar;
	}
//Filmselskapnamn
	public String getFilmselskapnamn() {
		return this.filmselskapnamn;
	}
	public void setFilmselskapnamn(String filmselskapnamn) {
		this.filmselskapnamn = filmselskapnamn;
	}
	
	
	
}
