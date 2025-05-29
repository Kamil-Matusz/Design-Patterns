package abstractFactory.Shop;

public class PromocjaProcentowa implements Promocja {

    private double percentage;

    public PromocjaProcentowa(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(Produkt product) {
        return product.getPrice() * (1 - percentage / 100.0);
    }
}
