package builder.Pizza;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public void newPizza() {
        pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void addCreme();
    public abstract void addCheese();
    public abstract void addMeet();
    public abstract void addVegetables();
    public abstract void addFruits();
}
