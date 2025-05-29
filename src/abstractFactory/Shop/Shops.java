package abstractFactory.Shop;

public class Shops {
    public static void main(String[] args) {
        FabrykaAbstrakcyjna fabrykaProduktu = KreatorFabryki.getFabryka("produkt");
        Produkt produkt = fabrykaProduktu.getProdukt("spożywczy");

        FabrykaAbstrakcyjna fabrykaPromocji = KreatorFabryki.getFabryka("promocja");
        Promocja promocja = fabrykaPromocji.getPromocja("procentowa");

        System.out.println("Produkt: " + produkt.getName());
        System.out.println("Cena przed promocją: " + produkt.getPrice());
    }
}
