package iiad.les1;

public class ZoekenSorteren
{
	public static void main (String [] args)
	{
		
		final char [] rij = {'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K'};
		RijBewerkingen rb = new RijBewerkingen (rij);
		rb.print();
		
		
		rb.bubble(); // voordat je binair gaat zoeken		
		rb.print();	 // moet de tabel gesorteerd zijn.
		
		char target = 'P';
		int index = rb.binair_zoeken(target);
		System.out.println (index);	
						
	}
}