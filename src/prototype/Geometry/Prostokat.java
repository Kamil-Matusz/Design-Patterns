package prototype.Geometry;

public class Prostokat implements Cloneable{

    private Punkt lewyGorny;
    private double szerokosc;
    private double wysokosc;

    public Prostokat(Punkt lewyGorny, double szerokosc, double wysokosc) {
        this.lewyGorny = lewyGorny;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prostokat((Punkt) lewyGorny.clone(), szerokosc, wysokosc);
    }

    public void draw() {
        System.out.println("Rysuję prostokąt: lewy górny punkt (" + lewyGorny.getX() + ", " + lewyGorny.getY()
                + "), szerokość: " + szerokosc + ", wysokość: " + wysokosc);
    }
}
