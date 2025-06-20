package proxy.Siec;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ZasobProxy implements ZasobSieciowy {

    private PrawdziwyZasobSieciowy serwer;
    private Map<String, LocalDate> ostatniePobranieKlienta = new HashMap<>();

    public ZasobProxy(PrawdziwyZasobSieciowy serwer) {
        this.serwer = serwer;
    }

    @Override
    public void pobierz(String nazwaKlienta) {
        LocalDate dzis = LocalDate.now();
        LocalDate ostatniaData = ostatniePobranieKlienta.get(nazwaKlienta);

        if (ostatniaData == null || !ostatniaData.equals(dzis) || serwer.getDataModyfikacji().isAfter(ostatniaData)) {
            serwer.pobierz(nazwaKlienta);
            ostatniePobranieKlienta.put(nazwaKlienta, dzis);
        } else {
            System.out.println("[" + nazwaKlienta + "] Użyto lokalnej wersji zasobu.");
        }

        System.out.println("➡️ Łączna liczba pobrań z serwera: " + serwer.getLiczbaPobran());
    }
}
