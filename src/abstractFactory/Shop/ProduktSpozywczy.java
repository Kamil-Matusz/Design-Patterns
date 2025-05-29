package abstractFactory.Shop;

public class ProduktSpozywczy implements Produkt {

    private String name;
    private double price;
    private String expirationDate;

    public ProduktSpozywczy(String name, double price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
