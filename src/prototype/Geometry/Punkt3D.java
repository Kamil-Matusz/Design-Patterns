package prototype.Geometry;

public class Punkt3D extends Punkt{

    private double z;

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() { return z; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Punkt3D(getX(), getY(), z);
    }

    @Override
    public void draw() {
        System.out.println("Punkt 3D: (" + getX() + ", " + getY() + ", " + z + ")");
    }
}
