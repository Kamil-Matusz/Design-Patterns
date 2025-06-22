package adapter.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TextBookAdapter implements BookSource {

    private TextDataSource source = new TextDataSource();

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        for (String entry : source.getTextData()) {
            String[] parts = entry.split("\\|");
            books.add(new Book(parts[0], parts[1]));
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
        source.add(book.title + "|" + book.author);
    }
}
