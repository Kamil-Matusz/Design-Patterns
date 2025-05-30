package builder.Restauracja;

public class DanieDirector {

    private DanieBuilder danieBuilder;

    public void setDanieBuilder(DanieBuilder danieBuilder) {
        this.danieBuilder = danieBuilder;
    }

    public Danie stworzDanie() {
        danieBuilder.noweDanie();
        danieBuilder.dodajNazwe();
        danieBuilder.dodajSkładniki();
        danieBuilder.czyNaCiepło();
        return danieBuilder.getDanie();
    }
}
