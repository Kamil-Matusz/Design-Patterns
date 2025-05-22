package factoryMethod.Figures;

import java.util.Scanner;

public class Field {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz figurę (rectangle, circle): ");
        String figureType = scanner.nextLine().toLowerCase();

        ShapeCreator creator = chooseCreator(figureType);

        if (creator == null) {
            System.out.println("Nieznany typ figury.");
            return;
        }

        System.out.print("Podaj parametry figury (np. prostokąt: a,b; koło: r): ");
        String params = scanner.nextLine();

        ShapeProduct shape = creator.factoryMethod(scanner);

        System.out.println("Pole: " + shape.area());
        System.out.println("Obwód: " + shape.perimeter());
    }

    private static ShapeCreator chooseCreator(String figureType) {
        return switch (figureType) {
            case "rectangle" -> new RectangleCreator();
            case "triangle" -> new TriangleCreator();
            default -> null;
        };
    }
}
