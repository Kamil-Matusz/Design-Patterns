package adapter.Books;

import java.util.List;
import java.util.Optional;

public interface BookSource {
    List<Book> getBooks();
    Optional<Book> findByTitle(String title);
    void addBook(Book book);
}
