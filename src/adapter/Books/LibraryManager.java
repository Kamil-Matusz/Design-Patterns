package adapter.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryManager {

    private List<BookSource> sources = new ArrayList<>();

    public void registerSource(BookSource source) {
        sources.add(source);
    }

    public void displayAllBooks() {
        for (BookSource source : sources) {
            for (Book book : source.getBooks()) {
                System.out.println(book);
            }
        }
    }

    public void searchByTitle(String title) {
        for (BookSource source : sources) {
            Optional<Book> found = source.findByTitle(title);
            found.ifPresent(book -> System.out.println("Found: " + book));
        }
    }

    public void addToAllSources(Book book) {
        for (BookSource source : sources) {
            source.addBook(book);
        }
    }
}
