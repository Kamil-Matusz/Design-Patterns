package interpreter.SystemConversion;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<Character, Integer> hexMap = new HashMap<>();

    public Context() {
        for (char c = '0'; c <= '9'; c++) {
            hexMap.put(c, c - '0');
        }
        for (char c = 'A'; c <= 'F'; c++) {
            hexMap.put(c, 10 + (c - 'A'));
        }
    }

    public int getValue(char symbol) {
        Integer value = hexMap.get(Character.toUpperCase(symbol));
        if (value == null) {
            throw new IllegalArgumentException("Nieprawidłowy znak heksadecymalny: " + symbol);
        }
        return value;
    }
}
