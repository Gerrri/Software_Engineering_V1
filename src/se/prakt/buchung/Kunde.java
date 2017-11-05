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
public class Kunde {
    String name;
    int kundenNr;

    public Kunde(String name, int kundenNr) {
        this.name = name;
        this.kundenNr = kundenNr;
    }

    public Kunde() {
    }

    public String getName() {
        return name;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }
    
}
