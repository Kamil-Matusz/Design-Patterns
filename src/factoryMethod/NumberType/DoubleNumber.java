package factoryMethod.NumberType;

public class DoubleNumber implements NumberProduct{

    private final Double number;

    public DoubleNumber(Double number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }
}
