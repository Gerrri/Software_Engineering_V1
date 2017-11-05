/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.hotel;

/**
 *
 * @author Dustin
 */
public class Zimmer {
   int tagespreis;
   int zimmerNr;
   
    // Beziehung definieren
    private Hotel fuer; 
    

    public Zimmer() {   //???
    }

    public Zimmer(int tagespreis, int zimmerNr, Hotel h) {
        this.tagespreis = tagespreis;
        this.zimmerNr = zimmerNr;
        this.fuer = h;              //für Beziehung
        h.addZimmer(this);
    }
   
    public int getTagespreis() {
        return tagespreis;
    }

    public int getZimmerNr() {
        return zimmerNr;
    }

    public void setTagespreis(int tagespreis) {
        this.tagespreis = tagespreis;
    }

    public void setZimmerNr(int zimmerNr) {
        this.zimmerNr = zimmerNr;
    }
     
}
