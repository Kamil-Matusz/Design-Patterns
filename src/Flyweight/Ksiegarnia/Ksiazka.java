package Flyweight.Ksiegarnia;

public class Ksiazka implements Publikacja {
    private final String tytul;
    private final String autor;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    @Override
    public void wyswietl(String opisPromocyjny) {
        System.out.println("📖 Książka: " + tytul + " - " + autor + " | " + opisPromocyjny);
    }
}
