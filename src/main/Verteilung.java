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
        gruppeA = new Gruppe("Gruppe A");
        gruppeB = new Gruppe("Gruppe B");
    }
    
    public void addTeam (Team t) {
        teamliste.add(t);
    }
    
    public void mischen() {
        Collections.shuffle(teamliste);
    }
    
    public void gruppenfestlegen() {
        
        int z = 0;
        mischen();
        while (z < 4 ) {
            
            //System.out.println(teamliste.get(0));
            Team t = teamliste.get(0);
            gruppeA.addTeam(t);
            t.setGruppe(gruppeA);
            teamliste.remove(0);
            z++;
            
        }
        z = 0;
                
        while ( z < 4 ) {
            
            Team t = teamliste.get(0);
            gruppeB.addTeam(t);
            t.setGruppe(gruppeB);
            teamliste.remove(0);
            z++;
        }
    }
    
    public Gruppe getGruppeA () {
        return gruppeA;
    }
    
    public Gruppe getGruppeB () {
        return gruppeB;
    }
    
    public Gruppe getGruppec () {
        return gruppeC;
    }
    public Gruppe getGruppeD () {
        return gruppeD;
    }
    
    public String toString() {
     
        Iterator<Team> i = teamliste.iterator();
        while (i.hasNext() ) {
            System.out.println(i.next());
        }
        //System.out.println(gruppeA);
        //System.out.println(gruppeB);
        return "";
    }
    
}
