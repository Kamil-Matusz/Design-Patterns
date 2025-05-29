package abstractFactory.Shop;

public class FabrykaProduktu extends FabrykaAbstrakcyjna {
    @Override
    public Produkt getProdukt(String typ) {
        if (typ.contains("elektroniczny")) {
            return new ProduktElektroniczny("Iphone 15 Pro", 5000.00, "15.06.2025");
        } else if (typ.contains("spozywczy")) {
            return new ProduktSpozywczy("Chleb", 100.00, "20.05.2025");
        } else {
            return new ProduktOdziezowy("Koszula", 50.00, "S", "Czarny");
        }
    }

    @Override
    public Promocja getPromocja(String typPromocji) {
        return null;
    }
}
