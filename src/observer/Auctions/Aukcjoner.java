package observer.Auctions;

public class Aukcjoner implements UczestnikAukcji {
    private String nazwa;

    public Aukcjoner(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void powiadom(String wiadomosc) {
        System.out.println(nazwa + " otrzymał powiadomienie: " + wiadomosc);
    }

    public String getNazwa() {
        return nazwa;
    }
}