package iiad.les2.Polymorfisme_Dynamic_Binding;

public class Werknemer extends PersoonImpl implements Persoon
{
  private String naam;
	
  public Werknemer (String naam)
  {
    this.naam = naam;
  }

  public String toString ()
  {
    return (naam);
  }
}
