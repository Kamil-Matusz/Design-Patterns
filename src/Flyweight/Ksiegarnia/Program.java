package Flyweight.Ksiegarnia;

import java.util.Random;

public class Program {
    private static final String[] ksiazki = {"Hobbit", "Lalka", "Kod Leonarda", "Gra o Tron"};
    private static final String[] autorzy = {"Tolkien", "Prus", "Brown", "Martin"};
    private static final String[] opisy = {"Hit tygodnia!", "Polecane!", "Nowość!", "Bestseller!"};

    private static final String[] typy = {"Ksiazka", "Czasopismo", "Mapa", "Kalendarz"};

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            String typ = typy[rand.nextInt(typy.length)];
            String tytul = ksiazki[rand.nextInt(ksiazki.length)];
            String autor = autorzy[rand.nextInt(autorzy.length)];
            String opis = opisy[rand.nextInt(opisy.length)];

            Publikacja publikacja = FabrykaPublikacji.getPublikacja(typ, tytul, autor);
            publikacja.wyswietl(opis);
        }
    }
}
