package mediator.Taxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiMediatorImpl implements TaxiMediator {
    private List<Taxi> taksowki = new ArrayList<>();

    @Override
    public void zarejestrujTaxi(Taxi taxi) {
        taksowki.add(taxi);
    }

    @Override
    public void zamowTaxi(Klient klient, Punkt lokalizacja) {
        Taxi najblizsza = null;
        double minDystans = Double.MAX_VALUE;

        for (Taxi t : taksowki) {
            if (!t.isZajeta()) {
                double dystans = t.getLokalizacja().odlegloscDo(lokalizacja);
                if (dystans < minDystans) {
                    minDystans = dystans;
                    najblizsza = t;
                }
            }
        }

        if (najblizsza != null) {
            najblizsza.odbierzKlienta(klient, lokalizacja);
        } else {
            System.out.println("Brak dostępnych taksówek dla klienta " + klient.getImie());
        }
    }
}