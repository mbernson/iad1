package iiad.les2.overerving_abstracte_klasse;

/**
 * @(#)TestFiguur.java
 *
 *
 * @author 
 * @version 1.00 2010/6/23
 */

import java.awt.*;

public class TestFiguur 
{

    public static void main (String [] args)
    {
    	Figuur f_1 = new Cirkel (30, 50, 50, Color.GREEN);
    	Figuur f_2 = new Vierkant (70, 70, 10, Color.RED);
    	
    	System.out.println (f_1.getVorm());
    	System.out.println (f_1.getKleur());
    	System.out.println (f_2.getVorm());
    	System.out.println (f_2.getKleur());
    }
    
    
}