package interpreter.RomeSystem;

import java.util.HashMap;
import java.util.Map;

class Context {
    private final Map<String, Integer> romanToNumber = new HashMap<>();

    public Context() {
        romanToNumber.put("I", 1);
        romanToNumber.put("V", 5);
        romanToNumber.put("X", 10);
        romanToNumber.put("L", 50);
        romanToNumber.put("C", 100);
        romanToNumber.put("D", 500);
        romanToNumber.put("M", 1000);
    }

    public int getValue(String symbol) {
        Integer value = romanToNumber.get(symbol);
        if (value == null) {
            throw new IllegalArgumentException("Nieznany symbol: " + symbol);
        }
        return value;
    }
}
