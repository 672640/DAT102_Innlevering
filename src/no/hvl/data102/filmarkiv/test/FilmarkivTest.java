package no.hvl.data102.filmarkiv.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import no.hvl.data102.filmarkiv.impl.*;


public class FilmarkivTest {
	
	Filmarkiv filmarkiv = new Filmarkiv();
	Film film1, film2, film3;
	private void setUp() {
		filmarkiv = new Filmarkiv();
		film1 = new Film(1,"produsent1","tittel11",1,"filmselskapnamn1", Sjanger.HORROR);
		film2 = new Film(2,"produsent2","tittel12",2,"filmselskapnamn2", Sjanger.DRAMA);
		film3 = new Film(3,"produsent3","tittel13",3,"filmselskapnamn3", Sjanger.KRIM);	
		filmarkiv.leggTilFilm(film1);
		filmarkiv.leggTilFilm(film2);
		filmarkiv.leggTilFilm(film3);
		
	}
	
	@Test
	public void finnFilmtest() {
		setUp();
		assertEquals(filmarkiv.finnFilm(2),new Film(2,"produsent2","tittel12",2,"filmselskapnamn2", Sjanger.DRAMA));
	}
	
	@Test
	public void soekTitteltest() {
		setUp();
		Film[] filmlist = filmarkiv.soekTittel("tittel");
		assertEquals(3,filmlist.length);
	}
	
	@Test
	public void soekProdusenttest() {
		setUp();
		Film[] filmlist = filmarkiv.soekProdusent("produsent");
		assertEquals(3,filmlist.length);
	}
	
	@Test
	public void antalltest() {
		setUp();
		assertTrue(filmarkiv.antall(Sjanger.HORROR)==1);
		filmarkiv.leggTilFilm(new Film(4,"produsent4","tittel14",4,"filmselskapnamn4", Sjanger.HORROR));
		assertTrue(filmarkiv.antall(Sjanger.HORROR)==2);
		assertTrue(filmarkiv.antall()==4);
	}
	
	@Test
	public void slettFilmtest() {
		setUp();
		filmarkiv.slettFilm(1);
		assertTrue(filmarkiv.finnFilm(1)==null);
		assertEquals(filmarkiv.antall(),2);
	}

}
