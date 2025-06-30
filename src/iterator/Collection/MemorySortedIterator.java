package iterator.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MemorySortedIterator implements Iterator<Element> {
    private final List<Element> posortowana;
    private int index = 0;

    public MemorySortedIterator(List<Element> oryginalna) {
        this.posortowana = new ArrayList<>(oryginalna);
        this.posortowana.sort(Comparator.comparingInt(Element::memorySize));
    }

    @Override
    public boolean hasNext() {
        return index < posortowana.size();
    }

    @Override
    public Element next() {
        return posortowana.get(index++);
    }
}
