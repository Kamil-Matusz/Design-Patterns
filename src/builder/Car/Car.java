package builder.Car;

public class Car {

    private String nazwa;
    private String model;
    private String typ;
    private String rodzajPaliwa;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setRodzajPaliwa(String rodzajPaliwa) {
        this.rodzajPaliwa = rodzajPaliwa;
    }

    public void showCar() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Model: " + model);
        System.out.println("Typ: " + typ);
        System.out.println("Paliwo: " + rodzajPaliwa);
    }
}
