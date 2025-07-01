package visitor.ShopSale;

public class Program {

    public static void main(String[] args) {
        Klienci klienci = new Klienci();
        klienci.dodaj(new Zlota("Jan Kowalski", 10.5, 1000));
        klienci.dodaj(new Srebrna("Monika Rak", 5.0, 500));
        klienci.dodaj(new Zwykla("Marek Nowicki", 2.5, 200));

        klienci.wizytuj(new OdwiedzajacyRabatu());
        klienci.wizytuj(new OdwiedzajacyPunktowLojalnosciowych());
    }
}