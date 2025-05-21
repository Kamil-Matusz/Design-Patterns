package builder.Pizza;

public class Director {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void buildPizza() {
        pizzaBuilder.newPizza();
        pizzaBuilder.addCreme();
        pizzaBuilder.addCheese();
        pizzaBuilder.addMeet();
        pizzaBuilder.addVegetables();
        pizzaBuilder.addFruits();
    }
}
