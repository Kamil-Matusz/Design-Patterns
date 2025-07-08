package visitor.ShopSale;

public class OdwiedzajacyRabatu implements Odwiedzajacy {

    public void wizytuj(Klient klient) {
        klient.setRabat(klient.getRabat() * 1.05);
        System.out.println(klient.getName() + " - karta " + klient.getClass().toString().substring(klient.getClass().toString().indexOf(".") + 1) + " " + ", rabat: " + klient.getRabat() + "%");

    }
}