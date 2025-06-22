package Flyweight.Kształty;

import java.awt.Color;
import java.awt.Graphics;

public class Owal implements Ksztalt 
{
   private boolean wypelnienie;
	
	public Owal(boolean f)
	{
	   this.wypelnienie=f;
	   System.out.println("Tworzenie obiektu Owal z wype�nieniem="+f);
	
		try 
		 {
		   Thread.sleep(2000);
		 } 
		catch (InterruptedException e) 
		 {
			e.printStackTrace();
		 }
	}
	
	public void rysuj(Graphics okrag, int x, int y, int width, int height, Color kolor) 
	{
		okrag.setColor(kolor);
		okrag.drawOval(x, y, width, height);
		
		if(wypelnienie)
		  okrag.fillOval(x, y, width, height);
		
	}
}
