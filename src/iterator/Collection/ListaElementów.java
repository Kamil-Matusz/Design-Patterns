package iterator.Collection;

import java.util.*;

public class ListaElementów implements Kontener<Element> {
    private final List<Element> elementy = new ArrayList<>();

    public void dodaj(Element e) {
        elementy.add(e);
    }

    @Override
    public Iterator<Element> getIterator() {
        return new ZwyklyIterator(elementy);
    }

    @Override
    public Iterator<Element> getSortedByMemoryIterator() {
        return new MemorySortedIterator(elementy);
    }
}
