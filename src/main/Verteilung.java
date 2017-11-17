package main;

import java.util.*;

/**
 *
 * @author sebas
 */
public class Verteilung {
    
    private List<Team> teamliste;
    private Gruppe gruppeA;
    private Gruppe gruppeB;
    private Gruppe gruppeC;
    private Gruppe gruppeD;
    
    public Verteilung() {
        
        teamliste = new ArrayList<Team>();
    }
    
    public void addTeam (Team t) {
        teamliste.add(t);
    }
    
    public void mischen() {
        Collections.shuffle(teamliste);
    }
    
    public void gruppenfestlegen() {
        
        mischen();
        teamliste.get(0).setGruppe();
    }
    
    public String toString() {
     
        Iterator<Team> i = teamliste.iterator();
        while (i.hasNext() ) {
            System.out.println(i.next());
        }
        return "";   
    }
    
}
