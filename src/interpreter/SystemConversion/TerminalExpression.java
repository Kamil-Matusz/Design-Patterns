package interpreter.SystemConversion;

public class TerminalExpression implements Expression {
    private final char symbol;
    private final int position; // pozycja od końca

    public TerminalExpression(char symbol, int position) {
        this.symbol = symbol;
        this.position = position;
    }

    @Override
    public int interpret(Context context) {
        int value = context.getValue(symbol);
        return value * (int) Math.pow(16, position);
    }
}
