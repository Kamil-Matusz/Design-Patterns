package Flyweight.Kształty;

import java.awt.Color;
import java.awt.Graphics;

public class Linia implements Ksztalt 
 {
	public Linia()
	{
		System.out.println("Tworzenie obiektu Linia");
		
		try 
		 {
		   Thread.sleep(2000);
		 } 
		catch (InterruptedException e) 
		{
		  e.printStackTrace();
		}
	}
	
	public void rysuj(Graphics linia, int x1, int y1, int x2, int y2, Color kolor) 
	{
		linia.setColor(kolor);
		linia.drawLine(x1, y1, x2, y2);
	}
 } 