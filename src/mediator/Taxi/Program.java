package mediator.Taxi;

public class Program {
    public static void main(String[] args) {
        TaxiMediatorImpl mediator = new TaxiMediatorImpl();

        Taxi t1 = new Taxi("TX1", new Punkt(0, 0));
        Taxi t2 = new Taxi("TX2", new Punkt(10, 10));
        Taxi t3 = new Taxi("TX3", new Punkt(5, 5));

        mediator.zarejestrujTaxi(t1);
        mediator.zarejestrujTaxi(t2);
        mediator.zarejestrujTaxi(t3);

        Klient k1 = new Klient("Ania");
        Klient k2 = new Klient("Marek");

        k1.zamowTaxi(mediator, new Punkt(2, 2));
        k2.zamowTaxi(mediator, new Punkt(9, 9));
    }
}