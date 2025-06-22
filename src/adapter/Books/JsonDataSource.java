package adapter.Books;

import java.util.ArrayList;
import java.util.List;

public class JsonDataSource {

    private List<String> jsons = new ArrayList<>(List.of(
            "{\"title\":\"Pan Tadeusz\", \"author\":\"Adam Mickiewicz\"}"
    ));

    public List<String> getJsonData() {
        return jsons;
    }

    public void add(String json) {
        jsons.add(json);
    }
}
