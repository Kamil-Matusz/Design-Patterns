package factoryMethod.Figury;

public class Romb implements FiguraProduct {

    private final Integer a,b;

    public Romb(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer pole() {
        return a * b;
    }

    @Override
    public Integer obwod() {
        return ((2 * a) + (2 * b));
    }
}
