package interpreter.RomeSystem;

class TerminalExpression implements Expression {
    private final String symbol;

    public TerminalExpression(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(symbol);
    }
}

