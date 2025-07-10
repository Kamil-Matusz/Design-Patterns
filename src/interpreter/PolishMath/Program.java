package interpreter.PolishMath;

import java.lang.Number;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<String, Expression>();
//        variables.put("w", new Number(5));
//        variables.put("x", new java.lang.Number(10));
//        variables.put("z", new Number(42));
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}