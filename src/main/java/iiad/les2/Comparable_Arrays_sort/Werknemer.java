package iiad.les2.Comparable_Arrays_sort;

import java.util.*;

public class Werknemer implements Comparable 
{
  private String naam;
  private double salaris;

  public Werknemer( String naam, double salaris ) 
  {
    this.naam = naam;
    this.salaris = salaris;
  }

  public String toString() 
  {
    return naam + ", " + salaris;
  }

  public double getSalaris() 
  {
    return salaris;
  }

  public int compareTo( Object o ) 
  {
    Werknemer w = (Werknemer) o;
    return naam.compareTo( w.naam );
    /*
    if (this.salaris < w.salaris)
    	return (-1);
    else
    	return (+1);
    */
  }
}
	