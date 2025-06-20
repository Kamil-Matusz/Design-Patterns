package proxy.Shop;

public class PelnySprzetSportowy implements SprzetSportowy {
    private String nazwa;
    private String producent;
    private String opis;
    private double cenaHurtowa;

    public PelnySprzetSportowy(String nazwa, String producent, String opis, double cenaHurtowa) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.opis = opis;
        this.cenaHurtowa = cenaHurtowa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Producent: " + producent);
        System.out.println("Opis: " + opis);
        System.out.println("Cena hurtowa: " + cenaHurtowa + " PLN");
    }
}
