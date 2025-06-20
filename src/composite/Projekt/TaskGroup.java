package composite.Projekt;

import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements ProjectComponent {

    private final String name;
    private final List<ProjectComponent> tasks = new ArrayList<>();

    public TaskGroup(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void add(ProjectComponent component) {
        tasks.add(component);
    }

    public void remove(ProjectComponent component) {
        tasks.remove(component);
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "+ Task Group: " + name);
        for (ProjectComponent c : tasks) {
            c.display(indent + 2);
        }
    }
}
