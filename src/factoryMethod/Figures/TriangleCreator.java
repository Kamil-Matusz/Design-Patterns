package factoryMethod.Figures;

import java.util.Scanner;

public class TriangleCreator implements ShapeCreator{
    @Override
    public ShapeProduct factoryMethod(Scanner scanner) {
        System.out.print("Podaj bok a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj wysokość h: ");
        double h = scanner.nextDouble();
        return new Triangle(a, h);
    }
}
