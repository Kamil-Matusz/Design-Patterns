package interpreter.PolishMath;

import java.util.*;

interface Expression {
    public int interpret(Map<String, Expression> variables);
}



