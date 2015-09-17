package iiad.les2.overerving_abstracte_klasse;

/**
 * @(#)Cirkel.java
 *
 *
 * @author 
 * @version 1.00 2010/6/23
 */

import java.awt.*;

public class Cirkel extends Figuur
{
	private int straal;
	private int x_middelpunt;
	private int y_middelpunt; 
	
	
    public Cirkel(int straal, int x, int y, Color kleur) 
    {
    	super (kleur);
    	
    	this.straal = straal;
    	this.x_middelpunt = x;
    	this.y_middelpunt = y;
    }
    
    public String getVorm()
    {
    	return ("Cirkel");
    }
    
    public void teken (Graphics g)
    {
    	g.setColor (getKleur());
    	// teken de cirkel 
    	// in een grafische context 
    } 
    	
    // etc met methoden voor de klasse Cirkel    	   
}