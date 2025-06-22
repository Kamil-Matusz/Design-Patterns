package adapter.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JsonBookAdapter implements BookSource {

    private JsonDataSource source = new JsonDataSource();

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        for (String json : source.getJsonData()) {
            String title = json.split("\"title\":\"")[1].split("\"")[0];
            String author = json.split("\"author\":\"")[1].split("\"")[0];
            books.add(new Book(title, author));
        }
        return books;
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return getBooks().stream()
                .filter(b -> b.title.equalsIgnoreCase(title))
                .findFirst();
    }

    @Override
    public void addBook(Book book) {
        String json = String.format("{\"title\":\"%s\", \"author\":\"%s\"}", book.title, book.author);
        source.add(json);
    }
}
