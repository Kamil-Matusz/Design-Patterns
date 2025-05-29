package builder.Car;

public class AudiCar extends CarBuilder {
    @Override
    public void dodajNazwe() {
        car.setNazwa("Audi");
    }

    @Override
    public void dodajModel() {
        car.setModel("Q5");
    }

    @Override
    public void dodajTyp() {
        car.setTyp("SUV");
    }

    @Override
    public void dodajPaliwo() {
        car.setRodzajPaliwa("ON");
    }
}
