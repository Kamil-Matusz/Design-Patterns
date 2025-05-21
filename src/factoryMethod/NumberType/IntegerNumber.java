package factoryMethod.NumberType;

public class IntegerNumber implements NumberProduct{

    private final Integer number;

    public IntegerNumber(Integer number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }
}
