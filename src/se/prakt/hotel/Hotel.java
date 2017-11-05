/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.hotel;

import java.util.ArrayList;



/**
 *
 * @author Dustin
 */
public class Hotel {
    String stadt;
    String name;
    
    // Beziehung definieren
    private ArrayList<Zimmer> verfuegt;
    
    
    public Hotel(String stadt, String name) {
        this.stadt = stadt;
        this.name = name;
        verfuegt = new ArrayList<Zimmer>();
    }
    
    public void addZimmer (Zimmer z){
        verfuegt.add(z);
    }
    
    public void delZimmer (Zimmer z){
        verfuegt.remove(z);
    }

    public String getName() {
        return name;
    }

    public String getStadt() {
        return stadt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }
    
        
}
