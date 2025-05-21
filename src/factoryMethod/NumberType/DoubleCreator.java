package factoryMethod.NumberType;

public class DoubleCreator implements NumberCreator{
    @Override
    public NumberProduct factoryMethod(String input) {
        try {
            return new DoubleNumber(Double.parseDouble(input));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: wrong type – " + input);
        }
    }
}
