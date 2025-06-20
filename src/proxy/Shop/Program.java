package proxy.Shop;

public class Program {
    public static void main(String[] args) {

        SprzetSportowy amator = new OgraniczonySprzetSportowyProxy(
                "Rower Górski X200", "Trek", "Lekka rama, amortyzatory, 27 biegów", 2999.99, false);


        SprzetSportowy firma = new OgraniczonySprzetSportowyProxy(
                "Rower Górski X200", "Trek", "Lekka rama, amortyzatory, 27 biegów", 2999.99, true);

        System.out.println("Użytkownik prywatny:\n");
        amator.wyswietlInformacje();

        System.out.println("\nUżytkownik firmowy (z KRS):\n");
        firma.wyswietlInformacje();
    }
}
