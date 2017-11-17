package main;

/**
 *
 * @author sebas
 */
public class Team 
{
    private String name;
    private Gruppe gruppe;
    
    public Team (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        String s = "Teamname: ";
        String g = "Noch nicht festgelegt";
        
        if ( gruppe != null ) {
            g = gruppe.getName();
        }
        return s + name;
    }
    
    public void setGruppe(Gruppe g) {
        gruppe = g;
    }
}
