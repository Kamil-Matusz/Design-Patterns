package factoryMethod.NumberType;

public class NumberType {

    public static void main(String[] args) {
        String input1 = "3";
        String input2 = "3.141592";

        NumberCreator creator1 = chooseCreator(input1);
        NumberCreator creator2 = chooseCreator(input2);

        NumberProduct num1 = creator1.factoryMethod(input1);
        NumberProduct num2 = creator2.factoryMethod(input2);

        System.out.println("Liczba=" + num1.getNumber() + " (type " + num1.getClass().getSimpleName() + ")");
        System.out.println("Liczba=" + num2.getNumber() + " (type " + num2.getClass().getSimpleName()+ ")");
    }

    private static NumberCreator chooseCreator(String input) {
        if (input.contains(".")) {
            return new DoubleCreator();
        } else {
            return new IntegerCreator();
        }
    }
}
