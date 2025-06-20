package composite.Projekt;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements ProjectComponent {
    private final String name;
    private final List<ProjectComponent> projects = new ArrayList<>();

    public Portfolio(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void add(ProjectComponent component) {
        projects.add(component);
    }

    public void remove(ProjectComponent component) {
        projects.remove(component);
    }

    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "🗂 Portfolio: " + name);
        for (ProjectComponent c : projects) {
            c.display(indent + 2);
        }
    }
}
