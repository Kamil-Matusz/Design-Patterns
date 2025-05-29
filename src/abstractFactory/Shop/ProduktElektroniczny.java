package abstractFactory.Shop;

public class ProduktElektroniczny implements Produkt {

    private String name;
    private double price;
    private String gwarancja;

    public ProduktElektroniczny(String name, double price, String gwarancja) {
        this.name = name;
        this.price = price;
        this.gwarancja = gwarancja;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getGwarancja() {
        return gwarancja;
    }
}
