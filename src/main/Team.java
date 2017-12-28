package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Team implements Comparable
{
    private String name;
    private Gruppe gruppe;
    private String spieler;
    private int punkte = 0;
    private int tore = 0;
    private int gegentore = 0;
    private ArrayList<Spiel> spielListe;
    
    public Team (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpieler() {
        return spieler;
    }
    
    public int getPunkte() {
        return punkte;
    }
    
    public int getTore() {
        return tore;
    }
    
    public int getGegentore() {
        return gegentore;
    }

    public void setPunkte(int punkte) {
        this.punkte += punkte;
    }

    public void setTore(int tore) {
        this.tore += tore;
    }

    public void setGegentore(int gegentore) {
        this.gegentore += gegentore;
    }
    
    public void setGruppe(Gruppe g) {
        gruppe = g;
    }
    
    public void setSpieler(String spieler)
    {
        this.spieler = spieler;
    }
    
    @Override
    public String toString() {
        
        return name + " Punkte: " + punkte + " Tore: " + tore + ":" 
                + gegentore + " (" + spieler + ")";
        
    /*    String n = "Teamname: ";
        String g = "Gruppe noch nicht festgelegt";
        String s = "Spieler noch nicht festgelegt";
        
        if ( gruppe != null ) {
            g = gruppe.getName();
        }
        if ( spieler != null ) {
            s = spieler;
        } 
        
        return n + name + " (" + g + ")" + " (" + s + ")" + '\n' ;*/
    
    }
    
    private boolean gleicherSpieler(Team t2) {
        return this.getSpieler().equals(t2.getSpieler());
    }
    
    private int punkteVergleich(Team t2) {
        if (this.getPunkte() < t2.getPunkte()) {
            return 1;
        } else if ( this.getPunkte() > t2.getPunkte() ) {
            return -1;
        } else {
            return 0;
        }
    }
    
    private int toreVergleich(Team t2) {
        int tordiff1 = tore - gegentore;
        int tordiff2 = t2.getTore() - t2.getGegentore();
        
        if ( tordiff1 < tordiff2 ) {
                return 1;
            } else if ( tordiff1 > tordiff2 ) {
                return -1;
            } else {
                if ( tore > t2.getTore() ) {
                    return -1;
                } else if ( tore < t2.getTore() ) {
                    return 1;
                } else {
                    return 0;
                }
            }
    }
    
    private int direkterVergleich ( Team t2 ) {
        spielListe = gruppe.getSpielliste();
        
        Spiel hinspiel = null;
        Spiel rueckspiel = null;
               
        int tore1, tore2, gegentore1, gegentore2, tordiff1, tordiff2;
        
        Spiel sp;
        Iterator<Spiel> i = spielListe.iterator();
        
        while (i.hasNext()) {
            sp = i.next();
            if ( ( sp.getHeim().equals(this) ) && ( sp.getGast().equals(t2) ) )
            {
                hinspiel = sp;
                System.out.println("Hinspiel: " + hinspiel);
            } else if ( ( sp.getHeim().equals(t2) ) && ( sp.getGast().equals(this) ) ) {
                rueckspiel = sp;                
                System.out.println("Rückspiel: " + rueckspiel);
            } else {
                
            }
        }
            tore1 = hinspiel.getErgebnis()[0] + rueckspiel.getErgebnis()[1];
            gegentore1 = hinspiel.getErgebnis()[1] + rueckspiel.getErgebnis()[0];
            
            tore2 = hinspiel.getErgebnis()[1] + rueckspiel.getErgebnis()[0];
            gegentore2 = hinspiel.getErgebnis()[0] + rueckspiel.getErgebnis()[1];
            
            tordiff1 = tore1 - gegentore1;
            tordiff2 = tore2 - gegentore2;
            
            System.out.println(hinspiel.getHeim().getName() + " Tordiff: " + tordiff1);
            System.out.println(hinspiel.getGast().getName() + " Tordiff: " + tordiff2);
            
            if ( tordiff1 > tordiff2 ) {
                return -1;
            } else if ( tordiff1 < tordiff2 ) {
                return 1;
            } else if ( tordiff1 == tordiff2) {
               tore1 = hinspiel.getErgebnis()[0] + 2* ( rueckspiel.getErgebnis()[1] );
               tore2 = 2 *( hinspiel.getErgebnis()[1] ) +  rueckspiel.getErgebnis()[0] ;
               System.out.println("ToreHeim : " + tore1 + "\n" + "ToreGast: " + tore2);
               if ( tore1 > tore2) {
                   return -1;
               } else if (tore1 < tore2){
                   return 1;
               }
            }
        System.out.println("Direkter Vergleich 0");
        return 0;
    }
    
    @Override
    public int compareTo(Object o) {
        Team t2 = (Team) o;
        //String t1Name = this.getName();
        //String t2Name = t2Team.getName();
               
        spielListe = gruppe.getSpielliste();
        if (spielListe.size() < 8) {
            if (punkteVergleich( t2 ) != 0 ) {
                return punkteVergleich( t2 ); 
            } else {
                return toreVergleich( t2 );
            }
        } else {        
            if ( punkteVergleich(t2) != 0 ) {
                return punkteVergleich( t2 );
            } else if (gleicherSpieler( t2 ) ) {
                System.out.println(getName() + "gelicher Spieler" + t2.getName());
                return toreVergleich(t2);
            } else {
                if ( direkterVergleich(t2) != 0){
                    System.out.println("ungleich");
                    return ( direkterVergleich (t2) );
                } else {
                    return toreVergleich(t2);
                }            
            }
        }
    }
}
