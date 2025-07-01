package visitor.ShopSale;

public class Klient extends Element {
    private String nazwa;
    private double rabat;
    private int punktyLojalnosciowe;

    public Klient(String nazwa, double rabat, int punktyLojalnosciowe) {
        this.nazwa = nazwa;
        this.rabat = rabat;
        this.punktyLojalnosciowe = punktyLojalnosciowe;
    }

    public String getName() {
        return nazwa;
    }

    public void setName(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getRabat() {
        return rabat;
    }

    public void setRabat(double rabat) {
        this.rabat = rabat;
    }

    public int getPunktyLojalnosciowe() {
        return punktyLojalnosciowe;
    }

    public void setPunktyLojalnosciowe(int punktyLojalnosciowe) {
        this.punktyLojalnosciowe = punktyLojalnosciowe;
    }

    public void wizytuj(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.wizytuj(this);
    }
}
