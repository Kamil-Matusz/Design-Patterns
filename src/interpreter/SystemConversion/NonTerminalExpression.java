package interpreter.SystemConversion;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression implements Expression {
    private final List<Expression> expressions = new ArrayList<>();

    public NonTerminalExpression(String hexString) {
        int length = hexString.length();

        for (int i = 0; i < length; i++) {
            char c = hexString.charAt(i);
            int position = length - i - 1; // pozycja w systemie hex (od końca)
            expressions.add(new TerminalExpression(c, position));
        }
    }

    @Override
    public int interpret(Context context) {
        int total = 0;
        for (Expression e : expressions) {
            total += e.interpret(context);
        }
        return total;
    }
}
