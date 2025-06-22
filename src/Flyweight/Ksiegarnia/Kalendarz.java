package Flyweight.Ksiegarnia;

public class Kalendarz implements Publikacja {
    private final String tytul;

    public Kalendarz(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public void wyswietl(String opisPromocyjny) {
        System.out.println("📅 Kalendarz: " + tytul + " | " + opisPromocyjny);
    }
}
