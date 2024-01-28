package no.hvl.data102.filmarkiv.klient;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

import no.hvl.data102.filmarkiv.impl.*;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.klient.*;

public class Tekstgrensesnitt {
	
	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm(){
		Scanner keyboard = new Scanner(System.in);
		int filmnr = keyboard.nextInt();
		String produsent = keyboard.next();
		String tittel = keyboard.next();
		int aar = keyboard.nextInt();
		String filmselskapnamn = keyboard.next();
		String check = keyboard.next();
		if(check.toUpperCase()==HORROR)
			Sjanger sjanger = new Sjanger.HORROR;
	}
	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
	// TODO
	}
	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
	// TODO
	}
	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
	// TODO
	}
	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
	// TODO
	}
	// osv ... andre metoder
}

=======
public class Tekstgrensesnitt {

}
>>>>>>> parent of 74ac2e3 (Endingar)
