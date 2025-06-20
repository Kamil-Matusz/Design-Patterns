package composite.Projekt;

public class Task implements ProjectComponent {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void add(ProjectComponent component) {}
    public void remove(ProjectComponent component) {}

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "- Task: " + name);
    }
}