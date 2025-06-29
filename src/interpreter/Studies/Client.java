package interpreter.Studies;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj oznaczenie kierunku (np. 1UIZ-IPO): ");
        String input = scanner.nextLine();

        Context context = new Context();
        Expression expression = new NonTerminalExpression(input);

        System.out.println("\nInterpretacja:");
        System.out.println(expression.interpret(context));
    }
}
