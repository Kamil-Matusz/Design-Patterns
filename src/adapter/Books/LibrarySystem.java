package adapter.Books;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.registerSource(new TextBookAdapter());
        manager.registerSource(new JsonBookAdapter());

        System.out.println("📚 Wszystkie książki:");
        manager.displayAllBooks();

        System.out.println("\n🔍 Szukam 'Wiedźmin':");
        manager.searchByTitle("Wiedźmin");

        System.out.println("\n➕ Dodaję nową książkę:");
        Book newBook = new Book("Gra o Tron", "George R. R. Martin");
        manager.addToAllSources(newBook);

        System.out.println("\n📚 Po dodaniu:");
        manager.displayAllBooks();
    }
}
