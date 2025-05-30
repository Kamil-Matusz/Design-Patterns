package builder.Restauracja;

public class CustomDanie extends DanieBuilder {

    private String nazwa;
    private boolean czyNaCiepło;
    private String[] składniki;

    public CustomDanie(String nazwa, boolean czyNaCiepło, String[] składniki) {
        this.nazwa = nazwa;
        this.czyNaCiepło = czyNaCiepło;
        this.składniki = składniki;
    }

    @Override
    public void dodajNazwe() {
        danie.setNazwa(nazwa);
    }

    @Override
    public void dodajSkładniki() {
        for (String składnik : składniki) {
            danie.dodajSkładnik(składnik);
        }
    }

    @Override
    public void czyNaCiepło() {
        danie.setNaCiepło(czyNaCiepło);
    }
}
