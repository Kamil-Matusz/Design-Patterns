package iterator.ElementCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedByMemoryIterator implements Iterator {

    private List<Element> sortedList;
    private int index = 0;

    public SortedByMemoryIterator(Element[] elements) {
        // kopiujemy referencje, nie modyfikujemy oryginału
        sortedList = new ArrayList<>(Arrays.asList(elements));
        sortedList.sort(Comparator.comparingInt(Element::getMemorySize));
    }

    @Override
    public boolean hasNext() {
        return index < sortedList.size();
    }

    @Override
    public Element next() {
        return sortedList.get(index++);
    }
}
