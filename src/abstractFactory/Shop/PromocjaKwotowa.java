package abstractFactory.Shop;

public class PromocjaKwotowa implements Promocja {

    private double kwota;

    public PromocjaKwotowa(double kwota) {
        this.kwota = kwota;
    }

    @Override
    public double applyDiscount(Produkt product) {
        return Math.max(0, product.getPrice() - kwota);
    }
}
