package factoryMethod.Calculator;

import java.util.*;

public class Kalkulator_prosty 
{
    public static void main(String args[]) {

       	Dzialania oo = new Dzialania();
        Wynik wynik = new Wynik();
        String liczba1, liczba2;
        char operator;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        liczba1 = sc.nextLine();
        
        System.out.println("Podaj działanie (+,-,* lub /): ");
        operator = sc.nextLine().charAt(0);
        
        System.out.println("Podaj drugą liczbę: ");
        liczba2 = sc.nextLine();
        
        wynik = oo.wybierz_dzialanie(liczba1,operator,liczba2);
        System.out.println(wynik.getWynik());
       
    }
       
}
