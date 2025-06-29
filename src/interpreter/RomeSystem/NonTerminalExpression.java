package interpreter.RomeSystem;

import java.util.ArrayList;
import java.util.List;

class NonTerminalExpression implements Expression {
    private final List<Expression> expressions = new ArrayList<>();

    public NonTerminalExpression(String input) {
        for (int i = 0; i < input.length(); i++) {
            expressions.add(new TerminalExpression(Character.toString(input.charAt(i))));
        }
    }

    @Override
    public int interpret(Context context) {
        int total = 0;
        int prevValue = 0;

        for (int i = expressions.size() - 1; i >= 0; i--) {
            int value = expressions.get(i).interpret(context);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }
}

