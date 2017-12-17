/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sebas
 */
public class Spiel 
{
    private Team t1;
    private Team t2;
    private int[] ergebnis = new int[2];
    
    
    public Spiel (Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
        ergebnis[0] = 99;
        ergebnis[1] = 99;
    }
    public Spiel (Team t1, Team t2, int toreHeim, int toreGast) {
        this.t1 = t1;
        this.t2 = t2;
        ergebnis[0] = toreHeim;
        ergebnis[1] = toreGast;
    }
    
    public void setErgebnis(int toreHeim, int toreGast) {
       ergebnis[0] = toreHeim;
       ergebnis[1] = toreGast;
    }
    
    public int[] getErgebnis() {
        return ergebnis;
    }
    
    public Team getHeim() {
        return t1;
    }
    
    public Team getGast() {
        return t2;
    }
    
    @Override
    public String toString() {
        String s;
        if (ergebnis[0] == 99 || ergebnis[1] == 99) {
            s = t1.getName() + " - " + t2.getName();   
        } 
        else {
            s = t1.getName() + " - " + t2.getName() + " " 
                + Integer.toString(ergebnis[0]) + " : " + Integer.toString(ergebnis[1]);            
        }
        
        return s;
    }
    
}
