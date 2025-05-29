package abstractFactory.Shop;

public class ProduktOdziezowy implements Produkt {

    private String name;
    private double price;
    private String rozmiar;
    private String kolor;

    public ProduktOdziezowy(String name, double price, String rozmiar, String kolor) {
        this.name = name;
        this.price = price;
        this.rozmiar = rozmiar;
        this.kolor = kolor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public String getKolor() {
        return kolor;
    }
}
