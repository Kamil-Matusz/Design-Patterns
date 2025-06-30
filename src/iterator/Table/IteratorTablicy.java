package iterator.Table;

public class IteratorTablicy <T> implements Iterator {
    private final T[] magazyn;
    private int index;

    public IteratorTablicy(T[] magazyn) {
        this.magazyn = magazyn;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < magazyn.length;
    }

    public boolean hasPrevious() {
        return index > 0;
    }
    
    public T next() {
        if (this.hasNext()) {
            return magazyn[index++];
        }
        return null;
    }

    public T previous() {
        if (index > 0) {
            return magazyn[--index];
        }
        return null;
    }
}
