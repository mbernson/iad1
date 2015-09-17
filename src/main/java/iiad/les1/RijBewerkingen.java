package iiad.les1;


public class RijBewerkingen
{
	private char[] rij;
	
	
	// constructor
	public RijBewerkingen (char [] rij)
	{
		this.rij = rij;
	}
	
	
	// als target voor komt in de tabel dan wordt de index van target teruggegeven
	// als target niet voor komt dan wordt -1 teruggegeven.
	
	public int lineair_zoeken(char target)
	{
		//  nog maken ...
		return 0;
	}
	
	
	// als target voor komt in de gesorteerde tabel dan wordt de index van target 
	// teruggegeven; als target niet voor komt dan -1.
	
	public int binair_zoeken(char target)
	{
		// nog maken .. zie ook sheets week_1
		return 0;
	}
	
	
	
	// de tabel wordt in oplopende volgorde gesorteerd
	// mbv de 'bubble-sort'-methode
	
	public void bubble ()
	{
		// nog maken ..  zie ook sheets week_1
	}
	
	
	
	public void print ()
	{
		for (int te = 0; te < rij.length; te++)
			System.out.print(rij[te] + "  ");
		System.out.println ("\n\n\n");
	}
	
}