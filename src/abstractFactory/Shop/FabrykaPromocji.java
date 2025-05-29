package abstractFactory.Shop;

public class FabrykaPromocji extends FabrykaAbstrakcyjna {
    @Override
    public Produkt getProdukt(String typ) {
        return null;
    }

    @Override
    public Promocja getPromocja(String typPromocji) {
        if (typPromocji.contains("procentowa")) {
            return new PromocjaProcentowa(15);
        } else if (typPromocji.contains("kwotowa")) {
            return new PromocjaKwotowa(20.00);
        } else {
            return new Promocja2za1();
        }
    }
}
