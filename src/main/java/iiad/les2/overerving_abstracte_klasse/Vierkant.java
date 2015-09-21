package iiad.les2.overerving_abstracte_klasse;

/**
 * @(#)Vierkant.java
 *
 *
 * @author 
 * @version 1.00 2010/6/23
 */

import java.awt.*;

public class Vierkant extends Figuur
{
	private int linksBoven_x;
	private int linksBoven_y;
	private int zijde;


    public Vierkant(int x, int y, int zijde, Color kleur) 
    {
    	super (kleur);
    	
    	this.linksBoven_x = x;
    	this.linksBoven_y = y;
    	this.zijde = zijde;   	
    }
        
    public String getVorm()
    {
    	return ("Vierkant");
    }
       
    public void teken (Graphics g)
    {
    	g.setColor (getKleur());
    	// teken het vierkant in een 
    	// grafische context 
    }
    
    // etc met methoden voor de klasse Vierkant            
}