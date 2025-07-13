package observer.Auctions;

public interface Aukcja {
    void dodajUczestnika(UczestnikAukcji u);
    void usunUczestnika(UczestnikAukcji u);
    void powiadomUczestnikow(String wiadomosc);
}
