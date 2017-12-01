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
        
        gruppeA.deleteAll();
        gruppeB.deleteAll();
        String spielerM = "Micha";
        String spielerS = "Sebastian";
        int z = 0;
        
        mischen();
        
        while (z < 4 ) {
            
            Team t = teamliste.get(z);
            gruppeA.addTeam(t);
            t.setGruppe(gruppeA);
            t.setSpieler(z % 2 == 0 ? spielerS : spielerM);
            z++;
        }
        
        while ( z < 8 ) {
            
            Team t = teamliste.get(z);
            gruppeB.addTeam(t);
            t.setGruppe(gruppeB);
            t.setSpieler(z % 2 == 0 ? spielerS : spielerM);
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
     
        String s = "";
        
        Iterator<Team> i = teamliste.iterator();
        while (i.hasNext() ) {
            s = s + i.next();
        }
        return s;
    }
    
}
