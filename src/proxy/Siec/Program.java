package proxy.Siec;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        PrawdziwyZasobSieciowy serwer = new PrawdziwyZasobSieciowy("plik.pdf", LocalDate.now());
        ZasobProxy proxy = new ZasobProxy(serwer);

        proxy.pobierz("Klient1");
        proxy.pobierz("Klient1");
        proxy.pobierz("Klient2");

        System.out.println("\n[MODYFIKACJA ZASOBU]");
        serwer.setDataModyfikacji(LocalDate.now().plusDays(1));

        proxy.pobierz("Klient1");
    }
}
