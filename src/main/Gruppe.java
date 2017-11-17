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
    
    public Gruppe (String s) {
        
        teamliste = new LinkedList<Team>();
        name = s;
    }
    
    public void addTeam( Team t ) {
        teamliste.add(t);
    }
    
    public String toString() {
        Iterator<Team> i = teamliste.iterator();
        while (i.hasNext() ) {
            System.out.println(i.next());
        }
        return ""; 
    }
    
    public String getName() {
        return name;
    }

    // Tabelle aufgrund der Ergebnisse erstellen (und ausgeben?)
    public void tabelle() {
        
    }
}
