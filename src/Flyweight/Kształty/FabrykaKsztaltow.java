package Flyweight.Kształty;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FabrykaKsztaltow {
    private static final Map<TypyKsztaltow, Ksztalt> ksztalty = new HashMap<>();
    private static final Map<TypyKsztaltow, Supplier<Ksztalt>> rejestracja = new HashMap<>();

    static {
        rejestracja.put(TypyKsztaltow.OVAL_FILL, () -> new Owal(true));
        rejestracja.put(TypyKsztaltow.OVAL_NOFILL, () -> new Owal(false));
        rejestracja.put(TypyKsztaltow.LINE, Linia::new);
    }

    public static Ksztalt getKsztalt(TypyKsztaltow typ) {
        return ksztalty.computeIfAbsent(typ, t -> rejestracja.get(t).get());
    }

    public enum TypyKsztaltow {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }

    public static void zarejestrujKsztalt(TypyKsztaltow typ, Supplier<Ksztalt> supplier) {
        rejestracja.put(typ, supplier);
    }
}


