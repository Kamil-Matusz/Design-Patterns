package interpreter.SystemConversion;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę heksadecymalną (np. 8AE): ");
        String hex = scanner.nextLine().toUpperCase();

        Context context = new Context();
        Expression expression = new NonTerminalExpression(hex);

        int result = expression.interpret(context);
        System.out.println("Wartość dziesiętna liczby " + hex + " to: " + result);
    }
}
