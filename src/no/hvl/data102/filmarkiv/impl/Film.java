package no.hvl.data102.filmarkiv.impl;

import java.util.Objects;

import no.hvl.data102.filmarkiv.test.*;

public class Film {
	protected int filmnr;
	private String produsent;
	private String tittel;
	private int aar;
	private Sjanger sjanger;
	private String filmselskapnamn;

	public Film() {
		this.filmnr = 0;
		this.produsent = null;
		this.tittel = null;
		this.aar = 0;
		this.filmselskapnamn = null;
		this.sjanger = null;
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
	@Override
	public int hashCode() {
		return Objects.hash(aar, filmnr, filmselskapnamn, produsent, sjanger, tittel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return aar == other.aar && filmnr == other.filmnr && Objects.equals(filmselskapnamn, other.filmselskapnamn)
				&& Objects.equals(produsent, other.produsent) && sjanger == other.sjanger
				&& Objects.equals(tittel, other.tittel);
	}
}