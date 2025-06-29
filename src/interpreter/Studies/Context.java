package interpreter.Studies;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, String> dictionary = new HashMap<>();

    public Context() {
        dictionary.put("1", "semestr 1");
        dictionary.put("2", "semestr 2");
        dictionary.put("3", "semestr 3");
        dictionary.put("U", "studia uzupełniające");
        dictionary.put("P", "studia pierwszego stopnia");
        dictionary.put("I", "informatyka");
        dictionary.put("Z", "niestacjonarne");
        dictionary.put("S", "stacjonarne");
        dictionary.put("IPO", "inżynieria produkcji oprogramowania");
        dictionary.put("AI", "sztuczna inteligencja");
        dictionary.put("BD", "bazy danych");
    }

    public String getMeaning(String symbol) {
        return dictionary.getOrDefault(symbol, "[Nieznane: " + symbol + "]");
    }
}
