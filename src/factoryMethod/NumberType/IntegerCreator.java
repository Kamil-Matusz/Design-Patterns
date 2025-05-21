package factoryMethod.NumberType;

public class IntegerCreator implements NumberCreator{
    @Override
    public NumberProduct factoryMethod(String input) {
        try {
            return new IntegerNumber(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: wrong type – " + input);
        }
    }
}
