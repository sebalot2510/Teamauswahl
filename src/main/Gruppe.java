package main;

import java.util.*;

/**
 *
 * @author sebas
 */
public class Gruppe 
{
    private List<Team> teamliste;
    String name;
    private List<Spiel> spielListe;
    
    public Gruppe (String s) {
        
        teamliste = new ArrayList<Team>();
        name = s;
    }
    
    public void addTeam( Team t ) {
        teamliste.add(t);
    }
    
    public String toString() {
        
        String s = name + '\n';
        
        Iterator<Team> i = teamliste.iterator();
        while (i.hasNext() ) {
            s = s + i.next();    
        }
        return s;
    }
    
    public void deleteAll() {
        teamliste.clear();
    }
    
    public void initSpielListe() {
        spielListe = new ArrayList<Spiel>();
        
        Spiel s1 = new Spiel (teamliste.get(0), teamliste.get(1));
        Spiel s2 = new Spiel (teamliste.get(3), teamliste.get(2));
        Spiel s3 = new Spiel (teamliste.get(3), teamliste.get(0));
        Spiel s4 = new Spiel (teamliste.get(2), teamliste.get(1));
        Spiel s5 = new Spiel (teamliste.get(1), teamliste.get(2));
        Spiel s6 = new Spiel (teamliste.get(0), teamliste.get(3));
        Spiel s7 = new Spiel (teamliste.get(2), teamliste.get(3));
        Spiel s8 = new Spiel (teamliste.get(1), teamliste.get(0));
        
                
        spielListe.add(s1);
        spielListe.add(s2);
        spielListe.add(s3);
        spielListe.add(s4);
        spielListe.add(s5);
        spielListe.add(s6);
        spielListe.add(s7);
        spielListe.add(s8);
        
        Iterator<Spiel> i = spielListe.iterator();
        while( i.hasNext()) {
            System.out.println(i.next().toString());
        }
        
    }
    
    public String getName() {
        return name;
    }
    
    public List<Team> getTeamliste() {
        return teamliste;
    }
    
    public List<Spiel> getSpielliste() {
        return spielListe;
    }

    // Tabelle aufgrund der Ergebnisse erstellen (und ausgeben?)
    public void tabelle() {
        
    }
}
