package no.hvl.data102.filmarkiv.klient;

import java.util.ArrayList;
import java.util.Arrays;
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
        if(check.toUpperCase()==Sjanger.HORROR.toString().toUpperCase()) {
            keyboard.close();
            return new Film(filmnr,produsent,tittel,aar,filmselskapnamn,Sjanger.HORROR);
        }
        if(check.toUpperCase()==Sjanger.DRAMA.toString().toUpperCase()) {
            keyboard.close();
            return new Film(filmnr,produsent,tittel,aar,filmselskapnamn,Sjanger.DRAMA);
        }
        keyboard.close();
        return new Film(filmnr,produsent,tittel,aar,filmselskapnamn,Sjanger.KRIM);

    }
    // Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void skrivUtFilm(Film film) {
        System.out.println(film.toString());
    }
// Skriver ut alle filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
        Film[] list = arkiv.soekTittel(delstreng);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }

    }
    // Skriver ut alle Filmer av en produsent (produsent er delstreng)
    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
        Film[] list = arkiv.soekProdusent(delstreng);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
    }
    // Skriver ut en enkel statistikk som inneholder antall filmer totalt
    // og hvor mange det er i hver sjanger.
    public void skrivUtStatistikk(FilmarkivADT arkiv) {
        System.out.println("DRAMA:" + arkiv.antall(Sjanger.DRAMA));
        System.out.println("HORROR:" + arkiv.antall(Sjanger.HORROR));
        System.out.println("KRIM:" + arkiv.antall(Sjanger.KRIM));
    }
    // osv ... andre metoder
}