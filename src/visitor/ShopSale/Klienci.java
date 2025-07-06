package visitor.ShopSale;

import java.util.*;

public class Klienci {
    private List<Klient> klienci = new ArrayList<Klient>();

    public void dodaj(Klient klient) {
        klienci.add(klient);
    }

    public void usun(Klient klient) {
        klienci.remove(klient);
    }

    public void wizytuj(Odwiedzajacy odwiedzajacy) {
        for (Klient e : this.klienci) {
            e.wizytuj(odwiedzajacy);
        }
        System.out.println();
    }
}