package interpreter.RomeSystem;

public class Client {
    public static void main(String[] args) {
        String roman = "MMXXV";
        
        Context context = new Context();
        NonTerminalExpression expression = new NonTerminalExpression(roman);
        int result = expression.interpret(context);
        System.out.println("Wartość " + roman + " w systemie rzymskim wynosi: " + result);
    }
}

