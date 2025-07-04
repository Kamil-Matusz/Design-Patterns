package iterator.ElementCollection;

public class Program {
    public static void main(String[] args) {
        Element[] dane = {
                new Element("Obiekt A", 120),
                new Element("Obiekt B", 80),
                new Element("Obiekt C", 240),
                new Element("Obiekt D", 50)
        };

        KolekcjaElementow kolekcja = new KolekcjaElementow(dane);
        Iterator iterator = kolekcja.getMemorySortedIterator();

        System.out.println("📦 Elementy posortowane po alokacji pamięci:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
