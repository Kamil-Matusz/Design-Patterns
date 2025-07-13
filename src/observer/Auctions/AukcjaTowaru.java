package observer.Auctions;

import java.util.ArrayList;
import java.util.List;

public class AukcjaTowaru implements Aukcja {
    private String nazwaTowaru;
    private String opis;
    private double cenaMinimalna;
    private double najwyzszaOferta;
    private Aukcjoner aktualnyLicytant;
    private List<UczestnikAukcji> uczestnicy = new ArrayList<>();

    public AukcjaTowaru(String nazwaTowaru, String opis, double cenaMinimalna) {
        this.nazwaTowaru = nazwaTowaru;
        this.opis = opis;
        this.cenaMinimalna = cenaMinimalna;
        this.najwyzszaOferta = 0;
    }

    @Override
    public void dodajUczestnika(UczestnikAukcji u) {
        uczestnicy.add(u);
    }

    @Override
    public void usunUczestnika(UczestnikAukcji u) {
        uczestnicy.remove(u);
    }

    @Override
    public void powiadomUczestnikow(String wiadomosc) {
        for (UczestnikAukcji u : uczestnicy) {
            u.powiadom(wiadomosc);
        }
    }

    public void zlozOferte(Aukcjoner aukcjoner, double kwota) {
        if (kwota > najwyzszaOferta) {
            najwyzszaOferta = kwota;
            aktualnyLicytant = aukcjoner;
            powiadomUczestnikow("Nowa oferta: " + kwota + " zł od " + aukcjoner.getNazwa());
        } else {
            aukcjoner.powiadom("Twoja oferta " + kwota + " zł jest niższa niż aktualna najwyższa: " + najwyzszaOferta + " zł.");
        }
    }

    public void zakonczAukcje() {
        if (najwyzszaOferta >= cenaMinimalna) {
            powiadomUczestnikow("Aukcja zakończona! Wygrywa " + aktualnyLicytant.getNazwa() + " z ofertą " + najwyzszaOferta + " zł.");
        } else {
            powiadomUczestnikow("Aukcja zakończona bez sprzedaży – nie osiągnięto ceny minimalnej (" + cenaMinimalna + " zł).");
        }
    }
}