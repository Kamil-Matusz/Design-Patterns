package adapter.Books;

import java.util.ArrayList;
import java.util.List;

public class TextDataSource {

    private List<String> data = new ArrayList<>(List.of(
            "Wiedźmin|Andrzej Sapkowski",
            "Lalka|Bolesław Prus"
    ));

    public List<String> getTextData() {
        return data;
    }

    public void add(String entry) {
        data.add(entry);
    }
}
