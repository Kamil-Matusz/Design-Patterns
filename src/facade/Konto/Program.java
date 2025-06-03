package facade.Konto;

public class Program 
{
    Fasada api;
    
    public Program()
    {
      api = new Fasada("Jan", "Ptyś", 1993, "studentx");
      api.wypiszDzisiejszaDate();
      api.wypiszLogin();
      api.wypiszDane();
      api.wypiszWiek();
      
    }
    	
	
	public static void main(String[] args) 
	{
	  new Program();
	}

}
