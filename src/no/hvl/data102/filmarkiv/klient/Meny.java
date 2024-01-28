package no.hvl.data102.filmarkiv.klient;

import no.hvl.data102.filmarkiv.impl.*;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.klient.*;
import no.hvl.data102.filmarkiv.test.FilmarkivTest;

public class Meny {
    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;
    public Meny(FilmarkivADT filmarkiv){
    tekstgr = new Tekstgrensesnitt();
    this.filmarkiv = filmarkiv;
    }
    public void start(){
        Film film1 = new Film(1,"produsent1","tittel11",1,"filmselskapnamn1", Sjanger.HORROR);
        Film film2 = new Film(2,"produsent2","tittel12",2,"filmselskapnamn2", Sjanger.DRAMA);
        Film film3 = new Film(3,"produsent3","tittel13",3,"filmselskapnamn3", Sjanger.KRIM);
        this.filmarkiv.leggTilFilm(film1);
        this.filmarkiv.leggTilFilm(film2);
        this.filmarkiv.leggTilFilm(film3);
    }
}