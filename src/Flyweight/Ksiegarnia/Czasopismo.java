package Flyweight.Ksiegarnia;

public class Czasopismo implements Publikacja {
    private final String tytul;

    public Czasopismo(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public void wyswietl(String opisPromocyjny) {
        System.out.println("📰 Czasopismo: " + tytul + " | " + opisPromocyjny);
    }
}
