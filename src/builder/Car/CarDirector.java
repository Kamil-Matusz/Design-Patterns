package builder.Car;

public class CarDirector {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void newCar() {
        carBuilder.buildCar();
        carBuilder.dodajNazwe();
        carBuilder.dodajModel();
        carBuilder.dodajTyp();
        carBuilder.dodajPaliwo();
    }
}
