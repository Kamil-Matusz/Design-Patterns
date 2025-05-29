package abstractFactory.Shop;

public class KreatorFabryki {
    public static FabrykaAbstrakcyjna getFabryka(String wybor) {
        if (wybor.equalsIgnoreCase("produkt")) {
            return new FabrykaProduktu();
        } else if (wybor.equalsIgnoreCase("promocja")) {
            return new FabrykaPromocji();
        }
        return null;
    }
}
