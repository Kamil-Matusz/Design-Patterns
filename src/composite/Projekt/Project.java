package composite.Projekt;

import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectComponent {
    private final String name;
    private final List<ProjectComponent> components = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void add(ProjectComponent component) {
        components.add(component);
    }

    public void remove(ProjectComponent component) {
        components.remove(component);
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "# Project: " + name);
        for (ProjectComponent c : components) {
            c.display(indent + 2);
        }
    }
}
