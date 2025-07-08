package visitor.ShopSale;

public class OdwiedzajacyPunktowLojalnosciowych implements Odwiedzajacy {

    public void wizytuj(Klient klient) {
        klient.setPunktyLojalnosciowe(klient.getPunktyLojalnosciowe() + 300);
        System.out.println(klient.getName() + " - karta " + klient.getClass().toString().substring(klient.getClass().toString().indexOf(".") + 1) + " " + ", punkty lojalnosciowe: " + klient.getPunktyLojalnosciowe());

    }
}