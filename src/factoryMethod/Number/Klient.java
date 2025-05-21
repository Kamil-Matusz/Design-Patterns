package factoryMethod.Number;

public class Klient {

    public static void main(String[] args) {
        String input1 = "3";
        String input2 = "3.141592";

        KreatorLiczby creator1 = chooseCreator(input1);
        KreatorLiczby creator2 = chooseCreator(input2);

        ProduktLiczbowy num1 = creator1.factoryMethod(input1);
        ProduktLiczbowy num2 = creator2.factoryMethod(input2);

        System.out.println("Liczba=" + num1.getValue() + " (typ " + num1.getClass().getSimpleName() + ")");
        System.out.println("Liczba=" + num2.getValue() + " (typ " + num2.getClass().getSimpleName()+ ")");
    }

    private static KreatorLiczby chooseCreator(String input) {
        if (input.contains(".")) {
            return new KreatorDouble();
        } else {
            return new KreatorInteger();
        }
    }

}
