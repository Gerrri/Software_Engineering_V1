/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.buchung;

/**
 *
 * @author Dustin
 */
public class Buchung {
    int anzahlTage;
    
    //Bezeihung Definition
    private se.prakt.hotel.Zimmer rel_z;
    private Kunde rel_k;
    

    public Buchung(int anzahlTage, se.prakt.hotel.Zimmer z, Kunde k) {
        this.anzahlTage = anzahlTage;
        this.rel_z = z;
        this.rel_k = k;
    }

    public Buchung() {
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }
    
}
