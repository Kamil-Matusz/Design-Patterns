package composite.Projekt;

public interface ProjectComponent {
    String getName();
    void add(ProjectComponent component);
    void remove(ProjectComponent component);
    void display(int indent);
}
