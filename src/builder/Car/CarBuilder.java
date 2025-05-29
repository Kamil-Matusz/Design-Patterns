package builder.Car;

public abstract class CarBuilder {

    protected Car car;

    public Car getCar() {
        return car;
    }

    public void buildCar() {
        car = new Car();
    }

    public abstract void dodajNazwe();
    public abstract void dodajModel();
    public abstract void dodajTyp();
    public abstract void dodajPaliwo();
}
