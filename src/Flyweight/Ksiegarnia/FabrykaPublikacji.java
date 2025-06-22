package Flyweight.Ksiegarnia;

import java.util.HashMap;
import java.util.Map;

public class FabrykaPublikacji {
    private static final Map<String, Publikacja> publikacje = new HashMap<>();

    public static Publikacja getPublikacja(String typ, String tytul, String autor) {
        String klucz = typ + ":" + tytul + ":" + autor;

        return publikacje.computeIfAbsent(klucz, k -> {
            switch (typ) {
                case "Ksiazka":
                    return new Ksiazka(tytul, autor);
                case "Czasopismo":
                    return new Czasopismo(tytul);
                case "Mapa":
                    return new Mapa(tytul);
                case "Kalendarz":
                    return new Kalendarz(tytul);
                default:
                    throw new IllegalArgumentException("Nieznany typ: " + typ);
            }
        });
    }
}
