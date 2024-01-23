package no.hvl.data102.filmarkiv.impl;

import java.util.Objects;

public class Film {
	protected int filmnr;
	private String produsent;
	private String tittel;
	private int aar;
	private Sjanger sjanger;
	private String filmselskapnamn;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int aar, String filmselskapnamn, Sjanger sjanger) {
		//Film film2 = new Film(this.filmnr = filmnr, this.produsent = produsent, this.tittel = tittel, this.aar = aar, this.filmselskapnamn = filmselskapnamn);
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.aar = aar;
		this.filmselskapnamn = filmselskapnamn;
		this.sjanger = sjanger;
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
//Sjangrane
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	public Sjanger getSjanger() {
		return this.sjanger;
	}
	
	public boolean like(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Film film = (Film) o;
		return filmnr = film.filmnr;
		
	}
}
