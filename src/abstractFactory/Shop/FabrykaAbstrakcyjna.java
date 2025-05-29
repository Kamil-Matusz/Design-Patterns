package abstractFactory.Shop;

public abstract class FabrykaAbstrakcyjna {
    public abstract Produkt getProdukt(String typ);
    public abstract Promocja getPromocja(String typPromocji);
}
