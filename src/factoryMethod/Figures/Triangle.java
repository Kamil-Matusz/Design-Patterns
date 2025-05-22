package factoryMethod.Figures;

public class Triangle implements ShapeProduct {

    private final double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return 3 * a;
    }

    @Override
    public double perimeter() {
        return 1/2 * (a * h);
    }
}
