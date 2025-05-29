package factoryMethod.Figury;

public class Trojkat implements FiguraProduct {

    private final Integer a,b,c,h;

    public Trojkat(Integer a, Integer b, Integer c, Integer h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public Integer pole() {
        return 1/2 * a * h;
    }

    @Override
    public Integer obwod() {
        return a + b + c;
    }
}
