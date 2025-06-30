package iterator.Collection;

public interface Kontener<T> {
    Iterator<T> getIterator();
    Iterator<T> getSortedByMemoryIterator();
}
