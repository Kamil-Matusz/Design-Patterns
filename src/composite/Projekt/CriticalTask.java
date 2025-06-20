package composite.Projekt;

public class CriticalTask extends Task {

    public CriticalTask(String name) {
        super(name);
    }

    @Override
    public void display(int indent) {
        System.out.println(" ".repeat(indent) + "- ⚠ Critical Task: " + getName());
    }
}
