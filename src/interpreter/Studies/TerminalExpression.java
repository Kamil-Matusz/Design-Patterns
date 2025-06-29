package interpreter.Studies;

public class TerminalExpression implements Expression {
    private final String symbol;

    public TerminalExpression(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String interpret(Context context) {
        return context.getMeaning(symbol);
    }
}
