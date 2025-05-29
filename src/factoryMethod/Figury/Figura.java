package factoryMethod.Figury;

import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj figure: ");
        String figura = scanner.nextLine();

        FiguraCreator creator = chooseCreator(figura);

        FiguraProduct figura1 = creator.factoryMethod(figura);
        System.out.println("Obwod: " + figura1.obwod());
        System.out.println("Pole: " + figura1.pole());
    }

    private static FiguraCreator chooseCreator(String input) {
        if (input.contains("romb")) {
            return new RombCreator();
        } else {
            return new TrojkatCreator();
        }
    }
}
