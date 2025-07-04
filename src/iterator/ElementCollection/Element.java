package iterator.ElementCollection;

public class Element {
    private String name;
    private int memorySize;

    public Element(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public String toString() {
        return name + " (" + memorySize + "B)";
    }
}
