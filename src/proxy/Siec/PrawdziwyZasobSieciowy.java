package proxy.Siec;

import java.time.LocalDate;

public class PrawdziwyZasobSieciowy implements ZasobSieciowy {

    private String zawartosc;
    private LocalDate dataModyfikacji;
    private int liczbaPobran;

    public PrawdziwyZasobSieciowy(String zawartosc, LocalDate dataModyfikacji) {
        this.zawartosc = zawartosc;
        this.dataModyfikacji = dataModyfikacji;
        this.liczbaPobran = 0;
    }

    @Override
    public void pobierz(String nazwaKlienta) {
        liczbaPobran++;
        System.out.println("[" + nazwaKlienta + "] Pobrano z SERWERA: " + zawartosc);
    }

    public LocalDate getDataModyfikacji() {
        return dataModyfikacji;
    }

    public void setDataModyfikacji(LocalDate data) {
        this.dataModyfikacji = data;
    }

    public int getLiczbaPobran() {
        return liczbaPobran;
    }
}
