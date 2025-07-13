package mediator.Taxi;

public class Klient {
    private String imie;

    public Klient(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void zamowTaxi(TaxiMediator mediator, Punkt lokalizacja) {
        System.out.println("📞 " + imie + " zamawia taxi na " + lokalizacja);
        mediator.zamowTaxi(this, lokalizacja);
    }
}