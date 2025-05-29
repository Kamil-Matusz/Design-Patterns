package abstractFactory.Shop;

public class Promocja2za1 implements Promocja {

    @Override
    public double applyDiscount(Produkt product) {
        return product.getPrice() * 1.5;
    }
}
