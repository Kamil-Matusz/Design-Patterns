package factoryMethod.Figury;

import java.util.Scanner;

public class RombCreator implements FiguraCreator{
    @Override
    public FiguraProduct factoryMethod(String figura) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        Integer a = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj bok b: ");
        Integer b = Integer.valueOf(scanner.nextLine());

        return new Romb(a, b);
    }
}
