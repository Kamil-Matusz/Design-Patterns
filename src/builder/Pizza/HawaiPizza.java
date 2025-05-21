package builder.Pizza;

public class HawaiPizza extends PizzaBuilder{
    @Override
    public void addCreme() {
        pizza.setCreme("soft");
    }

    @Override
    public void addCheese() {
        pizza.setCheese("ementaler");
    }

    @Override
    public void addMeet() {
        pizza.setMeet("chicken");
    }

    @Override
    public void addVegetables() {
        pizza.setVegetables("tomato");
    }

    @Override
    public void addFruits() {
        pizza.setFruits("pineapple");
    }
}
