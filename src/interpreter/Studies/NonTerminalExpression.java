package interpreter.Studies;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression implements Expression {
    private final List<Expression> expressions = new ArrayList<>();

    public NonTerminalExpression(String input) {
        String[] parts = input.split("-");

        // interpretuj każdy znak jako oddzielny symbol (np. 1, U, I, Z)
        for (char c : parts[0].toCharArray()) {
            expressions.add(new TerminalExpression(Character.toString(c)));
        }

        // jeśli jest drugi człon (np. IPO) – interpretuj jako całość
        if (parts.length > 1) {
            expressions.add(new TerminalExpression(parts[1]));
        }
    }

    @Override
    public String interpret(Context context) {
        StringBuilder result = new StringBuilder();

        for (Expression expression : expressions) {
            result.append(expression.interpret(context)).append("\n");
        }

        return result.toString();
    }
}
