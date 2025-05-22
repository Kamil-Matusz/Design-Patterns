package factoryMethod.Figures;

import java.util.Scanner;

public class RectangleCreator implements ShapeCreator{
    @Override
    public ShapeProduct factoryMethod(Scanner scanner) {
        System.out.print("Podaj bok a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj bok b: ");
        double b = scanner.nextDouble();
        return new Rectangle(a, b);
    }
}
