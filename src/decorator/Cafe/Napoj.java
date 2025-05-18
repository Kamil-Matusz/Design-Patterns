package decorator.Cafe;

public abstract class Napoj 
 {
	String opis = "nieznany napój";
  
	public String getOpis() 
	{
	  return opis;
	}
 
	public abstract double koszt();
}
