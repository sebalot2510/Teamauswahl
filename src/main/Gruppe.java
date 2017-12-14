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
        
        Spiel s = new Spiel (teamliste.get(0), teamliste.get(1));
        spielListe.add(s);
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

    // Tabelle aufgrund der Ergebnisse erstellen (und ausgeben?)
    public void tabelle() {
        
    }
}
