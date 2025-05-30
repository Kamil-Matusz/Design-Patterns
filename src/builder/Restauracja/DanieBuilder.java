package builder.Restauracja;

public abstract class DanieBuilder {

    protected Danie danie;

    public void noweDanie() {
        danie = new Danie();
    }

    public Danie getDanie() {
        return danie;
    }

    public abstract void dodajNazwe();
    public abstract void dodajSkładniki();
    public abstract void czyNaCiepło();
}
