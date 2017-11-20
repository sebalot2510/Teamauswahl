package main;

/**
 *
 * @author sebas
 */
public class Team 
{
    private String name;
    private Gruppe gruppe;
    private String spieler;
    
    public Team (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpieler() {
        return spieler;
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
        
        String n = "Teamname: ";
        String g = "Gruppe noch nicht festgelegt";
        String s = "Spieler noch nicht festgelegt";
        
        if ( gruppe != null ) {
            g = gruppe.getName();
        }
        if ( spieler != null ) {
            s = spieler;
        } 
        
        return n + name + " (" + g + ")" + " (" + s + ")" + '\n' ;
    }
}
