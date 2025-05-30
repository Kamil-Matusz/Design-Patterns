package builder.Restauracja;

public class Zamowienie {

    private Danie danie;
    private Stolik stolik;
    private Kelner kelner;

    public Zamowienie(Danie danie, Stolik stolik, Kelner kelner) {
        this.danie = danie;
        this.stolik = stolik;
        this.kelner = kelner;
    }

    public Danie getDanie() {
        return danie;
    }

    public Stolik getStolik() {
        return stolik;
    }

    public Kelner getKelner() {
        return kelner;
    }

    public void showOrder() {
        System.out.println("Order for table " + stolik.getNumber() + ", handled by " + kelner.getImie() + ":");
        danie.show();
    }
}
