package iiad.les2.Polymorfisme_Dynamic_Binding;

// Polymorfisme is mogelijk dankzij het verschijnsel 'Dynamic Binding':

//  (1) de betreffende methode is zowel in een superklasse als in een 
//      subklasse gedefinieerd.

//  (2) Je hebt een referentie die is gedeclareerd als ref. naar een 
//      superklasse, maar deze ref. verwijst naar een instantie van de 
//      subklasse

//  (3) de methode van (1) roep je met de ref. van (2) aan


public class DynamicBinding
{
    public static void main (String [] args)
    {
    	// voor de opslag van willekeurige objecten
        Persoon [] mijnTabel = new Persoon [4]; 
        
        	
        // werkgevers en werknemers door elkaar 
        mijnTabel[0] = new Werknemer("Jan");
        mijnTabel[1] = new Werkgever("Karel");
        mijnTabel[2] = new Werknemer("Piet");
        mijnTabel[3] = new Werkgever("Henk");
        
       
        for (int te = 0; te < mijnTabel.length; te++)
        {
        	Persoon p = mijnTabel[te];
        	System.out.println (p.toString() + " --- " + p.getRol());
        }
        
    }
}
