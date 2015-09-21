package iiad.les2.overerving_abstracte_klasse;

/**
 * @(#)Figuur.java
 *
 *
 * @author rob van den Bosch
 * @version 1.00 2010/6/23
 */

import java.awt.*;

public abstract class Figuur 
{
	
	private Color achtergrondKleur;
	

    public Figuur(Color kleur) 
    {
    	this.achtergrondKleur = kleur;
    }
    
    
    public Color getKleur()
    {
    	return (this.achtergrondKleur);
    }  
    
    	 
    public String getVorm() {
        return getClass().getSimpleName();
    }
    
    public abstract void teken (Graphics g);  
    	  
}