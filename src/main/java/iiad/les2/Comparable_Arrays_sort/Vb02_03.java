package iiad.les2.Comparable_Arrays_sort;
// Voorbeeld 2.3 Sorteren van een Comparable-array


import java.util.*;

public class Vb02_03 
{
  public static void main( String args[] ) 
  {
    Comparable[] lijst;

    lijst = new Comparable[ 3 ];
    lijst[ 0 ] = new Werknemer( "Bas", 2300 );
    lijst[ 1 ] = new Werknemer( "Anne", 2100 );
    lijst[ 2 ] = new Werknemer( "Charlotte", 2200 );
    Arrays.sort( lijst );

    for( int i = 0; i < lijst.length; i++ )
      System.out.println( lijst[ i ] );
  }
}

