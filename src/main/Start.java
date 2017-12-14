package main;

/**
 *
 * @author sebas
 */
public class Start {
    
    public static void main(String[] args)
    {
        Verteilung t = new Verteilung();
        
        Team team1 = new Team("FC Bayern München");
        t.addTeam(team1);
                
        Team team2 = new Team("FC Barcelona");
        t.addTeam(team2);
        
        Team team3 = new Team("Letzter FC Köln");
        t.addTeam(team3);
        
        Team team4 = new Team("Manschester United");
        t.addTeam(team4);
        
        Team team5 = new Team("Olympique Lyon");
        t.addTeam(team5);
        
        Team team6 = new Team("Paris Saint Germain");
        t.addTeam(team6);
        
        Team team7 = new Team("PSV Eindhoven");
        t.addTeam(team7);
        
        Team team8 = new Team("Celtic Glasgow");
        t.addTeam(team8);
        
        Team team9 = new Team("FC AUGSBURG");
        t.addTeam(team9);
        
        Team team10 = new Team("DER GLUBB");
        t.addTeam(team10);
        
        
        t.gruppenfestlegen();
        System.out.println(t.getGruppeA());
        System.out.println(t.getGruppeB());
        
        Spiel s = new Spiel(team1, team2);
        Spiel s2 = new Spiel (team2, team3, 0, 7);
        s.setErgebnis(3, 0);
        System.out.println(s);
        System.out.println(s2);
        
    }
    
}
