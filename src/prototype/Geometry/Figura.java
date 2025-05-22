package prototype.Geometry;

public class Figura {
    public static void main(String[] args) throws CloneNotSupportedException {
        Punkt p1 = new Punkt(1, 2);
        Punkt p2 = new Punkt(3, 4);

        Linia linia = new Linia();
        linia.dodajPunkt(p1);
        linia.dodajPunkt(p2);

        Prostokat prostokat = new Prostokat(new Punkt(0, 0), 10, 5);

        Linia sklonowanaLinia = (Linia) linia.clone();
        Prostokat sklonowanyProstokat = (Prostokat) prostokat.clone();

        linia.draw();
        sklonowanaLinia.draw();

        prostokat.draw();
        sklonowanyProstokat.draw();
    }
}
