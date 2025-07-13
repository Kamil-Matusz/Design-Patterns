package mediator.Taxi;

public interface TaxiMediator {
    void zamowTaxi(Klient klient, Punkt lokalizacja);
    void zarejestrujTaxi(Taxi taxi);
}
