package proxy.Shop;

public class OgraniczonySprzetSportowyProxy implements SprzetSportowy {

    private PelnySprzetSportowy pelnySprzet;
    private boolean czyMaDostep;

    public OgraniczonySprzetSportowyProxy(String nazwa, String producent, String opis, double cenaHurtowa, boolean czyMaDostep) {
        this.pelnySprzet = new PelnySprzetSportowy(nazwa, producent, opis, cenaHurtowa);
        this.czyMaDostep = czyMaDostep;
    }

    @Override
    public void wyswietlInformacje() {
        if (czyMaDostep) {
            pelnySprzet.wyswietlInformacje();
        } else {
            System.out.println("Nazwa: " + pelnySprzet.getNazwa());
            System.out.println("Producent: " + pelnySprzet.getProducent());
            System.out.println("Opis: " + pelnySprzet.getOpis());
            System.out.println("Dostęp do cen hurtowych tylko dla firm zarejestrowanych (z numerem KRS).");
        }
    }
}
