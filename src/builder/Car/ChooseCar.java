package builder.Car;

public class ChooseCar {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        CarBuilder audiBuilder = new AudiCar();
        carDirector.setCarBuilder(audiBuilder);
        carDirector.newCar();

        Car audiCar = carDirector.getCar();
        audiCar.showCar();
    }
}
