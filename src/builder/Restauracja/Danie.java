package builder.Restauracja;

import java.util.ArrayList;
import java.util.List;

public class Danie {
    private String nazwa;
    private List<String> składniki = new ArrayList<>();
    private boolean naCiepło;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSkładniki(List<String> składniki) {
        this.składniki = składniki;
    }

    public void setNaCiepło(boolean naCiepło) {
        this.naCiepło = naCiepło;
    }

    public void dodajSkładnik(String składnik) {
        składniki.add(składnik);
    }

    public void usunSkładnik(String składnik) {
        składniki.remove(składnik);
    }

    public void show() {
        System.out.println("Danie: " + nazwa);
        System.out.println("Składniki: " + składniki);
        System.out.println("Na ciepło: " + naCiepło);
    }
}
