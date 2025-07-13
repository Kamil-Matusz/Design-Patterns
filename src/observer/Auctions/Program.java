package observer.Auctions;

public class Program {
    public static void main(String[] args) {
        AukcjaTowaru aukcja = new AukcjaTowaru("Laptop", "Gamingowy laptop 16GB RAM", 2000);

        Aukcjoner jan = new Aukcjoner("Jan");
        Aukcjoner anna = new Aukcjoner("Anna");
        Aukcjoner tomasz = new Aukcjoner("Tomasz");

        aukcja.dodajUczestnika(jan);
        aukcja.dodajUczestnika(anna);
        aukcja.dodajUczestnika(tomasz);

        aukcja.zlozOferte(jan, 1800);
        aukcja.zlozOferte(anna, 2100);
        aukcja.zlozOferte(tomasz, 2500);

        aukcja.zakonczAukcje();
    }
}