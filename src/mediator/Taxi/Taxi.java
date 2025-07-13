package mediator.Taxi;

public class Taxi {
    private String id;
    private Punkt lokalizacja;
    private boolean zajeta;

    public Taxi(String id, Punkt lokalizacja) {
        this.id = id;
        this.lokalizacja = lokalizacja;
        this.zajeta = false;
    }

    public boolean isZajeta() {
        return zajeta;
    }

    public Punkt getLokalizacja() {
        return lokalizacja;
    }

    public void odbierzKlienta(Klient klient, Punkt cel) {
        this.zajeta = true;
        System.out.println("🚕 Taxi " + id + " jedzie po " + klient.getImie() + " na " + cel);
    }
}