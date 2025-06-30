package iterator.Collection;

public class Element {
    private String nazwa;
    private int[] dane;

    public Element(String nazwa, int size) {
        this.nazwa = nazwa;
        this.dane = new int[size];
    }

    public int memorySize() {
        return dane.length * Integer.BYTES;
    }

    @Override
    public String toString() {
        return nazwa + " (" + memorySize() + "B)";
    }
}
