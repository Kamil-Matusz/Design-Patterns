package Flyweight.Ksiegarnia;

public class Mapa implements Publikacja {
    private final String tytul;

    public Mapa(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public void wyswietl(String opisPromocyjny) {
        System.out.println("🗺️ Mapa: " + tytul + " | " + opisPromocyjny);
    }
}
