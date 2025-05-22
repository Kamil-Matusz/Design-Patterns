package prototype.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Linia implements Cloneable{

    private List<Punkt> punkty;

    public Linia() {
        punkty = new ArrayList<>();
    }

    public Linia(List<Punkt> punkty) {
        this.punkty = punkty;
    }

    public void dodajPunkt(Punkt p) {
        punkty.add(p);
    }

    public List<Punkt> getPunkty() {
        return punkty;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<Punkt> sklonowanaLista = new ArrayList<>();
        for (Punkt p : punkty) {
            sklonowanaLista.add((Punkt) p.clone());
        }
        return new Linia(sklonowanaLista);
    }

    public void draw() {
        System.out.println("Rysuję linię:");
        for (Punkt p : punkty) {
            p.draw();
        }
    }
}
