package composite.Projekt;

public class Projekt {
    public static void main(String[] args) {
        Task t1 = new Task("Zbierz wymagania");
        Task t2 = new Task("Zaprojektuj system");
        CriticalTask ct1 = new CriticalTask("Zaimplementuj system");
        CriticalTask ct2 = new CriticalTask("Przetestuj system");

        TaskGroup development = new TaskGroup("Etap Development");
        development.add(t2);
        development.add(ct1);
        development.add(ct2);

        Project p1 = new Project("System CRM");
        p1.add(t1);
        p1.add(development);

        Project p2 = new Project("System ERP");
        p2.add(new Task("Analiza biznesowa"));
        p2.add(new CriticalTask("Integracja z zewnętrznym API"));

        Portfolio portfolio = new Portfolio("Portfel IT 2025");
        portfolio.add(p1);
        portfolio.add(p2);

        portfolio.display(0);
    }
}

