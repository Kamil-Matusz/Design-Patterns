package iterator.Collection;

import java.util.List;

public class ZwyklyIterator implements Iterator<Element> {
    private final List<Element> lista;
    private int index = 0;

    public ZwyklyIterator(List<Element> lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return index < lista.size();
    }

    @Override
    public Element next() {
        return lista.get(index++);
    }
}
