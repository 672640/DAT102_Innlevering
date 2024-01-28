package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.adt.*;
import no.hvl.data102.filmarkiv.impl.*;
import no.hvl.data102.filmarkiv.klient.*;
public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	public Meny(FilmarkivADT filmarkiv){
	tekstgr = new Tekstgrensesnitt;
	this.filmarkiv = filmarkiv;
	}
	public void start(){
	// legg inn en del forhåndsdefinerte filmer for å teste metodene
	// ..
	// TODO
		this.filmarkiv.antall();
		this.filmarkiv.antall();
	}
}


//public static void main(String[] args) {
//FilmarkivADT filma = new Filmarkiv(100);
//Meny meny = new Meny(filma);
//meny.start();
//}
