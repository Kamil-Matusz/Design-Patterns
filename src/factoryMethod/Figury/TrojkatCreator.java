package factoryMethod.Figury;

import java.util.Scanner;

public class TrojkatCreator implements FiguraCreator {
    @Override
    public FiguraProduct factoryMethod(String figura) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        Integer a = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj bok b: ");
        Integer b = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj bok c: ");
        Integer c = Integer.valueOf(scanner.nextLine());

        System.out.println("Podaj wysokosc: ");
        Integer h = Integer.valueOf(scanner.nextLine());

        return new Trojkat(a, b, c, h);
    }
}
