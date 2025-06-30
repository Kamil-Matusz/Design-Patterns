package iterator.Collection;

public class Program {
    public static void main(String[] args) {
        ListaElementów kolekcja = new ListaElementów();

        kolekcja.dodaj(new Element("A", 100));
        kolekcja.dodaj(new Element("B", 20));
        kolekcja.dodaj(new Element("C", 50));
        kolekcja.dodaj(new Element("D", 10));

        System.out.println("Oryginalna kolekcja:");
        Iterator<Element> zwykly = kolekcja.getIterator();
        while (zwykly.hasNext()) {
            System.out.println(zwykly.next());
        }

        System.out.println("\nPosortowane po alokacji pamięci:");
        Iterator<Element> sortowany = kolekcja.getSortedByMemoryIterator();
        while (sortowany.hasNext()) {
            System.out.println(sortowany.next());
        }
    }
}
