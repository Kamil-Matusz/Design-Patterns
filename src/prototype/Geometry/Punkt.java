package prototype.Geometry;

public class Punkt implements Cloneable{

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Punkt(x, y);
    }

    public void draw() {
        System.out.println("Punkt: (" + x + ", " + y + ")");
    }
}
