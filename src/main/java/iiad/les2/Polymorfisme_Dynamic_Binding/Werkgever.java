package iiad.les2.Polymorfisme_Dynamic_Binding;

public class Werkgever extends PersoonImpl implements Persoon
{
  private String naam;

  public Werkgever (String naam)
  {
     this.naam = naam;
  }

  public String toString ()
  {
     return (naam);
  }
}
   
