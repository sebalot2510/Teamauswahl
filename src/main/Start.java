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
        
        System.out.println(t);
        t.mischen();
        System.out.println(t);
        
    }
    
}
