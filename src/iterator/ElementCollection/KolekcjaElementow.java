package iterator.ElementCollection;

public class KolekcjaElementow {
    private Element[] elements;

    public KolekcjaElementow(Element[] elements) {
        this.elements = elements;
    }

    public Iterator getMemorySortedIterator() {
        return new SortedByMemoryIterator(elements);
    }
}
